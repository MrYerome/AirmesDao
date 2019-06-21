package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Specialite {
    private int id;
    private String label;
    private Collection<Prescripteur> prescripteursById;
    private Collection<Prescripteur> prescripteursById_0;

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
        Specialite that = (Specialite) o;
        return id == that.id &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }

    @OneToMany(mappedBy = "specialiteBySpecialiteId")
    public Collection<Prescripteur> getPrescripteursById() {
        return prescripteursById;
    }

    public void setPrescripteursById(Collection<Prescripteur> prescripteursById) {
        this.prescripteursById = prescripteursById;
    }

    @OneToMany(mappedBy = "specialiteBySpecialiteId_0")
    public Collection<Prescripteur> getPrescripteursById_0() {
        return prescripteursById_0;
    }

    public void setPrescripteursById_0(Collection<Prescripteur> prescripteursById_0) {
        this.prescripteursById_0 = prescripteursById_0;
    }
}
