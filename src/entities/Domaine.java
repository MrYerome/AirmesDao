package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Domaine {
    private int id;
    private String libelle;
    private Collection<DemandeIntervention> demandeInterventionsById;
    private Collection<DemandeIntervention> demandeInterventionsById_0;
    private Collection<ParametreDomaine> parametreDomainesById;
    private Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        Domaine domaine = (Domaine) o;
        return id == domaine.id &&
                Objects.equals(libelle, domaine.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle);
    }

    @OneToMany(mappedBy = "domaineByDomaineId")
    public Collection<DemandeIntervention> getDemandeInterventionsById() {
        return demandeInterventionsById;
    }

    public void setDemandeInterventionsById(Collection<DemandeIntervention> demandeInterventionsById) {
        this.demandeInterventionsById = demandeInterventionsById;
    }

    @OneToMany(mappedBy = "domaineByDomaineId_0")
    public Collection<DemandeIntervention> getDemandeInterventionsById_0() {
        return demandeInterventionsById_0;
    }

    public void setDemandeInterventionsById_0(Collection<DemandeIntervention> demandeInterventionsById_0) {
        this.demandeInterventionsById_0 = demandeInterventionsById_0;
    }

    @OneToMany(mappedBy = "domaineByDomaineId")
    public Collection<ParametreDomaine> getParametreDomainesById() {
        return parametreDomainesById;
    }

    public void setParametreDomainesById(Collection<ParametreDomaine> parametreDomainesById) {
        this.parametreDomainesById = parametreDomainesById;
    }

    @OneToMany(mappedBy = "domaineByDomaineId")
    public Collection<SauvegardeDemandeIntervention> getSauvegardeDemandeInterventionsById() {
        return sauvegardeDemandeInterventionsById;
    }

    public void setSauvegardeDemandeInterventionsById(Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById) {
        this.sauvegardeDemandeInterventionsById = sauvegardeDemandeInterventionsById;
    }
}
