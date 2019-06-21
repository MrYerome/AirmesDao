package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "type_article", schema = "ventury", catalog = "")
public class TypeArticle {
    private int id;
    private String label;
    private Timestamp dateSuppr;
    private Collection<Article> articlesById;
    private Collection<Article> articlesById_0;
    private Collection<Mesure> mesuresById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeArticle that = (TypeArticle) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, dateSuppr);
    }

    @OneToMany(mappedBy = "typeArticleByTypeArticleId")
    public Collection<Article> getArticlesById() {
        return articlesById;
    }

    public void setArticlesById(Collection<Article> articlesById) {
        this.articlesById = articlesById;
    }

    @OneToMany(mappedBy = "typeArticleByTypeArticleId_0")
    public Collection<Article> getArticlesById_0() {
        return articlesById_0;
    }

    public void setArticlesById_0(Collection<Article> articlesById_0) {
        this.articlesById_0 = articlesById_0;
    }

    @OneToMany(mappedBy = "typeArticleByTypeArticleId")
    public Collection<Mesure> getMesuresById() {
        return mesuresById;
    }

    public void setMesuresById(Collection<Mesure> mesuresById) {
        this.mesuresById = mesuresById;
    }
}
