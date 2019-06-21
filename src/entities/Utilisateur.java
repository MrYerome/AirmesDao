package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Utilisateur {
    private int id;
    private String identifiant;
    private String password;
    private byte actif;
    private Timestamp dateSuppr;
    private Integer personneId;
    private Integer technicienId;
    private Integer profilId;
    private byte adminSiteweb;
    private Integer agenceId;
    private Collection<ActionCommerciale> actionCommercialesById;
    private Collection<CommandeFournisseur> commandeFournisseursById;
    private Collection<DemandeIntervention> demandeInterventionsById;
    private Collection<DemandeIntervention> demandeInterventionsById_0;
    private Collection<DroitAccesUtilisateur> droitAccesUtilisateursById;
    private Collection<Intervention> interventionsById;
    private Collection<Intervention> interventionsById_0;
    private Collection<Journal> journalsById;
    private Collection<Message> messagesById;
    private Collection<Personne> personnesById;
    private Collection<Personne> personnesById_0;
    private Personne personneByPersonneId;
    private Personne personneByPersonneId_0;
    private Technicien technicienByTechnicienId;
    private Technicien technicienByTechnicienId_0;
    private Collection<WebArticle> webArticlesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "personne_id")
    public Integer getPersonneId() {
        return personneId;
    }

    public void setPersonneId(Integer personneId) {
        this.personneId = personneId;
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
    @Column(name = "profil_id")
    public Integer getProfilId() {
        return profilId;
    }

    public void setProfilId(Integer profilId) {
        this.profilId = profilId;
    }

    @Basic
    @Column(name = "admin_siteweb")
    public byte getAdminSiteweb() {
        return adminSiteweb;
    }

    public void setAdminSiteweb(byte adminSiteweb) {
        this.adminSiteweb = adminSiteweb;
    }

    @Basic
    @Column(name = "agence_id")
    public Integer getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(Integer agenceId) {
        this.agenceId = agenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return id == that.id &&
                actif == that.actif &&
                adminSiteweb == that.adminSiteweb &&
                Objects.equals(identifiant, that.identifiant) &&
                Objects.equals(password, that.password) &&
                Objects.equals(dateSuppr, that.dateSuppr) &&
                Objects.equals(personneId, that.personneId) &&
                Objects.equals(technicienId, that.technicienId) &&
                Objects.equals(profilId, that.profilId) &&
                Objects.equals(agenceId, that.agenceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identifiant, password, actif, dateSuppr, personneId, technicienId, profilId, adminSiteweb, agenceId);
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<ActionCommerciale> getActionCommercialesById() {
        return actionCommercialesById;
    }

    public void setActionCommercialesById(Collection<ActionCommerciale> actionCommercialesById) {
        this.actionCommercialesById = actionCommercialesById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<CommandeFournisseur> getCommandeFournisseursById() {
        return commandeFournisseursById;
    }

    public void setCommandeFournisseursById(Collection<CommandeFournisseur> commandeFournisseursById) {
        this.commandeFournisseursById = commandeFournisseursById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<DemandeIntervention> getDemandeInterventionsById() {
        return demandeInterventionsById;
    }

    public void setDemandeInterventionsById(Collection<DemandeIntervention> demandeInterventionsById) {
        this.demandeInterventionsById = demandeInterventionsById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId_0")
    public Collection<DemandeIntervention> getDemandeInterventionsById_0() {
        return demandeInterventionsById_0;
    }

    public void setDemandeInterventionsById_0(Collection<DemandeIntervention> demandeInterventionsById_0) {
        this.demandeInterventionsById_0 = demandeInterventionsById_0;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<DroitAccesUtilisateur> getDroitAccesUtilisateursById() {
        return droitAccesUtilisateursById;
    }

    public void setDroitAccesUtilisateursById(Collection<DroitAccesUtilisateur> droitAccesUtilisateursById) {
        this.droitAccesUtilisateursById = droitAccesUtilisateursById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurIdValidateur")
    public Collection<Intervention> getInterventionsById() {
        return interventionsById;
    }

    public void setInterventionsById(Collection<Intervention> interventionsById) {
        this.interventionsById = interventionsById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurIdTechnicien")
    public Collection<Intervention> getInterventionsById_0() {
        return interventionsById_0;
    }

    public void setInterventionsById_0(Collection<Intervention> interventionsById_0) {
        this.interventionsById_0 = interventionsById_0;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<Journal> getJournalsById() {
        return journalsById;
    }

    public void setJournalsById(Collection<Journal> journalsById) {
        this.journalsById = journalsById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<Message> getMessagesById() {
        return messagesById;
    }

    public void setMessagesById(Collection<Message> messagesById) {
        this.messagesById = messagesById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId")
    public Collection<Personne> getPersonnesById() {
        return personnesById;
    }

    public void setPersonnesById(Collection<Personne> personnesById) {
        this.personnesById = personnesById;
    }

    @OneToMany(mappedBy = "utilisateurByUtilisateurId_0")
    public Collection<Personne> getPersonnesById_0() {
        return personnesById_0;
    }

    public void setPersonnesById_0(Collection<Personne> personnesById_0) {
        this.personnesById_0 = personnesById_0;
    }

    @ManyToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneId() {
        return personneByPersonneId;
    }

    public void setPersonneByPersonneId(Personne personneByPersonneId) {
        this.personneByPersonneId = personneByPersonneId;
    }

    @ManyToOne
    @JoinColumn(name = "personne_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneId_0() {
        return personneByPersonneId_0;
    }

    public void setPersonneByPersonneId_0(Personne personneByPersonneId_0) {
        this.personneByPersonneId_0 = personneByPersonneId_0;
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

    @OneToMany(mappedBy = "utilisateurByAuteurId")
    public Collection<WebArticle> getWebArticlesById() {
        return webArticlesById;
    }

    public void setWebArticlesById(Collection<WebArticle> webArticlesById) {
        this.webArticlesById = webArticlesById;
    }
}
