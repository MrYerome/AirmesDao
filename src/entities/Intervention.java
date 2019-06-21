package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
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
    private Integer typeInterventionId;
    private Integer utilisateurIdValidateur;
    private Integer utilisateurIdTechnicien;
    private Integer patientId;
    private byte astreinte;
    private byte imprevue;
    private Integer prescripteurId;
    private Byte affichageExtranet;
    private Byte revision;
    private Timestamp dateSuppr;
    private Collection<Fichierpdf> fichierpdfsById;
    private Collection<Fichierpdf> fichierpdfsById_0;
    private TypeIntervention typeInterventionByTypeInterventionId;
    private Utilisateur utilisateurByUtilisateurIdValidateur;
    private Utilisateur utilisateurByUtilisateurIdTechnicien;
    private Patient patientByPatientId;
    private Prescripteur prescripteurByPrescripteurId;
    private InterventionClient interventionClientById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0;
    private Collection<InterventionMaterielArrivee> interventionMaterielArriveesById;
    private Collection<ObusPatient> obusPatientsById;
    private Collection<ParcMaterielClient> parcMaterielClientsById;
    private Collection<ParcMaterielPatient> parcMaterielPatientsById;
    private Collection<StockConsommablePatient> stockConsommablePatientsById;
    private Collection<ValeurMesure> valeurMesuresById;
    private Collection<ValeurMesureObus> valeurMesureObusesById;

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
    @Column(name = "type_intervention_id")
    public Integer getTypeInterventionId() {
        return typeInterventionId;
    }

    public void setTypeInterventionId(Integer typeInterventionId) {
        this.typeInterventionId = typeInterventionId;
    }

    @Basic
    @Column(name = "utilisateur_id_validateur")
    public Integer getUtilisateurIdValidateur() {
        return utilisateurIdValidateur;
    }

    public void setUtilisateurIdValidateur(Integer utilisateurIdValidateur) {
        this.utilisateurIdValidateur = utilisateurIdValidateur;
    }

    @Basic
    @Column(name = "utilisateur_id_technicien")
    public Integer getUtilisateurIdTechnicien() {
        return utilisateurIdTechnicien;
    }

    public void setUtilisateurIdTechnicien(Integer utilisateurIdTechnicien) {
        this.utilisateurIdTechnicien = utilisateurIdTechnicien;
    }

    @Basic
    @Column(name = "patient_id")
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
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
    @Column(name = "prescripteur_id")
    public Integer getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Integer prescripteurId) {
        this.prescripteurId = prescripteurId;
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
                Objects.equals(typeInterventionId, that.typeInterventionId) &&
                Objects.equals(utilisateurIdValidateur, that.utilisateurIdValidateur) &&
                Objects.equals(utilisateurIdTechnicien, that.utilisateurIdTechnicien) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(prescripteurId, that.prescripteurId) &&
                Objects.equals(affichageExtranet, that.affichageExtranet) &&
                Objects.equals(revision, that.revision) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, datePlanification, dateRealisation, observation, observationPatient, rappelMail, rappelSms, dateValidation, utilisationEnCours, statut, aPlanifier, dateRappelPlanification, dateSynchronisation, dateModif, typeInterventionId, utilisateurIdValidateur, utilisateurIdTechnicien, patientId, astreinte, imprevue, prescripteurId, affichageExtranet, revision, dateSuppr);
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<Fichierpdf> getFichierpdfsById() {
        return fichierpdfsById;
    }

    public void setFichierpdfsById(Collection<Fichierpdf> fichierpdfsById) {
        this.fichierpdfsById = fichierpdfsById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId_0")
    public Collection<Fichierpdf> getFichierpdfsById_0() {
        return fichierpdfsById_0;
    }

    public void setFichierpdfsById_0(Collection<Fichierpdf> fichierpdfsById_0) {
        this.fichierpdfsById_0 = fichierpdfsById_0;
    }

    @ManyToOne
    @JoinColumn(name = "type_intervention_id", referencedColumnName = "id")
    public TypeIntervention getTypeInterventionByTypeInterventionId() {
        return typeInterventionByTypeInterventionId;
    }

    public void setTypeInterventionByTypeInterventionId(TypeIntervention typeInterventionByTypeInterventionId) {
        this.typeInterventionByTypeInterventionId = typeInterventionByTypeInterventionId;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id_validateur", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurIdValidateur() {
        return utilisateurByUtilisateurIdValidateur;
    }

    public void setUtilisateurByUtilisateurIdValidateur(Utilisateur utilisateurByUtilisateurIdValidateur) {
        this.utilisateurByUtilisateurIdValidateur = utilisateurByUtilisateurIdValidateur;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id_technicien", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurIdTechnicien() {
        return utilisateurByUtilisateurIdTechnicien;
    }

    public void setUtilisateurByUtilisateurIdTechnicien(Utilisateur utilisateurByUtilisateurIdTechnicien) {
        this.utilisateurByUtilisateurIdTechnicien = utilisateurByUtilisateurIdTechnicien;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id")
    public Prescripteur getPrescripteurByPrescripteurId() {
        return prescripteurByPrescripteurId;
    }

    public void setPrescripteurByPrescripteurId(Prescripteur prescripteurByPrescripteurId) {
        this.prescripteurByPrescripteurId = prescripteurByPrescripteurId;
    }

    @OneToOne(mappedBy = "interventionById")
    public InterventionClient getInterventionClientById() {
        return interventionClientById;
    }

    public void setInterventionClientById(InterventionClient interventionClientById) {
        this.interventionClientById = interventionClientById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById() {
        return interventionLivraisonReprisesById;
    }

    public void setInterventionLivraisonReprisesById(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById) {
        this.interventionLivraisonReprisesById = interventionLivraisonReprisesById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId_0")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById_0() {
        return interventionLivraisonReprisesById_0;
    }

    public void setInterventionLivraisonReprisesById_0(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0) {
        this.interventionLivraisonReprisesById_0 = interventionLivraisonReprisesById_0;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<InterventionMaterielArrivee> getInterventionMaterielArriveesById() {
        return interventionMaterielArriveesById;
    }

    public void setInterventionMaterielArriveesById(Collection<InterventionMaterielArrivee> interventionMaterielArriveesById) {
        this.interventionMaterielArriveesById = interventionMaterielArriveesById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<ObusPatient> getObusPatientsById() {
        return obusPatientsById;
    }

    public void setObusPatientsById(Collection<ObusPatient> obusPatientsById) {
        this.obusPatientsById = obusPatientsById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<ParcMaterielClient> getParcMaterielClientsById() {
        return parcMaterielClientsById;
    }

    public void setParcMaterielClientsById(Collection<ParcMaterielClient> parcMaterielClientsById) {
        this.parcMaterielClientsById = parcMaterielClientsById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<ParcMaterielPatient> getParcMaterielPatientsById() {
        return parcMaterielPatientsById;
    }

    public void setParcMaterielPatientsById(Collection<ParcMaterielPatient> parcMaterielPatientsById) {
        this.parcMaterielPatientsById = parcMaterielPatientsById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<StockConsommablePatient> getStockConsommablePatientsById() {
        return stockConsommablePatientsById;
    }

    public void setStockConsommablePatientsById(Collection<StockConsommablePatient> stockConsommablePatientsById) {
        this.stockConsommablePatientsById = stockConsommablePatientsById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<ValeurMesure> getValeurMesuresById() {
        return valeurMesuresById;
    }

    public void setValeurMesuresById(Collection<ValeurMesure> valeurMesuresById) {
        this.valeurMesuresById = valeurMesuresById;
    }

    @OneToMany(mappedBy = "interventionByInterventionId")
    public Collection<ValeurMesureObus> getValeurMesureObusesById() {
        return valeurMesureObusesById;
    }

    public void setValeurMesureObusesById(Collection<ValeurMesureObus> valeurMesureObusesById) {
        this.valeurMesureObusesById = valeurMesureObusesById;
    }
}
