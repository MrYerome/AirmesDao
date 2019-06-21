package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "bon_livraison_client", schema = "ventury", catalog = "")
public class BonLivraisonClient {
    private int id;
    private String commentaire;
    private Timestamp dateLivraison;
    private String numero;
    private Integer dossierId;
    private Dossier dossierByDossierId;
    private Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "date_livraison")
    public Timestamp getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Timestamp dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "numero")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BonLivraisonClient that = (BonLivraisonClient) o;
        return id == that.id &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(numero, that.numero) &&
                Objects.equals(dossierId, that.dossierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, dateLivraison, numero, dossierId);
    }

    @ManyToOne
    @JoinColumn(name = "dossier_id", referencedColumnName = "id")
    public Dossier getDossierByDossierId() {
        return dossierByDossierId;
    }

    public void setDossierByDossierId(Dossier dossierByDossierId) {
        this.dossierByDossierId = dossierByDossierId;
    }

    @OneToMany(mappedBy = "bonLivraisonClientByBonLivraisonClientId")
    public Collection<BonLivraisonClientLigne> getBonLivraisonClientLignesById() {
        return bonLivraisonClientLignesById;
    }

    public void setBonLivraisonClientLignesById(Collection<BonLivraisonClientLigne> bonLivraisonClientLignesById) {
        this.bonLivraisonClientLignesById = bonLivraisonClientLignesById;
    }
}
