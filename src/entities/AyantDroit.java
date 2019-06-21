package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ayant_droit", schema = "ventury", catalog = "")
public class AyantDroit {
    private int id;
    private String numeroSs;
    private int lienParenteId;
    private Personne personneById;
    private Personne personneById_0;
    private Personne personneById_1;
    private LienParente lienParenteByLienParenteId;
    private LienParente lienParenteByLienParenteId_0;
    private LienParente lienParenteByLienParenteId_1;
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
    @Column(name = "numero_ss")
    public String getNumeroSs() {
        return numeroSs;
    }

    public void setNumeroSs(String numeroSs) {
        this.numeroSs = numeroSs;
    }

    @Basic
    @Column(name = "lien_parente_id")
    public int getLienParenteId() {
        return lienParenteId;
    }

    public void setLienParenteId(int lienParenteId) {
        this.lienParenteId = lienParenteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AyantDroit that = (AyantDroit) o;
        return id == that.id &&
                lienParenteId == that.lienParenteId &&
                Objects.equals(numeroSs, that.numeroSs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroSs, lienParenteId);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById() {
        return personneById;
    }

    public void setPersonneById(Personne personneById) {
        this.personneById = personneById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById_0() {
        return personneById_0;
    }

    public void setPersonneById_0(Personne personneById_0) {
        this.personneById_0 = personneById_0;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById_1() {
        return personneById_1;
    }

    public void setPersonneById_1(Personne personneById_1) {
        this.personneById_1 = personneById_1;
    }

    @ManyToOne
    @JoinColumn(name = "lien_parente_id", referencedColumnName = "id", nullable = false)
    public LienParente getLienParenteByLienParenteId() {
        return lienParenteByLienParenteId;
    }

    public void setLienParenteByLienParenteId(LienParente lienParenteByLienParenteId) {
        this.lienParenteByLienParenteId = lienParenteByLienParenteId;
    }

    @ManyToOne
    @JoinColumn(name = "lien_parente_id", referencedColumnName = "id", nullable = false)
    public LienParente getLienParenteByLienParenteId_0() {
        return lienParenteByLienParenteId_0;
    }

    public void setLienParenteByLienParenteId_0(LienParente lienParenteByLienParenteId_0) {
        this.lienParenteByLienParenteId_0 = lienParenteByLienParenteId_0;
    }

    @ManyToOne
    @JoinColumn(name = "lien_parente_id", referencedColumnName = "id", nullable = false)
    public LienParente getLienParenteByLienParenteId_1() {
        return lienParenteByLienParenteId_1;
    }

    public void setLienParenteByLienParenteId_1(LienParente lienParenteByLienParenteId_1) {
        this.lienParenteByLienParenteId_1 = lienParenteByLienParenteId_1;
    }

    @OneToMany(mappedBy = "ayantDroitByAyantDroitId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "ayantDroitByAyantDroitId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }
}
