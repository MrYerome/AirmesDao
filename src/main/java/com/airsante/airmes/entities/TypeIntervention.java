package com.airsante.airmes.entities;

import javax.persistence.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
@Table(name = "type_intervention", schema = "ventury", catalog = "")
public class TypeIntervention {
    private Long id;
    private String label;
    private Integer delais;
    private Integer prix;
    private Byte pharmacien;
    private Byte urgent;
    private String couleurAgenda;

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
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "delais")
    public Integer getDelais() {
        return delais;
    }

    public void setDelais(Integer delais) {
        this.delais = delais;
    }

    @Basic
    @Column(name = "prix")
    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "pharmacien")
    public Byte getPharmacien() {
        return pharmacien;
    }

    public void setPharmacien(Byte pharmacien) {
        this.pharmacien = pharmacien;
    }

    @Basic
    @Column(name = "urgent")
    public Byte getUrgent() {
        return urgent;
    }

    public void setUrgent(Byte urgent) {
        this.urgent = urgent;
    }

    @Basic
    @Column(name = "couleur_agenda")
    public String getCouleurAgenda() {
        return couleurAgenda;
    }

    public void setCouleurAgenda(String couleurAgenda) {
        this.couleurAgenda = couleurAgenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeIntervention that = (TypeIntervention) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(delais, that.delais) &&
                Objects.equals(prix, that.prix) &&
                Objects.equals(pharmacien, that.pharmacien) &&
                Objects.equals(urgent, that.urgent) &&
                Objects.equals(couleurAgenda, that.couleurAgenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, delais, prix, pharmacien, urgent, couleurAgenda);
    }
}