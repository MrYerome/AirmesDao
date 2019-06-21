package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Intervention {
    private int id;
    private Timestamp datePlanification;
    private Timestamp dateRealisation;
    private String observation;
    private String observationPatient;
    private byte rappelMail;
    private byte rappelSms;
    private Timestamp dateValidation;
    private byte utilisationEnCours;
    private Integer statut;
    private Byte aPlanifier;
    private Timestamp dateRappelPlanification;
    private Timestamp dateSynchronisation;
    private Timestamp dateModif;
    private byte astreinte;
    private byte imprevue;
    private Byte affichageExtranet;
    private Byte revision;
    private Timestamp dateSuppr;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_planification")
    public Timestamp getDatePlanification() {
        return datePlanification;
    }

    public void setDatePlanification(Timestamp datePlanification) {
        this.datePlanification = datePlanification;
    }

    @Basic
    @Column(name = "date_realisation")
    public Timestamp getDateRealisation() {
        return dateRealisation;
    }

    public void setDateRealisation(Timestamp dateRealisation) {
        this.dateRealisation = dateRealisation;
    }

    @Basic
    @Column(name = "observation")
    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Basic
    @Column(name = "observation_patient")
    public String getObservationPatient() {
        return observationPatient;
    }

    public void setObservationPatient(String observationPatient) {
        this.observationPatient = observationPatient;
    }

    @Basic
    @Column(name = "rappel_mail")
    public byte getRappelMail() {
        return rappelMail;
    }

    public void setRappelMail(byte rappelMail) {
        this.rappelMail = rappelMail;
    }

    @Basic
    @Column(name = "rappel_sms")
    public byte getRappelSms() {
        return rappelSms;
    }

    public void setRappelSms(byte rappelSms) {
        this.rappelSms = rappelSms;
    }

    @Basic
    @Column(name = "date_validation")
    public Timestamp getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Timestamp dateValidation) {
        this.dateValidation = dateValidation;
    }

    @Basic
    @Column(name = "utilisation_en_cours")
    public byte getUtilisationEnCours() {
        return utilisationEnCours;
    }

    public void setUtilisationEnCours(byte utilisationEnCours) {
        this.utilisationEnCours = utilisationEnCours;
    }

    @Basic
    @Column(name = "statut")
    public Integer getStatut() {
        return statut;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "a_planifier")
    public Byte getaPlanifier() {
        return aPlanifier;
    }

    public void setaPlanifier(Byte aPlanifier) {
        this.aPlanifier = aPlanifier;
    }

    @Basic
    @Column(name = "date_rappel_planification")
    public Timestamp getDateRappelPlanification() {
        return dateRappelPlanification;
    }

    public void setDateRappelPlanification(Timestamp dateRappelPlanification) {
        this.dateRappelPlanification = dateRappelPlanification;
    }

    @Basic
    @Column(name = "date_synchronisation")
    public Timestamp getDateSynchronisation() {
        return dateSynchronisation;
    }

    public void setDateSynchronisation(Timestamp dateSynchronisation) {
        this.dateSynchronisation = dateSynchronisation;
    }

    @Basic
    @Column(name = "date_modif")
    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    @Basic
    @Column(name = "astreinte")
    public byte getAstreinte() {
        return astreinte;
    }

    public void setAstreinte(byte astreinte) {
        this.astreinte = astreinte;
    }

    @Basic
    @Column(name = "imprevue")
    public byte getImprevue() {
        return imprevue;
    }

    public void setImprevue(byte imprevue) {
        this.imprevue = imprevue;
    }

    @Basic
    @Column(name = "affichage_extranet")
    public Byte getAffichageExtranet() {
        return affichageExtranet;
    }

    public void setAffichageExtranet(Byte affichageExtranet) {
        this.affichageExtranet = affichageExtranet;
    }

    @Basic
    @Column(name = "revision")
    public Byte getRevision() {
        return revision;
    }

    public void setRevision(Byte revision) {
        this.revision = revision;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Intervention that = (Intervention) o;
        return id == that.id &&
                rappelMail == that.rappelMail &&
                rappelSms == that.rappelSms &&
                utilisationEnCours == that.utilisationEnCours &&
                astreinte == that.astreinte &&
                imprevue == that.imprevue &&
                Objects.equals(datePlanification, that.datePlanification) &&
                Objects.equals(dateRealisation, that.dateRealisation) &&
                Objects.equals(observation, that.observation) &&
                Objects.equals(observationPatient, that.observationPatient) &&
                Objects.equals(dateValidation, that.dateValidation) &&
                Objects.equals(statut, that.statut) &&
                Objects.equals(aPlanifier, that.aPlanifier) &&
                Objects.equals(dateRappelPlanification, that.dateRappelPlanification) &&
                Objects.equals(dateSynchronisation, that.dateSynchronisation) &&
                Objects.equals(dateModif, that.dateModif) &&
                Objects.equals(affichageExtranet, that.affichageExtranet) &&
                Objects.equals(revision, that.revision) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datePlanification, dateRealisation, observation, observationPatient, rappelMail, rappelSms, dateValidation, utilisationEnCours, statut, aPlanifier, dateRappelPlanification, dateSynchronisation, dateModif, astreinte, imprevue, affichageExtranet, revision, dateSuppr);
    }
}
