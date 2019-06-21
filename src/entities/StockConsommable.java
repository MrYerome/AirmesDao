package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "stock_consommable", schema = "ventury", catalog = "")
public class StockConsommable {
    private int id;
    private int articleConsommableId;
    private int agenceId;
    private Integer quantiteEnStock;
    private String localisation;
    private Collection<HistoriqueStock> historiqueStocksById;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private Agence agenceByAgenceId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "article_consommable_id")
    public int getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(int articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Basic
    @Column(name = "agence_id")
    public int getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(int agenceId) {
        this.agenceId = agenceId;
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
                articleConsommableId == that.articleConsommableId &&
                agenceId == that.agenceId &&
                Objects.equals(quantiteEnStock, that.quantiteEnStock) &&
                Objects.equals(localisation, that.localisation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleConsommableId, agenceId, quantiteEnStock, localisation);
    }

    @OneToMany(mappedBy = "stockConsommableByStockConsommableId")
    public Collection<HistoriqueStock> getHistoriqueStocksById() {
        return historiqueStocksById;
    }

    public void setHistoriqueStocksById(Collection<HistoriqueStock> historiqueStocksById) {
        this.historiqueStocksById = historiqueStocksById;
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
