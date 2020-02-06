package com.app.ipau.problematicas.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.ipau.commons.problematicas.models.entities.Problematica1;

@RepositoryRestResource(path = "problematicas1")
public interface ProblematicaDao extends PagingAndSortingRepository <Problematica1, Integer> {

}
