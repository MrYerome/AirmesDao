package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Prestation {
    private int id;
    private String code;
    private String designation;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "designation")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prestation that = (Prestation) o;
        return id == that.id &&
                Objects.equals(code, that.code) &&
                Objects.equals(designation, that.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, designation);
    }

    @OneToMany(mappedBy = "prestationByCodePrestaId")
    public Collection<Forfait> getForfaitsById() {
        return forfaitsById;
    }

    public void setForfaitsById(Collection<Forfait> forfaitsById) {
        this.forfaitsById = forfaitsById;
    }
}
