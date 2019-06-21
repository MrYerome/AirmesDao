package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Obus {
    private int id;
    private int articleId;
    private String numeroBouteille;
    private Date dateReception;
    private Integer statut;
    private Integer agenceId;
    private Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById;
    private Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0;
    private Collection<InterventionMaterielArrivee> interventionMaterielArriveesById;
    private Collection<LotOxygeneObus> lotOxygeneObusesById;
    private Article articleByArticleId;
    private Agence agenceByAgenceId;
    private Collection<ObusPatient> obusPatientsById;
    private Collection<ObusTechnicien> obusTechniciensById;
    private Collection<ValeurMesureObus> valeurMesureObusesById;

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
    @Column(name = "numero_bouteille")
    public String getNumeroBouteille() {
        return numeroBouteille;
    }

    public void setNumeroBouteille(String numeroBouteille) {
        this.numeroBouteille = numeroBouteille;
    }

    @Basic
    @Column(name = "date_reception")
    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    @Basic
    @Column(name = "statut")
    public Integer getStatut() {
        return statut;
    }

    public void setStatut(Integer statut) {
        this.statut = statut;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obus obus = (Obus) o;
        return id == obus.id &&
                articleId == obus.articleId &&
                Objects.equals(numeroBouteille, obus.numeroBouteille) &&
                Objects.equals(dateReception, obus.dateReception) &&
                Objects.equals(statut, obus.statut) &&
                Objects.equals(agenceId, obus.agenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleId, numeroBouteille, dateReception, statut, agenceId);
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<BonLivraisonClientLigne> getBonLivraisonClientLignesById() {
        return bonLivraisonClientLignesById;
    }

    public void setBonLivraisonClientLignesById(Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById) {
        this.bonLivraisonClientLignesById = bonLivraisonClientLignesById;
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById() {
        return interventionLivraisonReprisesById;
    }

    public void setInterventionLivraisonReprisesById(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById) {
        this.interventionLivraisonReprisesById = interventionLivraisonReprisesById;
    }

    @OneToMany(mappedBy = "obusByObusId_0")
    public Collection<InterventionLivraisonReprise> getInterventionLivraisonReprisesById_0() {
        return interventionLivraisonReprisesById_0;
    }

    public void setInterventionLivraisonReprisesById_0(Collection<InterventionLivraisonReprise> interventionLivraisonReprisesById_0) {
        this.interventionLivraisonReprisesById_0 = interventionLivraisonReprisesById_0;
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<InterventionMaterielArrivee> getInterventionMaterielArriveesById() {
        return interventionMaterielArriveesById;
    }

    public void setInterventionMaterielArriveesById(Collection<InterventionMaterielArrivee> interventionMaterielArriveesById) {
        this.interventionMaterielArriveesById = interventionMaterielArriveesById;
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<LotOxygeneObus> getLotOxygeneObusesById() {
        return lotOxygeneObusesById;
    }

    public void setLotOxygeneObusesById(Collection<LotOxygeneObus> lotOxygeneObusesById) {
        this.lotOxygeneObusesById = lotOxygeneObusesById;
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

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<ObusPatient> getObusPatientsById() {
        return obusPatientsById;
    }

    public void setObusPatientsById(Collection<ObusPatient> obusPatientsById) {
        this.obusPatientsById = obusPatientsById;
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<ObusTechnicien> getObusTechniciensById() {
        return obusTechniciensById;
    }

    public void setObusTechniciensById(Collection<ObusTechnicien> obusTechniciensById) {
        this.obusTechniciensById = obusTechniciensById;
    }

    @OneToMany(mappedBy = "obusByObusId")
    public Collection<ValeurMesureObus> getValeurMesureObusesById() {
        return valeurMesureObusesById;
    }

    public void setValeurMesureObusesById(Collection<ValeurMesureObus> valeurMesureObusesById) {
        this.valeurMesureObusesById = valeurMesureObusesById;
    }
}
