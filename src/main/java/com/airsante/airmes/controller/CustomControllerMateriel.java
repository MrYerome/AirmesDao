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
public class CustomControllerMateriel {

    @Autowired
    private EntityManager manager;



    /**
     * Requête native pour récupérer le parc_materiel_patient d'un patient
     */
    private String listePmp = "SELECT pmp.id " +
            "FROM parc_materiel_patient pmp " +
            "LEFT JOIN parc_materiel pm ON pmp.parc_materiel_id = pm.id " +
            "LEFT JOIN article art on art.id = pm.id " +
            "LEFT JOIN famille_article fa ON fa.id = art.famille_article_id " +
            "WHERE  pmp.patient_id =:param " +
            "and date_reprise is NULL " +
            "and (fa.id = 1 OR fa.id=3 OR fa.id =4 OR fa.id is NULL) " +
            "ORDER BY pmp.date_livraison asc  ";


    /**
     * Liste de TOUS les matériels par patient par prescripteur
     * @param param
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "api/CustomControllerMateriel/listePmpByIdPatient", method = RequestMethod.GET)
    public List<ListeId> getListPmpByIdPatient(
            @RequestParam("param") int param)
            throws IOException
    {
        System.out.println(listePmp);
        List<ListeId> listPmpPatient = (List<ListeId>) manager.createNativeQuery(listePmp)
                .setParameter("param", param )
                .unwrap(org.hibernate.query.Query.class)
                                .setResultTransformer(new AliasToBeanResultTransformer(ListeId.class))
                .list();

        System.out.println(listPmpPatient);
        return listPmpPatient;
    }


}
