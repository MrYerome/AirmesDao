package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_operation", schema = "ventury", catalog = "")
public class ParcMaterielOperation {
    private int id;
    private Integer etatV1;
    private String libelle;
    private Integer etat;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "etat_v1")
    public Integer getEtatV1() {
        return etatV1;
    }

    public void setEtatV1(Integer etatV1) {
        this.etatV1 = etatV1;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "etat")
    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcMaterielOperation that = (ParcMaterielOperation) o;
        return id == that.id &&
                Objects.equals(etatV1, that.etatV1) &&
                Objects.equals(libelle, that.libelle) &&
                Objects.equals(etat, that.etat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, etatV1, libelle, etat);
    }
}
