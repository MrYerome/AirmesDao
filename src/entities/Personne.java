package entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String telDomicile;
    private String telPortable;
    private String telAutre;
    private String telCommentaire;
    private String fax;
    private String mail;
    private String commentaire;
    private Integer adresseId;
    private Integer gpsId;
    private Integer utilisateurId;
    private Timestamp dateSuppr;
    private String sexe;
    private AyantDroit ayantDroitById;
    private AyantDroit ayantDroitById_0;
    private AyantDroit ayantDroitById_1;
    private Patient patientById;
    private Patient patientById_0;
    private Collection<Patient> patientsById;
    private Collection<Patient> patientsById_0;
    private Adresse adresseByAdresseId;
    private Adresse adresseByAdresseId_0;
    private Gps gpsByGpsId;
    private Gps gpsByGpsId_0;
    private Utilisateur utilisateurByUtilisateurId;
    private Utilisateur utilisateurByUtilisateurId_0;
    private Prescripteur prescripteurById;
    private Prescripteur prescripteurById_0;
    private Technicien technicienById;
    private Technicien technicienById_0;
    private Collection<Technicien> techniciensById;
    private Collection<Technicien> techniciensById_0;
    private Collection<Utilisateur> utilisateursById;
    private Collection<Utilisateur> utilisateursById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "date_naissance")
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Basic
    @Column(name = "tel_domicile")
    public String getTelDomicile() {
        return telDomicile;
    }

    public void setTelDomicile(String telDomicile) {
        this.telDomicile = telDomicile;
    }

    @Basic
    @Column(name = "tel_portable")
    public String getTelPortable() {
        return telPortable;
    }

    public void setTelPortable(String telPortable) {
        this.telPortable = telPortable;
    }

    @Basic
    @Column(name = "tel_autre")
    public String getTelAutre() {
        return telAutre;
    }

    public void setTelAutre(String telAutre) {
        this.telAutre = telAutre;
    }

    @Basic
    @Column(name = "tel_commentaire")
    public String getTelCommentaire() {
        return telCommentaire;
    }

    public void setTelCommentaire(String telCommentaire) {
        this.telCommentaire = telCommentaire;
    }

    @Basic
    @Column(name = "fax")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
    @Column(name = "adresse_id")
    public Integer getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(Integer adresseId) {
        this.adresseId = adresseId;
    }

    @Basic
    @Column(name = "gps_id")
    public Integer getGpsId() {
        return gpsId;
    }

    public void setGpsId(Integer gpsId) {
        this.gpsId = gpsId;
    }

    @Basic
    @Column(name = "utilisateur_id")
    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
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
    @Column(name = "sexe")
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return id == personne.id &&
                Objects.equals(nom, personne.nom) &&
                Objects.equals(prenom, personne.prenom) &&
                Objects.equals(dateNaissance, personne.dateNaissance) &&
                Objects.equals(telDomicile, personne.telDomicile) &&
                Objects.equals(telPortable, personne.telPortable) &&
                Objects.equals(telAutre, personne.telAutre) &&
                Objects.equals(telCommentaire, personne.telCommentaire) &&
                Objects.equals(fax, personne.fax) &&
                Objects.equals(mail, personne.mail) &&
                Objects.equals(commentaire, personne.commentaire) &&
                Objects.equals(adresseId, personne.adresseId) &&
                Objects.equals(gpsId, personne.gpsId) &&
                Objects.equals(utilisateurId, personne.utilisateurId) &&
                Objects.equals(dateSuppr, personne.dateSuppr) &&
                Objects.equals(sexe, personne.sexe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, dateNaissance, telDomicile, telPortable, telAutre, telCommentaire, fax, mail, commentaire, adresseId, gpsId, utilisateurId, dateSuppr, sexe);
    }

    @OneToOne(mappedBy = "personneById")
    public AyantDroit getAyantDroitById() {
        return ayantDroitById;
    }

    public void setAyantDroitById(AyantDroit ayantDroitById) {
        this.ayantDroitById = ayantDroitById;
    }

    @OneToOne(mappedBy = "personneById_0")
    public AyantDroit getAyantDroitById_0() {
        return ayantDroitById_0;
    }

    public void setAyantDroitById_0(AyantDroit ayantDroitById_0) {
        this.ayantDroitById_0 = ayantDroitById_0;
    }

    @OneToOne(mappedBy = "personneById_1")
    public AyantDroit getAyantDroitById_1() {
        return ayantDroitById_1;
    }

    public void setAyantDroitById_1(AyantDroit ayantDroitById_1) {
        this.ayantDroitById_1 = ayantDroitById_1;
    }

    @OneToOne(mappedBy = "personneById")
    public Patient getPatientById() {
        return patientById;
    }

    public void setPatientById(Patient patientById) {
        this.patientById = patientById;
    }

    @OneToOne(mappedBy = "personneById_0")
    public Patient getPatientById_0() {
        return patientById_0;
    }

    public void setPatientById_0(Patient patientById_0) {
        this.patientById_0 = patientById_0;
    }

    @OneToMany(mappedBy = "personneByPersonneIdRattachee")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "personneByPersonneIdRattachee_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseId_0() {
        return adresseByAdresseId_0;
    }

    public void setAdresseByAdresseId_0(Adresse adresseByAdresseId_0) {
        this.adresseByAdresseId_0 = adresseByAdresseId_0;
    }

    @ManyToOne
    @JoinColumn(name = "gps_id", referencedColumnName = "id")
    public Gps getGpsByGpsId() {
        return gpsByGpsId;
    }

    public void setGpsByGpsId(Gps gpsByGpsId) {
        this.gpsByGpsId = gpsByGpsId;
    }

    @ManyToOne
    @JoinColumn(name = "gps_id", referencedColumnName = "id")
    public Gps getGpsByGpsId_0() {
        return gpsByGpsId_0;
    }

    public void setGpsByGpsId_0(Gps gpsByGpsId_0) {
        this.gpsByGpsId_0 = gpsByGpsId_0;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId_0() {
        return utilisateurByUtilisateurId_0;
    }

    public void setUtilisateurByUtilisateurId_0(Utilisateur utilisateurByUtilisateurId_0) {
        this.utilisateurByUtilisateurId_0 = utilisateurByUtilisateurId_0;
    }

    @OneToOne(mappedBy = "personneById")
    public Prescripteur getPrescripteurById() {
        return prescripteurById;
    }

    public void setPrescripteurById(Prescripteur prescripteurById) {
        this.prescripteurById = prescripteurById;
    }

    @OneToOne(mappedBy = "personneById_0")
    public Prescripteur getPrescripteurById_0() {
        return prescripteurById_0;
    }

    public void setPrescripteurById_0(Prescripteur prescripteurById_0) {
        this.prescripteurById_0 = prescripteurById_0;
    }

    @OneToOne(mappedBy = "personneById")
    public Technicien getTechnicienById() {
        return technicienById;
    }

    public void setTechnicienById(Technicien technicienById) {
        this.technicienById = technicienById;
    }

    @OneToOne(mappedBy = "personneById_0")
    public Technicien getTechnicienById_0() {
        return technicienById_0;
    }

    public void setTechnicienById_0(Technicien technicienById_0) {
        this.technicienById_0 = technicienById_0;
    }

    @OneToMany(mappedBy = "personneByPersonneAContacterId")
    public Collection<Technicien> getTechniciensById() {
        return techniciensById;
    }

    public void setTechniciensById(Collection<Technicien> techniciensById) {
        this.techniciensById = techniciensById;
    }

    @OneToMany(mappedBy = "personneByPersonneAContacterId_0")
    public Collection<Technicien> getTechniciensById_0() {
        return techniciensById_0;
    }

    public void setTechniciensById_0(Collection<Technicien> techniciensById_0) {
        this.techniciensById_0 = techniciensById_0;
    }

    @OneToMany(mappedBy = "personneByPersonneId")
    public Collection<Utilisateur> getUtilisateursById() {
        return utilisateursById;
    }

    public void setUtilisateursById(Collection<Utilisateur> utilisateursById) {
        this.utilisateursById = utilisateursById;
    }

    @OneToMany(mappedBy = "personneByPersonneId_0")
    public Collection<Utilisateur> getUtilisateursById_0() {
        return utilisateursById_0;
    }

    public void setUtilisateursById_0(Collection<Utilisateur> utilisateursById_0) {
        this.utilisateursById_0 = utilisateursById_0;
    }
}
