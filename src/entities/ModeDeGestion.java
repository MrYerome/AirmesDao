package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "mode_de_gestion", schema = "ventury", catalog = "")
public class ModeDeGestion {
    private int id;
    private String label;
    private Collection<FamilleArticle> familleArticlesById;
    private Collection<FamilleArticle> familleArticlesById_0;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModeDeGestion that = (ModeDeGestion) o;
        return id == that.id &&
                Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label);
    }

    @OneToMany(mappedBy = "modeDeGestionByModeDeGestionId")
    public Collection<FamilleArticle> getFamilleArticlesById() {
        return familleArticlesById;
    }

    public void setFamilleArticlesById(Collection<FamilleArticle> familleArticlesById) {
        this.familleArticlesById = familleArticlesById;
    }

    @OneToMany(mappedBy = "modeDeGestionByModeDeGestionId_0")
    public Collection<FamilleArticle> getFamilleArticlesById_0() {
        return familleArticlesById_0;
    }

    public void setFamilleArticlesById_0(Collection<FamilleArticle> familleArticlesById_0) {
        this.familleArticlesById_0 = familleArticlesById_0;
    }
}
