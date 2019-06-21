package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "sauvegarde_demande_intervention", schema = "ventury", catalog = "")
public class SauvegardeDemandeIntervention {
    private int id;
    private Integer prescripteurId;
    private Integer patientId;
    private Integer typeId;
    private Integer domaineId;
    private Timestamp dateCreation;
    private String message;
    private String patientInfo;
    private Prescripteur prescripteurByPrescripteurId;
    private Patient patientByPatientId;
    private TypeDemandeIntervention typeDemandeInterventionByTypeId;
    private Domaine domaineByDomaineId;

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
    public Integer getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Integer prescripteurId) {
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
    @Column(name = "type_id")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "domaine_id")
    public Integer getDomaineId() {
        return domaineId;
    }

    public void setDomaineId(Integer domaineId) {
        this.domaineId = domaineId;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "patient_info")
    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SauvegardeDemandeIntervention that = (SauvegardeDemandeIntervention) o;
        return id == that.id &&
                Objects.equals(prescripteurId, that.prescripteurId) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(domaineId, that.domaineId) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(message, that.message) &&
                Objects.equals(patientInfo, that.patientInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prescripteurId, patientId, typeId, domaineId, dateCreation, message, patientInfo);
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
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    public TypeDemandeIntervention getTypeDemandeInterventionByTypeId() {
        return typeDemandeInterventionByTypeId;
    }

    public void setTypeDemandeInterventionByTypeId(TypeDemandeIntervention typeDemandeInterventionByTypeId) {
        this.typeDemandeInterventionByTypeId = typeDemandeInterventionByTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "domaine_id", referencedColumnName = "id")
    public Domaine getDomaineByDomaineId() {
        return domaineByDomaineId;
    }

    public void setDomaineByDomaineId(Domaine domaineByDomaineId) {
        this.domaineByDomaineId = domaineByDomaineId;
    }
}
