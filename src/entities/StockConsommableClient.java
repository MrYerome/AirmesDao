package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "stock_consommable_client", schema = "ventury", catalog = "")
public class StockConsommableClient {
    private long id;
    private Date dateLivraison;
    private Integer idVentury;
    private int quantite;
    private int articleConsommableId;
    private Integer dossierId;
    private Integer etablissementId;
    private Long interventionId;
    private Long prescripteurId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_livraison")
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "idVentury")
    public Integer getIdVentury() {
        return idVentury;
    }

    public void setIdVentury(Integer idVentury) {
        this.idVentury = idVentury;
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
    @Column(name = "article_consommable_id")
    public int getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(int articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Basic
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
    }

    @Basic
    @Column(name = "etablissement_id")
    public Integer getEtablissementId() {
        return etablissementId;
    }

    public void setEtablissementId(Integer etablissementId) {
        this.etablissementId = etablissementId;
    }

    @Basic
    @Column(name = "intervention_id")
    public Long getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Long interventionId) {
        this.interventionId = interventionId;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public Long getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Long prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockConsommableClient that = (StockConsommableClient) o;
        return id == that.id &&
                quantite == that.quantite &&
                articleConsommableId == that.articleConsommableId &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(interventionId, that.interventionId) &&
                Objects.equals(prescripteurId, that.prescripteurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateLivraison, idVentury, quantite, articleConsommableId, dossierId, etablissementId, interventionId, prescripteurId);
    }
}
