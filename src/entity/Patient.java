package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Patient {
    private int id;
    private String numeroSs;
    private String profession;
    private String photo;
    private String fichierAutorisationPhoto;
    private String poids;
    private String taille;
    private String nomJeuneFille;
    private byte actif;
    private String relationPersonneAttachee;
    private Timestamp dateRenouvellementDep;
    private Timestamp dateModif;
    private byte nouveauPatient;
    private Integer typeEcheanceId;
    private Integer modeReglementId;
    private String rangNaissance;
    private String rangBeneficiaire;
    private String finDroit;
    private String fin100;
    private Timestamp dateDeces;
    private Timestamp dateProchainRdv;
    private byte rappelSms;
    private byte rappelMail;
    private Timestamp dateProchaineInterv;
    private Timestamp dateInstallation;
    private String statutDossier;
    private String identifiant;
    private String motdepasse;
    private Integer dossierStatut;
    private Short teleobservance;
    private Byte extranetactif;
    private Byte premiereConnexion;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numero_ss")
    public String getNumeroSs() {
        return numeroSs;
    }

    public void setNumeroSs(String numeroSs) {
        this.numeroSs = numeroSs;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "fichier_autorisation_photo")
    public String getFichierAutorisationPhoto() {
        return fichierAutorisationPhoto;
    }

    public void setFichierAutorisationPhoto(String fichierAutorisationPhoto) {
        this.fichierAutorisationPhoto = fichierAutorisationPhoto;
    }

    @Basic
    @Column(name = "poids")
    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    @Basic
    @Column(name = "taille")
    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    @Basic
    @Column(name = "nom_jeune_fille")
    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    @Basic
    @Column(name = "actif")
    public byte getActif() {
        return actif;
    }

    public void setActif(byte actif) {
        this.actif = actif;
    }

    @Basic
    @Column(name = "relation_personne_attachee")
    public String getRelationPersonneAttachee() {
        return relationPersonneAttachee;
    }

    public void setRelationPersonneAttachee(String relationPersonneAttachee) {
        this.relationPersonneAttachee = relationPersonneAttachee;
    }

    @Basic
    @Column(name = "date_renouvellement_dep")
    public Timestamp getDateRenouvellementDep() {
        return dateRenouvellementDep;
    }

    public void setDateRenouvellementDep(Timestamp dateRenouvellementDep) {
        this.dateRenouvellementDep = dateRenouvellementDep;
    }

    @Basic
    @Column(name = "date_modif")
    public Timestamp getDateModif() {
        return dateModif;
    }

    public void setDateModif(Timestamp dateModif) {
        this.dateModif = dateModif;
    }

    @Basic
    @Column(name = "nouveau_patient")
    public byte getNouveauPatient() {
        return nouveauPatient;
    }

    public void setNouveauPatient(byte nouveauPatient) {
        this.nouveauPatient = nouveauPatient;
    }

    @Basic
    @Column(name = "type_echeance_id")
    public Integer getTypeEcheanceId() {
        return typeEcheanceId;
    }

    public void setTypeEcheanceId(Integer typeEcheanceId) {
        this.typeEcheanceId = typeEcheanceId;
    }

    @Basic
    @Column(name = "mode_reglement_id")
    public Integer getModeReglementId() {
        return modeReglementId;
    }

    public void setModeReglementId(Integer modeReglementId) {
        this.modeReglementId = modeReglementId;
    }

    @Basic
    @Column(name = "rang_naissance")
    public String getRangNaissance() {
        return rangNaissance;
    }

    public void setRangNaissance(String rangNaissance) {
        this.rangNaissance = rangNaissance;
    }

    @Basic
    @Column(name = "rang_beneficiaire")
    public String getRangBeneficiaire() {
        return rangBeneficiaire;
    }

    public void setRangBeneficiaire(String rangBeneficiaire) {
        this.rangBeneficiaire = rangBeneficiaire;
    }

    @Basic
    @Column(name = "fin_droit")
    public String getFinDroit() {
        return finDroit;
    }

    public void setFinDroit(String finDroit) {
        this.finDroit = finDroit;
    }

    @Basic
    @Column(name = "fin_100")
    public String getFin100() {
        return fin100;
    }

    public void setFin100(String fin100) {
        this.fin100 = fin100;
    }

    @Basic
    @Column(name = "date_deces")
    public Timestamp getDateDeces() {
        return dateDeces;
    }

    public void setDateDeces(Timestamp dateDeces) {
        this.dateDeces = dateDeces;
    }

    @Basic
    @Column(name = "date_prochain_rdv")
    public Timestamp getDateProchainRdv() {
        return dateProchainRdv;
    }

    public void setDateProchainRdv(Timestamp dateProchainRdv) {
        this.dateProchainRdv = dateProchainRdv;
    }

    @Basic
    @Column(name = "rappel_sms")
    public byte getRappelSms() {
        return rappelSms;
    }

    public void setRappelSms(byte rappelSms) {
        this.rappelSms = rappelSms;
    }

    @Basic
    @Column(name = "rappel_mail")
    public byte getRappelMail() {
        return rappelMail;
    }

    public void setRappelMail(byte rappelMail) {
        this.rappelMail = rappelMail;
    }

    @Basic
    @Column(name = "date_prochaine_interv")
    public Timestamp getDateProchaineInterv() {
        return dateProchaineInterv;
    }

    public void setDateProchaineInterv(Timestamp dateProchaineInterv) {
        this.dateProchaineInterv = dateProchaineInterv;
    }

    @Basic
    @Column(name = "date_installation")
    public Timestamp getDateInstallation() {
        return dateInstallation;
    }

    public void setDateInstallation(Timestamp dateInstallation) {
        this.dateInstallation = dateInstallation;
    }

    @Basic
    @Column(name = "statut_dossier")
    public String getStatutDossier() {
        return statutDossier;
    }

    public void setStatutDossier(String statutDossier) {
        this.statutDossier = statutDossier;
    }

    @Basic
    @Column(name = "identifiant")
    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    @Basic
    @Column(name = "motdepasse")
    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @Basic
    @Column(name = "dossier_statut")
    public Integer getDossierStatut() {
        return dossierStatut;
    }

    public void setDossierStatut(Integer dossierStatut) {
        this.dossierStatut = dossierStatut;
    }

    @Basic
    @Column(name = "teleobservance")
    public Short getTeleobservance() {
        return teleobservance;
    }

    public void setTeleobservance(Short teleobservance) {
        this.teleobservance = teleobservance;
    }

    @Basic
    @Column(name = "extranetactif")
    public Byte getExtranetactif() {
        return extranetactif;
    }

    public void setExtranetactif(Byte extranetactif) {
        this.extranetactif = extranetactif;
    }

    @Basic
    @Column(name = "premiere_connexion")
    public Byte getPremiereConnexion() {
        return premiereConnexion;
    }

    public void setPremiereConnexion(Byte premiereConnexion) {
        this.premiereConnexion = premiereConnexion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id &&
                actif == patient.actif &&
                nouveauPatient == patient.nouveauPatient &&
                rappelSms == patient.rappelSms &&
                rappelMail == patient.rappelMail &&
                Objects.equals(numeroSs, patient.numeroSs) &&
                Objects.equals(profession, patient.profession) &&
                Objects.equals(photo, patient.photo) &&
                Objects.equals(fichierAutorisationPhoto, patient.fichierAutorisationPhoto) &&
                Objects.equals(poids, patient.poids) &&
                Objects.equals(taille, patient.taille) &&
                Objects.equals(nomJeuneFille, patient.nomJeuneFille) &&
                Objects.equals(relationPersonneAttachee, patient.relationPersonneAttachee) &&
                Objects.equals(dateRenouvellementDep, patient.dateRenouvellementDep) &&
                Objects.equals(dateModif, patient.dateModif) &&
                Objects.equals(typeEcheanceId, patient.typeEcheanceId) &&
                Objects.equals(modeReglementId, patient.modeReglementId) &&
                Objects.equals(rangNaissance, patient.rangNaissance) &&
                Objects.equals(rangBeneficiaire, patient.rangBeneficiaire) &&
                Objects.equals(finDroit, patient.finDroit) &&
                Objects.equals(fin100, patient.fin100) &&
                Objects.equals(dateDeces, patient.dateDeces) &&
                Objects.equals(dateProchainRdv, patient.dateProchainRdv) &&
                Objects.equals(dateProchaineInterv, patient.dateProchaineInterv) &&
                Objects.equals(dateInstallation, patient.dateInstallation) &&
                Objects.equals(statutDossier, patient.statutDossier) &&
                Objects.equals(identifiant, patient.identifiant) &&
                Objects.equals(motdepasse, patient.motdepasse) &&
                Objects.equals(dossierStatut, patient.dossierStatut) &&
                Objects.equals(teleobservance, patient.teleobservance) &&
                Objects.equals(extranetactif, patient.extranetactif) &&
                Objects.equals(premiereConnexion, patient.premiereConnexion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroSs, profession, photo, fichierAutorisationPhoto, poids, taille, nomJeuneFille, actif, relationPersonneAttachee, dateRenouvellementDep, dateModif, nouveauPatient, typeEcheanceId, modeReglementId, rangNaissance, rangBeneficiaire, finDroit, fin100, dateDeces, dateProchainRdv, rappelSms, rappelMail, dateProchaineInterv, dateInstallation, statutDossier, identifiant, motdepasse, dossierStatut, teleobservance, extranetactif, premiereConnexion);
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
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId_0() {
        return agenceByAgenceId_0;
    }

    public void setAgenceByAgenceId_0(Agence agenceByAgenceId_0) {
        this.agenceByAgenceId_0 = agenceByAgenceId_0;
    }
}
