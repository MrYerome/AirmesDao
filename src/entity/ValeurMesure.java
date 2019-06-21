package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "valeur_mesure", schema = "ventury", catalog = "")
@IdClass(ValeurMesurePK.class)
public class ValeurMesure {
    private int interventionId;
    private int mesureId;
    private int parcMaterielId;
    private String valeur;
    private Intervention interventionByInterventionId;
    private Mesure mesureByMesureId;
    private ParcMateriel parcMaterielByParcMaterielId;
    private ValeurChoixMultiple valeurChoixMultipleByValeurChoixMultipleId;

    @Id
    @Column(name = "intervention_id")
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Id
    @Column(name = "mesure_id")
    public int getMesureId() {
        return mesureId;
    }

    public void setMesureId(int mesureId) {
        this.mesureId = mesureId;
    }

    @Id
    @Column(name = "parc_materiel_id")
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Basic
    @Column(name = "valeur")
    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurMesure that = (ValeurMesure) o;
        return interventionId == that.interventionId &&
                mesureId == that.mesureId &&
                parcMaterielId == that.parcMaterielId &&
                Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, mesureId, parcMaterielId, valeur);
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }

    @ManyToOne
    @JoinColumn(name = "mesure_id", referencedColumnName = "id", nullable = false)
    public Mesure getMesureByMesureId() {
        return mesureByMesureId;
    }

    public void setMesureByMesureId(Mesure mesureByMesureId) {
        this.mesureByMesureId = mesureByMesureId;
    }

    @ManyToOne
    @JoinColumn(name = "parc_materiel_id", referencedColumnName = "id", nullable = false)
    public ParcMateriel getParcMaterielByParcMaterielId() {
        return parcMaterielByParcMaterielId;
    }

    public void setParcMaterielByParcMaterielId(ParcMateriel parcMaterielByParcMaterielId) {
        this.parcMaterielByParcMaterielId = parcMaterielByParcMaterielId;
    }

    @ManyToOne
    @JoinColumn(name = "valeur_choix_multiple_id", referencedColumnName = "id")
    public ValeurChoixMultiple getValeurChoixMultipleByValeurChoixMultipleId() {
        return valeurChoixMultipleByValeurChoixMultipleId;
    }

    public void setValeurChoixMultipleByValeurChoixMultipleId(ValeurChoixMultiple valeurChoixMultipleByValeurChoixMultipleId) {
        this.valeurChoixMultipleByValeurChoixMultipleId = valeurChoixMultipleByValeurChoixMultipleId;
    }
}
