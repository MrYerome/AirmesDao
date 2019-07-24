package com.airsante.airmes.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * Classe qui permet de retourner un json sous forme de liste.
 * Fonctionne avec le CustomControllerMAteriel
 *
 * @author jerome.vinet
 * @since : 2019.03.12
 */

public class ListeId implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty(value = "dataId")
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
