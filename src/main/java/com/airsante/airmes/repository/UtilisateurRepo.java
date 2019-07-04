package com.airsante.airmes.repository;

import com.airsante.airmes.entities.InlineUtilisateur;
import com.airsante.airmes.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.transaction.Transactional;

@Transactional
@RepositoryRestResource(collectionResourceRel = "utilisateur", path = "utilisateur", excerptProjection = InlineUtilisateur.class)

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
    /**
     * Retourne UN SEUL UTILISATEUR
     * @param identifiant
     * @return
     */
    @Query("from Utilisateur u where u.identifiant = ?1")
    public Utilisateur getUtilisateurByIdentifiant(String identifiant);

}
