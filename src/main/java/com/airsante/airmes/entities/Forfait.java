package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Forfait {
    private Long id;
    private Integer codeLpp;
    private String designation;
    private Byte soumisDep;
    private Integer remboursementEdf;
    private Integer periodiciteVisite;
    private Integer dureePrescriptionInitiale;
    private Integer dureePrescriptionRenouvellement;
    private String libelle;
    private String commentaire;
    private String codeComptaLocation;
    private Short suspendu;
    private String reference;

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
    @Column(name = "code_lpp")
    public Integer getCodeLpp() {
        return codeLpp;
    }

    public void setCodeLpp(Integer codeLpp) {
        this.codeLpp = codeLpp;
    }

    @Basic
    @Column(name = "designation")
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Basic
    @Column(name = "soumis_dep")
    public Byte getSoumisDep() {
        return soumisDep;
    }

    public void setSoumisDep(Byte soumisDep) {
        this.soumisDep = soumisDep;
    }

    @Basic
    @Column(name = "remboursement_edf")
    public Integer getRemboursementEdf() {
        return remboursementEdf;
    }

    public void setRemboursementEdf(Integer remboursementEdf) {
        this.remboursementEdf = remboursementEdf;
    }

    @Basic
    @Column(name = "periodicite_visite")
    public Integer getPeriodiciteVisite() {
        return periodiciteVisite;
    }

    public void setPeriodiciteVisite(Integer periodiciteVisite) {
        this.periodiciteVisite = periodiciteVisite;
    }

    @Basic
    @Column(name = "duree_prescription_initiale")
    public Integer getDureePrescriptionInitiale() {
        return dureePrescriptionInitiale;
    }

    public void setDureePrescriptionInitiale(Integer dureePrescriptionInitiale) {
        this.dureePrescriptionInitiale = dureePrescriptionInitiale;
    }

    @Basic
    @Column(name = "duree_prescription_renouvellement")
    public Integer getDureePrescriptionRenouvellement() {
        return dureePrescriptionRenouvellement;
    }

    public void setDureePrescriptionRenouvellement(Integer dureePrescriptionRenouvellement) {
        this.dureePrescriptionRenouvellement = dureePrescriptionRenouvellement;
    }

    @Basic
    @Column(name = "libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "code_compta_location")
    public String getCodeComptaLocation() {
        return codeComptaLocation;
    }

    public void setCodeComptaLocation(String codeComptaLocation) {
        this.codeComptaLocation = codeComptaLocation;
    }

    @Basic
    @Column(name = "suspendu")
    public Short getSuspendu() {
        return suspendu;
    }

    public void setSuspendu(Short suspendu) {
        this.suspendu = suspendu;
    }

    @Basic
    @Column(name = "reference")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Forfait forfait = (Forfait) o;
        return id == forfait.id &&
                Objects.equals(codeLpp, forfait.codeLpp) &&
                Objects.equals(designation, forfait.designation) &&
                Objects.equals(soumisDep, forfait.soumisDep) &&
                Objects.equals(remboursementEdf, forfait.remboursementEdf) &&
                Objects.equals(periodiciteVisite, forfait.periodiciteVisite) &&
                Objects.equals(dureePrescriptionInitiale, forfait.dureePrescriptionInitiale) &&
                Objects.equals(dureePrescriptionRenouvellement, forfait.dureePrescriptionRenouvellement) &&
                Objects.equals(libelle, forfait.libelle) &&
                Objects.equals(commentaire, forfait.commentaire) &&
                Objects.equals(codeComptaLocation, forfait.codeComptaLocation) &&
                Objects.equals(suspendu, forfait.suspendu) &&
                Objects.equals(reference, forfait.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeLpp, designation, soumisDep, remboursementEdf, periodiciteVisite, dureePrescriptionInitiale, dureePrescriptionRenouvellement, libelle, commentaire, codeComptaLocation, suspendu, reference);
    }
}
