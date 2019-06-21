package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "droit_acces_utilisateur", schema = "ventury", catalog = "")
@IdClass(DroitAccesUtilisateurPK.class)
public class DroitAccesUtilisateur {
    private int fonctionnaliteId;
    private int utilisateurId;
    private byte creation;
    private byte creationPerso;
    private byte export;
    private byte exportPerso;
    private byte impression;
    private byte impressionPerso;
    private byte lecture;
    private byte lecturePerso;
    private byte modification;
    private byte modificationPerso;
    private byte suppression;
    private byte suppressionPerso;
    private Fonctionnalite fonctionnaliteByFonctionnaliteId;
    private Utilisateur utilisateurByUtilisateurId;

    @Id
    @Column(name = "fonctionnalite_id")
    public int getFonctionnaliteId() {
        return fonctionnaliteId;
    }

    public void setFonctionnaliteId(int fonctionnaliteId) {
        this.fonctionnaliteId = fonctionnaliteId;
    }

    @Id
    @Column(name = "utilisateur_id")
    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
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
    @Column(name = "creation_perso")
    public byte getCreationPerso() {
        return creationPerso;
    }

    public void setCreationPerso(byte creationPerso) {
        this.creationPerso = creationPerso;
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
    @Column(name = "export_perso")
    public byte getExportPerso() {
        return exportPerso;
    }

    public void setExportPerso(byte exportPerso) {
        this.exportPerso = exportPerso;
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
    @Column(name = "impression_perso")
    public byte getImpressionPerso() {
        return impressionPerso;
    }

    public void setImpressionPerso(byte impressionPerso) {
        this.impressionPerso = impressionPerso;
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
    @Column(name = "lecture_perso")
    public byte getLecturePerso() {
        return lecturePerso;
    }

    public void setLecturePerso(byte lecturePerso) {
        this.lecturePerso = lecturePerso;
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
    @Column(name = "modification_perso")
    public byte getModificationPerso() {
        return modificationPerso;
    }

    public void setModificationPerso(byte modificationPerso) {
        this.modificationPerso = modificationPerso;
    }

    @Basic
    @Column(name = "suppression")
    public byte getSuppression() {
        return suppression;
    }

    public void setSuppression(byte suppression) {
        this.suppression = suppression;
    }

    @Basic
    @Column(name = "suppression_perso")
    public byte getSuppressionPerso() {
        return suppressionPerso;
    }

    public void setSuppressionPerso(byte suppressionPerso) {
        this.suppressionPerso = suppressionPerso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DroitAccesUtilisateur that = (DroitAccesUtilisateur) o;
        return fonctionnaliteId == that.fonctionnaliteId &&
                utilisateurId == that.utilisateurId &&
                creation == that.creation &&
                creationPerso == that.creationPerso &&
                export == that.export &&
                exportPerso == that.exportPerso &&
                impression == that.impression &&
                impressionPerso == that.impressionPerso &&
                lecture == that.lecture &&
                lecturePerso == that.lecturePerso &&
                modification == that.modification &&
                modificationPerso == that.modificationPerso &&
                suppression == that.suppression &&
                suppressionPerso == that.suppressionPerso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fonctionnaliteId, utilisateurId, creation, creationPerso, export, exportPerso, impression, impressionPerso, lecture, lecturePerso, modification, modificationPerso, suppression, suppressionPerso);
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
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id", nullable = false)
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }
}
