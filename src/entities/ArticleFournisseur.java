package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "article_fournisseur", schema = "ventury", catalog = "")
@IdClass(ArticleFournisseurPK.class)
public class ArticleFournisseur {
    private int articleId;
    private int fournisseurId;
    private String reference;
    private Integer quantiteConditionnement;
    private Double prixHtConditionnement;
    private Double prixUnitaireHt;
    private String observation;
    private Article articleByArticleId;
    private Fournisseur fournisseurByFournisseurId;

    @Id
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Id
    @Column(name = "fournisseur_id")
    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Basic
    @Column(name = "reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Basic
    @Column(name = "quantite_conditionnement")
    public Integer getQuantiteConditionnement() {
        return quantiteConditionnement;
    }

    public void setQuantiteConditionnement(Integer quantiteConditionnement) {
        this.quantiteConditionnement = quantiteConditionnement;
    }

    @Basic
    @Column(name = "prix_ht_conditionnement")
    public Double getPrixHtConditionnement() {
        return prixHtConditionnement;
    }

    public void setPrixHtConditionnement(Double prixHtConditionnement) {
        this.prixHtConditionnement = prixHtConditionnement;
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
    @Column(name = "observation")
    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleFournisseur that = (ArticleFournisseur) o;
        return articleId == that.articleId &&
                fournisseurId == that.fournisseurId &&
                Objects.equals(reference, that.reference) &&
                Objects.equals(quantiteConditionnement, that.quantiteConditionnement) &&
                Objects.equals(prixHtConditionnement, that.prixHtConditionnement) &&
                Objects.equals(prixUnitaireHt, that.prixUnitaireHt) &&
                Objects.equals(observation, that.observation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, fournisseurId, reference, quantiteConditionnement, prixHtConditionnement, prixUnitaireHt, observation);
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
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id", nullable = false)
    public Fournisseur getFournisseurByFournisseurId() {
        return fournisseurByFournisseurId;
    }

    public void setFournisseurByFournisseurId(Fournisseur fournisseurByFournisseurId) {
        this.fournisseurByFournisseurId = fournisseurByFournisseurId;
    }
}
