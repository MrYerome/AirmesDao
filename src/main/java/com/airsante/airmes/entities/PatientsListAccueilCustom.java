package com.airsante.airmes.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe qui permet de retourner un json sous forme de liste.
 * Fonctionne avec le RequestController
 *
 * @author jerome.vinet
 * @since : 2019.03.12
 */
public class PatientsListAccueilCustom implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String nom;
    private String prenom;
    private String ville;
    private String numeroSecu;
    private Date dateInstallation;
    private Date dateDerniereInter;
    private Date dateProchaineInter;
    private Integer moyenneMois;
    private String statutDossier;


//On ne prévoit pas de constructeur, sinon ça plante	

    /**
     * GETTER SETTER
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNumeroSecu() {
        return numeroSecu;
    }

    public void setNumeroSecu(String numeroSecu) {
        this.numeroSecu = numeroSecu;
    }

    public Date getDateInstallation() {
        return dateInstallation;
    }

    public void setDateInstallation(Date dateInstallation) {
        this.dateInstallation = dateInstallation;
    }

    public Date getDateDerniereInter() {
        return dateDerniereInter;
    }

    public void setDateDerniereInter(Date dateDerniereInter) {
        this.dateDerniereInter = dateDerniereInter;
    }

    public Date getDateProchaineInter() {
        return dateProchaineInter;
    }

    public void setDateProchaineInter(Date dateProchaineInter) {
        this.dateProchaineInter = dateProchaineInter;
    }

    public Integer getMoyenneMois() {
        return moyenneMois;
    }

    public void setMoyenneMois(Integer moyenneMois) {
        this.moyenneMois = moyenneMois;
    }

    public String getStatutDossier() {
        return statutDossier;
    }

    public void setStatutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
    }
}
