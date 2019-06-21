package com.airsante.airmes.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * @author jerome.vinet
 * @since 20190304
 * Classe qui récupère la table adresse dans la BDD
 * NOTE : Ajout d'un dataId pour récupération dans le front
 */

@Entity
public class Adresse {
    private Long id;
    private String numeroVoie;
    private String typeVoie;
    private String nomVoie;
    private String codePostal;
    private String ville;
    private String pays;

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
    @Column(name = "numero_voie")
    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    @Basic
    @Column(name = "type_voie")
    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    @Basic
    @Column(name = "nom_voie")
    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    @Basic
    @Column(name = "code_postal")
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "ville")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "pays")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return id == adresse.id &&
                Objects.equals(numeroVoie, adresse.numeroVoie) &&
                Objects.equals(typeVoie, adresse.typeVoie) &&
                Objects.equals(nomVoie, adresse.nomVoie) &&
                Objects.equals(codePostal, adresse.codePostal) &&
                Objects.equals(ville, adresse.ville) &&
                Objects.equals(pays, adresse.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroVoie, typeVoie, nomVoie, codePostal, ville, pays);
    }
}
