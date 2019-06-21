package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dossier_patient", schema = "ventury", catalog = "")
public class DossierPatient {
    private int id;
    private int patientId;
    private Dossier dossierById;
    private Dossier dossierById_0;
    private Patient patientByPatientId;
    private Patient patientByPatientId_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "patient_id")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DossierPatient that = (DossierPatient) o;
        return id == that.id &&
                patientId == that.patientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Dossier getDossierById() {
        return dossierById;
    }

    public void setDossierById(Dossier dossierById) {
        this.dossierById = dossierById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Dossier getDossierById_0() {
        return dossierById_0;
    }

    public void setDossierById_0(Dossier dossierById_0) {
        this.dossierById_0 = dossierById_0;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    public Patient getPatientByPatientId_0() {
        return patientByPatientId_0;
    }

    public void setPatientByPatientId_0(Patient patientByPatientId_0) {
        this.patientByPatientId_0 = patientByPatientId_0;
    }
}
