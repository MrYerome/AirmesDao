package com.airsante.airmes.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * @author jerome.vinet
 * @since 20190304
 */
@Entity
@Table(name = "type_article", schema = "ventury", catalog = "")
public class TypeArticle {
    private Long id;
    private String label;
    private Timestamp dateSuppr;

    @Id
	@JsonProperty(value = "dataId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
    @Column(name = "date_suppr")
    public Timestamp getDateSuppr() {
        return dateSuppr;
    }

    public void setDateSuppr(Timestamp dateSuppr) {
        this.dateSuppr = dateSuppr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeArticle that = (TypeArticle) o;
        return id == that.id &&
                Objects.equals(label, that.label) &&
                Objects.equals(dateSuppr, that.dateSuppr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, dateSuppr);
    }
}
