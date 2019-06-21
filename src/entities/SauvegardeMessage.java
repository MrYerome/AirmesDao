package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sauvegarde_message", schema = "ventury", catalog = "")
public class SauvegardeMessage {
    private int id;
    private int prescripteurId;
    private Integer patientId;
    private Timestamp dateCreation;
    private String objet;
    private String message;
    private Prescripteur prescripteurByPrescripteurId;
    private Patient patientByPatientId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public int getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(int prescripteurId) {
        this.prescripteurId = prescripteurId;
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
    @Column(name = "date_creation")
    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "objet")
    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SauvegardeMessage that = (SauvegardeMessage) o;
        return id == that.id &&
                prescripteurId == that.prescripteurId &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(objet, that.objet) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prescripteurId, patientId, dateCreation, objet, message);
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurByPrescripteurId() {
        return prescripteurByPrescripteurId;
    }

    public void setPrescripteurByPrescripteurId(Prescripteur prescripteurByPrescripteurId) {
        this.prescripteurByPrescripteurId = prescripteurByPrescripteurId;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }
}
