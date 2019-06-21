package com.airsante.airmes.repository;


import com.airsante.airmes.entities.Personne;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;



/**
 * Interface générique qui doit remplacer toutes les interfaces
 * @author jerome.vinet
 *@since : 2019.04.03
 */
@NoRepositoryBean
@Repository
//@RepositoryRestResource(collectionResourceRel = "agence", path = "agence")
public interface GenericRepo<T, ID extends Serializable> extends CrudRepository<T, ID> {

  public List<T> findByNamedQuery( String name );
  public List<T> findByNamedQueryAndParams( String name, Map<String, Object> params );
  public T findOneByNamedQuery( String name );
  public T findOneByNamedQueryAndParams( String name, Map<String, Object> params );
}