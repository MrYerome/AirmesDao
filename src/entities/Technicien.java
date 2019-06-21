package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Technicien {
    private int id;
    private Integer personneAContacterId;
    private Integer agenceId;
    private Date dateEntree;
    private Date dateSortie;
    private Integer statutFamilial;
    private String epoux;
    private Double salaire;
    private Integer mutuelle;
    private String numeroVehicule;
    private String numeroCarteEssence;
    private String boitierPeage;
    private byte[] photo;
    private Collection<Etablissement> etablissementsById;
    private Collection<Etablissement> etablissementsById_0;
    private Collection<Etablissement> etablissementsById_1;
    private Collection<HistoriqueMateriel> historiqueMaterielsById;
    private Collection<HistoriqueStock> historiqueStocksById;
    private Collection<ObusTechnicien> obusTechniciensById;
    private Collection<ParcMaterielTechnicien> parcMaterielTechniciensById;
    private Collection<Patient> patientsById;
    private Collection<Patient> patientsById_0;
    private Collection<StockConsommableTechnicien> stockConsommableTechniciensById;
    private Personne personneById;
    private Personne personneById_0;
    private Personne personneByPersonneAContacterId;
    private Personne personneByPersonneAContacterId_0;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;
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
    @Column(name = "personne_a_contacter_id")
    public Integer getPersonneAContacterId() {
        return personneAContacterId;
    }

    public void setPersonneAContacterId(Integer personneAContacterId) {
        this.personneAContacterId = personneAContacterId;
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
    @Column(name = "date_entree")
    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    @Basic
    @Column(name = "date_sortie")
    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "statut_familial")
    public Integer getStatutFamilial() {
        return statutFamilial;
    }

    public void setStatutFamilial(Integer statutFamilial) {
        this.statutFamilial = statutFamilial;
    }

    @Basic
    @Column(name = "epoux")
    public String getEpoux() {
        return epoux;
    }

    public void setEpoux(String epoux) {
        this.epoux = epoux;
    }

    @Basic
    @Column(name = "salaire")
    public Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    @Basic
    @Column(name = "mutuelle")
    public Integer getMutuelle() {
        return mutuelle;
    }

    public void setMutuelle(Integer mutuelle) {
        this.mutuelle = mutuelle;
    }

    @Basic
    @Column(name = "numero_vehicule")
    public String getNumeroVehicule() {
        return numeroVehicule;
    }

    public void setNumeroVehicule(String numeroVehicule) {
        this.numeroVehicule = numeroVehicule;
    }

    @Basic
    @Column(name = "numero_carte_essence")
    public String getNumeroCarteEssence() {
        return numeroCarteEssence;
    }

    public void setNumeroCarteEssence(String numeroCarteEssence) {
        this.numeroCarteEssence = numeroCarteEssence;
    }

    @Basic
    @Column(name = "boitier_peage")
    public String getBoitierPeage() {
        return boitierPeage;
    }

    public void setBoitierPeage(String boitierPeage) {
        this.boitierPeage = boitierPeage;
    }

    @Basic
    @Column(name = "photo")
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technicien that = (Technicien) o;
        return id == that.id &&
                Objects.equals(personneAContacterId, that.personneAContacterId) &&
                Objects.equals(agenceId, that.agenceId) &&
                Objects.equals(dateEntree, that.dateEntree) &&
                Objects.equals(dateSortie, that.dateSortie) &&
                Objects.equals(statutFamilial, that.statutFamilial) &&
                Objects.equals(epoux, that.epoux) &&
                Objects.equals(salaire, that.salaire) &&
                Objects.equals(mutuelle, that.mutuelle) &&
                Objects.equals(numeroVehicule, that.numeroVehicule) &&
                Objects.equals(numeroCarteEssence, that.numeroCarteEssence) &&
                Objects.equals(boitierPeage, that.boitierPeage) &&
                Arrays.equals(photo, that.photo);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, personneAContacterId, agenceId, dateEntree, dateSortie, statutFamilial, epoux, salaire, mutuelle, numeroVehicule, numeroCarteEssence, boitierPeage);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<Etablissement> getEtablissementsById() {
        return etablissementsById;
    }

    public void setEtablissementsById(Collection<Etablissement> etablissementsById) {
        this.etablissementsById = etablissementsById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId_0")
    public Collection<Etablissement> getEtablissementsById_0() {
        return etablissementsById_0;
    }

    public void setEtablissementsById_0(Collection<Etablissement> etablissementsById_0) {
        this.etablissementsById_0 = etablissementsById_0;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId_1")
    public Collection<Etablissement> getEtablissementsById_1() {
        return etablissementsById_1;
    }

    public void setEtablissementsById_1(Collection<Etablissement> etablissementsById_1) {
        this.etablissementsById_1 = etablissementsById_1;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<HistoriqueMateriel> getHistoriqueMaterielsById() {
        return historiqueMaterielsById;
    }

    public void setHistoriqueMaterielsById(Collection<HistoriqueMateriel> historiqueMaterielsById) {
        this.historiqueMaterielsById = historiqueMaterielsById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<HistoriqueStock> getHistoriqueStocksById() {
        return historiqueStocksById;
    }

    public void setHistoriqueStocksById(Collection<HistoriqueStock> historiqueStocksById) {
        this.historiqueStocksById = historiqueStocksById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<ObusTechnicien> getObusTechniciensById() {
        return obusTechniciensById;
    }

    public void setObusTechniciensById(Collection<ObusTechnicien> obusTechniciensById) {
        this.obusTechniciensById = obusTechniciensById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<ParcMaterielTechnicien> getParcMaterielTechniciensById() {
        return parcMaterielTechniciensById;
    }

    public void setParcMaterielTechniciensById(Collection<ParcMaterielTechnicien> parcMaterielTechniciensById) {
        this.parcMaterielTechniciensById = parcMaterielTechniciensById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<Patient> getPatientsById() {
        return patientsById;
    }

    public void setPatientsById(Collection<Patient> patientsById) {
        this.patientsById = patientsById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId_0")
    public Collection<Patient> getPatientsById_0() {
        return patientsById_0;
    }

    public void setPatientsById_0(Collection<Patient> patientsById_0) {
        this.patientsById_0 = patientsById_0;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<StockConsommableTechnicien> getStockConsommableTechniciensById() {
        return stockConsommableTechniciensById;
    }

    public void setStockConsommableTechniciensById(Collection<StockConsommableTechnicien> stockConsommableTechniciensById) {
        this.stockConsommableTechniciensById = stockConsommableTechniciensById;
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
    @JoinColumn(name = "personne_a_contacter_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneAContacterId() {
        return personneByPersonneAContacterId;
    }

    public void setPersonneByPersonneAContacterId(Personne personneByPersonneAContacterId) {
        this.personneByPersonneAContacterId = personneByPersonneAContacterId;
    }

    @ManyToOne
    @JoinColumn(name = "personne_a_contacter_id", referencedColumnName = "id")
    public Personne getPersonneByPersonneAContacterId_0() {
        return personneByPersonneAContacterId_0;
    }

    public void setPersonneByPersonneAContacterId_0(Personne personneByPersonneAContacterId_0) {
        this.personneByPersonneAContacterId_0 = personneByPersonneAContacterId_0;
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

    @OneToMany(mappedBy = "technicienByTechnicienId")
    public Collection<Utilisateur> getUtilisateursById() {
        return utilisateursById;
    }

    public void setUtilisateursById(Collection<Utilisateur> utilisateursById) {
        this.utilisateursById = utilisateursById;
    }

    @OneToMany(mappedBy = "technicienByTechnicienId_0")
    public Collection<Utilisateur> getUtilisateursById_0() {
        return utilisateursById_0;
    }

    public void setUtilisateursById_0(Collection<Utilisateur> utilisateursById_0) {
        this.utilisateursById_0 = utilisateursById_0;
    }
}
