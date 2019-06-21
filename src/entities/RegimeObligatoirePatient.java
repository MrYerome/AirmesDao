package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "regime_obligatoire_patient", schema = "ventury", catalog = "")
public class RegimeObligatoirePatient {
    private int id;
    private int patientId;
    private int regimeObligatoireId;
    private Integer taux;
    private Timestamp dateDebut;
    private Timestamp dateFin;
    private Patient patientByPatientId;
    private RegimeObligatoire regimeObligatoireByRegimeObligatoireId;

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

    @Basic
    @Column(name = "regime_obligatoire_id")
    public int getRegimeObligatoireId() {
        return regimeObligatoireId;
    }

    public void setRegimeObligatoireId(int regimeObligatoireId) {
        this.regimeObligatoireId = regimeObligatoireId;
    }

    @Basic
    @Column(name = "taux")
    public Integer getTaux() {
        return taux;
    }

    public void setTaux(Integer taux) {
        this.taux = taux;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegimeObligatoirePatient that = (RegimeObligatoirePatient) o;
        return id == that.id &&
                patientId == that.patientId &&
                regimeObligatoireId == that.regimeObligatoireId &&
                Objects.equals(taux, that.taux) &&
                Objects.equals(dateDebut, that.dateDebut) &&
                Objects.equals(dateFin, that.dateFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, regimeObligatoireId, taux, dateDebut, dateFin);
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
    @JoinColumn(name = "regime_obligatoire_id", referencedColumnName = "id", nullable = false)
    public RegimeObligatoire getRegimeObligatoireByRegimeObligatoireId() {
        return regimeObligatoireByRegimeObligatoireId;
    }

    public void setRegimeObligatoireByRegimeObligatoireId(RegimeObligatoire regimeObligatoireByRegimeObligatoireId) {
        this.regimeObligatoireByRegimeObligatoireId = regimeObligatoireByRegimeObligatoireId;
    }
}
