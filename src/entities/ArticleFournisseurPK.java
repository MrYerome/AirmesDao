package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ArticleFournisseurPK implements Serializable {
    private int articleId;
    private int fournisseurId;

    @Column(name = "article_id")
    @Id
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Column(name = "fournisseur_id")
    @Id
    public int getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(int fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleFournisseurPK that = (ArticleFournisseurPK) o;
        return articleId == that.articleId &&
                fournisseurId == that.fournisseurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, fournisseurId);
    }
}
