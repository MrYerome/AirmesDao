package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "lien_parente", schema = "ventury", catalog = "")
public class LienParente {
    private int id;
    private String label;
    private Collection<AyantDroit> ayantDroitsById;
    private Collection<AyantDroit> ayantDroitsById_0;
    private Collection<AyantDroit> ayantDroitsById_1;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LienParente that = (LienParente) o;
        return id == that.id &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }

    @OneToMany(mappedBy = "lienParenteByLienParenteId")
    public Collection<AyantDroit> getAyantDroitsById() {
        return ayantDroitsById;
    }

    public void setAyantDroitsById(Collection<AyantDroit> ayantDroitsById) {
        this.ayantDroitsById = ayantDroitsById;
    }

    @OneToMany(mappedBy = "lienParenteByLienParenteId_0")
    public Collection<AyantDroit> getAyantDroitsById_0() {
        return ayantDroitsById_0;
    }

    public void setAyantDroitsById_0(Collection<AyantDroit> ayantDroitsById_0) {
        this.ayantDroitsById_0 = ayantDroitsById_0;
    }

    @OneToMany(mappedBy = "lienParenteByLienParenteId_1")
    public Collection<AyantDroit> getAyantDroitsById_1() {
        return ayantDroitsById_1;
    }

    public void setAyantDroitsById_1(Collection<AyantDroit> ayantDroitsById_1) {
        this.ayantDroitsById_1 = ayantDroitsById_1;
    }
}
