package com.Ranim.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.entities.Professeur;

public interface ProfesseurService {
	
	Professeur saveProfesseur(Professeur p);
	
	Professeur updateProfesseur(Professeur p);
	
	void deleteProfesseur(Professeur p);
	
	 void deleteProfesseurById(Long id);
	 
	Professeur getProfesseur(Long id);
	
	
	Page<Professeur> getAllProfesseursParPage(int page, int size);
	List<Professeur> getAllProfesseurs();
	List<Cours> getAllCours();
	List<Professeur> findByNomCours(String nomCours);
	List<Professeur> findByNomProf(String nom);
	List<Professeur> findByNomProfContains(String nom);
	List<Professeur> findByCIN (String nom, Double cin);
	List<Professeur> findByCours (Cours Cours);
	/*List<Professeur> findByCoursIdCours(long id);*/
	/*List<Professeur> findByOrderByNomProfAsc();*/
	List<Professeur> trierProfesseursNomCours();
}

