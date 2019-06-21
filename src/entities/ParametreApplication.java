package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "parametre_application", schema = "ventury", catalog = "")
public class ParametreApplication {
    private int utilisateurPrincipal;
    private Byte choixAgenceRetourMateriel;
    private String cheminVersPdf;
    private Byte compressionPdf;
    private Byte couleurDeFondActive;
    private String couleurDeFond;
    private Timestamp dateMaj;
    private Timestamp dateSauvegarde;
    private Timestamp dateSuppression;
    private Timestamp dateTransfertIntervention;
    private Byte gestionFenetreParWindows;
    private Integer identifiantApplication;
    private Byte imageAuCentre;
    private byte[] imageDeFond;
    private Byte imageDeFondActive;
    private Byte menuToujoursCache;
    private Byte moduleCommercial;
    private Byte fenetreMaximized;
    private byte premierLancement;
    private Byte retenirCheminPdf;
    private byte retenirMotDePasse;
    private Integer themes;
    private Byte transfertPdfParOvh;
    private Byte transfertSansVpn;
    private Byte triIntelligentConsommable;
    private Byte triIntelligentTypeIntervention;
    private Byte utiliserCheminPdfUtilisateur;

    @Id
    @Column(name = "utilisateur_principal")
    public int getUtilisateurPrincipal() {
        return utilisateurPrincipal;
    }

    public void setUtilisateurPrincipal(int utilisateurPrincipal) {
        this.utilisateurPrincipal = utilisateurPrincipal;
    }

    @Basic
    @Column(name = "choix_agence_retour_materiel")
    public Byte getChoixAgenceRetourMateriel() {
        return choixAgenceRetourMateriel;
    }

    public void setChoixAgenceRetourMateriel(Byte choixAgenceRetourMateriel) {
        this.choixAgenceRetourMateriel = choixAgenceRetourMateriel;
    }

    @Basic
    @Column(name = "chemin_vers_pdf")
    public String getCheminVersPdf() {
        return cheminVersPdf;
    }

    public void setCheminVersPdf(String cheminVersPdf) {
        this.cheminVersPdf = cheminVersPdf;
    }

    @Basic
    @Column(name = "compression_pdf")
    public Byte getCompressionPdf() {
        return compressionPdf;
    }

    public void setCompressionPdf(Byte compressionPdf) {
        this.compressionPdf = compressionPdf;
    }

    @Basic
    @Column(name = "couleur_de_fond_active")
    public Byte getCouleurDeFondActive() {
        return couleurDeFondActive;
    }

    public void setCouleurDeFondActive(Byte couleurDeFondActive) {
        this.couleurDeFondActive = couleurDeFondActive;
    }

    @Basic
    @Column(name = "couleur_de_fond")
    public String getCouleurDeFond() {
        return couleurDeFond;
    }

    public void setCouleurDeFond(String couleurDeFond) {
        this.couleurDeFond = couleurDeFond;
    }

    @Basic
    @Column(name = "date_maj")
    public Timestamp getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(Timestamp dateMaj) {
        this.dateMaj = dateMaj;
    }

    @Basic
    @Column(name = "date_sauvegarde")
    public Timestamp getDateSauvegarde() {
        return dateSauvegarde;
    }

    public void setDateSauvegarde(Timestamp dateSauvegarde) {
        this.dateSauvegarde = dateSauvegarde;
    }

    @Basic
    @Column(name = "date_suppression")
    public Timestamp getDateSuppression() {
        return dateSuppression;
    }

    public void setDateSuppression(Timestamp dateSuppression) {
        this.dateSuppression = dateSuppression;
    }

    @Basic
    @Column(name = "date_transfert_intervention")
    public Timestamp getDateTransfertIntervention() {
        return dateTransfertIntervention;
    }

    public void setDateTransfertIntervention(Timestamp dateTransfertIntervention) {
        this.dateTransfertIntervention = dateTransfertIntervention;
    }

