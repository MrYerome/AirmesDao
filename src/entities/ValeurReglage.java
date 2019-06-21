package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "valeur_reglage", schema = "ventury", catalog = "")
@IdClass(ValeurReglagePK.class)
public class ValeurReglage {
    private int parametreId;
    private int demandeId;
    private String valeur;
    private ParametreDomaine parametreDomaineByParametreId;
    private DemandeIntervention demandeInterventionByDemandeId;

    @Id
    @Column(name = "parametre_id")
    public int getParametreId() {
        return parametreId;
    }

    public void setParametreId(int parametreId) {
        this.parametreId = parametreId;
    }

    @Id
    @Column(name = "demande_id")
    public int getDemandeId() {
        return demandeId;
    }

    public void setDemandeId(int demandeId) {
        this.demandeId = demandeId;
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
        ValeurReglage that = (ValeurReglage) o;
        return parametreId == that.parametreId &&
                demandeId == that.demandeId &&
                Objects.equals(valeur, that.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parametreId, demandeId, valeur);
    }

    @ManyToOne
    @JoinColumn(name = "parametre_id", referencedColumnName = "id", nullable = false)
    public ParametreDomaine getParametreDomaineByParametreId() {
        return parametreDomaineByParametreId;
    }

    public void setParametreDomaineByParametreId(ParametreDomaine parametreDomaineByParametreId) {
        this.parametreDomaineByParametreId = parametreDomaineByParametreId;
    }

    @ManyToOne
    @JoinColumn(name = "demande_id", referencedColumnName = "id", nullable = false)
    public DemandeIntervention getDemandeInterventionByDemandeId() {
        return demandeInterventionByDemandeId;
    }

    public void setDemandeInterventionByDemandeId(DemandeIntervention demandeInterventionByDemandeId) {
        this.demandeInterventionByDemandeId = demandeInterventionByDemandeId;
    }
}
