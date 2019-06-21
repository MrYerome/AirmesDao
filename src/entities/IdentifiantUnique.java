package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "identifiant_unique", schema = "ventury", catalog = "")
public class IdentifiantUnique {
    private String nomTable;
    private Long identifiant;

    @Id
    @Column(name = "nom_table")
    public String getNomTable() {
        return nomTable;
    }

    public void setNomTable(String nomTable) {
        this.nomTable = nomTable;
    }

    @Basic
    @Column(name = "identifiant")
    public Long getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Long identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentifiantUnique that = (IdentifiantUnique) o;
        return Objects.equals(nomTable, that.nomTable) &&
                Objects.equals(identifiant, that.identifiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomTable, identifiant);
    }
}
