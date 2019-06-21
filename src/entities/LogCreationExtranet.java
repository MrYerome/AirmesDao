package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "log_creation_extranet", schema = "ventury", catalog = "")
@IdClass(LogCreationExtranetPK.class)
public class LogCreationExtranet {
    private String type;
    private int id;

    @Id
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogCreationExtranet that = (LogCreationExtranet) o;
        return id == that.id &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id);
    }
}
