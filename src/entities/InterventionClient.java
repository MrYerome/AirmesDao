package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "intervention_client", schema = "ventury", catalog = "")
public class InterventionClient {
    private int id;
    private Integer prescripteurClientId;
    private Intervention interventionById;
    private Prescripteur prescripteurByPrescripteurClientId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "prescripteur_client_id")
    public Integer getPrescripteurClientId() {
        return prescripteurClientId;
    }

    public void setPrescripteurClientId(Integer prescripteurClientId) {
        this.prescripteurClientId = prescripteurClientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InterventionClient that = (InterventionClient) o;
        return id == that.id &&
                Objects.equals(prescripteurClientId, that.prescripteurClientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, prescripteurClientId);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionById() {
        return interventionById;
    }

    public void setInterventionById(Intervention interventionById) {
        this.interventionById = interventionById;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_client_id", referencedColumnName = "id")
    public Prescripteur getPrescripteurByPrescripteurClientId() {
        return prescripteurByPrescripteurClientId;
    }

    public void setPrescripteurByPrescripteurClientId(Prescripteur prescripteurByPrescripteurClientId) {
        this.prescripteurByPrescripteurClientId = prescripteurByPrescripteurClientId;
    }
}
