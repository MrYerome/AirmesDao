package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "regime_complementaire", schema = "ventury", catalog = "")
public class RegimeComplementaire {
    private int id;
    private Integer adresseId;
    private String nom;
    private String numeroCaisse;
    private String numeroAmc;
    private Integer tauxRemboursement;
    private String tel;
    private String mail;
    private String fax;
    private String commentaire;
    private String login;
    private String password;
    private Adresse adresseByAdresseId;
    private Collection<RegimeComplementairePatient> regimeComplementairePatientsById;

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
    @Column(name = "numero_caisse")
    public String getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(String numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    @Basic
    @Column(name = "numero_amc")
    public String getNumeroAmc() {
        return numeroAmc;
    }

    public void setNumeroAmc(String numeroAmc) {
        this.numeroAmc = numeroAmc;
    }

    @Basic
    @Column(name = "taux_remboursement")
    public Integer getTauxRemboursement() {
        return tauxRemboursement;
    }

    public void setTauxRemboursement(Integer tauxRemboursement) {
        this.tauxRemboursement = tauxRemboursement;
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
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
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
        RegimeComplementaire that = (RegimeComplementaire) o;
        return id == that.id &&
                Objects.equals(adresseId, that.adresseId) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(numeroCaisse, that.numeroCaisse) &&
                Objects.equals(numeroAmc, that.numeroAmc) &&
                Objects.equals(tauxRemboursement, that.tauxRemboursement) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, adresseId, nom, numeroCaisse, numeroAmc, tauxRemboursement, tel, mail, fax, commentaire, login, password);
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }

    @OneToMany(mappedBy = "regimeComplementaireByRegimeComplementaireId")
    public Collection<RegimeComplementairePatient> getRegimeComplementairePatientsById() {
        return regimeComplementairePatientsById;
    }

    public void setRegimeComplementairePatientsById(Collection<RegimeComplementairePatient> regimeComplementairePatientsById) {
        this.regimeComplementairePatientsById = regimeComplementairePatientsById;
    }
}
