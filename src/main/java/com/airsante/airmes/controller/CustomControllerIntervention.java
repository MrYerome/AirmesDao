package com.airsante.airmes.controller;

import com.airsante.airmes.entities.ListeId;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.io.IOException;
import java.util.List;

@RestController
public class CustomControllerIntervention {

    @Autowired
    private EntityManager manager;



    /**
     * Requête native pour récupérer toutes les interventions d'un patient
     */
    private String listeInterventions = "SELECT inter.id FROM intervention inter " +
    " WHERE inter.patient_id =:param ORDER BY inter.id DESC";


    /**
     * Liste de TOUTES les id d'interventions par patient
     * @param param
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "api/CustomControllerIntervention/listeIdInterventionsByIdPatient", method = RequestMethod.GET)
    public List<ListeId> getListPmpByIdPatient(
            @RequestParam("param") int param)
            throws IOException
    {
        System.out.println(listeInterventions);
        List<ListeId> listPmpPatient = (List<ListeId>) manager.createNativeQuery(listeInterventions)
                .setParameter("param", param )
                .unwrap(org.hibernate.query.Query.class)
                .setResultTransformer(new AliasToBeanResultTransformer(ListeId.class))
                .list();

        System.out.println(listPmpPatient);
        return listPmpPatient;
    }


}
