package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medecin_prescripteur", schema = "ventury", catalog = "")
@IdClass(MedecinPrescripteurPK.class)
public class MedecinPrescripteur {
    private int medecinId;
    private int prescripteurId;
    private Medecin medecinByMedecinId;
    private Medecin medecinByMedecinId_0;
    private Prescripteur prescripteurByPrescripteurId;
    private Prescripteur prescripteurByPrescripteurId_0;

    @Id
    @Column(name = "medecin_id")
    public int getMedecinId() {
        return medecinId;
    }

    public void setMedecinId(int medecinId) {
        this.medecinId = medecinId;
    }

    @Id
    @Column(name = "prescripteur_id")
    public int getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(int prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedecinPrescripteur that = (MedecinPrescripteur) o;
        return medecinId == that.medecinId &&
                prescripteurId == that.prescripteurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medecinId, prescripteurId);
    }

    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "id", nullable = false)
    public Medecin getMedecinByMedecinId() {
        return medecinByMedecinId;
    }

    public void setMedecinByMedecinId(Medecin medecinByMedecinId) {
        this.medecinByMedecinId = medecinByMedecinId;
    }

    @ManyToOne
    @JoinColumn(name = "medecin_id", referencedColumnName = "id", nullable = false)
    public Medecin getMedecinByMedecinId_0() {
        return medecinByMedecinId_0;
    }

    public void setMedecinByMedecinId_0(Medecin medecinByMedecinId_0) {
        this.medecinByMedecinId_0 = medecinByMedecinId_0;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurByPrescripteurId() {
        return prescripteurByPrescripteurId;
    }

    public void setPrescripteurByPrescripteurId(Prescripteur prescripteurByPrescripteurId) {
        this.prescripteurByPrescripteurId = prescripteurByPrescripteurId;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurByPrescripteurId_0() {
        return prescripteurByPrescripteurId_0;
    }

    public void setPrescripteurByPrescripteurId_0(Prescripteur prescripteurByPrescripteurId_0) {
        this.prescripteurByPrescripteurId_0 = prescripteurByPrescripteurId_0;
    }
}
