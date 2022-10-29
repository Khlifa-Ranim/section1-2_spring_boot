package com.Ranim.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.entities.Professeur;
import com.Ranim.demo.repos.CoursRepository;
import com.Ranim.demo.repos.ProfesseurRepository;



@Service
public class ProfesseurServiceImpl  implements ProfesseurService {

	@Autowired
	ProfesseurRepository ProfesseurRepository ;
	@Autowired
	CoursRepository CoursRepository ;
	
	
	@Override
	public Professeur updateProfesseur(Professeur p) {
	return ProfesseurRepository.save(p);
	}
	
	@Override
	public void deleteProfesseur(Professeur p) {
	ProfesseurRepository.delete(p);
	}
	 @Override
	public void deleteProfesseurById(Long id) {
	ProfesseurRepository.deleteById(id);
	}
	@Override
	public Professeur getProfesseur(Long id) {
	return ProfesseurRepository.findById(id).get();
	}
	@Override
	public List<Professeur> getAllProfesseurs() {
	return ProfesseurRepository.findAll();
	}
	@Override
	public Page<Professeur> getAllProfesseursParPage(int page, int size) {
		return ProfesseurRepository.findAll(PageRequest.of(page, size));

	}
	@Override
	public Professeur saveProfesseur(Professeur p) {
		return ProfesseurRepository.save(p);
	}	
	@Override
	public List<Cours> getAllCours() {
		return CoursRepository.findAll() ;
	}
	/*@Override
	public List<Professeur> findByNomCours(String nomCours) {
		return ProfesseurRepository.findByNomCours(nomCours);
	}*/

	@Override
	public List<Professeur> findByNomProf(String nom) {
		
		return ProfesseurRepository.findByNomProf(nom);
	}

	@Override
	public List<Professeur> findByNomProfContains(String nom) {
		
		return ProfesseurRepository.findByNomProfContains(nom);
	}
	

    

	@Override
	public List<Professeur> findByCours(Cours Cours) {
		
		return ProfesseurRepository.findByCours(Cours);
	}

	/*@Override
	public List<Professeur> findByCoursIdCours(Long id) {
		
		return ProfesseurRepository.findByCoursIdCours(id);
	}

	@Override
	public List<Professeur> findByOrderByNomProfAsc() {
		
		return ProfesseurRepository.findByOrderByNomProfAsc() ;
	}*/

	@Override
	public List<Professeur> trierProfesseursNomCours() {
		
		return ProfesseurRepository.trierProfesseursNomCours();
	}

	@Override
	public List<Professeur> findByNomCours(String nomCours) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Professeur> findByCIN(String nom, Double cin) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Professeur> findByCoursIdCours(int id) {
		// TODO Auto-generated method stub
		return ProfesseurRepository.findByCoursIdCours(id) ;
	}
*/



}

