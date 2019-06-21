package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MedecinPrescripteurPK implements Serializable {
    private int medecinId;
    private int prescripteurId;

    @Column(name = "medecin_id")
    @Id
    public int getMedecinId() {
        return medecinId;
    }

    public void setMedecinId(int medecinId) {
        this.medecinId = medecinId;
    }

    @Column(name = "prescripteur_id")
    @Id
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
        MedecinPrescripteurPK that = (MedecinPrescripteurPK) o;
        return medecinId == that.medecinId &&
                prescripteurId == that.prescripteurId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medecinId, prescripteurId);
    }
}
