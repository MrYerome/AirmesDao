package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "intervention_livraison_reprise", schema = "ventury", catalog = "")
public class InterventionLivraisonReprise {
    private int id;
    private int quantite;
    private byte reprise;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private ArticleConsommable articleConsommableByArticleConsommableId_0;
    private Intervention interventionByInterventionId;
    private Intervention interventionByInterventionId_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantite")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "reprise")
    public byte getReprise() {
        return reprise;
    }

    public void setReprise(byte reprise) {
        this.reprise = reprise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionLivraisonReprise that = (InterventionLivraisonReprise) o;
        return id == that.id &&
                quantite == that.quantite &&
                reprise == that.reprise;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantite, reprise);
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id")
    public ArticleConsommable getArticleConsommableByArticleConsommableId() {
        return articleConsommableByArticleConsommableId;
    }

    public void setArticleConsommableByArticleConsommableId(ArticleConsommable articleConsommableByArticleConsommableId) {
        this.articleConsommableByArticleConsommableId = articleConsommableByArticleConsommableId;
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id")
    public ArticleConsommable getArticleConsommableByArticleConsommableId_0() {
        return articleConsommableByArticleConsommableId_0;
    }

    public void setArticleConsommableByArticleConsommableId_0(ArticleConsommable articleConsommableByArticleConsommableId_0) {
        this.articleConsommableByArticleConsommableId_0 = articleConsommableByArticleConsommableId_0;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId_0() {
        return interventionByInterventionId_0;
    }

    public void setInterventionByInterventionId_0(Intervention interventionByInterventionId_0) {
        this.interventionByInterventionId_0 = interventionByInterventionId_0;
    }
}
