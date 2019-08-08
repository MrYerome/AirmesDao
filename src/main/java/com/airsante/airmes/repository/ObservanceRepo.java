package com.airsante.airmes.repository;

import com.airsante.airmes.entities.InlineObservance;
import com.airsante.airmes.entities.ParcMaterielPatient;
import com.airsante.airmes.entities.ReleveObservancePatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
//TODO : voir comment faire pour récupérer données de plusieurs tables
// Exemple : liste de patients actifs

/**
 * @author jerome.vinet
 */
@Transactional
@RepositoryRestResource(collectionResourceRel = "releve_observance_patient", path = "releve_observance_patient", excerptProjection = InlineObservance.class)
public interface ObservanceRepo extends JpaRepository<ReleveObservancePatient, Long> {

    List<ReleveObservancePatient> findTop28ByPatientIdOrderByDateReleveDesc(@Param("id") Integer id);

    List<ReleveObservancePatient> findTopByPatientIdOrderByDateReleveDesc(@Param("id") Integer id);

    List<ReleveObservancePatient> findByPatientIdAndDateReleveBetween(
            @Param("id") Integer id,
            @Param("after") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date after,
            @Param("before") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date before);


    @Query("select rop from ReleveObservancePatient rop where rop.patientId = ?1 ORDER BY rop.dateReleve DESC")
    List<ReleveObservancePatient> findByIdPatient(Integer id);


}


