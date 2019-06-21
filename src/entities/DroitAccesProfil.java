package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "droit_acces_profil", schema = "ventury", catalog = "")
@IdClass(DroitAccesProfilPK.class)
public class DroitAccesProfil {
    private int fonctionnaliteId;
    private int profilUtilisateurId;
    private byte creation;
    private byte export;
    private byte impression;
    private byte lecture;
    private byte modification;
    private byte suppression;
    private Fonctionnalite fonctionnaliteByFonctionnaliteId;
    private ProfilUtilisateur profilUtilisateurByProfilUtilisateurId;

    @Id
    @Column(name = "fonctionnalite_id")
    public int getFonctionnaliteId() {
        return fonctionnaliteId;
    }

    public void setFonctionnaliteId(int fonctionnaliteId) {
        this.fonctionnaliteId = fonctionnaliteId;
    }

    @Id
    @Column(name = "profil_utilisateur_id")
    public int getProfilUtilisateurId() {
        return profilUtilisateurId;
    }

    public void setProfilUtilisateurId(int profilUtilisateurId) {
        this.profilUtilisateurId = profilUtilisateurId;
    }

    @Basic
    @Column(name = "creation")
    public byte getCreation() {
        return creation;
    }

    public void setCreation(byte creation) {
        this.creation = creation;
    }

    @Basic
    @Column(name = "export")
    public byte getExport() {
        return export;
    }

    public void setExport(byte export) {
        this.export = export;
    }

    @Basic
    @Column(name = "impression")
    public byte getImpression() {
        return impression;
    }

    public void setImpression(byte impression) {
        this.impression = impression;
    }

    @Basic
    @Column(name = "lecture")
    public byte getLecture() {
        return lecture;
    }

    public void setLecture(byte lecture) {
        this.lecture = lecture;
    }

    @Basic
    @Column(name = "modification")
    public byte getModification() {
        return modification;
    }

    public void setModification(byte modification) {
        this.modification = modification;
    }

    @Basic
    @Column(name = "suppression")
    public byte getSuppression() {
        return suppression;
    }

    public void setSuppression(byte suppression) {
        this.suppression = suppression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DroitAccesProfil that = (DroitAccesProfil) o;
        return fonctionnaliteId == that.fonctionnaliteId &&
                profilUtilisateurId == that.profilUtilisateurId &&
                creation == that.creation &&
                export == that.export &&
                impression == that.impression &&
                lecture == that.lecture &&
                modification == that.modification &&
                suppression == that.suppression;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fonctionnaliteId, profilUtilisateurId, creation, export, impression, lecture, modification, suppression);
    }

    @ManyToOne
    @JoinColumn(name = "fonctionnalite_id", referencedColumnName = "id", nullable = false)
    public Fonctionnalite getFonctionnaliteByFonctionnaliteId() {
        return fonctionnaliteByFonctionnaliteId;
    }

    public void setFonctionnaliteByFonctionnaliteId(Fonctionnalite fonctionnaliteByFonctionnaliteId) {
        this.fonctionnaliteByFonctionnaliteId = fonctionnaliteByFonctionnaliteId;
    }

    @ManyToOne
    @JoinColumn(name = "profil_utilisateur_id", referencedColumnName = "id", nullable = false)
    public ProfilUtilisateur getProfilUtilisateurByProfilUtilisateurId() {
        return profilUtilisateurByProfilUtilisateurId;
    }

    public void setProfilUtilisateurByProfilUtilisateurId(ProfilUtilisateur profilUtilisateurByProfilUtilisateurId) {
        this.profilUtilisateurByProfilUtilisateurId = profilUtilisateurByProfilUtilisateurId;
    }
}
