@javax.persistence.Entity
@javax.persistence.Table(name = "agence", schema = "ventury", catalog = "")
public class AgenceEnt {
    private Integer id;
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
    private Date dateSuppr;
    private byte[] fichierLogo;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "raison_sociale", nullable = false, length = 255)
    public java.lang.String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(java.lang.String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "nom", nullable = false, length = 255)
    public java.lang.String getNom() {
        return nom;
    }

    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "siege_social", nullable = true)
    public java.lang.Byte getSiegeSocial() {
        return siegeSocial;
    }

    public void setSiegeSocial(java.lang.Byte siegeSocial) {
        this.siegeSocial = siegeSocial;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "tel", nullable = true, length = 30)
    public java.lang.String getTel() {
        return tel;
    }

    public void setTel(java.lang.String tel) {
        this.tel = tel;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "fax", nullable = true, length = 30)
    public java.lang.String getFax() {
        return fax;
    }

    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "mail", nullable = true, length = 255)
    public java.lang.String getMail() {
        return mail;
    }

    public void setMail(java.lang.String mail) {
        this.mail = mail;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "horaire", nullable = true, length = -1)
    public java.lang.String getHoraire() {
        return horaire;
    }

    public void setHoraire(java.lang.String horaire) {
        this.horaire = horaire;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "logo", nullable = true, length = 255)
    public java.lang.String getLogo() {
        return logo;
    }

    public void setLogo(java.lang.String logo) {
        this.logo = logo;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "numero_prestataire", nullable = true, length = 50)
    public java.lang.String getNumeroPrestataire() {
        return numeroPrestataire;
    }

    public void setNumeroPrestataire(java.lang.String numeroPrestataire) {
        this.numeroPrestataire = numeroPrestataire;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "numero_tva", nullable = true, length = 50)
    public java.lang.String getNumeroTva() {
        return numeroTva;
    }

    public void setNumeroTva(java.lang.String numeroTva) {
        this.numeroTva = numeroTva;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "code_ape", nullable = true, length = 50)
    public java.lang.String getCodeApe() {
        return codeApe;
    }

    public void setCodeApe(java.lang.String codeApe) {
        this.codeApe = codeApe;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "numero_siret", nullable = true, length = 50)
    public java.lang.String getNumeroSiret() {
        return numeroSiret;
    }

    public void setNumeroSiret(java.lang.String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "date_suppr", nullable = true)
    public java.sql.Date getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(java.sql.Date dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "fichier_logo", nullable = true)
    public byte[] getFichierLogo() {
        return fichierLogo;
    }

    public void setFichierLogo(byte[] fichierLogo) {
        this.fichierLogo = fichierLogo;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        AgenceEnt agenceEnt = (AgenceEnt) object;

        if (id != null ? !id.equals(agenceEnt.id) : agenceEnt.id != null) return false;
        if (raisonSociale != null ? !raisonSociale.equals(agenceEnt.raisonSociale) : agenceEnt.raisonSociale != null)
            return false;
        if (nom != null ? !nom.equals(agenceEnt.nom) : agenceEnt.nom != null) return false;
        if (siegeSocial != null ? !siegeSocial.equals(agenceEnt.siegeSocial) : agenceEnt.siegeSocial != null)
            return false;
        if (tel != null ? !tel.equals(agenceEnt.tel) : agenceEnt.tel != null) return false;
        if (fax != null ? !fax.equals(agenceEnt.fax) : agenceEnt.fax != null) return false;
        if (mail != null ? !mail.equals(agenceEnt.mail) : agenceEnt.mail != null) return false;
        if (horaire != null ? !horaire.equals(agenceEnt.horaire) : agenceEnt.horaire != null) return false;
        if (logo != null ? !logo.equals(agenceEnt.logo) : agenceEnt.logo != null) return false;
        if (numeroPrestataire != null ? !numeroPrestataire.equals(agenceEnt.numeroPrestataire) : agenceEnt.numeroPrestataire != null)
            return false;
        if (numeroTva != null ? !numeroTva.equals(agenceEnt.numeroTva) : agenceEnt.numeroTva != null) return false;
        if (codeApe != null ? !codeApe.equals(agenceEnt.codeApe) : agenceEnt.codeApe != null) return false;
        if (numeroSiret != null ? !numeroSiret.equals(agenceEnt.numeroSiret) : agenceEnt.numeroSiret != null)
            return false;
        if (dateSuppr != null ? !dateSuppr.equals(agenceEnt.dateSuppr) : agenceEnt.dateSuppr != null) return false;
        if (!java.util.Arrays.equals(fichierLogo, agenceEnt.fichierLogo)) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (raisonSociale != null ? raisonSociale.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (siegeSocial != null ? siegeSocial.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (horaire != null ? horaire.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (numeroPrestataire != null ? numeroPrestataire.hashCode() : 0);
        result = 31 * result + (numeroTva != null ? numeroTva.hashCode() : 0);
        result = 31 * result + (codeApe != null ? codeApe.hashCode() : 0);
        result = 31 * result + (numeroSiret != null ? numeroSiret.hashCode() : 0);
        result = 31 * result + (dateSuppr != null ? dateSuppr.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(fichierLogo);
        return result;
    }
}
