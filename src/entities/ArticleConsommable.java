package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "article_consommable", schema = "ventury", catalog = "")
public class ArticleConsommable {
    private int id;
    private Integer categorieConsommableId;
    private Integer fournisseurId;
    private Article articleById;
    private Article articleById_0;
    private CategorieConsommable categorieConsommableByCategorieConsommableId;
    private CategorieConsommable categorieConsommableByCategorieConsommableId_0;
    private Fournisseur fournisseurByFournisseurId;
    private Fournisseur fournisseurByFournisseurId_0;
    private Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0;
    private Collection<StockConsommable> stockConsommablesById;
    private Collection<StockConsommablePatient> stockConsommablePatientsById;
    private Collection<StockConsommableTechnicien> stockConsommableTechniciensById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "categorie_consommable_id")
    public Integer getCategorieConsommableId() {
        return categorieConsommableId;
    }

    public void setCategorieConsommableId(Integer categorieConsommableId) {
        this.categorieConsommableId = categorieConsommableId;
    }

    @Basic
    @Column(name = "fournisseur_id")
    public Integer getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Integer fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleConsommable that = (ArticleConsommable) o;
        return id == that.id &&
                Objects.equals(categorieConsommableId, that.categorieConsommableId) &&
                Objects.equals(fournisseurId, that.fournisseurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categorieConsommableId, fournisseurId);
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

    @ManyToOne
    @JoinColumn(name = "categorie_consommable_id", referencedColumnName = "id")
    public CategorieConsommable getCategorieConsommableByCategorieConsommableId() {
        return categorieConsommableByCategorieConsommableId;
    }

    public void setCategorieConsommableByCategorieConsommableId(CategorieConsommable categorieConsommableByCategorieConsommableId) {
        this.categorieConsommableByCategorieConsommableId = categorieConsommableByCategorieConsommableId;
    }

    @ManyToOne
    @JoinColumn(name = "categorie_consommable_id", referencedColumnName = "id")
    public CategorieConsommable getCategorieConsommableByCategorieConsommableId_0() {
        return categorieConsommableByCategorieConsommableId_0;
    }

    public void setCategorieConsommableByCategorieConsommableId_0(CategorieConsommable categorieConsommableByCategorieConsommableId_0) {
        this.categorieConsommableByCategorieConsommableId_0 = categorieConsommableByCategorieConsommableId_0;
    }

    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    public Fournisseur getFournisseurByFournisseurId() {
        return fournisseurByFournisseurId;
    }

    public void setFournisseurByFournisseurId(Fournisseur fournisseurByFournisseurId) {
        this.fournisseurByFournisseurId = fournisseurByFournisseurId;
    }

    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    public Fournisseur getFournisseurByFournisseurId_0() {
        return fournisseurByFournisseurId_0;
    }

    public void setFournisseurByFournisseurId_0(Fournisseur fournisseurByFournisseurId_0) {
        this.fournisseurByFournisseurId_0 = fournisseurByFournisseurId_0;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId")
    public Collection<BonLivraisonClientLigne> getBonLivraisonClientLignesById() {
        return bonLivraisonClientLignesById;
    }

    public void setBonLivraisonClientLignesById(Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById) {
        this.bonLivraisonClientLignesById = bonLivraisonClientLignesById;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById() {
        return interventionLivraisonReprisesById;
    }

    public void setInterventionLivraisonReprisesById(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById) {
        this.interventionLivraisonReprisesById = interventionLivraisonReprisesById;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId_0")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById_0() {
        return interventionLivraisonReprisesById_0;
    }

    public void setInterventionLivraisonReprisesById_0(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0) {
        this.interventionLivraisonReprisesById_0 = interventionLivraisonReprisesById_0;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId")
    public Collection<StockConsommable> getStockConsommablesById() {
        return stockConsommablesById;
    }

    public void setStockConsommablesById(Collection<StockConsommable> stockConsommablesById) {
        this.stockConsommablesById = stockConsommablesById;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId")
    public Collection<StockConsommablePatient> getStockConsommablePatientsById() {
        return stockConsommablePatientsById;
    }

    public void setStockConsommablePatientsById(Collection<StockConsommablePatient> stockConsommablePatientsById) {
        this.stockConsommablePatientsById = stockConsommablePatientsById;
    }

    @OneToMany(mappedBy = "articleConsommableByArticleConsommableId")
    public Collection<StockConsommableTechnicien> getStockConsommableTechniciensById() {
        return stockConsommableTechniciensById;
    }

    public void setStockConsommableTechniciensById(Collection<StockConsommableTechnicien> stockConsommableTechniciensById) {
        this.stockConsommableTechniciensById = stockConsommableTechniciensById;
    }
}
