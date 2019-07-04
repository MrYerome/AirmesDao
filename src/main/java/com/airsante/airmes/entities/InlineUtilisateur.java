package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(name = "inlineUtilisateur", types = {Utilisateur.class})
public interface InlineUtilisateur {
    @JsonProperty(value = "dataId")
    public Long getId();
    public String getIdentifiant();
    public byte getActif();
    public Timestamp getDateSuppr();
    public Integer getProfilId();
    public byte getAdminSiteweb();
    public Integer getAgenceId();
    public Technicien getTechnicienByTechnicienId();
    public Personne getPersonneByPersonneId();
    //public Agence getAgenceByAgenceId();
}

