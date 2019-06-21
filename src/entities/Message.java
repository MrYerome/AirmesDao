package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
public class Message {
    private int id;
    private int prescripteurId;
    private Integer patientId;
    private Integer utilisateurId;
    private String objet;
    private String pieceJointeNom;
    private String pieceJointeType;
    private byte[] pieceJointe;
    private Timestamp dateCreation;
    private Timestamp dateTraitement;
    private String message;
    private String reponse;
    private Timestamp dateLectureReponse;
    private Prescripteur prescripteurByPrescripteurId;
    private Patient patientByPatientId;
    private Utilisateur utilisateurByUtilisateurId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "objet")
    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    @Basic
    @Column(name = "piece_jointe_nom")
    public String getPieceJointeNom() {
        return pieceJointeNom;
    }

    public void setPieceJointeNom(String pieceJointeNom) {
        this.pieceJointeNom = pieceJointeNom;
    }

    @Basic
    @Column(name = "piece_jointe_type")
    public String getPieceJointeType() {
        return pieceJointeType;
    }

    public void setPieceJointeType(String pieceJointeType) {
        this.pieceJointeType = pieceJointeType;
    }

    @Basic
    @Column(name = "piece_jointe")
    public byte[] getPieceJointe() {
        return pieceJointe;
    }

    public void setPieceJointe(byte[] pieceJointe) {
        this.pieceJointe = pieceJointe;
    }

    @Basic
    @Column(name = "date_creation")
    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Basic
    @Column(name = "date_traitement")
    public Timestamp getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Timestamp dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        Message message1 = (Message) o;
        return id == message1.id &&
                prescripteurId == message1.prescripteurId &&
                Objects.equals(patientId, message1.patientId) &&
                Objects.equals(utilisateurId, message1.utilisateurId) &&
                Objects.equals(objet, message1.objet) &&
                Objects.equals(pieceJointeNom, message1.pieceJointeNom) &&
                Objects.equals(pieceJointeType, message1.pieceJointeType) &&
                Arrays.equals(pieceJointe, message1.pieceJointe) &&
                Objects.equals(dateCreation, message1.dateCreation) &&
                Objects.equals(dateTraitement, message1.dateTraitement) &&
                Objects.equals(message, message1.message) &&
                Objects.equals(reponse, message1.reponse) &&
                Objects.equals(dateLectureReponse, message1.dateLectureReponse);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, prescripteurId, patientId, utilisateurId, objet, pieceJointeNom, pieceJointeType, dateCreation, dateTraitement, message, reponse, dateLectureReponse);
        result = 31 * result + Arrays.hashCode(pieceJointe);
        return result;
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
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    public Patient getPatientByPatientId() {
        return patientByPatientId;
    }

    public void setPatientByPatientId(Patient patientByPatientId) {
        this.patientByPatientId = patientByPatientId;
    }

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    public Utilisateur getUtilisateurByUtilisateurId() {
        return utilisateurByUtilisateurId;
    }

    public void setUtilisateurByUtilisateurId(Utilisateur utilisateurByUtilisateurId) {
        this.utilisateurByUtilisateurId = utilisateurByUtilisateurId;
    }
}
