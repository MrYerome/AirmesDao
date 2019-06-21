package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Usertypes {
    private int typeId;
    private String typeLibelle;
    private Integer typeVersion;

    @Id
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "type_libelle")
    public String getTypeLibelle() {
        return typeLibelle;
    }

    public void setTypeLibelle(String typeLibelle) {
        this.typeLibelle = typeLibelle;
    }

    @Basic
    @Column(name = "type_version")
    public Integer getTypeVersion() {
        return typeVersion;
    }

    public void setTypeVersion(Integer typeVersion) {
        this.typeVersion = typeVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usertypes usertypes = (Usertypes) o;
        return typeId == usertypes.typeId &&
                Objects.equals(typeLibelle, usertypes.typeLibelle) &&
                Objects.equals(typeVersion, usertypes.typeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeLibelle, typeVersion);
    }
}
