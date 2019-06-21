package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "web_article", schema = "ventury", catalog = "")
public class WebArticle {
    private int id;
    private Timestamp dateCreation;
    private Timestamp datePublication;
    private byte publish;
    private byte prescripteurOnly;
    private String titre;
    private String contenu;
    private String logo;
    private int auteurId;
    private Utilisateur utilisateurByAuteurId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_creation")
    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_publication")
    public Timestamp getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Timestamp datePublication) {
        this.datePublication = datePublication;
    }

    @Basic
    @Column(name = "publish")
    public byte getPublish() {
        return publish;
    }

    public void setPublish(byte publish) {
        this.publish = publish;
    }

    @Basic
    @Column(name = "prescripteur_only")
    public byte getPrescripteurOnly() {
        return prescripteurOnly;
    }

    public void setPrescripteurOnly(byte prescripteurOnly) {
        this.prescripteurOnly = prescripteurOnly;
    }

    @Basic
    @Column(name = "titre")
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Basic
    @Column(name = "contenu")
    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
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
    @Column(name = "auteur_id")
    public int getAuteurId() {
        return auteurId;
    }

    public void setAuteurId(int auteurId) {
        this.auteurId = auteurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebArticle that = (WebArticle) o;
        return id == that.id &&
                publish == that.publish &&
                prescripteurOnly == that.prescripteurOnly &&
                auteurId == that.auteurId &&
                Objects.equals(dateCreation, that.dateCreation) &&
                Objects.equals(datePublication, that.datePublication) &&
                Objects.equals(titre, that.titre) &&
                Objects.equals(contenu, that.contenu) &&
                Objects.equals(logo, that.logo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreation, datePublication, publish, prescripteurOnly, titre, contenu, logo, auteurId);
    }

    @ManyToOne
    @JoinColumn(name = "auteur_id", referencedColumnName = "id", nullable = false)
    public Utilisateur getUtilisateurByAuteurId() {
        return utilisateurByAuteurId;
    }

    public void setUtilisateurByAuteurId(Utilisateur utilisateurByAuteurId) {
        this.utilisateurByAuteurId = utilisateurByAuteurId;
    }
}
