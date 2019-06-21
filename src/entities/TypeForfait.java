package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "type_forfait", schema = "ventury", catalog = "")
public class TypeForfait {
    private int id;
    private String libelle;
    private Collection<Forfait> forfaitsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeForfait that = (TypeForfait) o;
        return id == that.id &&
                Objects.equals(libelle, that.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle);
    }

    @OneToMany(mappedBy = "typeForfaitByTypeId")
    public Collection<Forfait> getForfaitsById() {
        return forfaitsById;
    }

    public void setForfaitsById(Collection<Forfait> forfaitsById) {
        this.forfaitsById = forfaitsById;
    }
}
