package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "regime_complementaire_patient", schema = "ventury", catalog = "")
public class RegimeComplementairePatient {
    private int id;
    private Integer patientId;
    private Integer regimeComplementaireId;
    private Integer taux;
    private Timestamp dateDebut;
    private Timestamp dateFin;
    private String numeroAdherent;
    private Patient patientByPatientId;
    private RegimeComplementaire regimeComplementaireByRegimeComplementaireId;

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
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "regime_complementaire_id")
    public Integer getRegimeComplementaireId() {
        return regimeComplementaireId;
    }

    public void setRegimeComplementaireId(Integer regimeComplementaireId) {
        this.regimeComplementaireId = regimeComplementaireId;
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

    @Basic
    @Column(name = "numero_adherent")
    public String getNumeroAdherent() {
        return numeroAdherent;
    }

    public void setNumeroAdherent(String numeroAdherent) {
        this.numeroAdherent = numeroAdherent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegimeComplementairePatient that = (RegimeComplementairePatient) o;
        return id == that.id &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(regimeComplementaireId, that.regimeComplementaireId) &&
                Objects.equals(taux, that.taux) &&
                Objects.equals(dateDebut, that.dateDebut) &&
                Objects.equals(dateFin, that.dateFin) &&
                Objects.equals(numeroAdherent, that.numeroAdherent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, regimeComplementaireId, taux, dateDebut, dateFin, numeroAdherent);
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
    @JoinColumn(name = "regime_complementaire_id", referencedColumnName = "id")
    public RegimeComplementaire getRegimeComplementaireByRegimeComplementaireId() {
        return regimeComplementaireByRegimeComplementaireId;
    }

    public void setRegimeComplementaireByRegimeComplementaireId(RegimeComplementaire regimeComplementaireByRegimeComplementaireId) {
        this.regimeComplementaireByRegimeComplementaireId = regimeComplementaireByRegimeComplementaireId;
    }
}
