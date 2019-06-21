package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Activite {
    private int id;
    private int label;
    private Collection<Patient> patientsById;
    private Collection<Patient> patientsById_0;

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
    public int getLabel() {
        return label;
    }

    public void setLabel(int label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activite activite = (Activite) o;
        return id == activite.id &&
                label == activite.label;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }

    @OneToMany(mappedBy = "activiteByActiviteId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "activiteByActiviteId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }
}
