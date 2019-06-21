package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class LogModifPK implements Serializable {
    private String typeObjet;
    private int idObjet;

    @Column(name = "type_objet")
    @Id
    public String getTypeObjet() {
        return typeObjet;
    }

    public void setTypeObjet(String typeObjet) {
        this.typeObjet = typeObjet;
    }

    @Column(name = "id_objet")
    @Id
    public int getIdObjet() {
        return idObjet;
    }

    public void setIdObjet(int idObjet) {
        this.idObjet = idObjet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogModifPK that = (LogModifPK) o;
        return idObjet == that.idObjet &&
                Objects.equals(typeObjet, that.typeObjet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeObjet, idObjet);
    }
}
