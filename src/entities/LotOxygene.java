package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "lot_oxygene", schema = "ventury", catalog = "")
public class LotOxygene {
    private int id;
    private int reservoirId;
    private String numeroLot;
    private Double quantiteInitiale;
    private Double quantiteRestante;
    private byte actif;
    private Date dateRemplissage;
    private Date datePeremption;
    private String bonLivraison;
    private Collection<CuveRemplissage> cuveRemplissagesById;
    private Collection<CuveRemplissage> cuveRemplissagesById_0;
    private Reservoir reservoirByReservoirId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "reservoir_id")
    public int getReservoirId() {
        return reservoirId;
    }

    public void setReservoirId(int reservoirId) {
        this.reservoirId = reservoirId;
    }

    @Basic
    @Column(name = "numero_lot")
    public String getNumeroLot() {
        return numeroLot;
    }

    public void setNumeroLot(String numeroLot) {
        this.numeroLot = numeroLot;
    }

    @Basic
    @Column(name = "quantite_initiale")
    public Double getQuantiteInitiale() {
        return quantiteInitiale;
    }

    public void setQuantiteInitiale(Double quantiteInitiale) {
        this.quantiteInitiale = quantiteInitiale;
    }

    @Basic
    @Column(name = "quantite_restante")
    public Double getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setQuantiteRestante(Double quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }

    @Basic
    @Column(name = "actif")
    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
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
    @Column(name = "date_peremption")
    public Date getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    @Basic
    @Column(name = "bon_livraison")
    public String getBonLivraison() {
        return bonLivraison;
    }

    public void setBonLivraison(String bonLivraison) {
        this.bonLivraison = bonLivraison;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotOxygene that = (LotOxygene) o;
        return id == that.id &&
                reservoirId == that.reservoirId &&
                actif == that.actif &&
                Objects.equals(numeroLot, that.numeroLot) &&
                Objects.equals(quantiteInitiale, that.quantiteInitiale) &&
                Objects.equals(quantiteRestante, that.quantiteRestante) &&
                Objects.equals(dateRemplissage, that.dateRemplissage) &&
                Objects.equals(datePeremption, that.datePeremption) &&
                Objects.equals(bonLivraison, that.bonLivraison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reservoirId, numeroLot, quantiteInitiale, quantiteRestante, actif, dateRemplissage, datePeremption, bonLivraison);
    }

    @OneToMany(mappedBy = "lotOxygeneByLotOxygeneId")
    public Collection<CuveRemplissage> getCuveRemplissagesById() {
        return cuveRemplissagesById;
    }

    public void setCuveRemplissagesById(Collection<CuveRemplissage> cuveRemplissagesById) {
        this.cuveRemplissagesById = cuveRemplissagesById;
    }

    @OneToMany(mappedBy = "lotOxygeneByLotOxygeneId_0")
    public Collection<CuveRemplissage> getCuveRemplissagesById_0() {
        return cuveRemplissagesById_0;
    }

    public void setCuveRemplissagesById_0(Collection<CuveRemplissage> cuveRemplissagesById_0) {
        this.cuveRemplissagesById_0 = cuveRemplissagesById_0;
    }

    @ManyToOne
    @JoinColumn(name = "reservoir_id", referencedColumnName = "id", nullable = false)
    public Reservoir getReservoirByReservoirId() {
        return reservoirByReservoirId;
    }

    public void setReservoirByReservoirId(Reservoir reservoirByReservoirId) {
        this.reservoirByReservoirId = reservoirByReservoirId;
    }
}
