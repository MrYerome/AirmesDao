package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Candidatures {
    private int id;
    private Date refDate;
    private int refStageid;
    private int refUserid;
    private Offres offresByRefStageid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ref_date")
    public Date getRefDate() {
        return refDate;
    }

    public void setRefDate(Date refDate) {
        this.refDate = refDate;
    }

    @Basic
    @Column(name = "ref_stageid")
    public int getRefStageid() {
        return refStageid;
    }

    public void setRefStageid(int refStageid) {
        this.refStageid = refStageid;
    }

    @Basic
    @Column(name = "ref_userid")
    public int getRefUserid() {
        return refUserid;
    }

    public void setRefUserid(int refUserid) {
        this.refUserid = refUserid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidatures that = (Candidatures) o;
        return id == that.id &&
                refStageid == that.refStageid &&
                refUserid == that.refUserid &&
                Objects.equals(refDate, that.refDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refDate, refStageid, refUserid);
    }

    @ManyToOne
    @JoinColumn(name = "ref_stageid", referencedColumnName = "st_id", nullable = false)
    public Offres getOffresByRefStageid() {
        return offresByRefStageid;
    }

    public void setOffresByRefStageid(Offres offresByRefStageid) {
        this.offresByRefStageid = offresByRefStageid;
    }
}
