package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Fonctionnalite {
    private int id;
    private String description;
    private String nom;
    private Collection<DroitAccesProfil> droitAccesProfilsById;
    private Collection<DroitAccesUtilisateur> droitAccesUtilisateursById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fonctionnalite that = (Fonctionnalite) o;
        return id == that.id &&
                Objects.equals(description, that.description) &&
                Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, nom);
    }

    @OneToMany(mappedBy = "fonctionnaliteByFonctionnaliteId")
    public Collection<DroitAccesProfil> getDroitAccesProfilsById() {
        return droitAccesProfilsById;
    }

    public void setDroitAccesProfilsById(Collection<DroitAccesProfil> droitAccesProfilsById) {
        this.droitAccesProfilsById = droitAccesProfilsById;
    }

    @OneToMany(mappedBy = "fonctionnaliteByFonctionnaliteId")
    public Collection<DroitAccesUtilisateur> getDroitAccesUtilisateursById() {
        return droitAccesUtilisateursById;
    }

    public void setDroitAccesUtilisateursById(Collection<DroitAccesUtilisateur> droitAccesUtilisateursById) {
        this.droitAccesUtilisateursById = droitAccesUtilisateursById;
    }
}
