package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "famille_article", schema = "ventury", catalog = "")
public class FamilleArticle {
    private int id;
    private String label;
    private Integer modeDeGestionId;
    private Collection<Article> articlesById;
    private Collection<Article> articlesById_0;
    private ModeDeGestion modeDeGestionByModeDeGestionId;
    private ModeDeGestion modeDeGestionByModeDeGestionId_0;

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
    @Column(name = "mode_de_gestion_id")
    public Integer getModeDeGestionId() {
        return modeDeGestionId;
    }

    public void setModeDeGestionId(Integer modeDeGestionId) {
        this.modeDeGestionId = modeDeGestionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FamilleArticle that = (FamilleArticle) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(modeDeGestionId, that.modeDeGestionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, modeDeGestionId);
    }

    @OneToMany(mappedBy = "familleArticleByFamilleArticleId")
    public Collection<Article> getArticlesById() {
        return articlesById;
    }

    public void setArticlesById(Collection<Article> articlesById) {
        this.articlesById = articlesById;
    }

    @OneToMany(mappedBy = "familleArticleByFamilleArticleId_0")
    public Collection<Article> getArticlesById_0() {
        return articlesById_0;
    }

    public void setArticlesById_0(Collection<Article> articlesById_0) {
        this.articlesById_0 = articlesById_0;
    }

    @ManyToOne
    @JoinColumn(name = "mode_de_gestion_id", referencedColumnName = "id")
    public ModeDeGestion getModeDeGestionByModeDeGestionId() {
        return modeDeGestionByModeDeGestionId;
    }

    public void setModeDeGestionByModeDeGestionId(ModeDeGestion modeDeGestionByModeDeGestionId) {
        this.modeDeGestionByModeDeGestionId = modeDeGestionByModeDeGestionId;
    }

    @ManyToOne
    @JoinColumn(name = "mode_de_gestion_id", referencedColumnName = "id")
    public ModeDeGestion getModeDeGestionByModeDeGestionId_0() {
        return modeDeGestionByModeDeGestionId_0;
    }

    public void setModeDeGestionByModeDeGestionId_0(ModeDeGestion modeDeGestionByModeDeGestionId_0) {
        this.modeDeGestionByModeDeGestionId_0 = modeDeGestionByModeDeGestionId_0;
    }
}
