package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Hospitalisation {
    private int id;
    private String commentaire;
    private Timestamp dateEntree;
    private Timestamp dateSortie;
    private Timestamp dateSuppr;
    private long patientId;

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
    @Column(name = "date_entree")
    public Timestamp getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Timestamp dateEntree) {
        this.dateEntree = dateEntree;
    }

    @Basic
    @Column(name = "date_sortie")
    public Timestamp getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Timestamp dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "patient_id")
    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospitalisation that = (Hospitalisation) o;
        return id == that.id &&
                patientId == that.patientId &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateEntree, that.dateEntree) &&
                Objects.equals(dateSortie, that.dateSortie) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, dateEntree, dateSortie, dateSuppr, patientId);
    }
}
