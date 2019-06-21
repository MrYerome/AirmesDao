package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_client", schema = "ventury", catalog = "")
public class ParcMaterielClient {
    private int id;
    private Integer parcMaterielId;
    private Integer prescripteurId;
    private Integer dossierId;
    private Integer interventionId;
    private Date dateLivraison;
    private Date dateReprise;
    private ParcMateriel parcMaterielByParcMaterielId;
    private Prescripteur prescripteurByPrescripteurId;
    private Dossier dossierByDossierId;
    private Intervention interventionByInterventionId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parc_materiel_id")
    public Integer getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(Integer parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
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
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
    }

    @Basic
    @Column(name = "intervention_id")
    public Integer getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Integer interventionId) {
        this.interventionId = interventionId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcMaterielClient that = (ParcMaterielClient) o;
        return id == that.id &&
                Objects.equals(parcMaterielId, that.parcMaterielId) &&
                Objects.equals(prescripteurId, that.prescripteurId) &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(interventionId, that.interventionId) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, prescripteurId, dossierId, interventionId, dateLivraison, dateReprise);
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id")
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
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
    @JoinColumn(name = "dossier_id", referencedColumnName = "id")
    public Dossier getDossierByDossierId() {
        return dossierByDossierId;
    }

    public void setDossierByDossierId(Dossier dossierByDossierId) {
        this.dossierByDossierId = dossierByDossierId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id")
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
