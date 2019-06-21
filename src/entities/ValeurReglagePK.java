package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ValeurReglagePK implements Serializable {
    private int parametreId;
    private int demandeId;

    @Column(name = "parametre_id")
    @Id
    public int getParametreId() {
        return parametreId;
    }

    public void setParametreId(int parametreId) {
        this.parametreId = parametreId;
    }

    @Column(name = "demande_id")
    @Id
    public int getDemandeId() {
        return demandeId;
    }

    public void setDemandeId(int demandeId) {
        this.demandeId = demandeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurReglagePK that = (ValeurReglagePK) o;
        return parametreId == that.parametreId &&
                demandeId == that.demandeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(parametreId, demandeId);
    }
}
