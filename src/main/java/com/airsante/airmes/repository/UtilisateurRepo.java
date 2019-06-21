package com.airsante.airmes.repository;

import com.airsante.airmes.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;

@Transactional
@RepositoryRestResource(collectionResourceRel = "utilisateur", path = "utilisateur")

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {


}
