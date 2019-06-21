package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DroitAccesProfilPK implements Serializable {
    private int fonctionnaliteId;
    private int profilUtilisateurId;

    @Column(name = "fonctionnalite_id")
    @Id
    public int getFonctionnaliteId() {
        return fonctionnaliteId;
    }

    public void setFonctionnaliteId(int fonctionnaliteId) {
        this.fonctionnaliteId = fonctionnaliteId;
    }

    @Column(name = "profil_utilisateur_id")
    @Id
    public int getProfilUtilisateurId() {
        return profilUtilisateurId;
    }

    public void setProfilUtilisateurId(int profilUtilisateurId) {
        this.profilUtilisateurId = profilUtilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DroitAccesProfilPK that = (DroitAccesProfilPK) o;
        return fonctionnaliteId == that.fonctionnaliteId &&
                profilUtilisateurId == that.profilUtilisateurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fonctionnaliteId, profilUtilisateurId);
    }
}
