package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Fichierpdf {
    private int id;
    private String nom;
    private String url;
    private Byte extranet;
    private byte[] fichier;

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
                Objects.equals(nom, that.nom) &&
                Objects.equals(url, that.url) &&
                Objects.equals(extranet, that.extranet) &&
                Arrays.equals(fichier, that.fichier);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, nom, url, extranet);
        result = 31 * result + Arrays.hashCode(fichier);
        return result;
    }
}
