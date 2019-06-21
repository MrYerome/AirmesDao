package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "commande_article", schema = "ventury", catalog = "")
public class CommandeArticle {
    private int id;
    private String commentaire;
    private Integer conditionnement;
    private Timestamp dateLivraison;
    private Double prixUnitaireHt;
    private Integer quantiteCommande;
    private Integer quantiteLivree;
    private Double tva;
    private int articleId;
    private int commandeFournisseurId;
    private Article articleByArticleId;
    private CommandeFournisseur commandeFournisseurByCommandeFournisseurId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "conditionnement")
    public Integer getConditionnement() {
        return conditionnement;
    }

    public void setConditionnement(Integer conditionnement) {
        this.conditionnement = conditionnement;
    }

    @Basic
    @Column(name = "date_livraison")
    public Timestamp getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Timestamp dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "prix_unitaire_ht")
    public Double getPrixUnitaireHt() {
        return prixUnitaireHt;
    }

    public void setPrixUnitaireHt(Double prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
    }

    @Basic
    @Column(name = "quantite_commande")
    public Integer getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(Integer quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    @Basic
    @Column(name = "quantite_livree")
    public Integer getQuantiteLivree() {
        return quantiteLivree;
    }

    public void setQuantiteLivree(Integer quantiteLivree) {
        this.quantiteLivree = quantiteLivree;
    }

    @Basic
    @Column(name = "tva")
    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    @Basic
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "commande_fournisseur_id")
    public int getCommandeFournisseurId() {
        return commandeFournisseurId;
    }

    public void setCommandeFournisseurId(int commandeFournisseurId) {
        this.commandeFournisseurId = commandeFournisseurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandeArticle that = (CommandeArticle) o;
        return id == that.id &&
                articleId == that.articleId &&
                commandeFournisseurId == that.commandeFournisseurId &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(conditionnement, that.conditionnement) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(prixUnitaireHt, that.prixUnitaireHt) &&
                Objects.equals(quantiteCommande, that.quantiteCommande) &&
                Objects.equals(quantiteLivree, that.quantiteLivree) &&
                Objects.equals(tva, that.tva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, conditionnement, dateLivraison, prixUnitaireHt, quantiteCommande, quantiteLivree, tva, articleId, commandeFournisseurId);
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id", nullable = false)
    public Article getArticleByArticleId() {
        return articleByArticleId;
    }

    public void setArticleByArticleId(Article articleByArticleId) {
        this.articleByArticleId = articleByArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "commande_fournisseur_id", referencedColumnName = "id", nullable = false)
    public CommandeFournisseur getCommandeFournisseurByCommandeFournisseurId() {
        return commandeFournisseurByCommandeFournisseurId;
    }

    public void setCommandeFournisseurByCommandeFournisseurId(CommandeFournisseur commandeFournisseurByCommandeFournisseurId) {
        this.commandeFournisseurByCommandeFournisseurId = commandeFournisseurByCommandeFournisseurId;
    }
}
