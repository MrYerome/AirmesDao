package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Offres {
    private int stId;
    private String stAdresse;
    private boolean stArchive;
    private String stCodepostal;
    private Date stDateenvoi;
    private Date stDateoffre;
    private String stEnonce;
    private String stEntreprise;
    private String stFile;
    private boolean stIstia;
    private String stMaitre;
    private String stTitre;
    private int stVersion;
    private String stVille;
    private boolean stVisible;
    private int stOwner;
    private Collection<Candidatures> candidaturesByStId;

    @Id
    @Column(name = "st_id")
    public int getStId() {
        return stId;
    }

    public void setStId(int stId) {
        this.stId = stId;
    }

    @Basic
    @Column(name = "st_adresse")
    public String getStAdresse() {
        return stAdresse;
    }

    public void setStAdresse(String stAdresse) {
        this.stAdresse = stAdresse;
    }

    @Basic
    @Column(name = "st_archive")
    public boolean isStArchive() {
        return stArchive;
    }

    public void setStArchive(boolean stArchive) {
        this.stArchive = stArchive;
    }

    @Basic
    @Column(name = "st_codepostal")
    public String getStCodepostal() {
        return stCodepostal;
    }

    public void setStCodepostal(String stCodepostal) {
        this.stCodepostal = stCodepostal;
    }

    @Basic
    @Column(name = "st_dateenvoi")
    public Date getStDateenvoi() {
        return stDateenvoi;
    }

    public void setStDateenvoi(Date stDateenvoi) {
        this.stDateenvoi = stDateenvoi;
    }

    @Basic
    @Column(name = "st_dateoffre")
    public Date getStDateoffre() {
        return stDateoffre;
    }

    public void setStDateoffre(Date stDateoffre) {
        this.stDateoffre = stDateoffre;
    }

    @Basic
    @Column(name = "st_enonce")
    public String getStEnonce() {
        return stEnonce;
    }

    public void setStEnonce(String stEnonce) {
        this.stEnonce = stEnonce;
    }

    @Basic
    @Column(name = "st_entreprise")
    public String getStEntreprise() {
        return stEntreprise;
    }

    public void setStEntreprise(String stEntreprise) {
        this.stEntreprise = stEntreprise;
    }

    @Basic
    @Column(name = "st_file")
    public String getStFile() {
        return stFile;
    }

    public void setStFile(String stFile) {
        this.stFile = stFile;
    }

    @Basic
    @Column(name = "st_istia")
    public boolean isStIstia() {
        return stIstia;
    }

    public void setStIstia(boolean stIstia) {
        this.stIstia = stIstia;
    }

    @Basic
    @Column(name = "st_maitre")
    public String getStMaitre() {
        return stMaitre;
    }

    public void setStMaitre(String stMaitre) {
        this.stMaitre = stMaitre;
    }

    @Basic
    @Column(name = "st_titre")
    public String getStTitre() {
        return stTitre;
    }

    public void setStTitre(String stTitre) {
        this.stTitre = stTitre;
    }

    @Basic
    @Column(name = "st_version")
    public int getStVersion() {
        return stVersion;
    }

    public void setStVersion(int stVersion) {
        this.stVersion = stVersion;
    }

    @Basic
    @Column(name = "st_ville")
    public String getStVille() {
        return stVille;
    }

    public void setStVille(String stVille) {
        this.stVille = stVille;
    }

    @Basic
    @Column(name = "st_visible")
    public boolean isStVisible() {
        return stVisible;
    }

    public void setStVisible(boolean stVisible) {
        this.stVisible = stVisible;
    }

    @Basic
    @Column(name = "st_owner")
    public int getStOwner() {
        return stOwner;
    }

    public void setStOwner(int stOwner) {
        this.stOwner = stOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offres offres = (Offres) o;
        return stId == offres.stId &&
                stArchive == offres.stArchive &&
                stIstia == offres.stIstia &&
                stVersion == offres.stVersion &&
                stVisible == offres.stVisible &&
                stOwner == offres.stOwner &&
                Objects.equals(stAdresse, offres.stAdresse) &&
                Objects.equals(stCodepostal, offres.stCodepostal) &&
                Objects.equals(stDateenvoi, offres.stDateenvoi) &&
                Objects.equals(stDateoffre, offres.stDateoffre) &&
                Objects.equals(stEnonce, offres.stEnonce) &&
                Objects.equals(stEntreprise, offres.stEntreprise) &&
                Objects.equals(stFile, offres.stFile) &&
                Objects.equals(stMaitre, offres.stMaitre) &&
                Objects.equals(stTitre, offres.stTitre) &&
                Objects.equals(stVille, offres.stVille);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stId, stAdresse, stArchive, stCodepostal, stDateenvoi, stDateoffre, stEnonce, stEntreprise, stFile, stIstia, stMaitre, stTitre, stVersion, stVille, stVisible, stOwner);
    }

    @OneToMany(mappedBy = "offresByRefStageid")
    public Collection<Candidatures> getCandidaturesByStId() {
        return candidaturesByStId;
    }

    public void setCandidaturesByStId(Collection<Candidatures> candidaturesByStId) {
        this.candidaturesByStId = candidaturesByStId;
    }
}
