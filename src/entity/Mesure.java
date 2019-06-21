package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
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
    private byte obligatoire;
    private Timestamp dateSuppr;
    private Timestamp dateAjout;
    private Timestamp dateRetrait;

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
                Objects.equals(dateSuppr, mesure.dateSuppr) &&
                Objects.equals(dateAjout, mesure.dateAjout) &&
                Objects.equals(dateRetrait, mesure.dateRetrait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, unite, position, typeMesure, graphique, genre, preRemplie, minimum, maximum, obligatoire, dateSuppr, dateAjout, dateRetrait);
    }
}
