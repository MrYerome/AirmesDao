package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_patient", schema = "ventury", catalog = "")
public class ParcMaterielPatient {
    private int id;
    private int parcMaterielId;
    private Integer patientId;
    private Date dateLivraison;
    private Date dateReprise;
    private Integer dossierId;
    private Integer interventionId;
    private ParcMateriel parcMaterielByParcMaterielId;
    private Patient patientByPatientId;
    private Dossier dossierByDossierId;
    private Intervention interventionByInterventionId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parc_materiel_id")
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
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
    @Column(name = "date_livraison")
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "date_reprise")
    public Date getDateReprise() {
        return dateReprise;
    }

    public void setDateReprise(Date dateReprise) {
        this.dateReprise = dateReprise;
    }

    @Basic
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
    }

    @Basic
    @Column(name = "intervention_id")
    public Integer getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Integer interventionId) {
        this.interventionId = interventionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcMaterielPatient that = (ParcMaterielPatient) o;
        return id == that.id &&
                parcMaterielId == that.parcMaterielId &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise) &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(interventionId, that.interventionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, patientId, dateLivraison, dateReprise, dossierId, interventionId);
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
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
    @JoinColumn(name = "dossier_id", referencedColumnName = "id")
    public Dossier getDossierByDossierId() {
        return dossierByDossierId;
    }

    public void setDossierByDossierId(Dossier dossierByDossierId) {
        this.dossierByDossierId = dossierByDossierId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id")
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
