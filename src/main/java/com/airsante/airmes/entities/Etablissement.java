package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Etablissement {
    private Long id;
    private String nom;
    private String tel;
    private String telPortable;
    private String telAutre;
    private String telCommentaire;
    private String mail;
    private String commentaire;
    private String numeroFiness;
    private String login;
    private String password;
    private byte nouvelExtranet;
    private Adresse adresseByAdresseLivraisonId;
    private Adresse adresseByAdresseAdministrativeId;
    private Agence agenceByAgenceId;

    @Id
	@JsonProperty(value = "dataId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "tel_portable")
    public String getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    @Basic
    @Column(name = "tel_autre")
    public String getTelAutre() {
        return telAutre;
    }

    public void setTelAutre(String telAutre) {
        this.telAutre = telAutre;
    }

    @Basic
    @Column(name = "tel_commentaire")
    public String getTelCommentaire() {
        return telCommentaire;
    }

    public void setTelCommentaire(String telCommentaire) {
        this.telCommentaire = telCommentaire;
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
    @Column(name = "numero_finess")
    public String getNumeroFiness() {
        return numeroFiness;
    }

    public void setNumeroFiness(String numeroFiness) {
        this.numeroFiness = numeroFiness;
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

    @Basic
    @Column(name = "nouvel_extranet")
    public byte getNouvelExtranet() {
        return nouvelExtranet;
    }

    public void setNouvelExtranet(byte nouvelExtranet) {
        this.nouvelExtranet = nouvelExtranet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etablissement that = (Etablissement) o;
        return id == that.id &&
                nouvelExtranet == that.nouvelExtranet &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(telPortable, that.telPortable) &&
                Objects.equals(telAutre, that.telAutre) &&
                Objects.equals(telCommentaire, that.telCommentaire) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(numeroFiness, that.numeroFiness) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, tel, telPortable, telAutre, telCommentaire, mail, commentaire, numeroFiness, login, password, nouvelExtranet);
    }

    @ManyToOne
    @JoinColumn(name = "adresse_livraison_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseLivraisonId() {
        return adresseByAdresseLivraisonId;
    }

    public void setAdresseByAdresseLivraisonId(Adresse adresseByAdresseLivraisonId) {
        this.adresseByAdresseLivraisonId = adresseByAdresseLivraisonId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_administrative_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseAdministrativeId() {
        return adresseByAdresseAdministrativeId;
    }

    public void setAdresseByAdresseAdministrativeId(Adresse adresseByAdresseAdministrativeId) {
        this.adresseByAdresseAdministrativeId = adresseByAdresseAdministrativeId;
    }

    @ManyToOne
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }

}
