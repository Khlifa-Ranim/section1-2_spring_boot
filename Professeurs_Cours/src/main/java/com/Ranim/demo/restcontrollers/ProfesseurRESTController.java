package com.Ranim.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Ranim.demo.Service.ProfesseurService;
import com.Ranim.demo.entities.Professeur;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProfesseurRESTController {
	@Autowired
	
	ProfesseurService professeurService;
	
	@RequestMapping(method = RequestMethod.GET)
	
	public List<Professeur> getAllProduits() {
	return professeurService.getAllProfesseurs();
	}

	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Professeur getProfesseurById(@PathVariable("id") Long id) {
	return professeurService.getProfesseur(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Professeur createProduit(@RequestBody Professeur Professeur) {
	return professeurService.saveProfesseur(Professeur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Professeur updateProfesseur(@RequestBody Professeur Professeur) {
	return professeurService.updateProfesseur(Professeur);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProfesseur(@PathVariable("id") Long id)
	{
		professeurService.deleteProfesseurById(id);
	}

	
	/*@RequestMapping(value="/prodscat/{idCours}",method = RequestMethod.GET)
	public List<Professeur> getProduitsByIdCours(@PathVariable("idCours") Long id) {
	return professeurService.findByCoursIdCours(2);
	}*/

}
