package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "cuve_oxygene", schema = "ventury", catalog = "")
public class CuveOxygene {
    private int id;
    private ParcMateriel parcMaterielById;
    private ParcMateriel parcMaterielById_0;
    private Collection<CuveRemplissage> cuveRemplissagesById;
    private Collection<CuveRemplissage> cuveRemplissagesById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuveOxygene that = (CuveOxygene) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielById() {
        return parcMaterielById;
    }

    public void setParcMaterielById(ParcMateriel parcMaterielById) {
        this.parcMaterielById = parcMaterielById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielById_0() {
        return parcMaterielById_0;
    }

    public void setParcMaterielById_0(ParcMateriel parcMaterielById_0) {
        this.parcMaterielById_0 = parcMaterielById_0;
    }

    @OneToMany(mappedBy = "cuveOxygeneByCuveOxygeneId")
    public Collection<CuveRemplissage> getCuveRemplissagesById() {
        return cuveRemplissagesById;
    }

    public void setCuveRemplissagesById(Collection<CuveRemplissage> cuveRemplissagesById) {
        this.cuveRemplissagesById = cuveRemplissagesById;
    }

    @OneToMany(mappedBy = "cuveOxygeneByCuveOxygeneId_0")
    public Collection<CuveRemplissage> getCuveRemplissagesById_0() {
        return cuveRemplissagesById_0;
    }

    public void setCuveRemplissagesById_0(Collection<CuveRemplissage> cuveRemplissagesById_0) {
        this.cuveRemplissagesById_0 = cuveRemplissagesById_0;
    }
}
