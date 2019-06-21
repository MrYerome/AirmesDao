package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "dep_en_retard_statut", schema = "ventury", catalog = "")
public class DepEnRetardStatut {
    private int id;
    private String couleur;
    private Timestamp dateSuppr;
    private String libelle;
    private Collection<DepEnRetard2> depEnRetard2sById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "couleur")
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepEnRetardStatut that = (DepEnRetardStatut) o;
        return id == that.id &&
                Objects.equals(couleur, that.couleur) &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(libelle, that.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, couleur, dateSuppr, libelle);
    }

    @OneToMany(mappedBy = "depEnRetardStatutByDepEnRetardStatutId")
    public Collection<DepEnRetard2> getDepEnRetard2sById() {
        return depEnRetard2sById;
    }

    public void setDepEnRetard2sById(Collection<DepEnRetard2> depEnRetard2sById) {
        this.depEnRetard2sById = depEnRetard2sById;
    }
}
