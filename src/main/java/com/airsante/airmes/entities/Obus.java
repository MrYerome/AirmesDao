package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Obus {
    private Long id;
    private String numeroBouteille;
    private Date dateReception;
    private Integer statut;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obus obus = (Obus) o;
        return id == obus.id &&
                Objects.equals(numeroBouteille, obus.numeroBouteille) &&
                Objects.equals(dateReception, obus.dateReception) &&
                Objects.equals(statut, obus.statut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroBouteille, dateReception, statut);
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
