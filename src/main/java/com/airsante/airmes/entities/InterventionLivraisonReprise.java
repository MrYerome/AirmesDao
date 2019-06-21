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
@Table(name = "intervention_livraison_reprise", schema = "ventury", catalog = "")
public class InterventionLivraisonReprise {
    private Long id;
    private int quantite;
    private byte reprise;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private Intervention interventionByInterventionId;

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
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
