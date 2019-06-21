package com.airsante.airmes.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Personne {
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String telDomicile;
    private String telPortable;
    private String telAutre;
    private String telCommentaire;
    private String fax;
    private String mail;
    private String commentaire;
    private Timestamp dateSuppr;
    private String sexe;
    private Patient patientById;
    private Adresse adresseByAdresseId;

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
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "date_naissance")
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "tel_domicile")
    public String getTelDomicile() {
        return telDomicile;
    }

    public void setTelDomicile(String telDomicile) {
        this.telDomicile = telDomicile;
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
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "sexe")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return id == personne.id &&
                Objects.equals(nom, personne.nom) &&
                Objects.equals(prenom, personne.prenom) &&
                Objects.equals(dateNaissance, personne.dateNaissance) &&
                Objects.equals(telDomicile, personne.telDomicile) &&
                Objects.equals(telPortable, personne.telPortable) &&
                Objects.equals(telAutre, personne.telAutre) &&
                Objects.equals(telCommentaire, personne.telCommentaire) &&
                Objects.equals(fax, personne.fax) &&
                Objects.equals(mail, personne.mail) &&
                Objects.equals(commentaire, personne.commentaire) &&
                Objects.equals(dateSuppr, personne.dateSuppr) &&
                Objects.equals(sexe, personne.sexe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateNaissance, telDomicile, telPortable, telAutre, telCommentaire, fax, mail, commentaire, dateSuppr, sexe);
    }

    @OneToOne(mappedBy = "personneById")
    public Patient getPatientById() {
        return patientById;
    }

    public void setPatientById(Patient patientById) {
        this.patientById = patientById;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }
}
