@javax.persistence.Entity
@javax.persistence.Table(name = "adresse", schema = "ventury", catalog = "")
public class AdresseEnt {
    private Integer id;
    private String numeroVoie;
    private String typeVoie;
    private String nomVoie;
    private String codePostal;
    private String ville;
    private String pays;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "numero_voie", nullable = true, length = 20)
    public java.lang.String getNumeroVoie() {
        return numeroVoie;
    }

    public void setNumeroVoie(java.lang.String numeroVoie) {
        this.numeroVoie = numeroVoie;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "type_voie", nullable = true, length = 20)
    public java.lang.String getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(java.lang.String typeVoie) {
        this.typeVoie = typeVoie;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom_voie", nullable = true, length = -1)
    public java.lang.String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(java.lang.String nomVoie) {
        this.nomVoie = nomVoie;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code_postal", nullable = true, length = 10)
    public java.lang.String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(java.lang.String codePostal) {
        this.codePostal = codePostal;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "ville", nullable = true, length = 250)
    public java.lang.String getVille() {
        return ville;
    }

    public void setVille(java.lang.String ville) {
        this.ville = ville;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "pays", nullable = true, length = 100)
    public java.lang.String getPays() {
        return pays;
    }

    public void setPays(java.lang.String pays) {
        this.pays = pays;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        AdresseEnt that = (AdresseEnt) object;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (numeroVoie != null ? !numeroVoie.equals(that.numeroVoie) : that.numeroVoie != null) return false;
        if (typeVoie != null ? !typeVoie.equals(that.typeVoie) : that.typeVoie != null) return false;
        if (nomVoie != null ? !nomVoie.equals(that.nomVoie) : that.nomVoie != null) return false;
        if (codePostal != null ? !codePostal.equals(that.codePostal) : that.codePostal != null) return false;
        if (ville != null ? !ville.equals(that.ville) : that.ville != null) return false;
        if (pays != null ? !pays.equals(that.pays) : that.pays != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (numeroVoie != null ? numeroVoie.hashCode() : 0);
        result = 31 * result + (typeVoie != null ? typeVoie.hashCode() : 0);
        result = 31 * result + (nomVoie != null ? nomVoie.hashCode() : 0);
        result = 31 * result + (codePostal != null ? codePostal.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        return result;
    }
}
