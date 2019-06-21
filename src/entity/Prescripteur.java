package entity;

import javax.persistence.*;
import java.sql.Timestamp;
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
    private byte nouvelExtranet;
    private Timestamp derniereConnexion;
    private Personne personneById;
    private Personne personneById_0;
    private Agence agenceByAgenceId;
    private Agence agenceByAgenceId_0;
    private Etablissement etablissementByEtablissementId;
    private Etablissement etablissementByEtablissementId_0;

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
                Objects.equals(derniereConnexion, that.derniereConnexion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroPrescripteur, numeroFiness, login, password, etablissementVisibilite, etablissementService, nouvelExtranet, derniereConnexion);
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
}
