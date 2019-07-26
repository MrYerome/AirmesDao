package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Projection(name = "inlineObservance", types = { ReleveObservancePatient.class })
public interface InlineObservance {
    @JsonProperty(value = "dataId")
    public int getPatientId();
    public Date getDateReleve();
    public Integer getValeur();
    public BigDecimal getIah();
    public BigDecimal getFuites();

}