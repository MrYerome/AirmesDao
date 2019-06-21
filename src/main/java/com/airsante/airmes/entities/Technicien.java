package com.airsante.airmes.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Technicien {
    private Long id;
    private Date dateEntree;
    private Date dateSortie;
    private Integer statutFamilial;
    private String epoux;
    private Double salaire;
    private Integer mutuelle;
    private String numeroVehicule;
    private String numeroCarteEssence;
    private String boitierPeage;
    private byte[] photo;
    private Personne personneById;
    private Personne personneByPersonneAContacterId;
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
    @Column(name = "date_entree")
    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    @Basic
    @Column(name = "date_sortie")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "statut_familial")
    public Integer getStatutFamilial() {
        return statutFamilial;
    }

    public void setStatutFamilial(Integer statutFamilial) {
        this.statutFamilial = statutFamilial;
    }

    @Basic
    @Column(name = "epoux")
    public String getEpoux() {
        return epoux;
    }

    public void setEpoux(String epoux) {
        this.epoux = epoux;
    }

    @Basic
    @Column(name = "salaire")
    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Basic
    @Column(name = "mutuelle")
    public Integer getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(Integer mutuelle) {
        this.mutuelle = mutuelle;
    }

    @Basic
    @Column(name = "numero_vehicule")
    public String getNumeroVehicule() {
        return numeroVehicule;
    }

    public void setNumeroVehicule(String numeroVehicule) {
        this.numeroVehicule = numeroVehicule;
    }

    @Basic
    @Column(name = "numero_carte_essence")
    public String getNumeroCarteEssence() {
        return numeroCarteEssence;
    }

    public void setNumeroCarteEssence(String numeroCarteEssence) {
        this.numeroCarteEssence = numeroCarteEssence;
    }

    @Basic
    @Column(name = "boitier_peage")
    public String getBoitierPeage() {
        return boitierPeage;
    }

    public void setBoitierPeage(String boitierPeage) {
        this.boitierPeage = boitierPeage;
    }

    @Basic
    @Column(name = "photo")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technicien that = (Technicien) o;
        return id == that.id &&
                Objects.equals(dateEntree, that.dateEntree) &&
                Objects.equals(dateSortie, that.dateSortie) &&
                Objects.equals(statutFamilial, that.statutFamilial) &&
                Objects.equals(epoux, that.epoux) &&
                Objects.equals(salaire, that.salaire) &&
                Objects.equals(mutuelle, that.mutuelle) &&
                Objects.equals(numeroVehicule, that.numeroVehicule) &&
                Objects.equals(numeroCarteEssence, that.numeroCarteEssence) &&
                Objects.equals(boitierPeage, that.boitierPeage) &&
                Arrays.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, dateEntree, dateSortie, statutFamilial, epoux, salaire, mutuelle, numeroVehicule, numeroCarteEssence, boitierPeage);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById() {
        return personneById;
    }

    public void setPersonneById(Personne personneById) {
        this.personneById = personneById;
    }

    @ManyToOne
    @JoinColumn(name = "personne_a_contacter_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneAContacterId() {
        return personneByPersonneAContacterId;
    }

    public void setPersonneByPersonneAContacterId(Personne personneByPersonneAContacterId) {
        this.personneByPersonneAContacterId = personneByPersonneAContacterId;
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
