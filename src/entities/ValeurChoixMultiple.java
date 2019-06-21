package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "valeur_choix_multiple", schema = "ventury", catalog = "")
public class ValeurChoixMultiple {
    private int id;
    private String label;
    private Integer position;
    private Integer mesureId;
    private Mesure mesureByMesureId;
    private Collection<ValeurMesure> valeurMesuresById;
    private Collection<ValeurMesureObus> valeurMesureObusesById;

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

    @Basic
    @Column(name = "mesure_id")
    public Integer getMesureId() {
        return mesureId;
    }

    public void setMesureId(Integer mesureId) {
        this.mesureId = mesureId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurChoixMultiple that = (ValeurChoixMultiple) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(position, that.position) &&
                Objects.equals(mesureId, that.mesureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, position, mesureId);
    }

    @ManyToOne
    @JoinColumn(name = "mesure_id", referencedColumnName = "id")
    public Mesure getMesureByMesureId() {
        return mesureByMesureId;
    }

    public void setMesureByMesureId(Mesure mesureByMesureId) {
        this.mesureByMesureId = mesureByMesureId;
    }

    @OneToMany(mappedBy = "valeurChoixMultipleByValeurChoixMultipleId")
    public Collection<ValeurMesure> getValeurMesuresById() {
        return valeurMesuresById;
    }

    public void setValeurMesuresById(Collection<ValeurMesure> valeurMesuresById) {
        this.valeurMesuresById = valeurMesuresById;
    }

    @OneToMany(mappedBy = "valeurChoixMultipleByValeurChoixMultipleId")
    public Collection<ValeurMesureObus> getValeurMesureObusesById() {
        return valeurMesureObusesById;
    }

    public void setValeurMesureObusesById(Collection<ValeurMesureObus> valeurMesureObusesById) {
        this.valeurMesureObusesById = valeurMesureObusesById;
    }
}
