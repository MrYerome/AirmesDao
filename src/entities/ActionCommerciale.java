package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "action_commerciale", schema = "ventury", catalog = "")
public class ActionCommerciale {
    private long id;
    private String action;
    private Timestamp date;
    private Integer idVentury;
    private long prescripteurId;
    private int utilisateurId;
    private Utilisateur utilisateurByUtilisateurId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
    @Column(name = "prescripteur_id")
    public long getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(long prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Basic
    @Column(name = "utilisateur_id")
    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionCommerciale that = (ActionCommerciale) o;
        return id == that.id &&
                prescripteurId == that.prescripteurId &&
                utilisateurId == that.utilisateurId &&
                Objects.equals(action, that.action) &&
                Objects.equals(date, that.date) &&
                Objects.equals(idVentury, that.idVentury);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, action, date, idVentury, prescripteurId, utilisateurId);
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id", nullable = false)
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }
}
