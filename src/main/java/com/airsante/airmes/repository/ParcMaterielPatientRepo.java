package com.airsante.airmes.repository;

import com.airsante.airmes.entities.Adresse;
import com.airsante.airmes.entities.ParcMaterielPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;
import java.util.List;
//TODO : voir comment faire pour récupérer données de plusieurs tables
// Exemple : liste de patients actifs

/**
 * 
 * @author jerome.vinet
 *
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "parc_materiel_patient", path = "parc_materiel_patient")
public interface ParcMaterielPatientRepo extends JpaRepository<ParcMaterielPatient, Long> {

	@Query("select pmp from ParcMaterielPatient pmp where pmp.id = ?1")
	ParcMaterielPatient findByIdPatient(String emailAddress);


}


