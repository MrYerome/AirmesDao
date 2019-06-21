package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Etablissement {
    private int id;
    private String nom;
    private String tel;
    private String telPortable;
    private String telAutre;
    private String telCommentaire;
    private String mail;
    private String commentaire;
    private String numeroFiness;
    private Integer adresseLivraisonId;
    private Integer adresseAdministrativeId;
    private Integer agenceId;
    private Integer gpsId;
    private Integer technicienId;
    private String login;
    private String password;
    private byte nouvelExtranet;
    private Adresse adresseByAdresseLivraisonId;
    private Adresse adresseByAdresseLivraisonId_0;
    private Adresse adresseByAdresseLivraisonId_1;
    private Adresse adresseByAdresseAdministrativeId;
    private Adresse adresseByAdresseAdministrativeId_0;
    private Adresse adresseByAdresseAdministrativeId_1;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;
    private Agence agenceByAgenceId_1;
    private Gps gpsByGpsId;
    private Gps gpsByGpsId_0;
    private Gps gpsByGpsId_1;
    private Technicien technicienByTechnicienId;
    private Technicien technicienByTechnicienId_0;
    private Technicien technicienByTechnicienId_1;
    private Collection<EtablissementPatient> etablissementPatientsById;
    private Collection<Prescripteur> prescripteursById;
    private Collection<Prescripteur> prescripteursById_0;

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
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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
    @Column(name = "numero_finess")
    public String getNumeroFiness() {
        return numeroFiness;
    }

    public void setNumeroFiness(String numeroFiness) {
        this.numeroFiness = numeroFiness;
    }

    @Basic
    @Column(name = "adresse_livraison_id")
    public Integer getAdresseLivraisonId() {
        return adresseLivraisonId;
    }

    public void setAdresseLivraisonId(Integer adresseLivraisonId) {
        this.adresseLivraisonId = adresseLivraisonId;
    }

    @Basic
    @Column(name = "adresse_administrative_id")
    public Integer getAdresseAdministrativeId() {
        return adresseAdministrativeId;
    }

    public void setAdresseAdministrativeId(Integer adresseAdministrativeId) {
        this.adresseAdministrativeId = adresseAdministrativeId;
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
    @Column(name = "gps_id")
    public Integer getGpsId() {
        return gpsId;
    }

    public void setGpsId(Integer gpsId) {
        this.gpsId = gpsId;
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
    @Column(name = "nouvel_extranet")
    public byte getNouvelExtranet() {
        return nouvelExtranet;
    }

    public void setNouvelExtranet(byte nouvelExtranet) {
        this.nouvelExtranet = nouvelExtranet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etablissement that = (Etablissement) o;
        return id == that.id &&
                nouvelExtranet == that.nouvelExtranet &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(telPortable, that.telPortable) &&
                Objects.equals(telAutre, that.telAutre) &&
                Objects.equals(telCommentaire, that.telCommentaire) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(numeroFiness, that.numeroFiness) &&
                Objects.equals(adresseLivraisonId, that.adresseLivraisonId) &&
                Objects.equals(adresseAdministrativeId, that.adresseAdministrativeId) &&
                Objects.equals(agenceId, that.agenceId) &&
                Objects.equals(gpsId, that.gpsId) &&
                Objects.equals(technicienId, that.technicienId) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, tel, telPortable, telAutre, telCommentaire, mail, commentaire, numeroFiness, adresseLivraisonId, adresseAdministrativeId, agenceId, gpsId, technicienId, login, password, nouvelExtranet);
    }

    @ManyToOne
    @JoinColumn(name = "adresse_livraison_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseLivraisonId() {
        return adresseByAdresseLivraisonId;
    }

    public void setAdresseByAdresseLivraisonId(Adresse adresseByAdresseLivraisonId) {
        this.adresseByAdresseLivraisonId = adresseByAdresseLivraisonId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_livraison_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseLivraisonId_0() {
        return adresseByAdresseLivraisonId_0;
    }

    public void setAdresseByAdresseLivraisonId_0(Adresse adresseByAdresseLivraisonId_0) {
        this.adresseByAdresseLivraisonId_0 = adresseByAdresseLivraisonId_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_livraison_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseLivraisonId_1() {
        return adresseByAdresseLivraisonId_1;
    }

    public void setAdresseByAdresseLivraisonId_1(Adresse adresseByAdresseLivraisonId_1) {
        this.adresseByAdresseLivraisonId_1 = adresseByAdresseLivraisonId_1;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_administrative_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseAdministrativeId() {
        return adresseByAdresseAdministrativeId;
    }

    public void setAdresseByAdresseAdministrativeId(Adresse adresseByAdresseAdministrativeId) {
        this.adresseByAdresseAdministrativeId = adresseByAdresseAdministrativeId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_administrative_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseAdministrativeId_0() {
        return adresseByAdresseAdministrativeId_0;
    }

    public void setAdresseByAdresseAdministrativeId_0(Adresse adresseByAdresseAdministrativeId_0) {
        this.adresseByAdresseAdministrativeId_0 = adresseByAdresseAdministrativeId_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_administrative_id", referencedColumnName = "id")
    public Adresse getAdresseByAdresseAdministrativeId_1() {
        return adresseByAdresseAdministrativeId_1;
    }

    public void setAdresseByAdresseAdministrativeId_1(Adresse adresseByAdresseAdministrativeId_1) {
        this.adresseByAdresseAdministrativeId_1 = adresseByAdresseAdministrativeId_1;
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
    @JoinColumn(name = "agence_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceId_1() {
        return agenceByAgenceId_1;
    }

    public void setAgenceByAgenceId_1(Agence agenceByAgenceId_1) {
        this.agenceByAgenceId_1 = agenceByAgenceId_1;
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
    @JoinColumn(name = "gps_id", referencedColumnName = "id")
    public Gps getGpsByGpsId_1() {
        return gpsByGpsId_1;
    }

    public void setGpsByGpsId_1(Gps gpsByGpsId_1) {
        this.gpsByGpsId_1 = gpsByGpsId_1;
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

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId_1() {
        return technicienByTechnicienId_1;
    }

    public void setTechnicienByTechnicienId_1(Technicien technicienByTechnicienId_1) {
        this.technicienByTechnicienId_1 = technicienByTechnicienId_1;
    }

    @OneToMany(mappedBy = "etablissementByEtablissementId")
    public Collection<EtablissementPatient> getEtablissementPatientsById() {
        return etablissementPatientsById;
    }

    public void setEtablissementPatientsById(Collection<EtablissementPatient> etablissementPatientsById) {
        this.etablissementPatientsById = etablissementPatientsById;
    }

    @OneToMany(mappedBy = "etablissementByEtablissementId")
    public Collection<Prescripteur> getPrescripteursById() {
        return prescripteursById;
    }

    public void setPrescripteursById(Collection<Prescripteur> prescripteursById) {
        this.prescripteursById = prescripteursById;
    }

    @OneToMany(mappedBy = "etablissementByEtablissementId_0")
    public Collection<Prescripteur> getPrescripteursById_0() {
        return prescripteursById_0;
    }

    public void setPrescripteursById_0(Collection<Prescripteur> prescripteursById_0) {
        this.prescripteursById_0 = prescripteursById_0;
    }
}
