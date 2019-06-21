package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "regime_obligatoire", schema = "ventury", catalog = "")
public class RegimeObligatoire {
    private int id;
    private Integer adresseId;
    private String nom;
    private String numeroProfessionnel;
    private String numeroAffiliation;
    private String tel;
    private String fax;
    private String mail;
    private String commentaire;
    private Timestamp dateArchivage;
    private String login;
    private String password;
    private Adresse adresseByAdresseId;
    private Collection<RegimeObligatoirePatient> regimeObligatoirePatientsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "adresse_id")
    public Integer getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(Integer adresseId) {
        this.adresseId = adresseId;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "numero_professionnel")
    public String getNumeroProfessionnel() {
        return numeroProfessionnel;
    }

    public void setNumeroProfessionnel(String numeroProfessionnel) {
        this.numeroProfessionnel = numeroProfessionnel;
    }

    @Basic
    @Column(name = "numero_affiliation")
    public String getNumeroAffiliation() {
        return numeroAffiliation;
    }

    public void setNumeroAffiliation(String numeroAffiliation) {
        this.numeroAffiliation = numeroAffiliation;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "date_archivage")
    public Timestamp getDateArchivage() {
        return dateArchivage;
    }

    public void setDateArchivage(Timestamp dateArchivage) {
        this.dateArchivage = dateArchivage;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegimeObligatoire that = (RegimeObligatoire) o;
        return id == that.id &&
                Objects.equals(adresseId, that.adresseId) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(numeroProfessionnel, that.numeroProfessionnel) &&
                Objects.equals(numeroAffiliation, that.numeroAffiliation) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateArchivage, that.dateArchivage) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adresseId, nom, numeroProfessionnel, numeroAffiliation, tel, fax, mail, commentaire, dateArchivage, login, password);
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }

    @OneToMany(mappedBy = "regimeObligatoireByRegimeObligatoireId")
    public Collection<RegimeObligatoirePatient> getRegimeObligatoirePatientsById() {
        return regimeObligatoirePatientsById;
    }

    public void setRegimeObligatoirePatientsById(Collection<RegimeObligatoirePatient> regimeObligatoirePatientsById) {
        this.regimeObligatoirePatientsById = regimeObligatoirePatientsById;
    }
}
