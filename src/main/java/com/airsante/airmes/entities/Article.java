package com.airsante.airmes.entities;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
public class Article {
    private Long id;
    private String code;
    private String nom;
    private String codeBarres;
    private String commentaire;
    private byte suspendu;
    private String photo;
    private String referenceFabricant;

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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "code_barres")
    public String getCodeBarres() {
        return codeBarres;
    }

    public void setCodeBarres(String codeBarres) {
        this.codeBarres = codeBarres;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "suspendu")
    public byte getSuspendu() {
        return suspendu;
    }

    public void setSuspendu(byte suspendu) {
        this.suspendu = suspendu;
    }

    @Basic
    @Column(name = "photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "reference_fabricant")
    public String getReferenceFabricant() {
        return referenceFabricant;
    }

    public void setReferenceFabricant(String referenceFabricant) {
        this.referenceFabricant = referenceFabricant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return id == article.id &&
                suspendu == article.suspendu &&
                Objects.equals(code, article.code) &&
                Objects.equals(nom, article.nom) &&
                Objects.equals(codeBarres, article.codeBarres) &&
                Objects.equals(commentaire, article.commentaire) &&
                Objects.equals(photo, article.photo) &&
                Objects.equals(referenceFabricant, article.referenceFabricant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nom, codeBarres, commentaire, suspendu, photo, referenceFabricant);
    }
}
