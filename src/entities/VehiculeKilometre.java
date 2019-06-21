package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "vehicule_kilometre", schema = "ventury", catalog = "")
public class VehiculeKilometre {
    private long id;
    private Timestamp date;
    private Integer idVentury;
    private Integer kilometre;
    private Integer utilisateurId;
    private Integer vehiculeId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "idVentury")
    public Integer getIdVentury() {
        return idVentury;
    }

    public void setIdVentury(Integer idVentury) {
        this.idVentury = idVentury;
    }

    @Basic
    @Column(name = "kilometre")
    public Integer getKilometre() {
        return kilometre;
    }

    public void setKilometre(Integer kilometre) {
        this.kilometre = kilometre;
    }

    @Basic
    @Column(name = "utilisateur_id")
    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Basic
    @Column(name = "vehicule_id")
    public Integer getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(Integer vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehiculeKilometre that = (VehiculeKilometre) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(idVentury, that.idVentury) &&
                Objects.equals(kilometre, that.kilometre) &&
                Objects.equals(utilisateurId, that.utilisateurId) &&
                Objects.equals(vehiculeId, that.vehiculeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, idVentury, kilometre, utilisateurId, vehiculeId);
    }
}
