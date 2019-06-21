package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "historique_obus", schema = "ventury", catalog = "")
public class HistoriqueObus {
    private long id;
    private String commentaire;
    private Timestamp dateOperation;
    private Integer idVentury;
    private String operation;
    private Integer lotOxygeneObusId;
    private int obusId;
    private Long personneId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    @Column(name = "date_operation")
    public Timestamp getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Timestamp dateOperation) {
        this.dateOperation = dateOperation;
    }

    @Basic
    @Column(name = "idVentury")
    public Integer getIdVentury() {
        return idVentury;
    }

    public void setIdVentury(Integer idVentury) {
        this.idVentury = idVentury;
    }

    @Basic
    @Column(name = "operation")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "lot_oxygene_obus_id")
    public Integer getLotOxygeneObusId() {
        return lotOxygeneObusId;
    }

    public void setLotOxygeneObusId(Integer lotOxygeneObusId) {
        this.lotOxygeneObusId = lotOxygeneObusId;
    }

    @Basic
    @Column(name = "obus_id")
    public int getObusId() {
        return obusId;
    }

    public void setObusId(int obusId) {
        this.obusId = obusId;
    }

    @Basic
    @Column(name = "personne_id")
    public Long getPersonneId() {
        return personneId;
    }

    public void setPersonneId(Long personneId) {
        this.personneId = personneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoriqueObus that = (HistoriqueObus) o;
        return id == that.id &&
                obusId == that.obusId &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(lotOxygeneObusId, that.lotOxygeneObusId) &&
                Objects.equals(personneId, that.personneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentaire, dateOperation, idVentury, operation, lotOxygeneObusId, obusId, personneId);
    }
}
