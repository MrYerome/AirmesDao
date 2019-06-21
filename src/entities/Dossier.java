package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Dossier {
    private int id;
    private int statut;
    private Collection<BonLivraisonClient> bonLivraisonClientsById;
    private DossierClient dossierClientById;
    private DossierClient dossierClientById_0;
    private DossierPatient dossierPatientById;
    private DossierPatient dossierPatientById_0;
    private Collection<ObusPatient> obusPatientsById;
    private Collection<ParcMaterielClient> parcMaterielClientsById;
    private Collection<ParcMaterielPatient> parcMaterielPatientsById;
    private Collection<Prescription> prescriptionsById;
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
    @Column(name = "statut")
    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dossier dossier = (Dossier) o;
        return id == dossier.id &&
                statut == dossier.statut;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statut);
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<BonLivraisonClient> getBonLivraisonClientsById() {
        return bonLivraisonClientsById;
    }

    public void setBonLivraisonClientsById(Collection<BonLivraisonClient> bonLivraisonClientsById) {
        this.bonLivraisonClientsById = bonLivraisonClientsById;
    }

    @OneToOne(mappedBy = "dossierById")
    public DossierClient getDossierClientById() {
        return dossierClientById;
    }

    public void setDossierClientById(DossierClient dossierClientById) {
        this.dossierClientById = dossierClientById;
    }

    @OneToOne(mappedBy = "dossierById_0")
    public DossierClient getDossierClientById_0() {
        return dossierClientById_0;
    }

    public void setDossierClientById_0(DossierClient dossierClientById_0) {
        this.dossierClientById_0 = dossierClientById_0;
    }

    @OneToOne(mappedBy = "dossierById")
    public DossierPatient getDossierPatientById() {
        return dossierPatientById;
    }

    public void setDossierPatientById(DossierPatient dossierPatientById) {
        this.dossierPatientById = dossierPatientById;
    }

    @OneToOne(mappedBy = "dossierById_0")
    public DossierPatient getDossierPatientById_0() {
        return dossierPatientById_0;
    }

    public void setDossierPatientById_0(DossierPatient dossierPatientById_0) {
        this.dossierPatientById_0 = dossierPatientById_0;
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<ObusPatient> getObusPatientsById() {
        return obusPatientsById;
    }

    public void setObusPatientsById(Collection<ObusPatient> obusPatientsById) {
        this.obusPatientsById = obusPatientsById;
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<ParcMaterielClient> getParcMaterielClientsById() {
        return parcMaterielClientsById;
    }

    public void setParcMaterielClientsById(Collection<ParcMaterielClient> parcMaterielClientsById) {
        this.parcMaterielClientsById = parcMaterielClientsById;
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<ParcMaterielPatient> getParcMaterielPatientsById() {
        return parcMaterielPatientsById;
    }

    public void setParcMaterielPatientsById(Collection<ParcMaterielPatient> parcMaterielPatientsById) {
        this.parcMaterielPatientsById = parcMaterielPatientsById;
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<Prescription> getPrescriptionsById() {
        return prescriptionsById;
    }

    public void setPrescriptionsById(Collection<Prescription> prescriptionsById) {
        this.prescriptionsById = prescriptionsById;
    }

    @OneToMany(mappedBy = "dossierByDossierId")
    public Collection<StockConsommablePatient> getStockConsommablePatientsById() {
        return stockConsommablePatientsById;
    }

    public void setStockConsommablePatientsById(Collection<StockConsommablePatient> stockConsommablePatientsById) {
        this.stockConsommablePatientsById = stockConsommablePatientsById;
    }
}
