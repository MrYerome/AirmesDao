package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "historique_materiel", schema = "ventury", catalog = "")
public class HistoriqueMateriel {
    private int id;
    private Integer patientId;
    private Integer technicienId;
    private int parcMaterielId;
    private Date dateOperation;
    private String libelleOperation;
    private Date dateRetour;
    private String commentaire;
    private Patient patientByPatientId;
    private Technicien technicienByTechnicienId;
    private ParcMateriel parcMaterielByParcMaterielId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "patient_id")
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "technicien_id")
    public Integer getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(Integer technicienId) {
        this.technicienId = technicienId;
    }

    @Basic
    @Column(name = "parc_materiel_id")
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Basic
    @Column(name = "date_operation")
    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    @Basic
    @Column(name = "libelle_operation")
    public String getLibelleOperation() {
        return libelleOperation;
    }

    public void setLibelleOperation(String libelleOperation) {
        this.libelleOperation = libelleOperation;
    }

    @Basic
    @Column(name = "date_retour")
    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoriqueMateriel that = (HistoriqueMateriel) o;
        return id == that.id &&
                parcMaterielId == that.parcMaterielId &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(technicienId, that.technicienId) &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(libelleOperation, that.libelleOperation) &&
                Objects.equals(dateRetour, that.dateRetour) &&
                Objects.equals(commentaire, that.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, technicienId, parcMaterielId, dateOperation, libelleOperation, dateRetour, commentaire);
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "technicien_id", referencedColumnName = "id")
    public Technicien getTechnicienByTechnicienId() {
        return technicienByTechnicienId;
    }

    public void setTechnicienByTechnicienId(Technicien technicienByTechnicienId) {
        this.technicienByTechnicienId = technicienByTechnicienId;
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
    }
}
