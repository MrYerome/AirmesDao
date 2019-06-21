package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel", schema = "ventury", catalog = "")
public class ParcMateriel {
    private int id;
    private int articleId;
    private Integer agenceId;
    private Integer fournisseurId;
    private String numeroParc;
    private String numeroSerie;
    private Integer etat;
    private Integer periodiciteRevision;
    private Date dateProchaineRevision;
    private Date dateAchat;
    private Double prixAchat;
    private Timestamp dateSuppr;
    private Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById;
    private CuveOxygene cuveOxygeneById;
    private CuveOxygene cuveOxygeneById_0;
    private Collection<HistoriqueMateriel> historiqueMaterielsById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0;
    private Collection<InterventionMaterielArrivee> interventionMaterielArriveesById;
    private Article articleByArticleId;
    private Agence agenceByAgenceId;
    private Fournisseur fournisseurByFournisseurId;
    private Collection<ParcMaterielClient> parcMaterielClientsById;
    private Collection<ParcMaterielPatient> parcMaterielPatientsById;
    private Collection<ParcMaterielTechnicien> parcMaterielTechniciensById;
    private Collection<ValeurMesure> valeurMesuresById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Basic
    @Column(name = "fournisseur_id")
    public Integer getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Integer fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Basic
    @Column(name = "numero_parc")
    public String getNumeroParc() {
        return numeroParc;
    }

    public void setNumeroParc(String numeroParc) {
        this.numeroParc = numeroParc;
    }

    @Basic
    @Column(name = "numero_serie")
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Basic
    @Column(name = "etat")
    public Integer getEtat() {
        return etat;
    }

    public void setEtat(Integer etat) {
        this.etat = etat;
    }

    @Basic
    @Column(name = "periodicite_revision")
    public Integer getPeriodiciteRevision() {
        return periodiciteRevision;
    }

    public void setPeriodiciteRevision(Integer periodiciteRevision) {
        this.periodiciteRevision = periodiciteRevision;
    }

    @Basic
    @Column(name = "date_prochaine_revision")
    public Date getDateProchaineRevision() {
        return dateProchaineRevision;
    }

    public void setDateProchaineRevision(Date dateProchaineRevision) {
        this.dateProchaineRevision = dateProchaineRevision;
    }

    @Basic
    @Column(name = "date_achat")
    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    @Basic
    @Column(name = "prix_achat")
    public Double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(Double prixAchat) {
        this.prixAchat = prixAchat;
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
        ParcMateriel that = (ParcMateriel) o;
        return id == that.id &&
                articleId == that.articleId &&
                Objects.equals(agenceId, that.agenceId) &&
                Objects.equals(fournisseurId, that.fournisseurId) &&
                Objects.equals(numeroParc, that.numeroParc) &&
                Objects.equals(numeroSerie, that.numeroSerie) &&
                Objects.equals(etat, that.etat) &&
                Objects.equals(periodiciteRevision, that.periodiciteRevision) &&
                Objects.equals(dateProchaineRevision, that.dateProchaineRevision) &&
                Objects.equals(dateAchat, that.dateAchat) &&
                Objects.equals(prixAchat, that.prixAchat) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleId, agenceId, fournisseurId, numeroParc, numeroSerie, etat, periodiciteRevision, dateProchaineRevision, dateAchat, prixAchat, dateSuppr);
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<BonLivraisonClientLigne> getBonLivraisonClientLignesById() {
        return bonLivraisonClientLignesById;
    }

    public void setBonLivraisonClientLignesById(Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById) {
        this.bonLivraisonClientLignesById = bonLivraisonClientLignesById;
    }

    @OneToOne(mappedBy = "parcMaterielById")
    public CuveOxygene getCuveOxygeneById() {
        return cuveOxygeneById;
    }

    public void setCuveOxygeneById(CuveOxygene cuveOxygeneById) {
        this.cuveOxygeneById = cuveOxygeneById;
    }

    @OneToOne(mappedBy = "parcMaterielById_0")
    public CuveOxygene getCuveOxygeneById_0() {
        return cuveOxygeneById_0;
    }

    public void setCuveOxygeneById_0(CuveOxygene cuveOxygeneById_0) {
        this.cuveOxygeneById_0 = cuveOxygeneById_0;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<HistoriqueMateriel> getHistoriqueMaterielsById() {
        return historiqueMaterielsById;
    }

    public void setHistoriqueMaterielsById(Collection<HistoriqueMateriel> historiqueMaterielsById) {
        this.historiqueMaterielsById = historiqueMaterielsById;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById() {
        return interventionLivraisonReprisesById;
    }

    public void setInterventionLivraisonReprisesById(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById) {
        this.interventionLivraisonReprisesById = interventionLivraisonReprisesById;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId_0")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById_0() {
        return interventionLivraisonReprisesById_0;
    }

    public void setInterventionLivraisonReprisesById_0(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0) {
        this.interventionLivraisonReprisesById_0 = interventionLivraisonReprisesById_0;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<InterventionMaterielArrivee> getInterventionMaterielArriveesById() {
        return interventionMaterielArriveesById;
    }

    public void setInterventionMaterielArriveesById(Collection<InterventionMaterielArrivee> interventionMaterielArriveesById) {
        this.interventionMaterielArriveesById = interventionMaterielArriveesById;
    }

    @ManyToOne
    @JoinColumn(name = "article_id", referencedColumnName = "id", nullable = false)
    public Article getArticleByArticleId() {
        return articleByArticleId;
    }

    public void setArticleByArticleId(Article articleByArticleId) {
        this.articleByArticleId = articleByArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }

    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    public Fournisseur getFournisseurByFournisseurId() {
        return fournisseurByFournisseurId;
    }

    public void setFournisseurByFournisseurId(Fournisseur fournisseurByFournisseurId) {
        this.fournisseurByFournisseurId = fournisseurByFournisseurId;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<ParcMaterielClient> getParcMaterielClientsById() {
        return parcMaterielClientsById;
    }

    public void setParcMaterielClientsById(Collection<ParcMaterielClient> parcMaterielClientsById) {
        this.parcMaterielClientsById = parcMaterielClientsById;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<ParcMaterielPatient> getParcMaterielPatientsById() {
        return parcMaterielPatientsById;
    }

    public void setParcMaterielPatientsById(Collection<ParcMaterielPatient> parcMaterielPatientsById) {
        this.parcMaterielPatientsById = parcMaterielPatientsById;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<ParcMaterielTechnicien> getParcMaterielTechniciensById() {
        return parcMaterielTechniciensById;
    }

    public void setParcMaterielTechniciensById(Collection<ParcMaterielTechnicien> parcMaterielTechniciensById) {
        this.parcMaterielTechniciensById = parcMaterielTechniciensById;
    }

    @OneToMany(mappedBy = "parcMaterielByParcMaterielId")
    public Collection<ValeurMesure> getValeurMesuresById() {
        return valeurMesuresById;
    }

    public void setValeurMesuresById(Collection<ValeurMesure> valeurMesuresById) {
        this.valeurMesuresById = valeurMesuresById;
    }
}
