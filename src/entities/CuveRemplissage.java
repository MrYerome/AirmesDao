package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "cuve_remplissage", schema = "ventury", catalog = "")
@IdClass(CuveRemplissagePK.class)
public class CuveRemplissage {
    private int cuveOxygeneId;
    private int lotOxygeneId;
    private Date dateRemplissage;
    private Double poidsVide;
    private Double poidsPlein;
    private CuveOxygene cuveOxygeneByCuveOxygeneId;
    private CuveOxygene cuveOxygeneByCuveOxygeneId_0;
    private LotOxygene lotOxygeneByLotOxygeneId;
    private LotOxygene lotOxygeneByLotOxygeneId_0;

    @Id
    @Column(name = "cuve_oxygene_id")
    public int getCuveOxygeneId() {
        return cuveOxygeneId;
    }

    public void setCuveOxygeneId(int cuveOxygeneId) {
        this.cuveOxygeneId = cuveOxygeneId;
    }

    @Id
    @Column(name = "lot_oxygene_id")
    public int getLotOxygeneId() {
        return lotOxygeneId;
    }

    public void setLotOxygeneId(int lotOxygeneId) {
        this.lotOxygeneId = lotOxygeneId;
    }

    @Basic
    @Column(name = "date_remplissage")
    public Date getDateRemplissage() {
        return dateRemplissage;
    }

    public void setDateRemplissage(Date dateRemplissage) {
        this.dateRemplissage = dateRemplissage;
    }

    @Basic
    @Column(name = "poids_vide")
    public Double getPoidsVide() {
        return poidsVide;
    }

    public void setPoidsVide(Double poidsVide) {
        this.poidsVide = poidsVide;
    }

    @Basic
    @Column(name = "poids_plein")
    public Double getPoidsPlein() {
        return poidsPlein;
    }

    public void setPoidsPlein(Double poidsPlein) {
        this.poidsPlein = poidsPlein;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuveRemplissage that = (CuveRemplissage) o;
        return cuveOxygeneId == that.cuveOxygeneId &&
                lotOxygeneId == that.lotOxygeneId &&
                Objects.equals(dateRemplissage, that.dateRemplissage) &&
                Objects.equals(poidsVide, that.poidsVide) &&
                Objects.equals(poidsPlein, that.poidsPlein);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuveOxygeneId, lotOxygeneId, dateRemplissage, poidsVide, poidsPlein);
    }

    @ManyToOne
    @JoinColumn(name = "cuve_oxygene_id", referencedColumnName = "id", nullable = false)
    public CuveOxygene getCuveOxygeneByCuveOxygeneId() {
        return cuveOxygeneByCuveOxygeneId;
    }

    public void setCuveOxygeneByCuveOxygeneId(CuveOxygene cuveOxygeneByCuveOxygeneId) {
        this.cuveOxygeneByCuveOxygeneId = cuveOxygeneByCuveOxygeneId;
    }

    @ManyToOne
    @JoinColumn(name = "cuve_oxygene_id", referencedColumnName = "id", nullable = false)
    public CuveOxygene getCuveOxygeneByCuveOxygeneId_0() {
        return cuveOxygeneByCuveOxygeneId_0;
    }

    public void setCuveOxygeneByCuveOxygeneId_0(CuveOxygene cuveOxygeneByCuveOxygeneId_0) {
        this.cuveOxygeneByCuveOxygeneId_0 = cuveOxygeneByCuveOxygeneId_0;
    }

    @ManyToOne
    @JoinColumn(name = "lot_oxygene_id", referencedColumnName = "id", nullable = false)
    public LotOxygene getLotOxygeneByLotOxygeneId() {
        return lotOxygeneByLotOxygeneId;
    }

    public void setLotOxygeneByLotOxygeneId(LotOxygene lotOxygeneByLotOxygeneId) {
        this.lotOxygeneByLotOxygeneId = lotOxygeneByLotOxygeneId;
    }

    @ManyToOne
    @JoinColumn(name = "lot_oxygene_id", referencedColumnName = "id", nullable = false)
    public LotOxygene getLotOxygeneByLotOxygeneId_0() {
        return lotOxygeneByLotOxygeneId_0;
    }

    public void setLotOxygeneByLotOxygeneId_0(LotOxygene lotOxygeneByLotOxygeneId_0) {
        this.lotOxygeneByLotOxygeneId_0 = lotOxygeneByLotOxygeneId_0;
    }
}
