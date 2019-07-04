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
public class CustomControllerPrescripteurs {

	@Autowired
	private EntityManager manager;


	/**
     * Requête native pour récupérer tous les patients d'un prescripteur (actifs ou non)
	 */
	private String listePatientsPrescripteur = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " WHERE pa.prescripteur_id =:param group by pa.id, pe.nom, pe.prenom ";


	/**
	 * Requête native pour récupérer tous les patients ACTIFS d'un prescripteur
	 */
	private String listePatientsActifsPrescripteur = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm"
			+ "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id"
			+ " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " WHERE pa.prescripteur_id =:param and pa.statut_dossier = 'en cours' group by pa.id, pe.nom, pe.prenom ";


	/**
	 * Requête native pour récupérer tous les patients ACTIFS ET TELEOBSERVES d'un prescripteur
	 */
	private String listePatientsActifsTOPrescripteur = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
			+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
			+ " left outer join intervention inte on inte.patient_id = pa.id"
			+ " WHERE pa.prescripteur_id =:param and pa.statut_dossier = 'en cours' AND pa.teleobservance=1 group by pa.id, pe.nom, pe.prenom ";


    /**
     * Nombre total de patients par prescripteur
	 */
	private String nombreTotalPatientsParPrescripteur = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id "
			+  			"WHERE pa.prescripteur_id = :param ;"
			;
	/**
	 * Nombre total de patients actifs par prescripteur
	 */
	private String nombreTotalPatientsActifsParPrescripteur = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id "
			+  			"WHERE pa.prescripteur_id = :param and pa.dossier_statut = 2 ;"
			;
	/**
	 * Nombre total de patients actifs + TO par prescripteur
	 */
	private String nombreTotalPatientsTelesuivisParPrescripteur = "select count(*) from patientstomois ptm left join patient pa on pa.id= ptm.patient_id "
			+  			"WHERE pa.prescripteur_id = :param and pa.dossier_statut = 2 and pa.teleobservance=1;"
			;


	/**
     * Liste de TOUS les patients par prescripteur
	 * @param param
     * @return
     * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/listePatientsPrescripteur", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsPrescripteur(
			@RequestParam("param") int param)
	 throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatientsPrescripteur)
				.setParameter("param", param )
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}

	/**
	 * Liste de TOUS les patients ACTIFS par prescripteur
	 * @param param
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/listePatientsActifsPrescripteur", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsActifsPrescripteur(
			@RequestParam("param") int param)
			throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatientsActifsPrescripteur)
				.setParameter("param", param )
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}

	/**
	 * Liste de TOUS les patients actifs + TO par prescripteur
	 * @param param
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/listePatientsActifsTOPrescripteur", method = RequestMethod.GET)
	public List<PatientsListAccueilCustom> getListPatientsActifsTOPrescripteur(
			@RequestParam("param") int param)
			throws IOException
	{
		List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager.createNativeQuery(listePatientsActifsTOPrescripteur)
				.setParameter("param", param )
				.unwrap(org.hibernate.query.Query.class)
				.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class))
				.list();
		return listPatientsAccueil;
	}

	/**
	 * Nombre de TOUS les patients par prescripteur
	 * @param param
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/nombreTotalPatientsPrescripteur", method = RequestMethod.GET)
	public int getNombreTotalPatientsParPrescripteur(
			@RequestParam("param") int param)
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatientsParPrescripteur);
		query.setParameter("param", param);
		int nombreTotalPatients = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatients;
	}

	/**
	 * Nombre de TOUS les patients actifs par prescripteur
	 * @param param
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/nombreTotalPatientsActifsPrescripteur", method = RequestMethod.GET)
	public int getNombreTotalPatientsActifsParPrescripteur(
			@RequestParam("param") int param)
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatientsActifsParPrescripteur);
		query.setParameter("param", param);
		int nombreTotalPatientsActifs = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatientsActifs;
	}

	/**
	 * Nombre de TOUS les patients actifs + TO par prescripteur
	 * @param param
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "api/CustomControllerPrescripteurs/nombreTotalPatientsActifsTelesuivisPrescripteur", method = RequestMethod.GET)
	public int getNombreTotalPatientsTelesuivisParPrescripteur(
			@RequestParam("param") int param)
			throws IOException
	{
		Query query = manager.createNativeQuery(nombreTotalPatientsTelesuivisParPrescripteur);
		query.setParameter("param", param);
		int nombreTotalPatientsTelesuivis = ((Number) query.getSingleResult()).intValue();
		return nombreTotalPatientsTelesuivis;
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
