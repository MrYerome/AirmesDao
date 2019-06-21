package entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "releve_observance_patient", schema = "ventury", catalog = "")
@IdClass(ReleveObservancePatientPK.class)
public class ReleveObservancePatient {
    private int patientId;
    private Date dateReleve;
    private Integer valeur;
    private Timestamp dateCreation;
    private BigDecimal iah;
    private BigDecimal fuites;

    @Id
    @Column(name = "patient_id")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Id
    @Column(name = "date_releve")
    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    @Basic
    @Column(name = "valeur")
    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
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
    @Column(name = "iah")
    public BigDecimal getIah() {
        return iah;
    }

    public void setIah(BigDecimal iah) {
        this.iah = iah;
    }

    @Basic
    @Column(name = "fuites")
    public BigDecimal getFuites() {
        return fuites;
    }

    public void setFuites(BigDecimal fuites) {
        this.fuites = fuites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReleveObservancePatient that = (ReleveObservancePatient) o;
        return patientId == that.patientId &&
                Objects.equals(dateReleve, that.dateReleve) &&
                Objects.equals(valeur, that.valeur) &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(iah, that.iah) &&
                Objects.equals(fuites, that.fuites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, dateReleve, valeur, dateCreation, iah, fuites);
    }
}
