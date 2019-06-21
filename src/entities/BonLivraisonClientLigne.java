package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bon_livraison_client_ligne", schema = "ventury", catalog = "")
public class BonLivraisonClientLigne {
    private int id;
    private String commentaire;
    private Timestamp dateLivraison;
    private Integer quantite;
    private Integer articleConsommableId;
    private Integer bonLivraisonClientId;
    private Integer obusId;
    private Integer parcMaterielId;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private BonLivraisonClient bonLivraisonClientByBonLivraisonClientId;
    private Obus obusByObusId;
    private ParcMateriel parcMaterielByParcMaterielId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "date_livraison")
    public Timestamp getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Timestamp dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "quantite")
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
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
    @Column(name = "bon_livraison_client_id")
    public Integer getBonLivraisonClientId() {
        return bonLivraisonClientId;
    }

    public void setBonLivraisonClientId(Integer bonLivraisonClientId) {
        this.bonLivraisonClientId = bonLivraisonClientId;
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
    @Column(name = "parc_materiel_id")
    public Integer getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(Integer parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BonLivraisonClientLigne that = (BonLivraisonClientLigne) o;
        return id == that.id &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(quantite, that.quantite) &&
                Objects.equals(articleConsommableId, that.articleConsommableId) &&
                Objects.equals(bonLivraisonClientId, that.bonLivraisonClientId) &&
                Objects.equals(obusId, that.obusId) &&
                Objects.equals(parcMaterielId, that.parcMaterielId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, dateLivraison, quantite, articleConsommableId, bonLivraisonClientId, obusId, parcMaterielId);
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
    @JoinColumn(name = "bon_livraison_client_id", referencedColumnName = "id")
    public BonLivraisonClient getBonLivraisonClientByBonLivraisonClientId() {
        return bonLivraisonClientByBonLivraisonClientId;
    }

    public void setBonLivraisonClientByBonLivraisonClientId(BonLivraisonClient bonLivraisonClientByBonLivraisonClientId) {
        this.bonLivraisonClientByBonLivraisonClientId = bonLivraisonClientByBonLivraisonClientId;
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
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id")
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
    }
}