    @Basic
    @Column(name = "gestion_fenetre_par_windows")
    public Byte getGestionFenetreParWindows() {
        return gestionFenetreParWindows;
    }

    public void setGestionFenetreParWindows(Byte gestionFenetreParWindows) {
        this.gestionFenetreParWindows = gestionFenetreParWindows;
    }

    @Basic
    @Column(name = "identifiant_application")
    public Integer getIdentifiantApplication() {
        return identifiantApplication;
    }

    public void setIdentifiantApplication(Integer identifiantApplication) {
        this.identifiantApplication = identifiantApplication;
    }

    @Basic
    @Column(name = "image_au_centre")
    public Byte getImageAuCentre() {
        return imageAuCentre;
    }

    public void setImageAuCentre(Byte imageAuCentre) {
        this.imageAuCentre = imageAuCentre;
    }

    @Basic
    @Column(name = "image_de_fond")
    public byte[] getImageDeFond() {
        return imageDeFond;
    }

    public void setImageDeFond(byte[] imageDeFond) {
        this.imageDeFond = imageDeFond;
    }

    @Basic
    @Column(name = "image_de_fond_active")
    public Byte getImageDeFondActive() {
        return imageDeFondActive;
    }

    public void setImageDeFondActive(Byte imageDeFondActive) {
        this.imageDeFondActive = imageDeFondActive;
    }

    @Basic
    @Column(name = "menu_toujours_cache")
    public Byte getMenuToujoursCache() {
        return menuToujoursCache;
    }

    public void setMenuToujoursCache(Byte menuToujoursCache) {
        this.menuToujoursCache = menuToujoursCache;
    }

    @Basic
    @Column(name = "module_commercial")
    public Byte getModuleCommercial() {
        return moduleCommercial;
    }

    public void setModuleCommercial(Byte moduleCommercial) {
        this.moduleCommercial = moduleCommercial;
    }

    @Basic
    @Column(name = "fenetre_maximized")
    public Byte getFenetreMaximized() {
        return fenetreMaximized;
    }

    public void setFenetreMaximized(Byte fenetreMaximized) {
        this.fenetreMaximized = fenetreMaximized;
    }

    @Basic
    @Column(name = "premier_lancement")
    public byte getPremierLancement() {
        return premierLancement;
    }

    public void setPremierLancement(byte premierLancement) {
        this.premierLancement = premierLancement;
    }

    @Basic
    @Column(name = "retenir_chemin_pdf")
    public Byte getRetenirCheminPdf() {
        return retenirCheminPdf;
    }

    public void setRetenirCheminPdf(Byte retenirCheminPdf) {
        this.retenirCheminPdf = retenirCheminPdf;
    }

    @Basic
    @Column(name = "retenir_mot_de_passe")
    public byte getRetenirMotDePasse() {
        return retenirMotDePasse;
    }

    public void setRetenirMotDePasse(byte retenirMotDePasse) {
        this.retenirMotDePasse = retenirMotDePasse;
    }

    @Basic
    @Column(name = "themes")
    public Integer getThemes() {
        return themes;
    }

    public void setThemes(Integer themes) {
        this.themes = themes;
    }

    @Basic
    @Column(name = "transfert_pdf_par_ovh")
    public Byte getTransfertPdfParOvh() {
        return transfertPdfParOvh;
    }

    public void setTransfertPdfParOvh(Byte transfertPdfParOvh) {
        this.transfertPdfParOvh = transfertPdfParOvh;
    }

    @Basic
    @Column(name = "transfert_sans_vpn")
    public Byte getTransfertSansVpn() {
        return transfertSansVpn;
    }

    public void setTransfertSansVpn(Byte transfertSansVpn) {
        this.transfertSansVpn = transfertSansVpn;
    }

    @Basic
    @Column(name = "tri_intelligent_consommable")
    public Byte getTriIntelligentConsommable() {
        return triIntelligentConsommable;
    }

