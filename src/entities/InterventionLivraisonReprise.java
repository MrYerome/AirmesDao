package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "intervention_livraison_reprise", schema = "ventury", catalog = "")
public class InterventionLivraisonReprise {
    private int id;
    private Integer parcMaterielId;
    private Integer obusId;
    private Integer articleConsommableId;
    private int interventionId;
    private int quantite;
    private byte reprise;
    private ParcMateriel parcMaterielByParcMaterielId;
    private ParcMateriel parcMaterielByParcMaterielId_0;
    private Obus obusByObusId;
    private Obus obusByObusId_0;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private ArticleConsommable articleConsommableByArticleConsommableId_0;
    private Intervention interventionByInterventionId;
    private Intervention interventionByInterventionId_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parc_materiel_id")
    public Integer getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(Integer parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Basic
    @Column(name = "obus_id")
    public Integer getObusId() {
        return obusId;
    }

    public void setObusId(Integer obusId) {
        this.obusId = obusId;
    }

    @Basic
    @Column(name = "article_consommable_id")
    public Integer getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(Integer articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Basic
    @Column(name = "intervention_id")
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Basic
    @Column(name = "quantite")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "reprise")
    public byte getReprise() {
        return reprise;
    }

    public void setReprise(byte reprise) {
        this.reprise = reprise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionLivraisonReprise that = (InterventionLivraisonReprise) o;
        return id == that.id &&
                interventionId == that.interventionId &&
                quantite == that.quantite &&
                reprise == that.reprise &&
                Objects.equals(parcMaterielId, that.parcMaterielId) &&
                Objects.equals(obusId, that.obusId) &&
                Objects.equals(articleConsommableId, that.articleConsommableId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, obusId, articleConsommableId, interventionId, quantite, reprise);
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id")
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id")
    public ParcMateriel getParcMaterielByParcMaterielId_0() {
        return parcMaterielByParcMaterielId_0;
    }

    public void setParcMaterielByParcMaterielId_0(ParcMateriel parcMaterielByParcMaterielId_0) {
        this.parcMaterielByParcMaterielId_0 = parcMaterielByParcMaterielId_0;
    }

    @ManyToOne
    @JoinColumn(name = "obus_id", referencedColumnName = "id")
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
    }

    @ManyToOne
    @JoinColumn(name = "obus_id", referencedColumnName = "id")
    public Obus getObusByObusId_0() {
        return obusByObusId_0;
    }

    public void setObusByObusId_0(Obus obusByObusId_0) {
        this.obusByObusId_0 = obusByObusId_0;
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id")
    public ArticleConsommable getArticleConsommableByArticleConsommableId() {
        return articleConsommableByArticleConsommableId;
    }

    public void setArticleConsommableByArticleConsommableId(ArticleConsommable articleConsommableByArticleConsommableId) {
        this.articleConsommableByArticleConsommableId = articleConsommableByArticleConsommableId;
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id")
    public ArticleConsommable getArticleConsommableByArticleConsommableId_0() {
        return articleConsommableByArticleConsommableId_0;
    }

    public void setArticleConsommableByArticleConsommableId_0(ArticleConsommable articleConsommableByArticleConsommableId_0) {
        this.articleConsommableByArticleConsommableId_0 = articleConsommableByArticleConsommableId_0;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId_0() {
        return interventionByInterventionId_0;
    }

    public void setInterventionByInterventionId_0(Intervention interventionByInterventionId_0) {
        this.interventionByInterventionId_0 = interventionByInterventionId_0;
    }
}
