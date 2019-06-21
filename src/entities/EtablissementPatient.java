package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "etablissement_patient", schema = "ventury", catalog = "")
public class EtablissementPatient {
    private int id;
    private Integer etablissementId;
    private Integer patientId;
    private Etablissement etablissementByEtablissementId;
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
    @Column(name = "etablissement_id")
    public Integer getEtablissementId() {
        return etablissementId;
    }

    public void setEtablissementId(Integer etablissementId) {
        this.etablissementId = etablissementId;
    }

    @Basic
    @Column(name = "patient_id")
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtablissementPatient that = (EtablissementPatient) o;
        return id == that.id &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(patientId, that.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, etablissementId, patientId);
    }

    @ManyToOne
    @JoinColumn(name = "etablissement_id", referencedColumnName = "id")
    public Etablissement getEtablissementByEtablissementId() {
        return etablissementByEtablissementId;
    }

    public void setEtablissementByEtablissementId(Etablissement etablissementByEtablissementId) {
        this.etablissementByEtablissementId = etablissementByEtablissementId;
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
