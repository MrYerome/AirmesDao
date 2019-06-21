package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "log_modif", schema = "ventury", catalog = "")
@IdClass(LogModifPK.class)
public class LogModif {
    private String typeObjet;
    private int idObjet;
    private Timestamp dateModif;

    @Id
    @Column(name = "type_objet")
    public String getTypeObjet() {
        return typeObjet;
    }

    public void setTypeObjet(String typeObjet) {
        this.typeObjet = typeObjet;
    }

    @Id
    @Column(name = "id_objet")
    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    @Basic
    @Column(name = "date_modif")
    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogModif logModif = (LogModif) o;
        return idObjet == logModif.idObjet &&
                Objects.equals(typeObjet, logModif.typeObjet) &&
                Objects.equals(dateModif, logModif.dateModif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeObjet, idObjet, dateModif);
    }
}
