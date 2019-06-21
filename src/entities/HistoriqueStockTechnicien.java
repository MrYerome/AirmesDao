package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "historique_stock_technicien", schema = "ventury", catalog = "")
public class HistoriqueStockTechnicien {
    private long id;
    private Timestamp dateOperation;
    private byte entree;
    private Integer idVentury;
    private String operation;
    private int quantite;
    private Integer quantiteRestante;
    private Integer type;
    private int articleConsommableId;
    private Long technicienId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "entree")
    public byte getEntree() {
        return entree;
    }

    public void setEntree(byte entree) {
        this.entree = entree;
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
    @Column(name = "quantite")
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "quantite_restante")
    public Integer getQuantiteRestante() {
        return quantiteRestante;
    }

    public void setQuantiteRestante(Integer quantiteRestante) {
        this.quantiteRestante = quantiteRestante;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "technicien_id")
    public Long getTechnicienId() {
        return technicienId;
    }

    public void setTechnicienId(Long technicienId) {
        this.technicienId = technicienId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoriqueStockTechnicien that = (HistoriqueStockTechnicien) o;
        return id == that.id &&
                entree == that.entree &&
                quantite == that.quantite &&
                articleConsommableId == that.articleConsommableId &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(quantiteRestante, that.quantiteRestante) &&
                Objects.equals(type, that.type) &&
                Objects.equals(technicienId, that.technicienId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateOperation, entree, idVentury, operation, quantite, quantiteRestante, type, articleConsommableId, technicienId);
    }
}
