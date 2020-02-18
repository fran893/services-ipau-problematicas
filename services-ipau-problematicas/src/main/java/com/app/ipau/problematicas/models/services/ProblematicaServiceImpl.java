package com.app.ipau.problematicas.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.ipau.commons.problematicas.models.entities.Problematica1;
import com.app.ipau.problematicas.models.dao.ProblematicaDao;

@Service
public class ProblematicaServiceImpl implements IProblematicas {
	
	@Autowired
	private ProblematicaDao problematicaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Problematica1> findAll() {
		return (List<Problematica1>) problematicaDao.findAll();
	}

}
