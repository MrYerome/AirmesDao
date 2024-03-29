package com.airsante.airmes.controller;

import com.airsante.airmes.entities.PatientsListAccueilCustom;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.io.IOException;
import java.util.List;

/**
 * @author jerome.vinet
 * @since 190315
 * Création d'un RequestController pour faire des requêtes natives, car lorsque je veux retourner une liste de projections, spring data rest ne le permet pas :
 * il souhaite ajouter un proxy à l'interface, or, quand je retourne une liste de projections, ce n'est pas une interface, mais une liste.
 * Ce problème est récurrent et ancien (fin 2017) et est bien documenté dans https://jira.spring.io/browse/DATAREST-1237
 */
@RestController
public class CustomControllerUtilisateur {

	@Autowired
	private EntityManager manager;



	/**
	 * Requête native pour récupérer tous les patients d'un prescripteur (actifs ou non)
	 */
	private String listePatients = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " group by pa.id, pe.nom, pe.prenom ";


	/**
	 * Requête native pour récupérer tous les patients ACTIFS d'un prescripteur
	 */
	private String listePatientsActifs = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm"
			+ "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id"
			+ " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " WHERE pa.statut_dossier = 'en cours' group by pa.id, pe.nom, pe.prenom ";


	/**
	 * Requête native pour récupérer tous les patients ACTIFS ET TELEOBSERVES d'un prescripteur
	 */
	private String listePatientsActifsTO = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " WHERE pa.statut_dossier = 'en cours' AND pa.teleobservance=1 group by pa.id, pe.nom, pe.prenom ";



	/**
	 * Requête native pour récupérer la liste de tous les patients (actifs ou non)
	 */
	private String getListPatientsAccueil = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id  "
			+ " group by pa.id, pe.nom, pe.prenom LIMIT 10";


	/**
	 * Nombre total de patients TOTAL
	 */
	private String nombreTotalPatients = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id " ;

	/**
	 * Nombre total de patients actifs TOTAL
	 */
	private String nombreTotalPatientsActifs = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id "
			+  			"WHERE pa.dossier_statut = 2 ;"
	;
	/**
	 * Nombre total de patients actifs + TO TOTAL
	 */
	private String nombreTotalPatientsTelesuivis = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id "
			+  			"WHERE pa.dossier_statut = 2 and pa.teleobservance=1;"
			;


