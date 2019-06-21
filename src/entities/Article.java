package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Article {
    private int id;
    private String code;
    private String nom;
    private String codeBarres;
    private String commentaire;
    private byte suspendu;
    private String photo;
    private String referenceFabricant;
    private Integer familleArticleId;
    private Integer typeArticleId;
    private FamilleArticle familleArticleByFamilleArticleId;
    private FamilleArticle familleArticleByFamilleArticleId_0;
    private TypeArticle typeArticleByTypeArticleId;
    private TypeArticle typeArticleByTypeArticleId_0;
    private ArticleConsommable articleConsommableById;
    private ArticleConsommable articleConsommableById_0;
    private Collection<ArticleFournisseur> articleFournisseursById;
    private Collection<CommandeArticle> commandeArticlesById;
    private Collection<Obus> obusesById;
    private Collection<ParcMateriel> parcMaterielsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Basic
    @Column(name = "famille_article_id")
    public Integer getFamilleArticleId() {
        return familleArticleId;
    }

    public void setFamilleArticleId(Integer familleArticleId) {
        this.familleArticleId = familleArticleId;
    }

    @Basic
    @Column(name = "type_article_id")
    public Integer getTypeArticleId() {
        return typeArticleId;
    }

    public void setTypeArticleId(Integer typeArticleId) {
        this.typeArticleId = typeArticleId;
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
                Objects.equals(referenceFabricant, article.referenceFabricant) &&
                Objects.equals(familleArticleId, article.familleArticleId) &&
                Objects.equals(typeArticleId, article.typeArticleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, nom, codeBarres, commentaire, suspendu, photo, referenceFabricant, familleArticleId, typeArticleId);
    }

    @ManyToOne
    @JoinColumn(name = "famille_article_id", referencedColumnName = "id")
    public FamilleArticle getFamilleArticleByFamilleArticleId() {
        return familleArticleByFamilleArticleId;
    }

    public void setFamilleArticleByFamilleArticleId(FamilleArticle familleArticleByFamilleArticleId) {
        this.familleArticleByFamilleArticleId = familleArticleByFamilleArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "famille_article_id", referencedColumnName = "id")
    public FamilleArticle getFamilleArticleByFamilleArticleId_0() {
        return familleArticleByFamilleArticleId_0;
    }

    public void setFamilleArticleByFamilleArticleId_0(FamilleArticle familleArticleByFamilleArticleId_0) {
        this.familleArticleByFamilleArticleId_0 = familleArticleByFamilleArticleId_0;
    }

    @ManyToOne
    @JoinColumn(name = "type_article_id", referencedColumnName = "id")
    public TypeArticle getTypeArticleByTypeArticleId() {
        return typeArticleByTypeArticleId;
    }

    public void setTypeArticleByTypeArticleId(TypeArticle typeArticleByTypeArticleId) {
        this.typeArticleByTypeArticleId = typeArticleByTypeArticleId;
    }

    @ManyToOne
    @JoinColumn(name = "type_article_id", referencedColumnName = "id")
    public TypeArticle getTypeArticleByTypeArticleId_0() {
        return typeArticleByTypeArticleId_0;
    }

    public void setTypeArticleByTypeArticleId_0(TypeArticle typeArticleByTypeArticleId_0) {
        this.typeArticleByTypeArticleId_0 = typeArticleByTypeArticleId_0;
    }

    @OneToOne(mappedBy = "articleById")
    public ArticleConsommable getArticleConsommableById() {
        return articleConsommableById;
    }

    public void setArticleConsommableById(ArticleConsommable articleConsommableById) {
        this.articleConsommableById = articleConsommableById;
    }

    @OneToOne(mappedBy = "articleById_0")
    public ArticleConsommable getArticleConsommableById_0() {
        return articleConsommableById_0;
    }

    public void setArticleConsommableById_0(ArticleConsommable articleConsommableById_0) {
        this.articleConsommableById_0 = articleConsommableById_0;
    }

    @OneToMany(mappedBy = "articleByArticleId")
    public Collection<ArticleFournisseur> getArticleFournisseursById() {
        return articleFournisseursById;
    }

    public void setArticleFournisseursById(Collection<ArticleFournisseur> articleFournisseursById) {
        this.articleFournisseursById = articleFournisseursById;
    }

    @OneToMany(mappedBy = "articleByArticleId")
    public Collection<CommandeArticle> getCommandeArticlesById() {
        return commandeArticlesById;
    }

    public void setCommandeArticlesById(Collection<CommandeArticle> commandeArticlesById) {
        this.commandeArticlesById = commandeArticlesById;
    }

    @OneToMany(mappedBy = "articleByArticleId")
    public Collection<Obus> getObusesById() {
        return obusesById;
    }

    public void setObusesById(Collection<Obus> obusesById) {
        this.obusesById = obusesById;
    }

    @OneToMany(mappedBy = "articleByArticleId")
    public Collection<ParcMateriel> getParcMaterielsById() {
        return parcMaterielsById;
    }

    public void setParcMaterielsById(Collection<ParcMateriel> parcMaterielsById) {
        this.parcMaterielsById = parcMaterielsById;
    }
}
