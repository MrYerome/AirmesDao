package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contact_fournisseur", schema = "ventury", catalog = "")
public class ContactFournisseur {
    private int id;
    private String nom;
    private String mail;
    private String tel;
    private Integer fournisseurId;
    private Fournisseur fournisseurByFournisseurId;
    private Fournisseur fournisseurByFournisseurId_0;

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
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
    @Column(name = "fournisseur_id")
    public Integer getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Integer fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactFournisseur that = (ContactFournisseur) o;
        return id == that.id &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(fournisseurId, that.fournisseurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, mail, tel, fournisseurId);
    }

    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    public Fournisseur getFournisseurByFournisseurId() {
        return fournisseurByFournisseurId;
    }

    public void setFournisseurByFournisseurId(Fournisseur fournisseurByFournisseurId) {
        this.fournisseurByFournisseurId = fournisseurByFournisseurId;
    }

    @ManyToOne
    @JoinColumn(name = "fournisseur_id", referencedColumnName = "id")
    public Fournisseur getFournisseurByFournisseurId_0() {
        return fournisseurByFournisseurId_0;
    }

    public void setFournisseurByFournisseurId_0(Fournisseur fournisseurByFournisseurId_0) {
        this.fournisseurByFournisseurId_0 = fournisseurByFournisseurId_0;
    }
}
