package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class StockConsommableTechnicienPK implements Serializable {
    private int articleConsommableId;
    private int technicienId;

    @Column(name = "article_consommable_id")
    @Id
    public int getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(int articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Column(name = "technicien_id")
    @Id
    public int getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(int technicienId) {
        this.technicienId = technicienId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockConsommableTechnicienPK that = (StockConsommableTechnicienPK) o;
        return articleConsommableId == that.articleConsommableId &&
                technicienId == that.technicienId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleConsommableId, technicienId);
    }
}
