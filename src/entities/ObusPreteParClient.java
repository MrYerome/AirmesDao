package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "obus_prete_par_client", schema = "ventury", catalog = "")
public class ObusPreteParClient {
    private long id;
    private Timestamp dateLivraison;
    private Timestamp dateReprise;
    private Integer idVentury;
    private Integer etablissementId;
    private int obusId;
    private long patientId;
    private Long prescripteurId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_livraison")
    public Timestamp getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Timestamp dateLivraison) {
        this.dateLivraison = dateLivraison;
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
    @Column(name = "idVentury")
    public Integer getIdVentury() {
        return idVentury;
    }

    public void setIdVentury(Integer idVentury) {
        this.idVentury = idVentury;
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
    @Column(name = "obus_id")
    public int getObusId() {
        return obusId;
    }

    public void setObusId(int obusId) {
        this.obusId = obusId;
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
        ObusPreteParClient that = (ObusPreteParClient) o;
        return id == that.id &&
                obusId == that.obusId &&
                patientId == that.patientId &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(prescripteurId, that.prescripteurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateLivraison, dateReprise, idVentury, etablissementId, obusId, patientId, prescripteurId);
    }
}
