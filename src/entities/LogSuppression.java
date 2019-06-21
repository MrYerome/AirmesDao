package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "log_suppression", schema = "ventury", catalog = "")
@IdClass(LogSuppressionPK.class)
public class LogSuppression {
    private long idObjet;
    private String typeObjet;
    private Timestamp dateModif;

    @Id
    @Column(name = "id_objet")
    public long getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(long idObjet) {
        this.idObjet = idObjet;
    }

    @Id
    @Column(name = "type_objet")
    public String getTypeObjet() {
        return typeObjet;
    }

    public void setTypeObjet(String typeObjet) {
        this.typeObjet = typeObjet;
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
        LogSuppression that = (LogSuppression) o;
        return idObjet == that.idObjet &&
                Objects.equals(typeObjet, that.typeObjet) &&
                Objects.equals(dateModif, that.dateModif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObjet, typeObjet, dateModif);
    }
}
