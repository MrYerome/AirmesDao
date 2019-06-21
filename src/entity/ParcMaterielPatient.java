package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_patient", schema = "ventury", catalog = "")
public class ParcMaterielPatient {
    private int id;
    private Date dateLivraison;
    private Date dateReprise;
    private ParcMateriel parcMaterielByParcMaterielId;
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
        ParcMaterielPatient that = (ParcMaterielPatient) o;
        return id == that.id &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateLivraison, dateReprise);
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
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
