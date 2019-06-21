package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Forfait {
    private int id;
    private Integer typeId;
    private Integer tvaId;
    private Integer typeDossierId;
    private Integer codePrestaId;
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
    private TypeForfait typeForfaitByTypeId;
    private Tva tvaByTvaId;
    private TypeDossier typeDossierByTypeDossierId;
    private Prestation prestationByCodePrestaId;
    private Collection<Prescription> prescriptionsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_id")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "tva_id")
    public Integer getTvaId() {
        return tvaId;
    }

    public void setTvaId(Integer tvaId) {
        this.tvaId = tvaId;
    }

    @Basic
    @Column(name = "type_dossier_id")
    public Integer getTypeDossierId() {
        return typeDossierId;
    }

    public void setTypeDossierId(Integer typeDossierId) {
        this.typeDossierId = typeDossierId;
    }

    @Basic
    @Column(name = "code_presta_id")
    public Integer getCodePrestaId() {
        return codePrestaId;
    }

    public void setCodePrestaId(Integer codePrestaId) {
        this.codePrestaId = codePrestaId;
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
                Objects.equals(typeId, forfait.typeId) &&
                Objects.equals(tvaId, forfait.tvaId) &&
                Objects.equals(typeDossierId, forfait.typeDossierId) &&
                Objects.equals(codePrestaId, forfait.codePrestaId) &&
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
        return Objects.hash(id, typeId, tvaId, typeDossierId, codePrestaId, codeLpp, designation, soumisDep, remboursementEdf, periodiciteVisite, dureePrescriptionInitiale, dureePrescriptionRenouvellement, libelle, commentaire, codeComptaLocation, suspendu, reference);
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    public TypeForfait getTypeForfaitByTypeId() {
        return typeForfaitByTypeId;
    }

    public void setTypeForfaitByTypeId(TypeForfait typeForfaitByTypeId) {
        this.typeForfaitByTypeId = typeForfaitByTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "tva_id", referencedColumnName = "id")
    public Tva getTvaByTvaId() {
        return tvaByTvaId;
    }

    public void setTvaByTvaId(Tva tvaByTvaId) {
        this.tvaByTvaId = tvaByTvaId;
    }

    @ManyToOne
    @JoinColumn(name = "type_dossier_id", referencedColumnName = "id")
    public TypeDossier getTypeDossierByTypeDossierId() {
        return typeDossierByTypeDossierId;
    }

    public void setTypeDossierByTypeDossierId(TypeDossier typeDossierByTypeDossierId) {
        this.typeDossierByTypeDossierId = typeDossierByTypeDossierId;
    }

    @ManyToOne
    @JoinColumn(name = "code_presta_id", referencedColumnName = "id")
    public Prestation getPrestationByCodePrestaId() {
        return prestationByCodePrestaId;
    }

    public void setPrestationByCodePrestaId(Prestation prestationByCodePrestaId) {
        this.prestationByCodePrestaId = prestationByCodePrestaId;
    }

    @OneToMany(mappedBy = "forfaitByForfaitId")
    public Collection<Prescription> getPrescriptionsById() {
        return prescriptionsById;
    }

    public void setPrescriptionsById(Collection<Prescription> prescriptionsById) {
        this.prescriptionsById = prescriptionsById;
    }
}
