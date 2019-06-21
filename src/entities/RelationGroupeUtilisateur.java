package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "relation_groupe_utilisateur", schema = "ventury", catalog = "")
@IdClass(RelationGroupeUtilisateurPK.class)
public class RelationGroupeUtilisateur {
    private int utilisateurId;
    private int groupeUtilisateurId;

    @Id
    @Column(name = "utilisateur_id")
    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Id
    @Column(name = "groupe_utilisateur_id")
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
        RelationGroupeUtilisateur that = (RelationGroupeUtilisateur) o;
        return utilisateurId == that.utilisateurId &&
                groupeUtilisateurId == that.groupeUtilisateurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateurId, groupeUtilisateurId);
    }
}
