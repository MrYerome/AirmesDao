package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dossier_client", schema = "ventury", catalog = "")
public class DossierClient {
    private int id;
    private Dossier dossierById;
    private Dossier dossierById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DossierClient that = (DossierClient) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Dossier getDossierById() {
        return dossierById;
    }

    public void setDossierById(Dossier dossierById) {
        this.dossierById = dossierById;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Dossier getDossierById_0() {
        return dossierById_0;
    }

    public void setDossierById_0(Dossier dossierById_0) {
        this.dossierById_0 = dossierById_0;
    }
}
