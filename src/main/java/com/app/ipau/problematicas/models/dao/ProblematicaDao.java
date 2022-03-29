package com.app.ipau.problematicas.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.ipau.commons.problematicas.models.entities.Problematica1;

public interface ProblematicaDao extends CrudRepository <Problematica1, Integer> {

}
