package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "profil_utilisateur", schema = "ventury", catalog = "")
public class ProfilUtilisateur {
    private int id;
    private String nom;
    private Collection<DroitAccesProfil> droitAccesProfilsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        ProfilUtilisateur that = (ProfilUtilisateur) o;
        return id == that.id &&
                Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @OneToMany(mappedBy = "profilUtilisateurByProfilUtilisateurId")
    public Collection<DroitAccesProfil> getDroitAccesProfilsById() {
        return droitAccesProfilsById;
    }

    public void setDroitAccesProfilsById(Collection<DroitAccesProfil> droitAccesProfilsById) {
        this.droitAccesProfilsById = droitAccesProfilsById;
    }
}
