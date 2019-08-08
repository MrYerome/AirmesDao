package com.airsante.airmes.entities;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.hateoas.Link;

@Projection(name = "inlinePatient", types = {Patient.class})
public interface InlinePatient {
    @JsonProperty(value = "dataId")
    Long getId();
    String getNumeroSs();
    byte getActif();
    Timestamp getDateRenouvellementDep();
    Timestamp getDateProchainRdv();
    Timestamp getDateProchaineInterv();
    Timestamp getDateInstallation();
    String getStatutDossier();
    String getIdentifiant();
    String getMotdepasse();
    Integer getDossierStatut();
    Short getTeleobservance();
    Byte getExtranetactif();
    Personne getPersonneById();
}
