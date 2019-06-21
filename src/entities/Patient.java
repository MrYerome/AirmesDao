package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
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
    private Integer ayantDroitId;
    private Integer medecinId;
    private Integer activiteId;
    private Integer personneIdRattachee;
    private Integer agenceId;
    private Integer prescripteurId;
    private Timestamp dateProchainRdv;
    private byte rappelSms;
    private byte rappelMail;
    private Integer technicienId;
    private Timestamp dateProchaineInterv;
    private Timestamp dateInstallation;
    private String statutDossier;
    private String identifiant;
    private String motdepasse;
    private Integer dossierStatut;
    private Short teleobservance;
    private Byte extranetactif;
    private Byte premiereConnexion;
    private Collection<DemandeIntervention> demandeInterventionsById;
    private Collection<DemandeIntervention> demandeInterventionsById_0;
    private Collection<DossierPatient> dossierPatientsById;
    private Collection<DossierPatient> dossierPatientsById_0;
    private Collection<EtablissementPatient> etablissementPatientsById;
    private Collection<HistoriqueMateriel> historiqueMaterielsById;
    private Collection<HistoriqueStock> historiqueStocksById;
    private Collection<Intervention> interventionsById;
    private Collection<Message> messagesById;
    private Collection<ObusPatient> obusPatientsById;
    private Collection<ParcMaterielPatient> parcMaterielPatientsById;
    private Collection<ParcMaterielPreteParClient> parcMaterielPreteParClientsById;
    private Personne personneById;
    private Personne personneById_0;
    private AyantDroit ayantDroitByAyantDroitId;
    private AyantDroit ayantDroitByAyantDroitId_0;
    private Medecin medecinByMedecinId;
    private Medecin medecinByMedecinId_0;
    private Activite activiteByActiviteId;
    private Activite activiteByActiviteId_0;
    private Personne personneByPersonneIdRattachee;
    private Personne personneByPersonneIdRattachee_0;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;
    private Prescripteur prescripteurByPrescripteurId;
    private Prescripteur prescripteurByPrescripteurId_0;
    private Technicien technicienByTechnicienId;
    private Technicien technicienByTechnicienId_0;
    private Collection<Prescription> prescriptionsById;
    private Collection<RegimeComplementairePatient> regimeComplementairePatientsById;
    private Collection<RegimeObligatoirePatient> regimeObligatoirePatientsById;
    private Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById;
    private Collection<SauvegardeMessage> sauvegardeMessagesById;
    private Collection<StockConsommablePatient> stockConsommablePatientsById;

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
    @Column(name = "ayant_droit_id")
    public Integer getAyantDroitId() {
        return ayantDroitId;
    }

    public void setAyantDroitId(Integer ayantDroitId) {
        this.ayantDroitId = ayantDroitId;
    }

    @Basic
    @Column(name = "medecin_id")
    public Integer getMedecinId() {
        return medecinId;
    }

    public void setMedecinId(Integer medecinId) {
        this.medecinId = medecinId;
    }

    @Basic
    @Column(name = "activite_id")
    public Integer getActiviteId() {
        return activiteId;
    }

    public void setActiviteId(Integer activiteId) {
        this.activiteId = activiteId;
    }

    @Basic
    @Column(name = "personne_id_rattachee")
    public Integer getPersonneIdRattachee() {
        return personneIdRattachee;
    }

    public void setPersonneIdRattachee(Integer personneIdRattachee) {
        this.personneIdRattachee = personneIdRattachee;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public Integer getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Integer prescripteurId) {
        this.prescripteurId = prescripteurId;
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
    @Column(name = "technicien_id")
    public Integer getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(Integer technicienId) {
        this.technicienId = technicienId;
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
                Objects.equals(ayantDroitId, patient.ayantDroitId) &&
                Objects.equals(medecinId, patient.medecinId) &&
                Objects.equals(activiteId, patient.activiteId) &&
                Objects.equals(personneIdRattachee, patient.personneIdRattachee) &&
                Objects.equals(agenceId, patient.agenceId) &&
                Objects.equals(prescripteurId, patient.prescripteurId) &&
                Objects.equals(dateProchainRdv, patient.dateProchainRdv) &&
                Objects.equals(technicienId, patient.technicienId) &&
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
        return Objects.hash(id, numeroSs, profession, photo, fichierAutorisationPhoto, poids, taille, nomJeuneFille, actif, relationPersonneAttachee, dateRenouvellementDep, dateModif, nouveauPatient, typeEcheanceId, modeReglementId, rangNaissance, rangBeneficiaire, finDroit, fin100, dateDeces, ayantDroitId, medecinId, activiteId, personneIdRattachee, agenceId, prescripteurId, dateProchainRdv, rappelSms, rappelMail, technicienId, dateProchaineInterv, dateInstallation, statutDossier, identifiant, motdepasse, dossierStatut, teleobservance, extranetactif, premiereConnexion);
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<DemandeIntervention> getDemandeInterventionsById() {
        return demandeInterventionsById;
    }

    public void setDemandeInterventionsById(Collection<DemandeIntervention> demandeInterventionsById) {
        this.demandeInterventionsById = demandeInterventionsById;
    }

    @OneToMany(mappedBy = "patientByPatientId_0")
    public Collection<DemandeIntervention> getDemandeInterventionsById_0() {
        return demandeInterventionsById_0;
    }

    public void setDemandeInterventionsById_0(Collection<DemandeIntervention> demandeInterventionsById_0) {
        this.demandeInterventionsById_0 = demandeInterventionsById_0;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<DossierPatient> getDossierPatientsById() {
        return dossierPatientsById;
    }

    public void setDossierPatientsById(Collection<DossierPatient> dossierPatientsById) {
        this.dossierPatientsById = dossierPatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId_0")
    public Collection<DossierPatient> getDossierPatientsById_0() {
        return dossierPatientsById_0;
    }

    public void setDossierPatientsById_0(Collection<DossierPatient> dossierPatientsById_0) {
        this.dossierPatientsById_0 = dossierPatientsById_0;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<EtablissementPatient> getEtablissementPatientsById() {
        return etablissementPatientsById;
    }

    public void setEtablissementPatientsById(Collection<EtablissementPatient> etablissementPatientsById) {
        this.etablissementPatientsById = etablissementPatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<HistoriqueMateriel> getHistoriqueMaterielsById() {
        return historiqueMaterielsById;
    }

    public void setHistoriqueMaterielsById(Collection<HistoriqueMateriel> historiqueMaterielsById) {
        this.historiqueMaterielsById = historiqueMaterielsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<HistoriqueStock> getHistoriqueStocksById() {
        return historiqueStocksById;
    }

    public void setHistoriqueStocksById(Collection<HistoriqueStock> historiqueStocksById) {
        this.historiqueStocksById = historiqueStocksById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<Intervention> getInterventionsById() {
        return interventionsById;
    }

    public void setInterventionsById(Collection<Intervention> interventionsById) {
        this.interventionsById = interventionsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<ObusPatient> getObusPatientsById() {
        return obusPatientsById;
    }

    public void setObusPatientsById(Collection<ObusPatient> obusPatientsById) {
        this.obusPatientsById = obusPatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<ParcMaterielPatient> getParcMaterielPatientsById() {
        return parcMaterielPatientsById;
    }

    public void setParcMaterielPatientsById(Collection<ParcMaterielPatient> parcMaterielPatientsById) {
        this.parcMaterielPatientsById = parcMaterielPatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<ParcMaterielPreteParClient> getParcMaterielPreteParClientsById() {
        return parcMaterielPreteParClientsById;
    }

    public void setParcMaterielPreteParClientsById(Collection<ParcMaterielPreteParClient> parcMaterielPreteParClientsById) {
        this.parcMaterielPreteParClientsById = parcMaterielPreteParClientsById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById() {
        return personneById;
    }

    public void setPersonneById(Personne personneById) {
        this.personneById = personneById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Personne getPersonneById_0() {
        return personneById_0;
    }

    public void setPersonneById_0(Personne personneById_0) {
        this.personneById_0 = personneById_0;
    }

    @ManyToOne
    @JoinColumn(name = "ayant_droit_id", referencedColumnName = "id")
    public AyantDroit getAyantDroitByAyantDroitId() {
        return ayantDroitByAyantDroitId;
    }

    public void setAyantDroitByAyantDroitId(AyantDroit ayantDroitByAyantDroitId) {
        this.ayantDroitByAyantDroitId = ayantDroitByAyantDroitId;
    }

    @ManyToOne
    @JoinColumn(name = "ayant_droit_id", referencedColumnName = "id")
    public AyantDroit getAyantDroitByAyantDroitId_0() {
        return ayantDroitByAyantDroitId_0;
    }

    public void setAyantDroitByAyantDroitId_0(AyantDroit ayantDroitByAyantDroitId_0) {
        this.ayantDroitByAyantDroitId_0 = ayantDroitByAyantDroitId_0;
    }

    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "id")
    public Medecin getMedecinByMedecinId() {
        return medecinByMedecinId;
    }

    public void setMedecinByMedecinId(Medecin medecinByMedecinId) {
        this.medecinByMedecinId = medecinByMedecinId;
    }

    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "id")
    public Medecin getMedecinByMedecinId_0() {
        return medecinByMedecinId_0;
    }

    public void setMedecinByMedecinId_0(Medecin medecinByMedecinId_0) {
        this.medecinByMedecinId_0 = medecinByMedecinId_0;
    }

    @ManyToOne
    @JoinColumn(name = "activite_id", referencedColumnName = "id")
    public Activite getActiviteByActiviteId() {
        return activiteByActiviteId;
    }

    public void setActiviteByActiviteId(Activite activiteByActiviteId) {
        this.activiteByActiviteId = activiteByActiviteId;
    }

    @ManyToOne
    @JoinColumn(name = "activite_id", referencedColumnName = "id")
    public Activite getActiviteByActiviteId_0() {
        return activiteByActiviteId_0;
    }

    public void setActiviteByActiviteId_0(Activite activiteByActiviteId_0) {
        this.activiteByActiviteId_0 = activiteByActiviteId_0;
    }

    @ManyToOne
    @JoinColumn(name = "personne_id_rattachee", referencedColumnName = "id")
    public Personne getPersonneByPersonneIdRattachee() {
        return personneByPersonneIdRattachee;
    }

    public void setPersonneByPersonneIdRattachee(Personne personneByPersonneIdRattachee) {
        this.personneByPersonneIdRattachee = personneByPersonneIdRattachee;
    }

    @ManyToOne
    @JoinColumn(name = "personne_id_rattachee", referencedColumnName = "id")
    public Personne getPersonneByPersonneIdRattachee_0() {
        return personneByPersonneIdRattachee_0;
    }

    public void setPersonneByPersonneIdRattachee_0(Personne personneByPersonneIdRattachee_0) {
        this.personneByPersonneIdRattachee_0 = personneByPersonneIdRattachee_0;
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

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id")
    public Prescripteur getPrescripteurByPrescripteurId() {
        return prescripteurByPrescripteurId;
    }

    public void setPrescripteurByPrescripteurId(Prescripteur prescripteurByPrescripteurId) {
        this.prescripteurByPrescripteurId = prescripteurByPrescripteurId;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id")
    public Prescripteur getPrescripteurByPrescripteurId_0() {
        return prescripteurByPrescripteurId_0;
    }

    public void setPrescripteurByPrescripteurId_0(Prescripteur prescripteurByPrescripteurId_0) {
        this.prescripteurByPrescripteurId_0 = prescripteurByPrescripteurId_0;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId_0() {
        return technicienByTechnicienId_0;
    }

    public void setTechnicienByTechnicienId_0(Technicien technicienByTechnicienId_0) {
        this.technicienByTechnicienId_0 = technicienByTechnicienId_0;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<Prescription> getPrescriptionsById() {
        return prescriptionsById;
    }

    public void setPrescriptionsById(Collection<Prescription> prescriptionsById) {
        this.prescriptionsById = prescriptionsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<RegimeComplementairePatient> getRegimeComplementairePatientsById() {
        return regimeComplementairePatientsById;
    }

    public void setRegimeComplementairePatientsById(Collection<RegimeComplementairePatient> regimeComplementairePatientsById) {
        this.regimeComplementairePatientsById = regimeComplementairePatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<RegimeObligatoirePatient> getRegimeObligatoirePatientsById() {
        return regimeObligatoirePatientsById;
    }

    public void setRegimeObligatoirePatientsById(Collection<RegimeObligatoirePatient> regimeObligatoirePatientsById) {
        this.regimeObligatoirePatientsById = regimeObligatoirePatientsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<SauvegardeDemandeIntervention> getSauvegardeDemandeInterventionsById() {
        return sauvegardeDemandeInterventionsById;
    }

    public void setSauvegardeDemandeInterventionsById(Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById) {
        this.sauvegardeDemandeInterventionsById = sauvegardeDemandeInterventionsById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<SauvegardeMessage> getSauvegardeMessagesById() {
        return sauvegardeMessagesById;
    }

    public void setSauvegardeMessagesById(Collection<SauvegardeMessage> sauvegardeMessagesById) {
        this.sauvegardeMessagesById = sauvegardeMessagesById;
    }

    @OneToMany(mappedBy = "patientByPatientId")
    public Collection<StockConsommablePatient> getStockConsommablePatientsById() {
        return stockConsommablePatientsById;
    }

    public void setStockConsommablePatientsById(Collection<StockConsommablePatient> stockConsommablePatientsById) {
        this.stockConsommablePatientsById = stockConsommablePatientsById;
    }
}
