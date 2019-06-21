package entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Agence {
    private int id;
    private String raisonSociale;
    private String nom;
    private Byte siegeSocial;
    private String tel;
    private String fax;
    private String mail;
    private String horaire;
    private String logo;
    private String numeroPrestataire;
    private String numeroTva;
    private String codeApe;
    private String numeroSiret;
    private Date dateSuppr;
    private byte[] fichierLogo;
    private Adresse adresseByAdresseIdLivraison;
    private Adresse adresseByAdresseIdLivraison_0;
    private Adresse adresseByAdresseIdLivraison_1;
    private Adresse adresseByAdresseId;
    private Adresse adresseByAdresseId_0;
    private Adresse adresseByAdresseId_1;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "raison_sociale")
    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
    @Column(name = "siege_social")
    public Byte getSiegeSocial() {
        return siegeSocial;
    }

    public void setSiegeSocial(Byte siegeSocial) {
        this.siegeSocial = siegeSocial;
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
    @Column(name = "horaire")
    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "numero_prestataire")
    public String getNumeroPrestataire() {
        return numeroPrestataire;
    }

    public void setNumeroPrestataire(String numeroPrestataire) {
        this.numeroPrestataire = numeroPrestataire;
    }

    @Basic
    @Column(name = "numero_tva")
    public String getNumeroTva() {
        return numeroTva;
    }

    public void setNumeroTva(String numeroTva) {
        this.numeroTva = numeroTva;
    }

    @Basic
    @Column(name = "code_ape")
    public String getCodeApe() {
        return codeApe;
    }

    public void setCodeApe(String codeApe) {
        this.codeApe = codeApe;
    }

    @Basic
    @Column(name = "numero_siret")
    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    @Basic
    @Column(name = "date_suppr")
    public Date getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Date dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "fichier_logo")
    public byte[] getFichierLogo() {
        return fichierLogo;
    }

    public void setFichierLogo(byte[] fichierLogo) {
        this.fichierLogo = fichierLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agence agence = (Agence) o;
        return id == agence.id &&
                Objects.equals(raisonSociale, agence.raisonSociale) &&
                Objects.equals(nom, agence.nom) &&
                Objects.equals(siegeSocial, agence.siegeSocial) &&
                Objects.equals(tel, agence.tel) &&
                Objects.equals(fax, agence.fax) &&
                Objects.equals(mail, agence.mail) &&
                Objects.equals(horaire, agence.horaire) &&
                Objects.equals(logo, agence.logo) &&
                Objects.equals(numeroPrestataire, agence.numeroPrestataire) &&
                Objects.equals(numeroTva, agence.numeroTva) &&
                Objects.equals(codeApe, agence.codeApe) &&
                Objects.equals(numeroSiret, agence.numeroSiret) &&
                Objects.equals(dateSuppr, agence.dateSuppr) &&
                Arrays.equals(fichierLogo, agence.fichierLogo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, raisonSociale, nom, siegeSocial, tel, fax, mail, horaire, logo, numeroPrestataire, numeroTva, codeApe, numeroSiret, dateSuppr);
        result = 31 * result + Arrays.hashCode(fichierLogo);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison() {
        return adresseByAdresseIdLivraison;
    }

    public void setAdresseByAdresseIdLivraison(Adresse adresseByAdresseIdLivraison) {
        this.adresseByAdresseIdLivraison = adresseByAdresseIdLivraison;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison_0() {
        return adresseByAdresseIdLivraison_0;
    }

    public void setAdresseByAdresseIdLivraison_0(Adresse adresseByAdresseIdLivraison_0) {
        this.adresseByAdresseIdLivraison_0 = adresseByAdresseIdLivraison_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison_1() {
        return adresseByAdresseIdLivraison_1;
    }

    public void setAdresseByAdresseIdLivraison_1(Adresse adresseByAdresseIdLivraison_1) {
        this.adresseByAdresseIdLivraison_1 = adresseByAdresseIdLivraison_1;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId_0() {
        return adresseByAdresseId_0;
    }

    public void setAdresseByAdresseId_0(Adresse adresseByAdresseId_0) {
        this.adresseByAdresseId_0 = adresseByAdresseId_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId_1() {
        return adresseByAdresseId_1;
    }

    public void setAdresseByAdresseId_1(Adresse adresseByAdresseId_1) {
        this.adresseByAdresseId_1 = adresseByAdresseId_1;
    }
}
