package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Mesure {
    private int id;
    private String label;
    private String unite;
    private Integer position;
    private Integer typeMesure;
    private byte graphique;
    private Integer genre;
    private byte preRemplie;
    private Double minimum;
    private Double maximum;
    private Integer typeArticleId;
    private byte obligatoire;
    private Timestamp dateSuppr;
    private Timestamp dateAjout;
    private Timestamp dateRetrait;
    private TypeArticle typeArticleByTypeArticleId;
    private Collection<ValeurChoixMultiple> valeurChoixMultiplesById;
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
    @Column(name = "unite")
    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
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
    @Column(name = "type_mesure")
    public Integer getTypeMesure() {
        return typeMesure;
    }

    public void setTypeMesure(Integer typeMesure) {
        this.typeMesure = typeMesure;
    }

    @Basic
    @Column(name = "graphique")
    public byte getGraphique() {
        return graphique;
    }

    public void setGraphique(byte graphique) {
        this.graphique = graphique;
    }

    @Basic
    @Column(name = "genre")
    public Integer getGenre() {
        return genre;
    }

    public void setGenre(Integer genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "pre_remplie")
    public byte getPreRemplie() {
        return preRemplie;
    }

    public void setPreRemplie(byte preRemplie) {
        this.preRemplie = preRemplie;
    }

    @Basic
    @Column(name = "minimum")
    public Double getMinimum() {
        return minimum;
    }

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    @Basic
    @Column(name = "maximum")
    public Double getMaximum() {
        return maximum;
    }

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    @Basic
    @Column(name = "type_article_id")
    public Integer getTypeArticleId() {
        return typeArticleId;
    }

    public void setTypeArticleId(Integer typeArticleId) {
        this.typeArticleId = typeArticleId;
    }

    @Basic
    @Column(name = "obligatoire")
    public byte getObligatoire() {
        return obligatoire;
    }

    public void setObligatoire(byte obligatoire) {
        this.obligatoire = obligatoire;
    }

    @Basic
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Basic
    @Column(name = "date_ajout")
    public Timestamp getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Timestamp dateAjout) {
        this.dateAjout = dateAjout;
    }

    @Basic
    @Column(name = "date_retrait")
    public Timestamp getDateRetrait() {
        return dateRetrait;
    }

    public void setDateRetrait(Timestamp dateRetrait) {
        this.dateRetrait = dateRetrait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesure mesure = (Mesure) o;
        return id == mesure.id &&
                graphique == mesure.graphique &&
                preRemplie == mesure.preRemplie &&
                obligatoire == mesure.obligatoire &&
                Objects.equals(label, mesure.label) &&
                Objects.equals(unite, mesure.unite) &&
                Objects.equals(position, mesure.position) &&
                Objects.equals(typeMesure, mesure.typeMesure) &&
                Objects.equals(genre, mesure.genre) &&
                Objects.equals(minimum, mesure.minimum) &&
                Objects.equals(maximum, mesure.maximum) &&
                Objects.equals(typeArticleId, mesure.typeArticleId) &&
                Objects.equals(dateSuppr, mesure.dateSuppr) &&
                Objects.equals(dateAjout, mesure.dateAjout) &&
                Objects.equals(dateRetrait, mesure.dateRetrait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, unite, position, typeMesure, graphique, genre, preRemplie, minimum, maximum, typeArticleId, obligatoire, dateSuppr, dateAjout, dateRetrait);
    }

    @ManyToOne
    @JoinColumn(name = "type_article_id", referencedColumnName = "id")
    public TypeArticle getTypeArticleByTypeArticleId() {
        return typeArticleByTypeArticleId;
    }

    public void setTypeArticleByTypeArticleId(TypeArticle typeArticleByTypeArticleId) {
        this.typeArticleByTypeArticleId = typeArticleByTypeArticleId;
    }

    @OneToMany(mappedBy = "mesureByMesureId")
    public Collection<ValeurChoixMultiple> getValeurChoixMultiplesById() {
        return valeurChoixMultiplesById;
    }

    public void setValeurChoixMultiplesById(Collection<ValeurChoixMultiple> valeurChoixMultiplesById) {
        this.valeurChoixMultiplesById = valeurChoixMultiplesById;
    }

    @OneToMany(mappedBy = "mesureByMesureId")
    public Collection<ValeurMesure> getValeurMesuresById() {
        return valeurMesuresById;
    }

    public void setValeurMesuresById(Collection<ValeurMesure> valeurMesuresById) {
        this.valeurMesuresById = valeurMesuresById;
    }

    @OneToMany(mappedBy = "mesureByMesureId")
    public Collection<ValeurMesureObus> getValeurMesureObusesById() {
        return valeurMesureObusesById;
    }

    public void setValeurMesureObusesById(Collection<ValeurMesureObus> valeurMesureObusesById) {
        this.valeurMesureObusesById = valeurMesureObusesById;
    }
}
