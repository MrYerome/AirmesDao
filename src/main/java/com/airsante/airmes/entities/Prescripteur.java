package com.airsante.airmes.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Prescripteur {
    private Long id;
    private String numeroPrescripteur;
    private String numeroFiness;
    private String login;
    private String password;
    private Byte etablissementVisibilite;
    private String etablissementService;
    private byte nouvelExtranet;
    private Timestamp derniereConnexion;
    private Personne personneById;
    private Agence agenceByAgenceId;
    private Etablissement etablissementByEtablissementId;

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
    @Column(name = "numero_prescripteur")
    public String getNumeroPrescripteur() {
        return numeroPrescripteur;
    }

    public void setNumeroPrescripteur(String numeroPrescripteur) {
        this.numeroPrescripteur = numeroPrescripteur;
    }

    @Basic
    @Column(name = "numero_finess")
    public String getNumeroFiness() {
        return numeroFiness;
    }

    public void setNumeroFiness(String numeroFiness) {
        this.numeroFiness = numeroFiness;
    }

    @Basic
    @Column(name = "login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "etablissement_visibilite")
    public Byte getEtablissementVisibilite() {
        return etablissementVisibilite;
    }

    public void setEtablissementVisibilite(Byte etablissementVisibilite) {
        this.etablissementVisibilite = etablissementVisibilite;
    }

    @Basic
    @Column(name = "etablissement_service")
    public String getEtablissementService() {
        return etablissementService;
    }

    public void setEtablissementService(String etablissementService) {
        this.etablissementService = etablissementService;
    }

    @Basic
    @Column(name = "nouvel_extranet")
    public byte getNouvelExtranet() {
        return nouvelExtranet;
    }

    public void setNouvelExtranet(byte nouvelExtranet) {
        this.nouvelExtranet = nouvelExtranet;
    }

    @Basic
    @Column(name = "derniere_connexion")
    public Timestamp getDerniereConnexion() {
        return derniereConnexion;
    }

    public void setDerniereConnexion(Timestamp derniereConnexion) {
        this.derniereConnexion = derniereConnexion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescripteur that = (Prescripteur) o;
        return id == that.id &&
                nouvelExtranet == that.nouvelExtranet &&
                Objects.equals(numeroPrescripteur, that.numeroPrescripteur) &&
                Objects.equals(numeroFiness, that.numeroFiness) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(etablissementVisibilite, that.etablissementVisibilite) &&
                Objects.equals(etablissementService, that.etablissementService) &&
                Objects.equals(derniereConnexion, that.derniereConnexion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroPrescripteur, numeroFiness, login, password, etablissementVisibilite, etablissementService, nouvelExtranet, derniereConnexion);
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
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }

    @ManyToOne
    @JoinColumn(name = "etablissement_id", referencedColumnName = "id")
    public Etablissement getEtablissementByEtablissementId() {
        return etablissementByEtablissementId;
    }

    public void setEtablissementByEtablissementId(Etablissement etablissementByEtablissementId) {
        this.etablissementByEtablissementId = etablissementByEtablissementId;
    }
}
