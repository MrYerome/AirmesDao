package com.airsante.airmes.repository;

import com.airsante.airmes.entities.InlineIntervention;
import com.airsante.airmes.entities.InlinePrescripteur;
import com.airsante.airmes.entities.Intervention;
import com.airsante.airmes.entities.Prescripteur;
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
 * @since 2019.06.13
 * Permet de communiquer avec la table prescripteur de la BDD
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "intervention", path = "intervention", excerptProjection = InlineIntervention.class)
public interface InterventionRepo extends JpaRepository<Intervention, Long> {


	/**
	 * Retourne UN SEUL PRESCRIPTEUR
	 * @param id
	 * @return
	 */
	@Query("from Intervention i where i.id = ?1")
	public Intervention getInterventionByIdentifiant(String id);

}


