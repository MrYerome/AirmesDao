package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LogSuppressionPK implements Serializable {
    private long idObjet;
    private String typeObjet;

    @Column(name = "id_objet")
    @Id
    public long getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(long idObjet) {
        this.idObjet = idObjet;
    }

    @Column(name = "type_objet")
    @Id
    public String getTypeObjet() {
        return typeObjet;
    }

    public void setTypeObjet(String typeObjet) {
        this.typeObjet = typeObjet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogSuppressionPK that = (LogSuppressionPK) o;
        return idObjet == that.idObjet &&
                Objects.equals(typeObjet, that.typeObjet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idObjet, typeObjet);
    }
}
