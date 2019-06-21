package entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "parc_materiel_prete_par_client", schema = "ventury", catalog = "")
public class ParcMaterielPreteParClient {
    private int id;
    private int parcMaterielId;
    private Integer etablissementId;
    private Integer prescripteurId;
    private Timestamp dateLivraison;
    private Timestamp dateReprise;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "etablissement_id")
    public Integer getEtablissementId() {
        return etablissementId;
    }

    public void setEtablissementId(Integer etablissementId) {
        this.etablissementId = etablissementId;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public Integer getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(Integer prescripteurId) {
        this.prescripteurId = prescripteurId;
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
    @Column(name = "date_reprise")
    public Timestamp getDateReprise() {
        return dateReprise;
    }

    public void setDateReprise(Timestamp dateReprise) {
        this.dateReprise = dateReprise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParcMaterielPreteParClient that = (ParcMaterielPreteParClient) o;
        return id == that.id &&
                parcMaterielId == that.parcMaterielId &&
                Objects.equals(etablissementId, that.etablissementId) &&
                Objects.equals(prescripteurId, that.prescripteurId) &&
                Objects.equals(dateLivraison, that.dateLivraison) &&
                Objects.equals(dateReprise, that.dateReprise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parcMaterielId, etablissementId, prescripteurId, dateLivraison, dateReprise);
    }
}
