package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Prescripteur {
    private int id;
    private String numeroPrescripteur;
    private String numeroFiness;
    private String login;
    private String password;
    private Byte etablissementVisibilite;
    private String etablissementService;
    private Integer specialiteId;
    private Integer agenceId;
    private Integer etablissementId;
    private byte nouvelExtranet;
    private Timestamp derniereConnexion;
    private Collection<DemandeIntervention> demandeInterventionsById;
    private Collection<DemandeIntervention> demandeInterventionsById_0;
    private Collection<Intervention> interventionsById;
    private Collection<InterventionClient> interventionClientsById;
    private Medecin medecinById;
    private Medecin medecinById_0;
    private Collection<MedecinPrescripteur> medecinPrescripteursById;
    private Collection<MedecinPrescripteur> medecinPrescripteursById_0;
    private Collection<Message> messagesById;
    private Collection<ParcMaterielClient> parcMaterielClientsById;
    private Collection<Patient> patientsById;
    private Collection<Patient> patientsById_0;
    private Personne personneById;
    private Personne personneById_0;
    private Specialite specialiteBySpecialiteId;
    private Specialite specialiteBySpecialiteId_0;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;
    private Etablissement etablissementByEtablissementId;
    private Etablissement etablissementByEtablissementId_0;
    private Collection<Prescription> prescriptionsById;
    private Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById;
    private Collection<SauvegardeMessage> sauvegardeMessagesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    @Column(name = "specialite_id")
    public Integer getSpecialiteId() {
        return specialiteId;
    }

    public void setSpecialiteId(Integer specialiteId) {
        this.specialiteId = specialiteId;
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
    @Column(name = "etablissement_id")
    public Integer getEtablissementId() {
        return etablissementId;
    }

    public void setEtablissementId(Integer etablissementId) {
        this.etablissementId = etablissementId;
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
                Objects.equals(specialiteId, that.specialiteId) &&
                Objects.equals(agenceId, that.agenceId) &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(derniereConnexion, that.derniereConnexion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroPrescripteur, numeroFiness, login, password, etablissementVisibilite, etablissementService, specialiteId, agenceId, etablissementId, nouvelExtranet, derniereConnexion);
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<DemandeIntervention> getDemandeInterventionsById() {
        return demandeInterventionsById;
    }

    public void setDemandeInterventionsById(Collection<DemandeIntervention> demandeInterventionsById) {
        this.demandeInterventionsById = demandeInterventionsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId_0")
    public Collection<DemandeIntervention> getDemandeInterventionsById_0() {
        return demandeInterventionsById_0;
    }

    public void setDemandeInterventionsById_0(Collection<DemandeIntervention> demandeInterventionsById_0) {
        this.demandeInterventionsById_0 = demandeInterventionsById_0;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<Intervention> getInterventionsById() {
        return interventionsById;
    }

    public void setInterventionsById(Collection<Intervention> interventionsById) {
        this.interventionsById = interventionsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurClientId")
    public Collection<InterventionClient> getInterventionClientsById() {
        return interventionClientsById;
    }

    public void setInterventionClientsById(Collection<InterventionClient> interventionClientsById) {
        this.interventionClientsById = interventionClientsById;
    }

    @OneToOne(mappedBy = "prescripteurById")
    public Medecin getMedecinById() {
        return medecinById;
    }

    public void setMedecinById(Medecin medecinById) {
        this.medecinById = medecinById;
    }

    @OneToOne(mappedBy = "prescripteurById_0")
    public Medecin getMedecinById_0() {
        return medecinById_0;
    }

    public void setMedecinById_0(Medecin medecinById_0) {
        this.medecinById_0 = medecinById_0;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<MedecinPrescripteur> getMedecinPrescripteursById() {
        return medecinPrescripteursById;
    }

    public void setMedecinPrescripteursById(Collection<MedecinPrescripteur> medecinPrescripteursById) {
        this.medecinPrescripteursById = medecinPrescripteursById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId_0")
    public Collection<MedecinPrescripteur> getMedecinPrescripteursById_0() {
        return medecinPrescripteursById_0;
    }

    public void setMedecinPrescripteursById_0(Collection<MedecinPrescripteur> medecinPrescripteursById_0) {
        this.medecinPrescripteursById_0 = medecinPrescripteursById_0;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<ParcMaterielClient> getParcMaterielClientsById() {
        return parcMaterielClientsById;
    }

    public void setParcMaterielClientsById(Collection<ParcMaterielClient> parcMaterielClientsById) {
        this.parcMaterielClientsById = parcMaterielClientsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
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
    @JoinColumn(name = "specialite_id", referencedColumnName = "id")
    public Specialite getSpecialiteBySpecialiteId() {
        return specialiteBySpecialiteId;
    }

    public void setSpecialiteBySpecialiteId(Specialite specialiteBySpecialiteId) {
        this.specialiteBySpecialiteId = specialiteBySpecialiteId;
    }

    @ManyToOne
    @JoinColumn(name = "specialite_id", referencedColumnName = "id")
    public Specialite getSpecialiteBySpecialiteId_0() {
        return specialiteBySpecialiteId_0;
    }

    public void setSpecialiteBySpecialiteId_0(Specialite specialiteBySpecialiteId_0) {
        this.specialiteBySpecialiteId_0 = specialiteBySpecialiteId_0;
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
    @JoinColumn(name = "etablissement_id", referencedColumnName = "id")
    public Etablissement getEtablissementByEtablissementId() {
        return etablissementByEtablissementId;
    }

    public void setEtablissementByEtablissementId(Etablissement etablissementByEtablissementId) {
        this.etablissementByEtablissementId = etablissementByEtablissementId;
    }

    @ManyToOne
    @JoinColumn(name = "etablissement_id", referencedColumnName = "id")
    public Etablissement getEtablissementByEtablissementId_0() {
        return etablissementByEtablissementId_0;
    }

    public void setEtablissementByEtablissementId_0(Etablissement etablissementByEtablissementId_0) {
        this.etablissementByEtablissementId_0 = etablissementByEtablissementId_0;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<Prescription> getPrescriptionsById() {
        return prescriptionsById;
    }

    public void setPrescriptionsById(Collection<Prescription> prescriptionsById) {
        this.prescriptionsById = prescriptionsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<SauvegardeDemandeIntervention> getSauvegardeDemandeInterventionsById() {
        return sauvegardeDemandeInterventionsById;
    }

    public void setSauvegardeDemandeInterventionsById(Collection<SauvegardeDemandeIntervention> sauvegardeDemandeInterventionsById) {
        this.sauvegardeDemandeInterventionsById = sauvegardeDemandeInterventionsById;
    }

    @OneToMany(mappedBy = "prescripteurByPrescripteurId")
    public Collection<SauvegardeMessage> getSauvegardeMessagesById() {
        return sauvegardeMessagesById;
    }

    public void setSauvegardeMessagesById(Collection<SauvegardeMessage> sauvegardeMessagesById) {
        this.sauvegardeMessagesById = sauvegardeMessagesById;
    }
}
