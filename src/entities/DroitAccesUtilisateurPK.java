package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DroitAccesUtilisateurPK implements Serializable {
    private int fonctionnaliteId;
    private int utilisateurId;

    @Column(name = "fonctionnalite_id")
    @Id
    public int getFonctionnaliteId() {
        return fonctionnaliteId;
    }

    public void setFonctionnaliteId(int fonctionnaliteId) {
        this.fonctionnaliteId = fonctionnaliteId;
    }

    @Column(name = "utilisateur_id")
    @Id
    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DroitAccesUtilisateurPK that = (DroitAccesUtilisateurPK) o;
        return fonctionnaliteId == that.fonctionnaliteId &&
                utilisateurId == that.utilisateurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fonctionnaliteId, utilisateurId);
    }
}
