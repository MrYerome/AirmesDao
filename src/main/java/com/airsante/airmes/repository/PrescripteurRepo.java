package com.airsante.airmes.repository;

import com.airsante.airmes.entities.Adresse;
import com.airsante.airmes.entities.InlinePrescripteur;
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
@RepositoryRestResource(collectionResourceRel = "prescripteur", path = "prescripteur", excerptProjection = InlinePrescripteur.class)
public interface PrescripteurRepo extends JpaRepository<Prescripteur, Long> {

	/**
	 * Retourne UNE LISTE DE PRESCRIPTEUR
	 * @param login
	 * @return
	 */
	List<Prescripteur> findByLoginContaining(@Param("login") String login);


	
	/**
	 * Retourne UN SEUL PRESCRIPTEUR
	 * @param login
	 * @return
	 */
	@Query("from Prescripteur p where p.login = ?1")
	Prescripteur getPrescripteurByIdentifiant(String login);

}


