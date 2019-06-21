package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "categorie_consommable", schema = "ventury", catalog = "")
public class CategorieConsommable {
    private int id;
    private String nom;
    private Collection<ArticleConsommable> articleConsommablesById;
    private Collection<ArticleConsommable> articleConsommablesById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieConsommable that = (CategorieConsommable) o;
        return id == that.id &&
                Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }

    @OneToMany(mappedBy = "categorieConsommableByCategorieConsommableId")
    public Collection<ArticleConsommable> getArticleConsommablesById() {
        return articleConsommablesById;
    }

    public void setArticleConsommablesById(Collection<ArticleConsommable> articleConsommablesById) {
        this.articleConsommablesById = articleConsommablesById;
    }

    @OneToMany(mappedBy = "categorieConsommableByCategorieConsommableId_0")
    public Collection<ArticleConsommable> getArticleConsommablesById_0() {
        return articleConsommablesById_0;
    }

    public void setArticleConsommablesById_0(Collection<ArticleConsommable> articleConsommablesById_0) {
        this.articleConsommablesById_0 = articleConsommablesById_0;
    }
}
