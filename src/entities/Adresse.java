package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Adresse {
    private int id;
    private String numeroVoie;
    private String typeVoie;
    private String nomVoie;
    private String codePostal;
    private String ville;
    private String pays;
    private Collection<Agence> agencesById;
    private Collection<Agence> agencesById_0;
    private Collection<Agence> agencesById_1;
    private Collection<Agence> agencesById_2;
    private Collection<Agence> agencesById_3;
    private Collection<Agence> agencesById_4;
    private Collection<Etablissement> etablissementsById;
    private Collection<Etablissement> etablissementsById_0;
    private Collection<Etablissement> etablissementsById_1;
    private Collection<Etablissement> etablissementsById_2;
    private Collection<Etablissement> etablissementsById_3;
    private Collection<Etablissement> etablissementsById_4;
    private Collection<Personne> personnesById;
    private Collection<Personne> personnesById_0;
    private Collection<RegimeComplementaire> regimeComplementairesById;
    private Collection<RegimeObligatoire> regimeObligatoiresById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "numero_voie")
    public String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    @Basic
    @Column(name = "type_voie")
    public String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String typeVoie) {
        this.typeVoie = typeVoie;
    }

    @Basic
    @Column(name = "nom_voie")
    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    @Basic
    @Column(name = "code_postal")
    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Basic
    @Column(name = "ville")
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "pays")
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return id == adresse.id &&
                Objects.equals(numeroVoie, adresse.numeroVoie) &&
                Objects.equals(typeVoie, adresse.typeVoie) &&
                Objects.equals(nomVoie, adresse.nomVoie) &&
                Objects.equals(codePostal, adresse.codePostal) &&
                Objects.equals(ville, adresse.ville) &&
                Objects.equals(pays, adresse.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroVoie, typeVoie, nomVoie, codePostal, ville, pays);
    }

    @OneToMany(mappedBy = "adresseByAdresseIdLivraison")
    public Collection<Agence> getAgencesById() {
        return agencesById;
    }

    public void setAgencesById(Collection<Agence> agencesById) {
        this.agencesById = agencesById;
    }

    @OneToMany(mappedBy = "adresseByAdresseIdLivraison_0")
    public Collection<Agence> getAgencesById_0() {
        return agencesById_0;
    }

    public void setAgencesById_0(Collection<Agence> agencesById_0) {
        this.agencesById_0 = agencesById_0;
    }

    @OneToMany(mappedBy = "adresseByAdresseIdLivraison_1")
    public Collection<Agence> getAgencesById_1() {
        return agencesById_1;
    }

    public void setAgencesById_1(Collection<Agence> agencesById_1) {
        this.agencesById_1 = agencesById_1;
    }

    @OneToMany(mappedBy = "adresseByAdresseId")
    public Collection<Agence> getAgencesById_2() {
        return agencesById_2;
    }

    public void setAgencesById_2(Collection<Agence> agencesById_2) {
        this.agencesById_2 = agencesById_2;
    }

    @OneToMany(mappedBy = "adresseByAdresseId_0")
    public Collection<Agence> getAgencesById_3() {
        return agencesById_3;
    }

    public void setAgencesById_3(Collection<Agence> agencesById_3) {
        this.agencesById_3 = agencesById_3;
    }

    @OneToMany(mappedBy = "adresseByAdresseId_1")
    public Collection<Agence> getAgencesById_4() {
        return agencesById_4;
    }

    public void setAgencesById_4(Collection<Agence> agencesById_4) {
        this.agencesById_4 = agencesById_4;
    }

    @OneToMany(mappedBy = "adresseByAdresseLivraisonId")
    public Collection<Etablissement> getEtablissementsById() {
        return etablissementsById;
    }

    public void setEtablissementsById(Collection<Etablissement> etablissementsById) {
        this.etablissementsById = etablissementsById;
    }

    @OneToMany(mappedBy = "adresseByAdresseLivraisonId_0")
    public Collection<Etablissement> getEtablissementsById_0() {
        return etablissementsById_0;
    }

    public void setEtablissementsById_0(Collection<Etablissement> etablissementsById_0) {
        this.etablissementsById_0 = etablissementsById_0;
    }

    @OneToMany(mappedBy = "adresseByAdresseLivraisonId_1")
    public Collection<Etablissement> getEtablissementsById_1() {
        return etablissementsById_1;
    }

    public void setEtablissementsById_1(Collection<Etablissement> etablissementsById_1) {
        this.etablissementsById_1 = etablissementsById_1;
    }

    @OneToMany(mappedBy = "adresseByAdresseAdministrativeId")
    public Collection<Etablissement> getEtablissementsById_2() {
        return etablissementsById_2;
    }

    public void setEtablissementsById_2(Collection<Etablissement> etablissementsById_2) {
        this.etablissementsById_2 = etablissementsById_2;
    }

    @OneToMany(mappedBy = "adresseByAdresseAdministrativeId_0")
    public Collection<Etablissement> getEtablissementsById_3() {
        return etablissementsById_3;
    }

    public void setEtablissementsById_3(Collection<Etablissement> etablissementsById_3) {
        this.etablissementsById_3 = etablissementsById_3;
    }

    @OneToMany(mappedBy = "adresseByAdresseAdministrativeId_1")
    public Collection<Etablissement> getEtablissementsById_4() {
        return etablissementsById_4;
    }

    public void setEtablissementsById_4(Collection<Etablissement> etablissementsById_4) {
        this.etablissementsById_4 = etablissementsById_4;
    }

    @OneToMany(mappedBy = "adresseByAdresseId")
    public Collection<Personne> getPersonnesById() {
        return personnesById;
    }

    public void setPersonnesById(Collection<Personne> personnesById) {
        this.personnesById = personnesById;
    }

    @OneToMany(mappedBy = "adresseByAdresseId_0")
    public Collection<Personne> getPersonnesById_0() {
        return personnesById_0;
    }

    public void setPersonnesById_0(Collection<Personne> personnesById_0) {
        this.personnesById_0 = personnesById_0;
    }

    @OneToMany(mappedBy = "adresseByAdresseId")
    public Collection<RegimeComplementaire> getRegimeComplementairesById() {
        return regimeComplementairesById;
    }

    public void setRegimeComplementairesById(Collection<RegimeComplementaire> regimeComplementairesById) {
        this.regimeComplementairesById = regimeComplementairesById;
    }

    @OneToMany(mappedBy = "adresseByAdresseId")
    public Collection<RegimeObligatoire> getRegimeObligatoiresById() {
        return regimeObligatoiresById;
    }

    public void setRegimeObligatoiresById(Collection<RegimeObligatoire> regimeObligatoiresById) {
        this.regimeObligatoiresById = regimeObligatoiresById;
    }
}
