package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "dep_en_retard2", schema = "ventury", catalog = "")
public class DepEnRetard2 {
    private int id;
    private String commentaire;
    private Timestamp datePrescription;
    private Timestamp dateRelance;
    private Timestamp dateReprise;
    private Timestamp dateResolution;
    private Timestamp dateSuppr;
    private Integer agenceId;
    private Integer depEnRetardStatutId;
    private long patientId;
    private Long prescripteurId;
    private Agence agenceByAgenceId;
    private DepEnRetardStatut depEnRetardStatutByDepEnRetardStatutId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
    @Column(name = "date_relance")
    public Timestamp getDateRelance() {
        return dateRelance;
    }

    public void setDateRelance(Timestamp dateRelance) {
        this.dateRelance = dateRelance;
    }

    @Basic
    @Column(name = "date_reprise")
    public Timestamp getDateReprise() {
        return dateReprise;
    }

    public void setDateReprise(Timestamp dateReprise) {
        this.dateReprise = dateReprise;
    }

    @Basic
    @Column(name = "date_resolution")
    public Timestamp getDateResolution() {
        return dateResolution;
    }

    public void setDateResolution(Timestamp dateResolution) {
        this.dateResolution = dateResolution;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Basic
    @Column(name = "dep_en_retard_statut_id")
    public Integer getDepEnRetardStatutId() {
        return depEnRetardStatutId;
    }

    public void setDepEnRetardStatutId(Integer depEnRetardStatutId) {
        this.depEnRetardStatutId = depEnRetardStatutId;
    }

    @Basic
    @Column(name = "patient_id")
    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public Long getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Long prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepEnRetard2 that = (DepEnRetard2) o;
        return id == that.id &&
                patientId == that.patientId &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(datePrescription, that.datePrescription) &&
                Objects.equals(dateRelance, that.dateRelance) &&
                Objects.equals(dateReprise, that.dateReprise) &&
                Objects.equals(dateResolution, that.dateResolution) &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(agenceId, that.agenceId) &&
                Objects.equals(depEnRetardStatutId, that.depEnRetardStatutId) &&
                Objects.equals(prescripteurId, that.prescripteurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, datePrescription, dateRelance, dateReprise, dateResolution, dateSuppr, agenceId, depEnRetardStatutId, patientId, prescripteurId);
    }

    @ManyToOne
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }

    @ManyToOne
    @JoinColumn(name = "dep_en_retard_statut_id", referencedColumnName = "id")
    public DepEnRetardStatut getDepEnRetardStatutByDepEnRetardStatutId() {
        return depEnRetardStatutByDepEnRetardStatutId;
    }

    public void setDepEnRetardStatutByDepEnRetardStatutId(DepEnRetardStatut depEnRetardStatutByDepEnRetardStatutId) {
        this.depEnRetardStatutByDepEnRetardStatutId = depEnRetardStatutByDepEnRetardStatutId;
    }
}
