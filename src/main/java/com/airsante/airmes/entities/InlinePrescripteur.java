package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

import javax.persistence.Basic;
import javax.persistence.Column;
import java.sql.Timestamp;

@Projection(name = "inlinePrescripteur", types = {Prescripteur.class})
public interface InlinePrescripteur {
    @JsonProperty(value = "dataId")
    public Long getId();
    public String getNumeroPrescripteur();
    public String getNumeroFiness();
    public String getLogin();
    public String getPassword();
    public Byte getEtablissementVisibilite();
    public String getEtablissementService();
    public byte getNouvelExtranet();
    public Timestamp getDerniereConnexion();
    public Personne getPersonneById();
    public Agence getAgenceByAgenceId();
    public Etablissement getEtablissementByEtablissementId();

}

