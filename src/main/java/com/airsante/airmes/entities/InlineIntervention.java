package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(name = "inlineIntervention", types = {Intervention.class})
public interface InlineIntervention {
    @JsonProperty(value = "dataId")
    public Long getId();
    public Timestamp getDatePlanification();
    public Timestamp getDateRealisation();
    public String getObservation();
    public String getObservationPatient();
    public byte getRappelMail();
    public byte getRappelSms();
    public Timestamp getDateValidation();
    public byte getUtilisationEnCours();
    public Integer getStatut();
    public Byte getaPlanifier();
    public Timestamp getDateRappelPlanification();
    public Timestamp getDateSynchronisation();
    public Timestamp getDateModif();
    public byte getAstreinte();
    public byte getImprevue();
    public Byte getAffichageExtranet();
    public Byte getRevision();
    public Timestamp getDateSuppr();

}

