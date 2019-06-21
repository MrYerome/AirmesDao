package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
@Table(name = "intervention_materiel_arrivee", schema = "ventury", catalog = "")
public class InterventionMaterielArrivee {
    private Long id;
    private Intervention interventionByInterventionId;

    @Id
	@JsonProperty(value = "dataId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionMaterielArrivee that = (InterventionMaterielArrivee) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }
}
