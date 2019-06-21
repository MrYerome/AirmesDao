package com.airsante.airmes.entities;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.hateoas.Link;

@Projection(name = "inlinePatient", types = { Patient.class })
public interface InlinePatient {
    @JsonProperty(value = "dataId")
	public Long getId();
	public String getNumeroSs();
	//public String getProfession();
	//public String getPhoto();
	//public String getFichierAutorisationPhoto();
	//public String getPoids();
	//public String getTaille();
	//public String getNomJeuneFille();
	public byte getActif() ;
	//public String getRelationPersonneAttachee();
	public Timestamp getDateRenouvellementDep();
	//public Timestamp getDateModif();
	//public byte getNouveauPatient();
	//public Integer getTypeEcheanceId();
	//public Integer getModeReglementId();
	//public String getRangNaissance();
	//public String getRangBeneficiaire();
	//public String getFinDroit();
	//public String getFin100();
	//public Timestamp getDateDeces();
	public Timestamp getDateProchainRdv();
	//public byte getRappelSms() ;
	//public byte getRappelMail() ;
	public Timestamp getDateProchaineInterv();
	public Timestamp getDateInstallation() ;
	public String getStatutDossier() ;
	public String getIdentifiant() ;
	public String getMotdepasse();
	public Integer getDossierStatut() ;
	public Short getTeleobservance();
	public Byte getExtranetactif();
	//public Byte getPremiereConnexion();
	//public Agence getAgenceByAgenceId();
	public Personne getPersonneById();
}
