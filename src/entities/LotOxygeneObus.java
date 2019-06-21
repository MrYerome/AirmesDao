package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "lot_oxygene_obus", schema = "ventury", catalog = "")
public class LotOxygeneObus {
    private int id;
    private int obusId;
    private String numeroLot;
    private Date dateReception;
    private Date datePeremption;
    private Obus obusByObusId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "numero_lot")
    public String getNumeroLot() {
        return numeroLot;
    }

    public void setNumeroLot(String numeroLot) {
        this.numeroLot = numeroLot;
    }

    @Basic
    @Column(name = "date_reception")
    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    @Basic
    @Column(name = "date_peremption")
    public Date getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(Date datePeremption) {
        this.datePeremption = datePeremption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LotOxygeneObus that = (LotOxygeneObus) o;
        return id == that.id &&
                obusId == that.obusId &&
                Objects.equals(numeroLot, that.numeroLot) &&
                Objects.equals(dateReception, that.dateReception) &&
                Objects.equals(datePeremption, that.datePeremption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, obusId, numeroLot, dateReception, datePeremption);
    }

    @ManyToOne
    @JoinColumn(name = "obus_id", referencedColumnName = "id", nullable = false)
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
    }
}
