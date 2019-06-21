package com.airsante.airmes.entities;

import javax.persistence.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
@Table(name = "stock_consommable", schema = "ventury", catalog = "")
public class StockConsommable {
    private Long id;
    private Integer quantiteEnStock;
    private String localisation;
    private ArticleConsommable articleConsommableByArticleConsommableId;
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
    @Column(name = "quantite_en_stock")
    public Integer getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(Integer quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    @Basic
    @Column(name = "localisation")
    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockConsommable that = (StockConsommable) o;
        return id == that.id &&
                Objects.equals(quantiteEnStock, that.quantiteEnStock) &&
                Objects.equals(localisation, that.localisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantiteEnStock, localisation);
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id", nullable = false)
    public ArticleConsommable getArticleConsommableByArticleConsommableId() {
        return articleConsommableByArticleConsommableId;
    }

    public void setArticleConsommableByArticleConsommableId(ArticleConsommable articleConsommableByArticleConsommableId) {
        this.articleConsommableByArticleConsommableId = articleConsommableByArticleConsommableId;
    }

    @ManyToOne
    @JoinColumn(name = "agence_id", referencedColumnName = "id", nullable = false)
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }
}
