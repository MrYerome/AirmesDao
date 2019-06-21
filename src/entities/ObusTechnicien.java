package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "obus_technicien", schema = "ventury", catalog = "")
public class ObusTechnicien {
    private int id;
    private int obusId;
    private int technicienId;
    private Date dateEntree;
    private Date dateSortie;
    private byte reserve;
    private byte obusRepris;
    private Obus obusByObusId;
    private Technicien technicienByTechnicienId;

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
    @Column(name = "technicien_id")
    public int getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(int technicienId) {
        this.technicienId = technicienId;
    }

    @Basic
    @Column(name = "date_entree")
    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    @Basic
    @Column(name = "date_sortie")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "reserve")
    public byte getReserve() {
        return reserve;
    }

    public void setReserve(byte reserve) {
        this.reserve = reserve;
    }

    @Basic
    @Column(name = "obus_repris")
    public byte getObusRepris() {
        return obusRepris;
    }

    public void setObusRepris(byte obusRepris) {
        this.obusRepris = obusRepris;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObusTechnicien that = (ObusTechnicien) o;
        return id == that.id &&
                obusId == that.obusId &&
                technicienId == that.technicienId &&
                reserve == that.reserve &&
                obusRepris == that.obusRepris &&
                Objects.equals(dateEntree, that.dateEntree) &&
                Objects.equals(dateSortie, that.dateSortie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, obusId, technicienId, dateEntree, dateSortie, reserve, obusRepris);
    }

    @ManyToOne
    @JoinColumn(name = "obus_id", referencedColumnName = "id", nullable = false)
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id", nullable = false)
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }
}
