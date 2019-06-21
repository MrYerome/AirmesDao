package com.airsante.airmes.config;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import javax.persistence.metamodel.Type;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.airsante.airmes.entities.Adresse;
import com.airsante.airmes.entities.InlinePatient;;
/**
 * @author jerome.vinet
 *@since 2019.02.20
 * Permet de récupérer les id de toutes les classes, sinon jpa ne le fait pas * 
 */
@SuppressWarnings("deprecation")
@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
    	 /* Permet de récupérer les id de toutes les classes, sinon jpa ne le fait pas */ 
    	repositoryRestConfiguration.exposeIdsFor(
                entityManager.getMetamodel().getEntities().stream()
                .map(Type::getJavaType)
                .toArray(Class[]::new));
    	 /*Applique les projections aux requêtes de type user/{id}*/
//    	repositoryRestConfiguration.getProjectionConfiguration()
//        .addProjection(InlinePatient.class);
        
        
    }
}
