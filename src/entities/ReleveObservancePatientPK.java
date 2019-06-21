package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class ReleveObservancePatientPK implements Serializable {
    private int patientId;
    private Date dateReleve;

    @Column(name = "patient_id")
    @Id
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Column(name = "date_releve")
    @Id
    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReleveObservancePatientPK that = (ReleveObservancePatientPK) o;
        return patientId == that.patientId &&
                Objects.equals(dateReleve, that.dateReleve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId, dateReleve);
    }
}
