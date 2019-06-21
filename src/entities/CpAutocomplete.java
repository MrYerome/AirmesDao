package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "cp_autocomplete", schema = "ventury", catalog = "")
public class CpAutocomplete {
    private String codepays;
    private String cp;
    private String ville;

    @Basic
    @Column(name = "CODEPAYS")
    public String getCodepays() {
        return codepays;
    }

    public void setCodepays(String codepays) {
        this.codepays = codepays;
    }

    @Basic
    @Column(name = "CP")
    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Basic
    @Column(name = "VILLE")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CpAutocomplete that = (CpAutocomplete) o;
        return Objects.equals(codepays, that.codepays) &&
                Objects.equals(cp, that.cp) &&
                Objects.equals(ville, that.ville);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codepays, cp, ville);
    }
}
