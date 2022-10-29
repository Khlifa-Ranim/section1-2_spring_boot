package com.Ranim.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProf", types = { Professeur.class })
public interface ProfesseurProjection {

	public String getNomProf();

}
