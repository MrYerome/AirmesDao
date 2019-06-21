package com.airsante.airmes.repository;

import java.awt.print.Pageable;
import java.lang.annotation.Native;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airsante.airmes.entities.InlinePatient;
import com.airsante.airmes.entities.Patient;
import com.airsante.airmes.entities.PatientInterfaceAccueilCustom;
import com.airsante.airmes.entities.PatientsListAccueilCustom;
import com.airsante.airmes.entities.PersonnesListCustom;

/**
 * @author jerome.vinet
 * @since : 20190403
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "patient", path = "patient", excerptProjection = InlinePatient.class)
public interface PatientRepo extends JpaRepository<Patient, Long> {
	/**
	 * Requête automatique pour retrouver une liste de patient par son identifiant
	 * @param identifiant
	 * @return
	 */
	List<Patient> findByIdentifiantContaining(@Param("identifiant") String identifiant);

		
	/**
	 * Requête JPA pour trouver un patient par son identifiant
	 * @param nom
	 * @return
	 */
	@Query("from Patient p where p.identifiant = ?1")
	public Patient getPatientByIdentifiant(String nom);

	
	/**
	 * Retourne un patient par l'interface
	 * La méthode pour retourner tous les patients n'existe pas en data-rest : voir le @RestController RequestController
	 * @return
	 */
	@Query(value = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+" MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as prochaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			 +" from patientstomois ptm"
			 +"	left join patient pa on pa.id= ptm.patient_id"
			 	+" left join personne pe on pe.id= pa.id"
			 	+" left join adresse ad on ad.id = pe.adresse_id"
			 	 +" left outer join intervention inte on inte.patient_id = pa.id"
			+			" WHERE pa.id=?1"
			 	+" group by pa.id, pe.nom, pe.prenom "

			, nativeQuery = true)
    PatientInterfaceAccueilCustom getOnePatientInterfaceAccueilCustom(String id);


	@Query(value = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+" MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as prochaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+" from patientstomois ptm"
			+"	left join patient pa on pa.id= ptm.patient_id"
			+" left join personne pe on pe.id= pa.id"
			+" left join adresse ad on ad.id = pe.adresse_id"
			+" left outer join intervention inte on inte.patient_id = pa.id"
			+			" WHERE pa.id=?1"
			+" group by pa.id, pe.nom, pe.prenom "

			, nativeQuery = true)
	PatientsListAccueilCustom getOnePatientsListAccueilCustom(String id);


	@Query(value = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+" MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as prochaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			+" from patientstomois ptm"
			+"	left join patient pa on pa.id= ptm.patient_id"
			+" left join personne pe on pe.id= pa.id"
			+" left join adresse ad on ad.id = pe.adresse_id"
			+" left outer join intervention inte on inte.patient_id = pa.id"
			+			" WHERE pa.id=?1"
			+" group by pa.id, pe.nom, pe.prenom "

			, nativeQuery = true)
	InlinePatient getOneInlinePatient(String id);

	
	/**
	 * Cette méthode ne fonctionne pas : voir le issue https://jira.spring.io/browse/DATAREST-1237
	 * Il est impossible de retourner une liste de projection custom.
	 * Systématiquement, prtoblème de classe proxy que le framework veut ajouter à ma list. Or list est une classe et pas une interface, donc bug.
	 * Cette issue n'est toujours pas résolvue.
	 * @return
	 */
	@Query(value = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
			+" MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as prochaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
			 +" from patientstomois ptm"
			 +"	left join patient pa on pa.id= ptm.patient_id"
			 	+" left join personne pe on pe.id= pa.id"
			 	+" left join adresse ad on ad.id = pe.adresse_id"
			 	 +" left outer join intervention inte on inte.patient_id = pa.id"
			 	+" group by pa.id, pe.nom, pe.prenom"
			, nativeQuery = true)
    List<PatientInterfaceAccueilCustom> getAllPatientAccueil();
}