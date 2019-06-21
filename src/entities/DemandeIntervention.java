package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "demande_intervention", schema = "ventury", catalog = "")
public class DemandeIntervention {
    private int id;
    private Integer typeId;
    private Integer domaineId;
    private int prescripteurId;
    private Integer patientId;
    private Integer utilisateurId;
    private Timestamp dateDemande;
    private String pathologie;
    private String commentaire;
    private Timestamp dateTraitementInterv;
    private String reponse;
    private Timestamp dateLectureReponse;
    private TypeDemandeIntervention typeDemandeInterventionByTypeId;
    private TypeDemandeIntervention typeDemandeInterventionByTypeId_0;
    private Domaine domaineByDomaineId;
    private Domaine domaineByDomaineId_0;
    private Prescripteur prescripteurByPrescripteurId;
    private Prescripteur prescripteurByPrescripteurId_0;
    private Patient patientByPatientId;
    private Patient patientByPatientId_0;
    private Utilisateur utilisateurByUtilisateurId;
    private Utilisateur utilisateurByUtilisateurId_0;
    private Collection<ValeurReglage> valeurReglagesById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_id")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "domaine_id")
    public Integer getDomaineId() {
        return domaineId;
    }

    public void setDomaineId(Integer domaineId) {
        this.domaineId = domaineId;
    }

    @Basic
    @Column(name = "prescripteur_id")
    public int getPrescripteurId() {
        return prescripteurId;
    }

    public void setPrescripteurId(int prescripteurId) {
        this.prescripteurId = prescripteurId;
    }

    @Basic
    @Column(name = "patient_id")
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    @Basic
    @Column(name = "utilisateur_id")
    public Integer getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(Integer utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    @Basic
    @Column(name = "date_demande")
    public Timestamp getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Timestamp dateDemande) {
        this.dateDemande = dateDemande;
    }

    @Basic
    @Column(name = "pathologie")
    public String getPathologie() {
        return pathologie;
    }

    public void setPathologie(String pathologie) {
        this.pathologie = pathologie;
    }

    @Basic
    @Column(name = "commentaire")
    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Basic
    @Column(name = "date_traitement_interv")
    public Timestamp getDateTraitementInterv() {
        return dateTraitementInterv;
    }

    public void setDateTraitementInterv(Timestamp dateTraitementInterv) {
        this.dateTraitementInterv = dateTraitementInterv;
    }

    @Basic
    @Column(name = "reponse")
    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    @Basic
    @Column(name = "date_lecture_reponse")
    public Timestamp getDateLectureReponse() {
        return dateLectureReponse;
    }

    public void setDateLectureReponse(Timestamp dateLectureReponse) {
        this.dateLectureReponse = dateLectureReponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeIntervention that = (DemandeIntervention) o;
        return id == that.id &&
                prescripteurId == that.prescripteurId &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(domaineId, that.domaineId) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(utilisateurId, that.utilisateurId) &&
                Objects.equals(dateDemande, that.dateDemande) &&
                Objects.equals(pathologie, that.pathologie) &&
                Objects.equals(commentaire, that.commentaire) &&
                Objects.equals(dateTraitementInterv, that.dateTraitementInterv) &&
                Objects.equals(reponse, that.reponse) &&
                Objects.equals(dateLectureReponse, that.dateLectureReponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeId, domaineId, prescripteurId, patientId, utilisateurId, dateDemande, pathologie, commentaire, dateTraitementInterv, reponse, dateLectureReponse);
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    public TypeDemandeIntervention getTypeDemandeInterventionByTypeId() {
        return typeDemandeInterventionByTypeId;
    }

    public void setTypeDemandeInterventionByTypeId(TypeDemandeIntervention typeDemandeInterventionByTypeId) {
        this.typeDemandeInterventionByTypeId = typeDemandeInterventionByTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    public TypeDemandeIntervention getTypeDemandeInterventionByTypeId_0() {
        return typeDemandeInterventionByTypeId_0;
    }

    public void setTypeDemandeInterventionByTypeId_0(TypeDemandeIntervention typeDemandeInterventionByTypeId_0) {
        this.typeDemandeInterventionByTypeId_0 = typeDemandeInterventionByTypeId_0;
    }

    @ManyToOne
    @JoinColumn(name = "domaine_id", referencedColumnName = "id")
    public Domaine getDomaineByDomaineId() {
        return domaineByDomaineId;
    }

    public void setDomaineByDomaineId(Domaine domaineByDomaineId) {
        this.domaineByDomaineId = domaineByDomaineId;
    }

    @ManyToOne
    @JoinColumn(name = "domaine_id", referencedColumnName = "id")
    public Domaine getDomaineByDomaineId_0() {
        return domaineByDomaineId_0;
    }

    public void setDomaineByDomaineId_0(Domaine domaineByDomaineId_0) {
        this.domaineByDomaineId_0 = domaineByDomaineId_0;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurByPrescripteurId() {
        return prescripteurByPrescripteurId;
    }

    public void setPrescripteurByPrescripteurId(Prescripteur prescripteurByPrescripteurId) {
        this.prescripteurByPrescripteurId = prescripteurByPrescripteurId;
    }

    @ManyToOne
    @JoinColumn(name = "prescripteur_id", referencedColumnName = "id", nullable = false)
    public Prescripteur getPrescripteurByPrescripteurId_0() {
        return prescripteurByPrescripteurId_0;
    }

    public void setPrescripteurByPrescripteurId_0(Prescripteur prescripteurByPrescripteurId_0) {
        this.prescripteurByPrescripteurId_0 = prescripteurByPrescripteurId_0;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId_0() {
        return patientByPatientId_0;
    }

    public void setPatientByPatientId_0(Patient patientByPatientId_0) {
        this.patientByPatientId_0 = patientByPatientId_0;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId_0() {
        return utilisateurByUtilisateurId_0;
    }

    public void setUtilisateurByUtilisateurId_0(Utilisateur utilisateurByUtilisateurId_0) {
        this.utilisateurByUtilisateurId_0 = utilisateurByUtilisateurId_0;
    }

    @OneToMany(mappedBy = "demandeInterventionByDemandeId")
    public Collection<ValeurReglage> getValeurReglagesById() {
        return valeurReglagesById;
    }

    public void setValeurReglagesById(Collection<ValeurReglage> valeurReglagesById) {
        this.valeurReglagesById = valeurReglagesById;
    }
}
