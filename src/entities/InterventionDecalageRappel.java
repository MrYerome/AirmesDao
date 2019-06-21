package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "intervention_decalage_rappel", schema = "ventury", catalog = "")
public class InterventionDecalageRappel {
    private int id;
    private Timestamp dateSuppr;
    private String libelle;
    private Integer nbJourRappel;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Basic
    @Column(name = "nb_jour_rappel")
    public Integer getNbJourRappel() {
        return nbJourRappel;
    }

    public void setNbJourRappel(Integer nbJourRappel) {
        this.nbJourRappel = nbJourRappel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionDecalageRappel that = (InterventionDecalageRappel) o;
        return id == that.id &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(libelle, that.libelle) &&
                Objects.equals(nbJourRappel, that.nbJourRappel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateSuppr, libelle, nbJourRappel);
    }
}
