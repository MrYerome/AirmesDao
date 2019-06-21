package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fichier_temporaire", schema = "ventury", catalog = "")
public class FichierTemporaire {
    private int id;
    private String chemin;
    private Timestamp dateAjout;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "chemin")
    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }

    @Basic
    @Column(name = "date_ajout")
    public Timestamp getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Timestamp dateAjout) {
        this.dateAjout = dateAjout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FichierTemporaire that = (FichierTemporaire) o;
        return id == that.id &&
                Objects.equals(chemin, that.chemin) &&
                Objects.equals(dateAjout, that.dateAjout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chemin, dateAjout);
    }
}
