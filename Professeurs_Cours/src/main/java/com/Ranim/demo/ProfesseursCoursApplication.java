package com.Ranim.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.Ranim.demo.entities.Professeur;

@SpringBootApplication
public class ProfesseursCoursApplication implements CommandLineRunner {

	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	
	public static void main(String[] args) {
		SpringApplication.run(ProfesseursCoursApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Professeur.class);
		
	}

	
	/*@Override
	public void run(String... args) throws Exception {
		
	/*ProfesseurService.saveProfesseur(new Professeur("bondek","bahi",1465011,"boundek@gmail.com",new Date()));
	ProfesseurService.saveProfesseur(new Professeur("hamdi","mahdi",1465081,"mahdi@gmail.com",new Date()));
	ProfesseurService.saveProfesseur(new Professeur("forat","fourati",1460181,"fourat@gmail.com",new Date()));


}*/
}
