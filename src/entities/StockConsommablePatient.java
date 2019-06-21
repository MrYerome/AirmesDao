package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "stock_consommable_patient", schema = "ventury", catalog = "")
public class StockConsommablePatient {
    private int id;
    private int articleConsommableId;
    private int patientId;
    private Integer dossierId;
    private int quantite;
    private Date dateLivraison;
    private int interventionId;
    private ArticleConsommable articleConsommableByArticleConsommableId;
    private Patient patientByPatientId;
    private Dossier dossierByDossierId;
    private Intervention interventionByInterventionId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "article_consommable_id")
    public int getArticleConsommableId() {
        return articleConsommableId;
    }

    public void setArticleConsommableId(int articleConsommableId) {
        this.articleConsommableId = articleConsommableId;
    }

    @Basic
    @Column(name = "patient_id")
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "dossier_id")
    public Integer getDossierId() {
        return dossierId;
    }

    public void setDossierId(Integer dossierId) {
        this.dossierId = dossierId;
    }

    @Basic
    @Column(name = "quantite")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "date_livraison")
    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Basic
    @Column(name = "intervention_id")
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockConsommablePatient that = (StockConsommablePatient) o;
        return id == that.id &&
                articleConsommableId == that.articleConsommableId &&
                patientId == that.patientId &&
                quantite == that.quantite &&
                interventionId == that.interventionId &&
                Objects.equals(dossierId, that.dossierId) &&
                Objects.equals(dateLivraison, that.dateLivraison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, articleConsommableId, patientId, dossierId, quantite, dateLivraison, interventionId);
    }

    @ManyToOne
    @JoinColumn(name = "article_consommable_id", referencedColumnName = "id", nullable = false)
    public ArticleConsommable getArticleConsommableByArticleConsommableId() {
        return articleConsommableByArticleConsommableId;
    }

    public void setArticleConsommableByArticleConsommableId(ArticleConsommable articleConsommableByArticleConsommableId) {
        this.articleConsommableByArticleConsommableId = articleConsommableByArticleConsommableId;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id", nullable = false)
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "dossier_id", referencedColumnName = "id")
    public Dossier getDossierByDossierId() {
        return dossierByDossierId;
    }

    public void setDossierByDossierId(Dossier dossierByDossierId) {
        this.dossierByDossierId = dossierByDossierId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