	/**
	  Récupère la liste de tous les patients, avec les infos suivantes :
	 * 	int getId();		
	 *	String getNom() ;	
	 *	String getPrenom()
	 *	String getVille();	
	 *	String getNumeroSecu();		
	 *	Date getDateInstallation();	
	 *	Date getDateDerniereInter();	
	 *	Date getDateProchaineInter();	
	 *	int getMoyenneMois();	
	 *	String getStatutDossier();
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/listeAccueil", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsAccueil() throws IOException {
		//Solution simple pour un return avec une liste d'objets
		//List<Object> listPatientsAccueil = manager.createNativeQuery(getListPatientsAccueil).getResultList();

		//Solution plus complexe où l'on retourne des PatientsCustoms, ce qui permet d'avoir un label aux infos retournées. On utilise une méthode dite dépréciée mais qui n'a pas été remplacée
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(getListPatientsAccueil)
				.unwrap(org.hibernate.query.Query.class)
				 .setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				 .list();
		//On vérifie chacun des noms
//		for (PatientsListAccueilCustom patient : listPatientsAccueil) {
//			System.out.println(patient.getNom());
//		}
		return listPatientsAccueil;
	}


    /**
     * Nombre TOTAL des patients
	 * @return
     * @throws IOException
     */
	@RequestMapping(value = "api/CustomControllerUtilisateur/nombreTotalPatients", method = RequestMethod.GET)
	public int getNombreTotalPatients()
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatients);
		int nombreTotalPatients = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatients;
	}

	/**
	 * Nombre TOTAL des patients ACTIFS
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/nombreTotalPatientsActifs", method = RequestMethod.GET)
	public int getNombreTotalPatientsActifs()
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatientsActifs);
		int nombreTotalPatientsActifs = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatientsActifs;
	}

	/**
	 * Nombre TOTAL des patients ACTIFS + TO
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/nombreTotalPatientsTelesuivis", method = RequestMethod.GET)
	public int getNombreTotalPatientsTelesuivis()
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatientsTelesuivis);
		int nombreTotalPatientsTelesuivis = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatientsTelesuivis;
	}


	/**
	 * Liste de TOUS les patients au TOTAL
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/listePatients", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsUtilisateur()
			throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatients)
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}

	/**
	 * Liste de TOUS les patients ACTIFS au TOTAL
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/listePatientsActifs", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsActifsUtilisateur()
			throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatientsActifs)
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}

	/**
	 * Liste de TOUS les patients actifs + TO au TOTAL
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerUtilisateur/listePatientsActifsTO", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsActifsTOUtilisateur()
			throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatientsActifsTO)
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}



	/**
	 * Exemple de base
	 */
	/*
	 * private String withinQuery = "WITH L as\n" + "\n" + "(SELECT *\n" +
	 * "FROM location\n" + "\n" +
	 * "WHERE ST_Distance(ST_FlipCoordinates(location.shape), ST_FlipCoordinates(ST_GeomFromGeoJSON('%s'\n"
	 * + "        )))=0)\n" + "\n" + "SELECT *\n" + "FROM L\n" +
	 * "WHERE id NOT IN (\n" + "SELECT metalocation_id FROM location\n" +
	 * "WHERE metalocation_id IS NOT NULL\n" + ")";
	 * 
	 * private String nearestQuery =
	 * "select * from location order by ST_Distance(ST_FlipCoordinates(location.shape), ST_FlipCoordinates(St_GeomFromGeoJSON('%s'))) limit 1"
	 * ;
	 * 
	 * @RequestMapping(value="near", method = RequestMethod.GET) public
	 * List<Location> getNearestLocations(@RequestParam(value = "point") String
	 * pointAsString) throws IOException { List<Location> locationCloseToPoint =
	 * manager.createNativeQuery(String.format(withinQuery, pointAsString),
	 * Location.class).getResultList(); if (locationCloseToPoint.size() == 0) {
	 * List<Location> closesLocation =
	 * manager.createNativeQuery(String.format(nearestQuery, pointAsString),
	 * Location.class) .getResultList();
	 * locationCloseToPoint.addAll(closesLocation); } return locationCloseToPoint; }
	 */

	/**
	 * Retourne un utilisateur en fonction de son identifiant
	 * Le choisx a été fait de ne retourner qu'un seul utilisateur et pas une liste
	 * @return
	 * @throws IOException
	 */
//    @RequestMapping(value = "api/searchUser", method = RequestMethod.GET)
//    public Utilisateur getUserByIdentifiant() throws IOException {
//        //Solution simple pour un return avec une liste d'objets
//        //List<Object> listPatientsAccueil = manager.createNativeQuery(getListPatientsAccueil).getResultList();
//
//        //Solution plus complexe où l'on retourne des PatientsCustoms, ce qui permet d'avoir un label aux infos retournées. On utilise une méthode dite dépréciée mais qui n'a pas été remplacée
//       Utilisateur user =  manager.createNativeQuery(getListPatientsAccueil)
//			   .unwrap(org.hibernate.query.Query.class)
//			   .setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
//			   ;
//        List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(getListPatientsAccueil)
//                .unwrap(org.hibernate.query.Query.class)
//                .setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
//                .list();
//        //On vérifie chacun des noms
////		for (PatientsListAccueilCustom patient : listPatientsAccueil) {
////			System.out.println(patient.getNom());
////		}
//        return user;
//    }

}
