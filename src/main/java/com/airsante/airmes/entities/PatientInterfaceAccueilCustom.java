package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public interface PatientInterfaceAccueilCustom {
	@JsonProperty(value = "dataId")
	int getId();
	
	String getNom() ;
	String getPrenom();
	String getVille();
	String getNumeroSecu();
	Date getDateInstallation();
	Date getDateDerniereInter();
	Date getDateProchaineInter();
	int getMoyenneMois();
	String getStatutDossier();
	
}
