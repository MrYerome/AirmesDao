package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "valeur_choix_multiple", schema = "ventury", catalog = "")
public class ValeurChoixMultiple {
    private int id;
    private String label;
    private Integer position;
    private Mesure mesureByMesureId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "position")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurChoixMultiple that = (ValeurChoixMultiple) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, position);
    }

    @ManyToOne
    @JoinColumn(name = "mesure_id", referencedColumnName = "id")
    public Mesure getMesureByMesureId() {
        return mesureByMesureId;
    }

    public void setMesureByMesureId(Mesure mesureByMesureId) {
        this.mesureByMesureId = mesureByMesureId;
    }
}
