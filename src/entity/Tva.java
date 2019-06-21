package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Tva {
    private int id;
    private Double taux;
    private String codeCompteVente;
    private String codeCompteAchat;
    private Byte actifParDefaut;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "taux")
    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    @Basic
    @Column(name = "code_compte_vente")
    public String getCodeCompteVente() {
        return codeCompteVente;
    }

    public void setCodeCompteVente(String codeCompteVente) {
        this.codeCompteVente = codeCompteVente;
    }

    @Basic
    @Column(name = "code_compte_achat")
    public String getCodeCompteAchat() {
        return codeCompteAchat;
    }

    public void setCodeCompteAchat(String codeCompteAchat) {
        this.codeCompteAchat = codeCompteAchat;
    }

    @Basic
    @Column(name = "actif_par_defaut")
    public Byte getActifParDefaut() {
        return actifParDefaut;
    }

    public void setActifParDefaut(Byte actifParDefaut) {
        this.actifParDefaut = actifParDefaut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tva tva = (Tva) o;
        return id == tva.id &&
                Objects.equals(taux, tva.taux) &&
                Objects.equals(codeCompteVente, tva.codeCompteVente) &&
                Objects.equals(codeCompteAchat, tva.codeCompteAchat) &&
                Objects.equals(actifParDefaut, tva.actifParDefaut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, taux, codeCompteVente, codeCompteAchat, actifParDefaut);
    }
}
