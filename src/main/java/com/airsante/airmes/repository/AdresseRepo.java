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


/**
 * Repo qui permet d'interroger la table adresse en restful
 * @author jerome.vinet
 * @since 2019.03.25
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "adresse", path = "adresse")
public interface AdresseRepo extends JpaRepository<Adresse, Long> {

}


//    List<Adresse> findByVilleContaining(@Param("word") String word);