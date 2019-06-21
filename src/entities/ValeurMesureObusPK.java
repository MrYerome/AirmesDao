package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ValeurMesureObusPK implements Serializable {
    private int interventionId;
    private int mesureId;
    private int obusId;

    @Column(name = "intervention_id")
    @Id
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Column(name = "mesure_id")
    @Id
    public int getMesureId() {
        return mesureId;
    }

    public void setMesureId(int mesureId) {
        this.mesureId = mesureId;
    }

    @Column(name = "obus_id")
    @Id
    public int getObusId() {
        return obusId;
    }

    public void setObusId(int obusId) {
        this.obusId = obusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurMesureObusPK that = (ValeurMesureObusPK) o;
        return interventionId == that.interventionId &&
                mesureId == that.mesureId &&
                obusId == that.obusId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, mesureId, obusId);
    }
}
