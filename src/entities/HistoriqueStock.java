package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "historique_stock", schema = "ventury", catalog = "")
public class HistoriqueStock {
    private int id;
    private Integer patientId;
    private Integer technicienId;
    private int stockConsommableId;
    private Date dateOperation;
    private String libelleOperation;
    private int quantite;
    private Integer quantiteRestante;
    private byte entree;
    private Patient patientByPatientId;
    private Technicien technicienByTechnicienId;
    private StockConsommable stockConsommableByStockConsommableId;

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
    @Column(name = "stock_consommable_id")
    public int getStockConsommableId() {
        return stockConsommableId;
    }

    public void setStockConsommableId(int stockConsommableId) {
        this.stockConsommableId = stockConsommableId;
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
    @Column(name = "entree")
    public byte getEntree() {
        return entree;
    }

    public void setEntree(byte entree) {
        this.entree = entree;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoriqueStock that = (HistoriqueStock) o;
        return id == that.id &&
                stockConsommableId == that.stockConsommableId &&
                quantite == that.quantite &&
                entree == that.entree &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(technicienId, that.technicienId) &&
                Objects.equals(dateOperation, that.dateOperation) &&
                Objects.equals(libelleOperation, that.libelleOperation) &&
                Objects.equals(quantiteRestante, that.quantiteRestante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, technicienId, stockConsommableId, dateOperation, libelleOperation, quantite, quantiteRestante, entree);
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
    @JoinColumn(name = "stock_consommable_id", referencedColumnName = "id", nullable = false)
    public StockConsommable getStockConsommableByStockConsommableId() {
        return stockConsommableByStockConsommableId;
    }

    public void setStockConsommableByStockConsommableId(StockConsommable stockConsommableByStockConsommableId) {
        this.stockConsommableByStockConsommableId = stockConsommableByStockConsommableId;
    }
}
