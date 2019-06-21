package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Medecin {
    private int id;
    private Prescripteur prescripteurById;
    private Prescripteur prescripteurById_0;
    private Collection<MedecinPrescripteur> medecinPrescripteursById;
    private Collection<MedecinPrescripteur> medecinPrescripteursById_0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medecin medecin = (Medecin) o;
        return id == medecin.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurById() {
        return prescripteurById;
    }

    public void setPrescripteurById(Prescripteur prescripteurById) {
        this.prescripteurById = prescripteurById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurById_0() {
        return prescripteurById_0;
    }

    public void setPrescripteurById_0(Prescripteur prescripteurById_0) {
        this.prescripteurById_0 = prescripteurById_0;
    }

    @OneToMany(mappedBy = "medecinByMedecinId")
    public Collection<MedecinPrescripteur> getMedecinPrescripteursById() {
        return medecinPrescripteursById;
    }

    public void setMedecinPrescripteursById(Collection<MedecinPrescripteur> medecinPrescripteursById) {
        this.medecinPrescripteursById = medecinPrescripteursById;
    }

    @OneToMany(mappedBy = "medecinByMedecinId_0")
    public Collection<MedecinPrescripteur> getMedecinPrescripteursById_0() {
        return medecinPrescripteursById_0;
    }

    public void setMedecinPrescripteursById_0(Collection<MedecinPrescripteur> medecinPrescripteursById_0) {
        this.medecinPrescripteursById_0 = medecinPrescripteursById_0;
    }

    @OneToMany(mappedBy = "medecinByMedecinId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "medecinByMedecinId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }
}
