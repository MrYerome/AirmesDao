package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "livraison_oxygene", schema = "ventury", catalog = "")
@IdClass(LivraisonOxygenePK.class)
public class LivraisonOxygene {
    private long interventionId;
    private int parcMaterielId;
    private Byte ctrlBatterie;
    private Byte ctrlVisuelRsv;
    private Byte ctrlVisuelSortieO2;
    private Byte ctrlSystemeLimitationDebit;
    private String debitAttendu;
    private String debitMesure;

    @Id
    @Column(name = "intervention_id")
    public long getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(long interventionId) {
        this.interventionId = interventionId;
    }

    @Id
    @Column(name = "parc_materiel_id")
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Basic
    @Column(name = "ctrl_batterie")
    public Byte getCtrlBatterie() {
        return ctrlBatterie;
    }

    public void setCtrlBatterie(Byte ctrlBatterie) {
        this.ctrlBatterie = ctrlBatterie;
    }

    @Basic
    @Column(name = "ctrl_visuel_rsv")
    public Byte getCtrlVisuelRsv() {
        return ctrlVisuelRsv;
    }

    public void setCtrlVisuelRsv(Byte ctrlVisuelRsv) {
        this.ctrlVisuelRsv = ctrlVisuelRsv;
    }

    @Basic
    @Column(name = "ctrl_visuel_sortie_o2")
    public Byte getCtrlVisuelSortieO2() {
        return ctrlVisuelSortieO2;
    }

    public void setCtrlVisuelSortieO2(Byte ctrlVisuelSortieO2) {
        this.ctrlVisuelSortieO2 = ctrlVisuelSortieO2;
    }

    @Basic
    @Column(name = "ctrl_systeme_limitation_debit")
    public Byte getCtrlSystemeLimitationDebit() {
        return ctrlSystemeLimitationDebit;
    }

    public void setCtrlSystemeLimitationDebit(Byte ctrlSystemeLimitationDebit) {
        this.ctrlSystemeLimitationDebit = ctrlSystemeLimitationDebit;
    }

    @Basic
    @Column(name = "debit_attendu")
    public String getDebitAttendu() {
        return debitAttendu;
    }

    public void setDebitAttendu(String debitAttendu) {
        this.debitAttendu = debitAttendu;
    }

    @Basic
    @Column(name = "debit_mesure")
    public String getDebitMesure() {
        return debitMesure;
    }

    public void setDebitMesure(String debitMesure) {
        this.debitMesure = debitMesure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivraisonOxygene that = (LivraisonOxygene) o;
        return interventionId == that.interventionId &&
                parcMaterielId == that.parcMaterielId &&
                Objects.equals(ctrlBatterie, that.ctrlBatterie) &&
                Objects.equals(ctrlVisuelRsv, that.ctrlVisuelRsv) &&
                Objects.equals(ctrlVisuelSortieO2, that.ctrlVisuelSortieO2) &&
                Objects.equals(ctrlSystemeLimitationDebit, that.ctrlSystemeLimitationDebit) &&
                Objects.equals(debitAttendu, that.debitAttendu) &&
                Objects.equals(debitMesure, that.debitMesure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, parcMaterielId, ctrlBatterie, ctrlVisuelRsv, ctrlVisuelSortieO2, ctrlSystemeLimitationDebit, debitAttendu, debitMesure);
    }
}
