package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Reservoir {
    private int id;
    private String nom;
    private int agenceId;
    private Collection<LotOxygene> lotOxygenesById;
    private Agence agenceByAgenceId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "agence_id")
    public int getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(int agenceId) {
        this.agenceId = agenceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservoir reservoir = (Reservoir) o;
        return id == reservoir.id &&
                agenceId == reservoir.agenceId &&
                Objects.equals(nom, reservoir.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, agenceId);
    }

    @OneToMany(mappedBy = "reservoirByReservoirId")
    public Collection<LotOxygene> getLotOxygenesById() {
        return lotOxygenesById;
    }

    public void setLotOxygenesById(Collection<LotOxygene> lotOxygenesById) {
        this.lotOxygenesById = lotOxygenesById;
    }

    @ManyToOne
    @JoinColumn(name = "agence_id", referencedColumnName = "id", nullable = false)
    public Agence getAgenceByAgenceId() {
        return agenceByAgenceId;
    }

    public void setAgenceByAgenceId(Agence agenceByAgenceId) {
        this.agenceByAgenceId = agenceByAgenceId;
    }
}
