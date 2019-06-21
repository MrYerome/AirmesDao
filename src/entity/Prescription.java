package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Prescription {
    private int id;
    private Byte aFacturer;
    private Byte suspendu;
    private Byte facture;
    private Timestamp datePrescription;
    private Timestamp dateDebut;
    private Timestamp dateFin;
    private Byte accidentCauseParTiers;
    private Timestamp dateAccident;
    private Integer quantite;
    private BigDecimal prixUnitaireTtc;
    private BigDecimal prixLppTcc;
    private Byte soumisDep;
    private Timestamp dateEnvoiMedecin;
    private Timestamp dateRetourMedecin;
    private Timestamp dateEnvoiCaisse;
    private Timestamp dateRetourCaisse;
    private Byte accord;
    private Short aRenouveller;
    private Short renouvellementFait;
    private String commentaire;
    private Patient patientByPatientId;
    private Prescripteur prescripteurByPrescripteurId;
    private Forfait forfaitByForfaitId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "a_facturer")
    public Byte getaFacturer() {
        return aFacturer;
    }

    public void setaFacturer(Byte aFacturer) {
        this.aFacturer = aFacturer;
    }

    @Basic
    @Column(name = "suspendu")
    public Byte getSuspendu() {
        return suspendu;
    }

    public void setSuspendu(Byte suspendu) {
        this.suspendu = suspendu;
    }

    @Basic
    @Column(name = "facture")
    public Byte getFacture() {
        return facture;
    }

    public void setFacture(Byte facture) {
        this.facture = facture;
    }

    @Basic
    @Column(name = "date_prescription")
    public Timestamp getDatePrescription() {
        return datePrescription;
    }

    public void setDatePrescription(Timestamp datePrescription) {
        this.datePrescription = datePrescription;
    }

    @Basic
    @Column(name = "date_debut")
    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "date_fin")
    public Timestamp getDateFin() {
        return dateFin;
    }

    public void setDateFin(Timestamp dateFin) {
        this.dateFin = dateFin;
    }

    @Basic
    @Column(name = "accident_cause_par_tiers")
    public Byte getAccidentCauseParTiers() {
        return accidentCauseParTiers;
    }

    public void setAccidentCauseParTiers(Byte accidentCauseParTiers) {
        this.accidentCauseParTiers = accidentCauseParTiers;
    }

    @Basic
    @Column(name = "date_accident")
    public Timestamp getDateAccident() {
        return dateAccident;
    }

    public void setDateAccident(Timestamp dateAccident) {
        this.dateAccident = dateAccident;
    }

    @Basic
    @Column(name = "quantite")
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "prix_unitaire_ttc")
    public BigDecimal getPrixUnitaireTtc() {
        return prixUnitaireTtc;
    }

    public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
    }

    @Basic
    @Column(name = "prix_lpp_tcc")
    public BigDecimal getPrixLppTcc() {
        return prixLppTcc;
    }

    public void setPrixLppTcc(BigDecimal prixLppTcc) {
        this.prixLppTcc = prixLppTcc;
    }

    @Basic
    @Column(name = "soumis_dep")
    public Byte getSoumisDep() {
        return soumisDep;
    }

    public void setSoumisDep(Byte soumisDep) {
        this.soumisDep = soumisDep;
    }

    @Basic
    @Column(name = "date_envoi_medecin")
    public Timestamp getDateEnvoiMedecin() {
        return dateEnvoiMedecin;
    }

    public void setDateEnvoiMedecin(Timestamp dateEnvoiMedecin) {
        this.dateEnvoiMedecin = dateEnvoiMedecin;
    }

    @Basic
    @Column(name = "date_retour_medecin")
    public Timestamp getDateRetourMedecin() {
        return dateRetourMedecin;
    }

    public void setDateRetourMedecin(Timestamp dateRetourMedecin) {
        this.dateRetourMedecin = dateRetourMedecin;
    }

    @Basic
    @Column(name = "date_envoi_caisse")
    public Timestamp getDateEnvoiCaisse() {
        return dateEnvoiCaisse;
    }

    public void setDateEnvoiCaisse(Timestamp dateEnvoiCaisse) {
        this.dateEnvoiCaisse = dateEnvoiCaisse;
    }

    @Basic
    @Column(name = "date_retour_caisse")
    public Timestamp getDateRetourCaisse() {
        return dateRetourCaisse;
    }

    public void setDateRetourCaisse(Timestamp dateRetourCaisse) {
        this.dateRetourCaisse = dateRetourCaisse;
    }

    @Basic
    @Column(name = "accord")
    public Byte getAccord() {
        return accord;
    }

    public void setAccord(Byte accord) {
        this.accord = accord;
    }

    @Basic
    @Column(name = "a_renouveller")
    public Short getaRenouveller() {
        return aRenouveller;
    }

    public void setaRenouveller(Short aRenouveller) {
        this.aRenouveller = aRenouveller;
    }

    @Basic
    @Column(name = "renouvellement_fait")
    public Short getRenouvellementFait() {
        return renouvellementFait;
    }

    public void setRenouvellementFait(Short renouvellementFait) {
        this.renouvellementFait = renouvellementFait;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return id == that.id &&
                Objects.equals(aFacturer, that.aFacturer) &&
                Objects.equals(suspendu, that.suspendu) &&
                Objects.equals(facture, that.facture) &&
                Objects.equals(datePrescription, that.datePrescription) &&
                Objects.equals(dateDebut, that.dateDebut) &&
                Objects.equals(dateFin, that.dateFin) &&
                Objects.equals(accidentCauseParTiers, that.accidentCauseParTiers) &&
                Objects.equals(dateAccident, that.dateAccident) &&
                Objects.equals(quantite, that.quantite) &&
                Objects.equals(prixUnitaireTtc, that.prixUnitaireTtc) &&
                Objects.equals(prixLppTcc, that.prixLppTcc) &&
                Objects.equals(soumisDep, that.soumisDep) &&
                Objects.equals(dateEnvoiMedecin, that.dateEnvoiMedecin) &&
                Objects.equals(dateRetourMedecin, that.dateRetourMedecin) &&
                Objects.equals(dateEnvoiCaisse, that.dateEnvoiCaisse) &&
                Objects.equals(dateRetourCaisse, that.dateRetourCaisse) &&
                Objects.equals(accord, that.accord) &&
                Objects.equals(aRenouveller, that.aRenouveller) &&
                Objects.equals(renouvellementFait, that.renouvellementFait) &&
                Objects.equals(commentaire, that.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aFacturer, suspendu, facture, datePrescription, dateDebut, dateFin, accidentCauseParTiers, dateAccident, quantite, prixUnitaireTtc, prixLppTcc, soumisDep, dateEnvoiMedecin, dateRetourMedecin, dateEnvoiCaisse, dateRetourCaisse, accord, aRenouveller, renouvellementFait, commentaire);
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

    @ManyToOne
    @JoinColumn(name = "forfait_id", referencedColumnName = "id")
    public Forfait getForfaitByForfaitId() {
        return forfaitByForfaitId;
    }

    public void setForfaitByForfaitId(Forfait forfaitByForfaitId) {
        this.forfaitByForfaitId = forfaitByForfaitId;
    }
}
