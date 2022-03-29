package com.app.ipau.problematicas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ipau.commons.problematicas.models.entities.Problematica1;
import com.app.ipau.problematicas.models.services.IProblematicas;

@RestController
public class ProblematicaController {
	
	@Autowired
	private IProblematicas problematicasServices;
	
	@GetMapping("/listarProblematicas")
	public List<Problematica1> listarProblematicas(){
		return problematicasServices.findAll();
	}

}
