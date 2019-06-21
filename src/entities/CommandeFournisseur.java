package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "commande_fournisseur", schema = "ventury", catalog = "")
public class CommandeFournisseur {
    private int id;
    private String commentaire;
    private Timestamp date;
    private Double montantHt;
    private Integer numero;
    private Integer agenceFacturationId;
    private Integer agenceLivraisonId;
    private Integer commandeFournisseurStatutId;
    private Integer fournisseurId;
    private Integer utilisateurId;
    private Collection<CommandeArticle> commandeArticlesById;
    private Agence agenceByAgenceFacturationId;
    private Agence agenceByAgenceLivraisonId;
    private CommandeFournisseurStatut commandeFournisseurStatutByCommandeFournisseurStatutId;
    private Fournisseur fournisseurByFournisseurId;
    private Utilisateur utilisateurByUtilisateurId;

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
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "montant_ht")
    public Double getMontantHt() {
        return montantHt;
    }

    public void setMontantHt(Double montantHt) {
        this.montantHt = montantHt;
    }

    @Basic
    @Column(name = "numero")
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Basic
    @Column(name = "agence_facturation_id")
    public Integer getAgenceFacturationId() {
        return agenceFacturationId;
    }

    public void setAgenceFacturationId(Integer agenceFacturationId) {
        this.agenceFacturationId = agenceFacturationId;
    }

    @Basic
    @Column(name = "agence_livraison_id")
    public Integer getAgenceLivraisonId() {
        return agenceLivraisonId;
    }

    public void setAgenceLivraisonId(Integer agenceLivraisonId) {
        this.agenceLivraisonId = agenceLivraisonId;
    }

    @Basic
    @Column(name = "commande_fournisseur_statut_id")
    public Integer getCommandeFournisseurStatutId() {
        return commandeFournisseurStatutId;
    }

    public void setCommandeFournisseurStatutId(Integer commandeFournisseurStatutId) {
        this.commandeFournisseurStatutId = commandeFournisseurStatutId;
    }

    @Basic
    @Column(name = "fournisseur_id")
    public Integer getFournisseurId() {
        return fournisseurId;
    }

    public void setFournisseurId(Integer fournisseurId) {
        this.fournisseurId = fournisseurId;
    }

    @Basic
    @Column(name = "utilisateur_id")
    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandeFournisseur that = (CommandeFournisseur) o;
        return id == that.id &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(date, that.date) &&
                Objects.equals(montantHt, that.montantHt) &&
                Objects.equals(numero, that.numero) &&
                Objects.equals(agenceFacturationId, that.agenceFacturationId) &&
                Objects.equals(agenceLivraisonId, that.agenceLivraisonId) &&
                Objects.equals(commandeFournisseurStatutId, that.commandeFournisseurStatutId) &&
                Objects.equals(fournisseurId, that.fournisseurId) &&
                Objects.equals(utilisateurId, that.utilisateurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, date, montantHt, numero, agenceFacturationId, agenceLivraisonId, commandeFournisseurStatutId, fournisseurId, utilisateurId);
    }

    @OneToMany(mappedBy = "commandeFournisseurByCommandeFournisseurId")
    public Collection<CommandeArticle> getCommandeArticlesById() {
        return commandeArticlesById;
    }

    public void setCommandeArticlesById(Collection<CommandeArticle> commandeArticlesById) {
        this.commandeArticlesById = commandeArticlesById;
    }

    @ManyToOne
    @JoinColumn(name = "agence_facturation_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceFacturationId() {
        return agenceByAgenceFacturationId;
    }

    public void setAgenceByAgenceFacturationId(Agence agenceByAgenceFacturationId) {
        this.agenceByAgenceFacturationId = agenceByAgenceFacturationId;
    }

    @ManyToOne
    @JoinColumn(name = "agence_livraison_id", referencedColumnName = "id")
    public Agence getAgenceByAgenceLivraisonId() {
        return agenceByAgenceLivraisonId;
    }

    public void setAgenceByAgenceLivraisonId(Agence agenceByAgenceLivraisonId) {
        this.agenceByAgenceLivraisonId = agenceByAgenceLivraisonId;
    }

    @ManyToOne
    @JoinColumn(name = "commande_fournisseur_statut_id", referencedColumnName = "id")
    public CommandeFournisseurStatut getCommandeFournisseurStatutByCommandeFournisseurStatutId() {
        return commandeFournisseurStatutByCommandeFournisseurStatutId;
    }

    public void setCommandeFournisseurStatutByCommandeFournisseurStatutId(CommandeFournisseurStatut commandeFournisseurStatutByCommandeFournisseurStatutId) {
        this.commandeFournisseurStatutByCommandeFournisseurStatutId = commandeFournisseurStatutByCommandeFournisseurStatutId;
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
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }
}
