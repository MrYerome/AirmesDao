package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "valeur_mesure_obus", schema = "ventury", catalog = "")
@IdClass(ValeurMesureObusPK.class)
public class ValeurMesureObus {
    private int interventionId;
    private int mesureId;
    private int obusId;
    private String valeur;
    private Integer valeurChoixMultipleId;
    private Intervention interventionByInterventionId;
    private Mesure mesureByMesureId;
    private Obus obusByObusId;
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
    @Column(name = "obus_id")
    public int getObusId() {
        return obusId;
    }

    public void setObusId(int obusId) {
        this.obusId = obusId;
    }

    @Basic
    @Column(name = "valeur")
    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Basic
    @Column(name = "valeur_choix_multiple_id")
    public Integer getValeurChoixMultipleId() {
        return valeurChoixMultipleId;
    }

    public void setValeurChoixMultipleId(Integer valeurChoixMultipleId) {
        this.valeurChoixMultipleId = valeurChoixMultipleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurMesureObus that = (ValeurMesureObus) o;
        return interventionId == that.interventionId &&
                mesureId == that.mesureId &&
                obusId == that.obusId &&
                Objects.equals(valeur, that.valeur) &&
                Objects.equals(valeurChoixMultipleId, that.valeurChoixMultipleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, mesureId, obusId, valeur, valeurChoixMultipleId);
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
    @JoinColumn(name = "obus_id", referencedColumnName = "id", nullable = false)
    public Obus getObusByObusId() {
        return obusByObusId;
    }

    public void setObusByObusId(Obus obusByObusId) {
        this.obusByObusId = obusByObusId;
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
