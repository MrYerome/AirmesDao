package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LivraisonOxygenePK implements Serializable {
    private long interventionId;
    private int parcMaterielId;

    @Column(name = "intervention_id")
    @Id
    public long getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(long interventionId) {
        this.interventionId = interventionId;
    }

    @Column(name = "parc_materiel_id")
    @Id
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivraisonOxygenePK that = (LivraisonOxygenePK) o;
        return interventionId == that.interventionId &&
                parcMaterielId == that.parcMaterielId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, parcMaterielId);
    }
}
