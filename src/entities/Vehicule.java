package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Vehicule {
    private int id;
    private String badgeTelepeage;
    private String banque;
    private String carteEssence;
    private BigDecimal creditMensualite;
    private Double creditTaux;
    private Timestamp dateProchainCt;
    private Timestamp dateSuppr;
    private Integer essenceRecuperationTva;
    private String immatriculation;
    private Timestamp leasingDateDebut;
    private Timestamp leasingDateFin;
    private String marque;
    private String modele;
    private Integer periodeRevision;
    private byte[] photo;
    private BigDecimal prixAchat;
    private Byte recuperationTva;
    private Integer tvaId;
    private Integer utilisateurId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "badge_telepeage")
    public String getBadgeTelepeage() {
        return badgeTelepeage;
    }

    public void setBadgeTelepeage(String badgeTelepeage) {
        this.badgeTelepeage = badgeTelepeage;
    }

    @Basic
    @Column(name = "banque")
    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    @Basic
    @Column(name = "carte_essence")
    public String getCarteEssence() {
        return carteEssence;
    }

    public void setCarteEssence(String carteEssence) {
        this.carteEssence = carteEssence;
    }

    @Basic
    @Column(name = "credit_mensualite")
    public BigDecimal getCreditMensualite() {
        return creditMensualite;
    }

    public void setCreditMensualite(BigDecimal creditMensualite) {
        this.creditMensualite = creditMensualite;
    }

    @Basic
    @Column(name = "credit_taux")
    public Double getCreditTaux() {
        return creditTaux;
    }

    public void setCreditTaux(Double creditTaux) {
        this.creditTaux = creditTaux;
    }

    @Basic
    @Column(name = "date_prochain_ct")
    public Timestamp getDateProchainCt() {
        return dateProchainCt;
    }

    public void setDateProchainCt(Timestamp dateProchainCt) {
        this.dateProchainCt = dateProchainCt;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "essence_recuperation_tva")
    public Integer getEssenceRecuperationTva() {
        return essenceRecuperationTva;
    }

    public void setEssenceRecuperationTva(Integer essenceRecuperationTva) {
        this.essenceRecuperationTva = essenceRecuperationTva;
    }

    @Basic
    @Column(name = "immatriculation")
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Basic
    @Column(name = "leasing_date_debut")
    public Timestamp getLeasingDateDebut() {
        return leasingDateDebut;
    }

    public void setLeasingDateDebut(Timestamp leasingDateDebut) {
        this.leasingDateDebut = leasingDateDebut;
    }

    @Basic
    @Column(name = "leasing_date_fin")
    public Timestamp getLeasingDateFin() {
        return leasingDateFin;
    }

    public void setLeasingDateFin(Timestamp leasingDateFin) {
        this.leasingDateFin = leasingDateFin;
    }

    @Basic
    @Column(name = "marque")
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Basic
    @Column(name = "modele")
    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    @Basic
    @Column(name = "periode_revision")
    public Integer getPeriodeRevision() {
        return periodeRevision;
    }

    public void setPeriodeRevision(Integer periodeRevision) {
        this.periodeRevision = periodeRevision;
    }

    @Basic
    @Column(name = "photo")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "prix_achat")
    public BigDecimal getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(BigDecimal prixAchat) {
        this.prixAchat = prixAchat;
    }

    @Basic
    @Column(name = "recuperation_tva")
    public Byte getRecuperationTva() {
        return recuperationTva;
    }

    public void setRecuperationTva(Byte recuperationTva) {
        this.recuperationTva = recuperationTva;
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
    @Column(name = "utilisateur_id")
    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return id == vehicule.id &&
                Objects.equals(badgeTelepeage, vehicule.badgeTelepeage) &&
                Objects.equals(banque, vehicule.banque) &&
                Objects.equals(carteEssence, vehicule.carteEssence) &&
                Objects.equals(creditMensualite, vehicule.creditMensualite) &&
                Objects.equals(creditTaux, vehicule.creditTaux) &&
                Objects.equals(dateProchainCt, vehicule.dateProchainCt) &&
                Objects.equals(dateSuppr, vehicule.dateSuppr) &&
                Objects.equals(essenceRecuperationTva, vehicule.essenceRecuperationTva) &&
                Objects.equals(immatriculation, vehicule.immatriculation) &&
                Objects.equals(leasingDateDebut, vehicule.leasingDateDebut) &&
                Objects.equals(leasingDateFin, vehicule.leasingDateFin) &&
                Objects.equals(marque, vehicule.marque) &&
                Objects.equals(modele, vehicule.modele) &&
                Objects.equals(periodeRevision, vehicule.periodeRevision) &&
                Arrays.equals(photo, vehicule.photo) &&
                Objects.equals(prixAchat, vehicule.prixAchat) &&
                Objects.equals(recuperationTva, vehicule.recuperationTva) &&
                Objects.equals(tvaId, vehicule.tvaId) &&
                Objects.equals(utilisateurId, vehicule.utilisateurId);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, badgeTelepeage, banque, carteEssence, creditMensualite, creditTaux, dateProchainCt, dateSuppr, essenceRecuperationTva, immatriculation, leasingDateDebut, leasingDateFin, marque, modele, periodeRevision, prixAchat, recuperationTva, tvaId, utilisateurId);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
