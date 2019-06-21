package com.airsante.airmes.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
public class ValeurMesurePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long interventionId;
    private int mesureId;
    private int parcMaterielId;

    @Column(name = "intervention_id")
    @Id
    public Long getInterventionId() {
        return interventionId;
    }

    public void setInterventionId(Long interventionId) {
        this.interventionId = interventionId;
    }

    @Column(name = "mesure_id")
    @Id
    public int getMesureId() {
        return mesureId;
    }

    public void setMesureId(int mesureId) {
        this.mesureId = mesureId;
    }

    @Column(name = "parc_materiel_id")
    @Id
    public int getParcMaterielId() {
        return parcMaterielId;
    }

    public void setParcMaterielId(int parcMaterielId) {
        this.parcMaterielId = parcMaterielId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValeurMesurePK that = (ValeurMesurePK) o;
        return interventionId == that.interventionId &&
                mesureId == that.mesureId &&
                parcMaterielId == that.parcMaterielId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(interventionId, mesureId, parcMaterielId);
    }
}
