package entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Gps {
    private int id;
    private String latitudeDecimale;
    private String longitudeDecimale;
    private String latitudeSexagesimale;
    private String longitudeSexagesimale;
    private Collection<Etablissement> etablissementsById;
    private Collection<Etablissement> etablissementsById_0;
    private Collection<Etablissement> etablissementsById_1;
    private Collection<Personne> personnesById;
    private Collection<Personne> personnesById_0;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "latitude_decimale")
    public String getLatitudeDecimale() {
        return latitudeDecimale;
    }

    public void setLatitudeDecimale(String latitudeDecimale) {
        this.latitudeDecimale = latitudeDecimale;
    }

    @Basic
    @Column(name = "longitude_decimale")
    public String getLongitudeDecimale() {
        return longitudeDecimale;
    }

    public void setLongitudeDecimale(String longitudeDecimale) {
        this.longitudeDecimale = longitudeDecimale;
    }

    @Basic
    @Column(name = "latitude_sexagesimale")
    public String getLatitudeSexagesimale() {
        return latitudeSexagesimale;
    }

    public void setLatitudeSexagesimale(String latitudeSexagesimale) {
        this.latitudeSexagesimale = latitudeSexagesimale;
    }

    @Basic
    @Column(name = "longitude_sexagesimale")
    public String getLongitudeSexagesimale() {
        return longitudeSexagesimale;
    }

    public void setLongitudeSexagesimale(String longitudeSexagesimale) {
        this.longitudeSexagesimale = longitudeSexagesimale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gps gps = (Gps) o;
        return id == gps.id &&
                Objects.equals(latitudeDecimale, gps.latitudeDecimale) &&
                Objects.equals(longitudeDecimale, gps.longitudeDecimale) &&
                Objects.equals(latitudeSexagesimale, gps.latitudeSexagesimale) &&
                Objects.equals(longitudeSexagesimale, gps.longitudeSexagesimale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, latitudeDecimale, longitudeDecimale, latitudeSexagesimale, longitudeSexagesimale);
    }

    @OneToMany(mappedBy = "gpsByGpsId")
    public Collection<Etablissement> getEtablissementsById() {
        return etablissementsById;
    }

    public void setEtablissementsById(Collection<Etablissement> etablissementsById) {
        this.etablissementsById = etablissementsById;
    }

    @OneToMany(mappedBy = "gpsByGpsId_0")
    public Collection<Etablissement> getEtablissementsById_0() {
        return etablissementsById_0;
    }

    public void setEtablissementsById_0(Collection<Etablissement> etablissementsById_0) {
        this.etablissementsById_0 = etablissementsById_0;
    }

    @OneToMany(mappedBy = "gpsByGpsId_1")
    public Collection<Etablissement> getEtablissementsById_1() {
        return etablissementsById_1;
    }

    public void setEtablissementsById_1(Collection<Etablissement> etablissementsById_1) {
        this.etablissementsById_1 = etablissementsById_1;
    }

    @OneToMany(mappedBy = "gpsByGpsId")
    public Collection<Personne> getPersonnesById() {
        return personnesById;
    }

    public void setPersonnesById(Collection<Personne> personnesById) {
        this.personnesById = personnesById;
    }

    @OneToMany(mappedBy = "gpsByGpsId_0")
    public Collection<Personne> getPersonnesById_0() {
        return personnesById_0;
    }

    public void setPersonnesById_0(Collection<Personne> personnesById_0) {
        this.personnesById_0 = personnesById_0;
    }
}
