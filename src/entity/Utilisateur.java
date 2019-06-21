package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Utilisateur {
    private int id;
    private String identifiant;
    private String password;
    private byte actif;
    private Timestamp dateSuppr;
    private Integer profilId;
    private byte adminSiteweb;
    private Integer agenceId;
    private Personne personneByPersonneId;
    private Personne personneByPersonneId_0;
    private Technicien technicienByTechnicienId;
    private Technicien technicienByTechnicienId_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "identifiant")
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "actif")
    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "profil_id")
    public Integer getProfilId() {
        return profilId;
    }

    public void setProfilId(Integer profilId) {
        this.profilId = profilId;
    }

    @Basic
    @Column(name = "admin_siteweb")
    public byte getAdminSiteweb() {
        return adminSiteweb;
    }

    public void setAdminSiteweb(byte adminSiteweb) {
        this.adminSiteweb = adminSiteweb;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return id == that.id &&
                actif == that.actif &&
                adminSiteweb == that.adminSiteweb &&
                Objects.equals(identifiant, that.identifiant) &&
                Objects.equals(password, that.password) &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(profilId, that.profilId) &&
                Objects.equals(agenceId, that.agenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifiant, password, actif, dateSuppr, profilId, adminSiteweb, agenceId);
    }

    @ManyToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneId() {
        return personneByPersonneId;
    }

    public void setPersonneByPersonneId(Personne personneByPersonneId) {
        this.personneByPersonneId = personneByPersonneId;
    }

    @ManyToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneId_0() {
        return personneByPersonneId_0;
    }

    public void setPersonneByPersonneId_0(Personne personneByPersonneId_0) {
        this.personneByPersonneId_0 = personneByPersonneId_0;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId_0() {
        return technicienByTechnicienId_0;
    }

    public void setTechnicienByTechnicienId_0(Technicien technicienByTechnicienId_0) {
        this.technicienByTechnicienId_0 = technicienByTechnicienId_0;
    }
}
