package com.airsante.airmes;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.ToListResultTransformer;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airsante.airmes.entities.PatientsListAccueilCustom;

@Controller
@RunWith(SpringRunner.class)
@SpringBootTest
public class AirmesApplicationTests {

	@PersistenceContext
	EntityManager manager;
//	@Resource
//	private UserTransaction utx; 
	
	@Test
	public void executeQueries() throws Exception, IOException {


		String getListPatientsAccueil = "select pa.id as id,  pe.nom as nom, pe.prenom as prenom, ad.ville as ville, pa.numero_ss as numeroSecu, pa.date_installation as dateInstallation,"
				+ " MAX(inte.date_realisation) as dateDerniereInter , pa.date_prochaine_interv as dateProchaineInter, ptm.moyenneMois as moyenneMois, pa.statut_dossier as statutDossier"
				+ " from patientstomois ptm" + "	left join patient pa on pa.id= ptm.patient_id"
				+ " left join personne pe on pe.id= pa.id" + " left join adresse ad on ad.id = pe.adresse_id"
				+ " left outer join intervention inte on inte.patient_id = pa.id"
				+ " group by pa.id, pe.nom, pe.prenom LIMIT 50";

		// Solution simple pour un return avec une liste d'objets
		// List<Object> listPatientsAccueil =
		// manager.createNativeQuery(getListPatientsAccueil).getResultList();

		// Solution plus complexe où l'on retourne des PatientsCustoms, ce qui permet
		// d'avoir un label aux infos retournées. On utilise une méthode dite dépréciée
		// mais qui n'a pas été remplacée

		try {
			// utx.begin();
			List<PatientsListAccueilCustom> listPatientsAccueil = (List<PatientsListAccueilCustom>) manager
					.createNativeQuery(getListPatientsAccueil).unwrap(org.hibernate.query.Query.class)
					.setResultTransformer(new AliasToBeanResultTransformer(PatientsListAccueilCustom.class)).list();
			// utx.commit();
			for (PatientsListAccueilCustom patient : listPatientsAccueil) {
				System.out.println(patient.getNom());
			}
			assertEquals(50, listPatientsAccueil.size());

		} catch (Exception e){
			System.out.println(e.toString());
		} finally

		{
			assertEquals(100, 100);
		}

	}

}
