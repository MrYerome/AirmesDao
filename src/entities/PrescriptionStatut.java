package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "prescription_statut", schema = "ventury", catalog = "")
public class PrescriptionStatut {
    private int id;
    private String libelle;
    private Collection<Prescription> prescriptionsById;

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
        PrescriptionStatut that = (PrescriptionStatut) o;
        return id == that.id &&
                Objects.equals(libelle, that.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle);
    }

    @OneToMany(mappedBy = "prescriptionStatutByStatutId")
    public Collection<Prescription> getPrescriptionsById() {
        return prescriptionsById;
    }

    public void setPrescriptionsById(Collection<Prescription> prescriptionsById) {
        this.prescriptionsById = prescriptionsById;
    }
}
