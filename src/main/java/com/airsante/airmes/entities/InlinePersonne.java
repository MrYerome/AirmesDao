package com.airsante.airmes.entities;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlinePersonne", types = { Personne.class })
public interface InlinePersonne {
    @JsonProperty(value = "dataId")
	public Long getId();
    public String getNom();
    public String getPrenom();
    public Date getDateNaissance();
    public String getTelDomicile();
    public String getTelPortable();
    public String getTelAutre();
    public String getTelCommentaire();
    public String getFax();
    public String getMail();
    public String getCommentaire();
    public Timestamp getDateSuppr();
    public String getSexe();
    public Patient getPatientById();
    public Adresse getAdresseByAdresseId();   
	

}