    public void setTriIntelligentConsommable(Byte triIntelligentConsommable) {
        this.triIntelligentConsommable = triIntelligentConsommable;
    }

    @Basic
    @Column(name = "tri_intelligent_type_intervention")
    public Byte getTriIntelligentTypeIntervention() {
        return triIntelligentTypeIntervention;
    }

    public void setTriIntelligentTypeIntervention(Byte triIntelligentTypeIntervention) {
        this.triIntelligentTypeIntervention = triIntelligentTypeIntervention;
    }

    @Basic
    @Column(name = "utiliser_chemin_pdf_utilisateur")
    public Byte getUtiliserCheminPdfUtilisateur() {
        return utiliserCheminPdfUtilisateur;
    }

    public void setUtiliserCheminPdfUtilisateur(Byte utiliserCheminPdfUtilisateur) {
        this.utiliserCheminPdfUtilisateur = utiliserCheminPdfUtilisateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParametreApplication that = (ParametreApplication) o;
        return utilisateurPrincipal == that.utilisateurPrincipal &&
                premierLancement == that.premierLancement &&
                retenirMotDePasse == that.retenirMotDePasse &&
                Objects.equals(choixAgenceRetourMateriel, that.choixAgenceRetourMateriel) &&
                Objects.equals(cheminVersPdf, that.cheminVersPdf) &&
                Objects.equals(compressionPdf, that.compressionPdf) &&
                Objects.equals(couleurDeFondActive, that.couleurDeFondActive) &&
                Objects.equals(couleurDeFond, that.couleurDeFond) &&
                Objects.equals(dateMaj, that.dateMaj) &&
                Objects.equals(dateSauvegarde, that.dateSauvegarde) &&
                Objects.equals(dateSuppression, that.dateSuppression) &&
                Objects.equals(dateTransfertIntervention, that.dateTransfertIntervention) &&
                Objects.equals(gestionFenetreParWindows, that.gestionFenetreParWindows) &&
                Objects.equals(identifiantApplication, that.identifiantApplication) &&
                Objects.equals(imageAuCentre, that.imageAuCentre) &&
                Arrays.equals(imageDeFond, that.imageDeFond) &&
                Objects.equals(imageDeFondActive, that.imageDeFondActive) &&
                Objects.equals(menuToujoursCache, that.menuToujoursCache) &&
                Objects.equals(moduleCommercial, that.moduleCommercial) &&
                Objects.equals(fenetreMaximized, that.fenetreMaximized) &&
                Objects.equals(retenirCheminPdf, that.retenirCheminPdf) &&
                Objects.equals(themes, that.themes) &&
                Objects.equals(transfertPdfParOvh, that.transfertPdfParOvh) &&
                Objects.equals(transfertSansVpn, that.transfertSansVpn) &&
                Objects.equals(triIntelligentConsommable, that.triIntelligentConsommable) &&
                Objects.equals(triIntelligentTypeIntervention, that.triIntelligentTypeIntervention) &&
                Objects.equals(utiliserCheminPdfUtilisateur, that.utiliserCheminPdfUtilisateur);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(utilisateurPrincipal, choixAgenceRetourMateriel, cheminVersPdf, compressionPdf, couleurDeFondActive, couleurDeFond, dateMaj, dateSauvegarde, dateSuppression, dateTransfertIntervention, gestionFenetreParWindows, identifiantApplication, imageAuCentre, imageDeFondActive, menuToujoursCache, moduleCommercial, fenetreMaximized, premierLancement, retenirCheminPdf, retenirMotDePasse, themes, transfertPdfParOvh, transfertSansVpn, triIntelligentConsommable, triIntelligentTypeIntervention, utiliserCheminPdfUtilisateur);
        result = 31 * result + Arrays.hashCode(imageDeFond);
        return result;
    }
}
