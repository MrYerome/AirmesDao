package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Fournisseur {
    private int id;
    private String nom;
    private String codeClient;
    private String siteInternet;
    private String telCommande;
    private String mailCommande;
    private String faxCommande;
    private Double montantMinimumCommande;
    private Double montantFrancoFraisDePort;
    private Collection<ArticleConsommable> articleConsommablesById;
    private Collection<ArticleConsommable> articleConsommablesById_0;
    private Collection<ArticleFournisseur> articleFournisseursById;
    private Collection<CommandeFournisseur> commandeFournisseursById;
    private Collection<ContactFournisseur> contactFournisseursById;
    private Collection<ContactFournisseur> contactFournisseursById_0;
    private Collection<ParcMateriel> parcMaterielsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    @Column(name = "code_client")
    public String getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }

    @Basic
    @Column(name = "site_internet")
    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    @Basic
    @Column(name = "tel_commande")
    public String getTelCommande() {
        return telCommande;
    }

    public void setTelCommande(String telCommande) {
        this.telCommande = telCommande;
    }

    @Basic
    @Column(name = "mail_commande")
    public String getMailCommande() {
        return mailCommande;
    }

    public void setMailCommande(String mailCommande) {
        this.mailCommande = mailCommande;
    }

    @Basic
    @Column(name = "fax_commande")
    public String getFaxCommande() {
        return faxCommande;
    }

    public void setFaxCommande(String faxCommande) {
        this.faxCommande = faxCommande;
    }

    @Basic
    @Column(name = "montant_minimum_commande")
    public Double getMontantMinimumCommande() {
        return montantMinimumCommande;
    }

    public void setMontantMinimumCommande(Double montantMinimumCommande) {
        this.montantMinimumCommande = montantMinimumCommande;
    }

    @Basic
    @Column(name = "montant_franco_frais_de_port")
    public Double getMontantFrancoFraisDePort() {
        return montantFrancoFraisDePort;
    }

    public void setMontantFrancoFraisDePort(Double montantFrancoFraisDePort) {
        this.montantFrancoFraisDePort = montantFrancoFraisDePort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fournisseur that = (Fournisseur) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(codeClient, that.codeClient) &&
                Objects.equals(siteInternet, that.siteInternet) &&
                Objects.equals(telCommande, that.telCommande) &&
                Objects.equals(mailCommande, that.mailCommande) &&
                Objects.equals(faxCommande, that.faxCommande) &&
                Objects.equals(montantMinimumCommande, that.montantMinimumCommande) &&
                Objects.equals(montantFrancoFraisDePort, that.montantFrancoFraisDePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, codeClient, siteInternet, telCommande, mailCommande, faxCommande, montantMinimumCommande, montantFrancoFraisDePort);
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId")
    public Collection<ArticleConsommable> getArticleConsommablesById() {
        return articleConsommablesById;
    }

    public void setArticleConsommablesById(Collection<ArticleConsommable> articleConsommablesById) {
        this.articleConsommablesById = articleConsommablesById;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId_0")
    public Collection<ArticleConsommable> getArticleConsommablesById_0() {
        return articleConsommablesById_0;
    }

    public void setArticleConsommablesById_0(Collection<ArticleConsommable> articleConsommablesById_0) {
        this.articleConsommablesById_0 = articleConsommablesById_0;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId")
    public Collection<ArticleFournisseur> getArticleFournisseursById() {
        return articleFournisseursById;
    }

    public void setArticleFournisseursById(Collection<ArticleFournisseur> articleFournisseursById) {
        this.articleFournisseursById = articleFournisseursById;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId")
    public Collection<CommandeFournisseur> getCommandeFournisseursById() {
        return commandeFournisseursById;
    }

    public void setCommandeFournisseursById(Collection<CommandeFournisseur> commandeFournisseursById) {
        this.commandeFournisseursById = commandeFournisseursById;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId")
    public Collection<ContactFournisseur> getContactFournisseursById() {
        return contactFournisseursById;
    }

    public void setContactFournisseursById(Collection<ContactFournisseur> contactFournisseursById) {
        this.contactFournisseursById = contactFournisseursById;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId_0")
    public Collection<ContactFournisseur> getContactFournisseursById_0() {
        return contactFournisseursById_0;
    }

    public void setContactFournisseursById_0(Collection<ContactFournisseur> contactFournisseursById_0) {
        this.contactFournisseursById_0 = contactFournisseursById_0;
    }

    @OneToMany(mappedBy = "fournisseurByFournisseurId")
    public Collection<ParcMateriel> getParcMaterielsById() {
        return parcMaterielsById;
    }

    public void setParcMaterielsById(Collection<ParcMateriel> parcMaterielsById) {
        this.parcMaterielsById = parcMaterielsById;
    }
}
