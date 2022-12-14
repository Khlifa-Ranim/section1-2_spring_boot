package com.Ranim.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.Ranim.demo.entities.Cours;
import com.Ranim.demo.entities.Professeur;

@RepositoryRestResource(path = "rest")

@Repository
public interface ProfesseurRepository  extends JpaRepository<Professeur, Long>  {
	
	List<Professeur> findByCin(int cin);

	/*
	@Query("select p from Professeur p, Cours c where p.Cours.idCours = c.idCours and c.nomCours like %:nomCours%")
	List<Professeur> findByNomCours(@Param("nomCours") String nomCours);*/
	
	
/*	Professeur getProfesseur(Long id);*/
    List<Professeur> findByNomProf(String nom);
	
	List<Professeur> findByNomProfContains(String nom); 
	
	/*@Query("select p from Professeur p where p.nomProf like %?1 and p.CIN >?2")
	List<Professeur> findByCIN (String nom, int CIN);*/

	
	/*@Query("select p from Professeur p where p.nomProf like %:nom and p.CIN  > :cin")
	List<Professeur> findByCIN  (@Param("nom") String nom,@Param("cin") int cin);*/
	
	@Query("select p from Professeur p where p.Cours = ?1")
	List<Professeur> findByCours (Cours Cours);
	
	
	/*List<Professeur> findByCoursIdCours(int id);*/
	
	List<Professeur> findByOrderByNomProfAsc();
	
	@Query("select p from Professeur p order by p.nomProf ASC, p.cin DESC")
	List<Professeur> trierProfesseursNomCours ();



	
	

}
