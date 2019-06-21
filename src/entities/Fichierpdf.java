package entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Fichierpdf {
    private int id;
    private String nom;
    private String url;
    private Byte extranet;
    private int interventionId;
    private byte[] fichier;
    private Intervention interventionByInterventionId;
    private Intervention interventionByInterventionId_0;

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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "extranet")
    public Byte getExtranet() {
        return extranet;
    }

    public void setExtranet(Byte extranet) {
        this.extranet = extranet;
    }

    @Basic
    @Column(name = "intervention_id")
    public int getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(int interventionId) {
        this.interventionId = interventionId;
    }

    @Basic
    @Column(name = "fichier")
    public byte[] getFichier() {
        return fichier;
    }

    public void setFichier(byte[] fichier) {
        this.fichier = fichier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fichierpdf that = (Fichierpdf) o;
        return id == that.id &&
                interventionId == that.interventionId &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(url, that.url) &&
                Objects.equals(extranet, that.extranet) &&
                Arrays.equals(fichier, that.fichier);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, nom, url, extranet, interventionId);
        result = 31 * result + Arrays.hashCode(fichier);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId() {
        return interventionByInterventionId;
    }

    public void setInterventionByInterventionId(Intervention interventionByInterventionId) {
        this.interventionByInterventionId = interventionByInterventionId;
    }

    @ManyToOne
    @JoinColumn(name = "intervention_id", referencedColumnName = "id", nullable = false)
    public Intervention getInterventionByInterventionId_0() {
        return interventionByInterventionId_0;
    }

    public void setInterventionByInterventionId_0(Intervention interventionByInterventionId_0) {
        this.interventionByInterventionId_0 = interventionByInterventionId_0;
    }
}
