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
@Table(name = "article_consommable", schema = "ventury", catalog = "")
public class ArticleConsommable {
    private Long id;
    private Article articleById;

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

}
