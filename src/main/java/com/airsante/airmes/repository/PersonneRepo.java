package com.airsante.airmes.repository;

import java.awt.print.Pageable;
import java.util.List;

import javax.persistence.NamedNativeQueries;
import javax.transaction.Transactional;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.airsante.airmes.entities.InlinePersonne;
import com.airsante.airmes.entities.Patient;
import com.airsante.airmes.entities.PersonnesListCustom;
import com.airsante.airmes.entities.Personne;

/**
 * @author jerome.vinet
 *@since : 2019.04.03
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "personne", path = "personne", excerptProjection = InlinePersonne.class)
public interface PersonneRepo extends JpaRepository<Personne, Long> {
	
	@Query(value = "SELECT pe.nom, pe.prenom, ad.ville FROM adresse ad INNER JOIN personne pe ON ad.id = pe.adresse_id where pe.nom ='ARAB'", nativeQuery = true)
	 List<PersonnesListCustom> customFind(String param1, String param2);
	
	@Query(value = "SELECT pe.nom, pe.prenom, ad.ville FROM adresse ad INNER JOIN personne pe ON ad.id = pe.adresse_id where pe.nom = ?1", nativeQuery = true)
    public PersonnesListCustom customRequestNew(String nom);
	
	@Query(value = "SELECT pe.nom, pe.prenom, ad.ville FROM adresse ad INNER JOIN personne pe ON ad.id = pe.adresse_id where pe.nom ='ARAB'", nativeQuery = true)
    public PersonnesListCustom customRequest();

	
	@Query(value = "SELECT * FROM personne pe INNER JOIN adresse ad ON ad.id = pe.adresse_id where ad.ville = 'Avrillé'", nativeQuery = true)
    public List<Personne> customRequest2();
	
	@Query(value = "SELECT pe.nom, pe.prenom, ad.ville FROM personne pe INNER JOIN adresse ad ON ad.id = pe.adresse_id where ad.ville = 'Avrillé'", nativeQuery = true)
    public List<PersonnesListCustom> customRequest21();
	
	@Query(value = "SELECT * FROM personne pe where pe.nom ='ARAB'", nativeQuery = true)
    public Personne customRequest3();

}