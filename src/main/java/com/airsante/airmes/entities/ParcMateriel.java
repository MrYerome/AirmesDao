package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
@Table(name = "parc_materiel", schema = "ventury", catalog = "")
public class ParcMateriel {
    private Long id;
    private String numeroParc;
    private String numeroSerie;
    private Integer etat;
    private Integer periodiciteRevision;
    private Date dateProchaineRevision;
    private Date dateAchat;
    private Double prixAchat;
    private Timestamp dateSuppr;
    private Article articleByArticleId;
    private Agence agenceByAgenceId;

    @Id
	@JsonProperty(value = "dataId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return Objects.hash(id, numeroParc, numeroSerie, etat, periodiciteRevision, dateProchaineRevision, dateAchat, prixAchat, dateSuppr);
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
}
