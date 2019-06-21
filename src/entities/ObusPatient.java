package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "obus_patient", schema = "ventury", catalog = "")
public class ObusPatient {
    private int id;
    private int obusId;
    private Integer patientId;
    private Date dateLivraison;
    private Date dateReprise;
    private Integer dossierId;
    private Integer interventionId;
    private Obus obusByObusId;
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
    @Column(name = "obus_id")
    public int getObusId() {
        return obusId;
    }

    public void setObusId(int obusId) {
        this.obusId = obusId;
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
        ObusPatient that = (ObusPatient) o;
        return id == that.id &&
                obusId == that.obusId &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise) &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(interventionId, that.interventionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, obusId, patientId, dateLivraison, dateReprise, dossierId, interventionId);
    }

    @ManyToOne
    @JoinColumn(name = "obus_id", referencedColumnName = "id", nullable = false)
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
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
