package com.airsante.airmes.repository;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import com.airsante.airmes.entities.Adresse;
//TODO : voir comment faire pour récupérer données de plusieurs tables
// Exemple : liste de patients actifs
/**
 * 
 * @author jerome.vinet
 *
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "adresse", path = "adresse")
public interface AdresseRepo extends JpaRepository<Adresse, Long> {

//	List<AdresseEntity> findByCreatedAfter(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date date);
//
//	List<AdresseEntity> findByCreatedBetween(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date after,
//			@Param("before") @DateTimeFormat(iso = ISO.DATE) Date before);
//http://marketplace.eclipse.org/content/jboss-tools
//	List<AdresseEntity> findByTitleContaining(@Param("word") String word);
	
	List<Adresse> findByVilleContaining(@Param("word") String word);
	
	 
	//List<AdresseEntity> findByNomVoieContaining(@Param("rue") String rue);
//	@Param(sfsdfdfdf)
	List<Adresse> findByPaysContaining(@Param("pays") String pays);
}


