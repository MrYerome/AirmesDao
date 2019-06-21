package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "log_transfert", schema = "ventury", catalog = "")
public class LogTransfert {
    private int id;
    private Integer ancienId;
    private Timestamp date;
    private Integer nouvelId;
    private String type;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ancien_id")
    public Integer getAncienId() {
        return ancienId;
    }

    public void setAncienId(Integer ancienId) {
        this.ancienId = ancienId;
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
    @Column(name = "nouvel_id")
    public Integer getNouvelId() {
        return nouvelId;
    }

    public void setNouvelId(Integer nouvelId) {
        this.nouvelId = nouvelId;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogTransfert that = (LogTransfert) o;
        return id == that.id &&
                Objects.equals(ancienId, that.ancienId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(nouvelId, that.nouvelId) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ancienId, date, nouvelId, type);
    }
}
