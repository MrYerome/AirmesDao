package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rendez_vous_prescripteur", schema = "ventury", catalog = "")
public class RendezVousPrescripteur {
    private long id;
    private Timestamp date;
    private Timestamp dateSuppr;
    private Integer idVentury;
    private long patientId;
    private long prescripteurId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
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
    @Column(name = "idVentury")
    public Integer getIdVentury() {
        return idVentury;
    }

    public void setIdVentury(Integer idVentury) {
        this.idVentury = idVentury;
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
    public long getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(long prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RendezVousPrescripteur that = (RendezVousPrescripteur) o;
        return id == that.id &&
                patientId == that.patientId &&
                prescripteurId == that.prescripteurId &&
                Objects.equals(date, that.date) &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(idVentury, that.idVentury);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, dateSuppr, idVentury, patientId, prescripteurId);
    }
}
