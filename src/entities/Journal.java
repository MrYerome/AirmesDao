package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Journal {
    private int id;
    private String label;
    private Integer type;
    private Timestamp date;
    private Byte modeEnLigne;
    private String lieu;
    private Integer utilisateurId;
    private int niveauGravite;
    private Utilisateur utilisateurByUtilisateurId;

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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
    @Column(name = "mode_en_ligne")
    public Byte getModeEnLigne() {
        return modeEnLigne;
    }

    public void setModeEnLigne(Byte modeEnLigne) {
        this.modeEnLigne = modeEnLigne;
    }

    @Basic
    @Column(name = "lieu")
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
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
    @Column(name = "niveau_gravite")
    public int getNiveauGravite() {
        return niveauGravite;
    }

    public void setNiveauGravite(int niveauGravite) {
        this.niveauGravite = niveauGravite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Journal journal = (Journal) o;
        return id == journal.id &&
                niveauGravite == journal.niveauGravite &&
                Objects.equals(label, journal.label) &&
                Objects.equals(type, journal.type) &&
                Objects.equals(date, journal.date) &&
                Objects.equals(modeEnLigne, journal.modeEnLigne) &&
                Objects.equals(lieu, journal.lieu) &&
                Objects.equals(utilisateurId, journal.utilisateurId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, type, date, modeEnLigne, lieu, utilisateurId, niveauGravite);
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }
}
