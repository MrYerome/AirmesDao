package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "parametre_domaine", schema = "ventury", catalog = "")
public class ParametreDomaine {
    private int id;
    private int domaineId;
    private String libelle;
    private String typeDonnee;
    private Domaine domaineByDomaineId;
    private Collection<ValeurReglage> valeurReglagesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "domaine_id")
    public int getDomaineId() {
        return domaineId;
    }

    public void setDomaineId(int domaineId) {
        this.domaineId = domaineId;
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
    @Column(name = "type_donnee")
    public String getTypeDonnee() {
        return typeDonnee;
    }

    public void setTypeDonnee(String typeDonnee) {
        this.typeDonnee = typeDonnee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParametreDomaine that = (ParametreDomaine) o;
        return id == that.id &&
                domaineId == that.domaineId &&
                Objects.equals(libelle, that.libelle) &&
                Objects.equals(typeDonnee, that.typeDonnee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, domaineId, libelle, typeDonnee);
    }

    @ManyToOne
    @JoinColumn(name = "domaine_id", referencedColumnName = "id", nullable = false)
    public Domaine getDomaineByDomaineId() {
        return domaineByDomaineId;
    }

    public void setDomaineByDomaineId(Domaine domaineByDomaineId) {
        this.domaineByDomaineId = domaineByDomaineId;
    }

    @OneToMany(mappedBy = "parametreDomaineByParametreId")
    public Collection<ValeurReglage> getValeurReglagesById() {
        return valeurReglagesById;
    }

    public void setValeurReglagesById(Collection<ValeurReglage> valeurReglagesById) {
        this.valeurReglagesById = valeurReglagesById;
    }
}
