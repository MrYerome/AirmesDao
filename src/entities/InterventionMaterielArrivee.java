package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "intervention_materiel_arrivee", schema = "ventury", catalog = "")
public class InterventionMaterielArrivee {
    private int id;
    private Integer parcMaterielId;
    private Integer obusId;
    private int interventionId;
    private ParcMateriel parcMaterielByParcMaterielId;
    private Obus obusByObusId;
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
    @Column(name = "obus_id")
    public Integer getObusId() {
        return obusId;
    }

    public void setObusId(Integer obusId) {
        this.obusId = obusId;
    }

    @Basic
    @Column(name = "intervention_id")
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionMaterielArrivee that = (InterventionMaterielArrivee) o;
        return id == that.id &&
                interventionId == that.interventionId &&
                Objects.equals(parcMaterielId, that.parcMaterielId) &&
                Objects.equals(obusId, that.obusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, obusId, interventionId);
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
    @JoinColumn(name = "obus_id", referencedColumnName = "id")
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
