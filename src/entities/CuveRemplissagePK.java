package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CuveRemplissagePK implements Serializable {
    private int cuveOxygeneId;
    private int lotOxygeneId;

    @Column(name = "cuve_oxygene_id")
    @Id
    public int getCuveOxygeneId() {
        return cuveOxygeneId;
    }

    public void setCuveOxygeneId(int cuveOxygeneId) {
        this.cuveOxygeneId = cuveOxygeneId;
    }

    @Column(name = "lot_oxygene_id")
    @Id
    public int getLotOxygeneId() {
        return lotOxygeneId;
    }

    public void setLotOxygeneId(int lotOxygeneId) {
        this.lotOxygeneId = lotOxygeneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuveRemplissagePK that = (CuveRemplissagePK) o;
        return cuveOxygeneId == that.cuveOxygeneId &&
                lotOxygeneId == that.lotOxygeneId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuveOxygeneId, lotOxygeneId);
    }
}
