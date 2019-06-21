package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "obus_client", schema = "ventury", catalog = "")
public class ObusClient {
    private long id;
    private Date dateLivraison;
    private Date dateReprise;
    private Integer idVentury;
    private Integer dossierId;
    private Integer etablissementId;
    private Long interventionId;
    private int obusId;
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
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "date_reprise")
    public Date getDateReprise() {
        return dateReprise;
    }

    public void setDateReprise(Date dateReprise) {
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
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
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
    @Column(name = "intervention_id")
    public Long getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Long interventionId) {
        this.interventionId = interventionId;
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
        ObusClient that = (ObusClient) o;
        return id == that.id &&
                obusId == that.obusId &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(interventionId, that.interventionId) &&
                Objects.equals(prescripteurId, that.prescripteurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateLivraison, dateReprise, idVentury, dossierId, etablissementId, interventionId, obusId, prescripteurId);
    }
}
