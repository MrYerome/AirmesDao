package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "article_consommable", schema = "ventury", catalog = "")
public class ArticleConsommable {
    private int id;
    private Article articleById;
    private Article articleById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleConsommable that = (ArticleConsommable) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Article getArticleById() {
        return articleById;
    }

    public void setArticleById(Article articleById) {
        this.articleById = articleById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Article getArticleById_0() {
        return articleById_0;
    }

    public void setArticleById_0(Article articleById_0) {
        this.articleById_0 = articleById_0;
    }
}
