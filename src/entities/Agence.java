package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Agence {
    private int id;
    private String raisonSociale;
    private String nom;
    private Byte siegeSocial;
    private String tel;
    private String fax;
    private String mail;
    private String horaire;
    private String logo;
    private String numeroPrestataire;
    private String numeroTva;
    private String codeApe;
    private String numeroSiret;
    private int adresseIdLivraison;
    private int adresseId;
    private Date dateSuppr;
    private byte[] fichierLogo;
    private Adresse adresseByAdresseIdLivraison;
    private Adresse adresseByAdresseIdLivraison_0;
    private Adresse adresseByAdresseIdLivraison_1;
    private Adresse adresseByAdresseId;
    private Adresse adresseByAdresseId_0;
    private Adresse adresseByAdresseId_1;
    private Collection<CommandeFournisseur> commandeFournisseursById;
    private Collection<CommandeFournisseur> commandeFournisseursById_0;
    private Collection<DepEnRetard2> depEnRetard2sById;
    private Collection<Etablissement> etablissementsById;
    private Collection<Etablissement> etablissementsById_0;
    private Collection<Etablissement> etablissementsById_1;
    private Collection<Obus> obusesById;
    private Collection<ParcMateriel> parcMaterielsById;
    private Collection<Patient> patientsById;
    private Collection<Patient> patientsById_0;
    private Collection<Prescripteur> prescripteursById;
    private Collection<Prescripteur> prescripteursById_0;
    private Collection<Reservoir> reservoirsById;
    private Collection<StockConsommable> stockConsommablesById;
    private Collection<Technicien> techniciensById;
    private Collection<Technicien> techniciensById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "raison_sociale")
    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
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
    @Column(name = "siege_social")
    public Byte getSiegeSocial() {
        return siegeSocial;
    }

    public void setSiegeSocial(Byte siegeSocial) {
        this.siegeSocial = siegeSocial;
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
    @Column(name = "horaire")
    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    @Basic
    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "numero_prestataire")
    public String getNumeroPrestataire() {
        return numeroPrestataire;
    }

    public void setNumeroPrestataire(String numeroPrestataire) {
        this.numeroPrestataire = numeroPrestataire;
    }

    @Basic
    @Column(name = "numero_tva")
    public String getNumeroTva() {
        return numeroTva;
    }

    public void setNumeroTva(String numeroTva) {
        this.numeroTva = numeroTva;
    }

    @Basic
    @Column(name = "code_ape")
    public String getCodeApe() {
        return codeApe;
    }

    public void setCodeApe(String codeApe) {
        this.codeApe = codeApe;
    }

    @Basic
    @Column(name = "numero_siret")
    public String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    @Basic
    @Column(name = "adresse_id_livraison")
    public int getAdresseIdLivraison() {
        return adresseIdLivraison;
    }

    public void setAdresseIdLivraison(int adresseIdLivraison) {
        this.adresseIdLivraison = adresseIdLivraison;
    }

    @Basic
    @Column(name = "adresse_id")
    public int getAdresseId() {
        return adresseId;
    }

    public void setAdresseId(int adresseId) {
        this.adresseId = adresseId;
    }

    @Basic
    @Column(name = "date_suppr")
    public Date getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Date dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "fichier_logo")
    public byte[] getFichierLogo() {
        return fichierLogo;
    }

    public void setFichierLogo(byte[] fichierLogo) {
        this.fichierLogo = fichierLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agence agence = (Agence) o;
        return id == agence.id &&
                adresseIdLivraison == agence.adresseIdLivraison &&
                adresseId == agence.adresseId &&
                Objects.equals(raisonSociale, agence.raisonSociale) &&
                Objects.equals(nom, agence.nom) &&
                Objects.equals(siegeSocial, agence.siegeSocial) &&
                Objects.equals(tel, agence.tel) &&
                Objects.equals(fax, agence.fax) &&
                Objects.equals(mail, agence.mail) &&
                Objects.equals(horaire, agence.horaire) &&
                Objects.equals(logo, agence.logo) &&
                Objects.equals(numeroPrestataire, agence.numeroPrestataire) &&
                Objects.equals(numeroTva, agence.numeroTva) &&
                Objects.equals(codeApe, agence.codeApe) &&
                Objects.equals(numeroSiret, agence.numeroSiret) &&
                Objects.equals(dateSuppr, agence.dateSuppr) &&
                Arrays.equals(fichierLogo, agence.fichierLogo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, raisonSociale, nom, siegeSocial, tel, fax, mail, horaire, logo, numeroPrestataire, numeroTva, codeApe, numeroSiret, adresseIdLivraison, adresseId, dateSuppr);
        result = 31 * result + Arrays.hashCode(fichierLogo);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison() {
        return adresseByAdresseIdLivraison;
    }

    public void setAdresseByAdresseIdLivraison(Adresse adresseByAdresseIdLivraison) {
        this.adresseByAdresseIdLivraison = adresseByAdresseIdLivraison;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison_0() {
        return adresseByAdresseIdLivraison_0;
    }

    public void setAdresseByAdresseIdLivraison_0(Adresse adresseByAdresseIdLivraison_0) {
        this.adresseByAdresseIdLivraison_0 = adresseByAdresseIdLivraison_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id_livraison", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseIdLivraison_1() {
        return adresseByAdresseIdLivraison_1;
    }

    public void setAdresseByAdresseIdLivraison_1(Adresse adresseByAdresseIdLivraison_1) {
        this.adresseByAdresseIdLivraison_1 = adresseByAdresseIdLivraison_1;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId() {
        return adresseByAdresseId;
    }

    public void setAdresseByAdresseId(Adresse adresseByAdresseId) {
        this.adresseByAdresseId = adresseByAdresseId;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId_0() {
        return adresseByAdresseId_0;
    }

    public void setAdresseByAdresseId_0(Adresse adresseByAdresseId_0) {
        this.adresseByAdresseId_0 = adresseByAdresseId_0;
    }

    @ManyToOne
    @JoinColumn(name = "adresse_id", referencedColumnName = "id", nullable = false)
    public Adresse getAdresseByAdresseId_1() {
        return adresseByAdresseId_1;
    }

    public void setAdresseByAdresseId_1(Adresse adresseByAdresseId_1) {
        this.adresseByAdresseId_1 = adresseByAdresseId_1;
    }

    @OneToMany(mappedBy = "agenceByAgenceFacturationId")
    public Collection<CommandeFournisseur> getCommandeFournisseursById() {
        return commandeFournisseursById;
    }

    public void setCommandeFournisseursById(Collection<CommandeFournisseur> commandeFournisseursById) {
        this.commandeFournisseursById = commandeFournisseursById;
    }

    @OneToMany(mappedBy = "agenceByAgenceLivraisonId")
    public Collection<CommandeFournisseur> getCommandeFournisseursById_0() {
        return commandeFournisseursById_0;
    }

    public void setCommandeFournisseursById_0(Collection<CommandeFournisseur> commandeFournisseursById_0) {
        this.commandeFournisseursById_0 = commandeFournisseursById_0;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<DepEnRetard2> getDepEnRetard2sById() {
        return depEnRetard2sById;
    }

    public void setDepEnRetard2sById(Collection<DepEnRetard2> depEnRetard2sById) {
        this.depEnRetard2sById = depEnRetard2sById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Etablissement> getEtablissementsById() {
        return etablissementsById;
    }

    public void setEtablissementsById(Collection<Etablissement> etablissementsById) {
        this.etablissementsById = etablissementsById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId_0")
    public Collection<Etablissement> getEtablissementsById_0() {
        return etablissementsById_0;
    }

    public void setEtablissementsById_0(Collection<Etablissement> etablissementsById_0) {
        this.etablissementsById_0 = etablissementsById_0;
    }

    @OneToMany(mappedBy = "agenceByAgenceId_1")
    public Collection<Etablissement> getEtablissementsById_1() {
        return etablissementsById_1;
    }

    public void setEtablissementsById_1(Collection<Etablissement> etablissementsById_1) {
        this.etablissementsById_1 = etablissementsById_1;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Obus> getObusesById() {
        return obusesById;
    }

    public void setObusesById(Collection<Obus> obusesById) {
        this.obusesById = obusesById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<ParcMateriel> getParcMaterielsById() {
        return parcMaterielsById;
    }

    public void setParcMaterielsById(Collection<ParcMateriel> parcMaterielsById) {
        this.parcMaterielsById = parcMaterielsById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Prescripteur> getPrescripteursById() {
        return prescripteursById;
    }

    public void setPrescripteursById(Collection<Prescripteur> prescripteursById) {
        this.prescripteursById = prescripteursById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId_0")
    public Collection<Prescripteur> getPrescripteursById_0() {
        return prescripteursById_0;
    }

    public void setPrescripteursById_0(Collection<Prescripteur> prescripteursById_0) {
        this.prescripteursById_0 = prescripteursById_0;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Reservoir> getReservoirsById() {
        return reservoirsById;
    }

    public void setReservoirsById(Collection<Reservoir> reservoirsById) {
        this.reservoirsById = reservoirsById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<StockConsommable> getStockConsommablesById() {
        return stockConsommablesById;
    }

    public void setStockConsommablesById(Collection<StockConsommable> stockConsommablesById) {
        this.stockConsommablesById = stockConsommablesById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId")
    public Collection<Technicien> getTechniciensById() {
        return techniciensById;
    }

    public void setTechniciensById(Collection<Technicien> techniciensById) {
        this.techniciensById = techniciensById;
    }

    @OneToMany(mappedBy = "agenceByAgenceId_0")
    public Collection<Technicien> getTechniciensById_0() {
        return techniciensById_0;
    }

    public void setTechniciensById_0(Collection<Technicien> techniciensById_0) {
        this.techniciensById_0 = techniciensById_0;
    }
}
