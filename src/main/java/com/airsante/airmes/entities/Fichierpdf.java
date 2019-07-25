package com.airsante.airmes.entities;
import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Fichierpdf {
    private Long id;
    private String nom;
    private String url;
    private Byte extranet;
    private byte[] fichier;

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
