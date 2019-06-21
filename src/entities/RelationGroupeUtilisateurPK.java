package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RelationGroupeUtilisateurPK implements Serializable {
    private int utilisateurId;
    private int groupeUtilisateurId;

    @Column(name = "utilisateur_id")
    @Id
    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Column(name = "groupe_utilisateur_id")
    @Id
    public int getGroupeUtilisateurId() {
        return groupeUtilisateurId;
    }

    public void setGroupeUtilisateurId(int groupeUtilisateurId) {
        this.groupeUtilisateurId = groupeUtilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelationGroupeUtilisateurPK that = (RelationGroupeUtilisateurPK) o;
        return utilisateurId == that.utilisateurId &&
                groupeUtilisateurId == that.groupeUtilisateurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateurId, groupeUtilisateurId);
    }
}
