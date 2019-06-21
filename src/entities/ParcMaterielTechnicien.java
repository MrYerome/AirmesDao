package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_technicien", schema = "ventury", catalog = "")
public class ParcMaterielTechnicien {
    private int id;
    private Integer parcMaterielId;
    private Integer technicienId;
    private Date dateEntree;
    private Date dateSortie;
    private byte reserve;
    private byte materielRepris;
    private ParcMateriel parcMaterielByParcMaterielId;
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
    @Column(name = "parc_materiel_id")
    public Integer getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(Integer parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Basic
    @Column(name = "technicien_id")
    public Integer getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(Integer technicienId) {
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
    @Column(name = "materiel_repris")
    public byte getMaterielRepris() {
        return materielRepris;
    }

    public void setMaterielRepris(byte materielRepris) {
        this.materielRepris = materielRepris;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcMaterielTechnicien that = (ParcMaterielTechnicien) o;
        return id == that.id &&
                reserve == that.reserve &&
                materielRepris == that.materielRepris &&
                Objects.equals(parcMaterielId, that.parcMaterielId) &&
                Objects.equals(technicienId, that.technicienId) &&
                Objects.equals(dateEntree, that.dateEntree) &&
                Objects.equals(dateSortie, that.dateSortie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, technicienId, dateEntree, dateSortie, reserve, materielRepris);
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
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }
}
