package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stock_consommable_technicien", schema = "ventury", catalog = "")
@IdClass(StockConsommableTechnicienPK.class)
public class StockConsommableTechnicien {
    private int articleConsommableId;
    private int technicienId;
    private int quantiteEnStock;
    private int quantiteReserve;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private Technicien technicienByTechnicienId;

    @Id
    @Column(name = "article_consommable_id")
    public int getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(int articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Id
    @Column(name = "technicien_id")
    public int getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(int technicienId) {
        this.technicienId = technicienId;
    }

    @Basic
    @Column(name = "quantite_en_stock")
    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }

    @Basic
    @Column(name = "quantite_reserve")
    public int getQuantiteReserve() {
        return quantiteReserve;
    }

    public void setQuantiteReserve(int quantiteReserve) {
        this.quantiteReserve = quantiteReserve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockConsommableTechnicien that = (StockConsommableTechnicien) o;
        return articleConsommableId == that.articleConsommableId &&
                technicienId == that.technicienId &&
                quantiteEnStock == that.quantiteEnStock &&
                quantiteReserve == that.quantiteReserve;
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleConsommableId, technicienId, quantiteEnStock, quantiteReserve);
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
    @JoinColumn(name = "technicien_id", referencedColumnName = "id", nullable = false)
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }
}
