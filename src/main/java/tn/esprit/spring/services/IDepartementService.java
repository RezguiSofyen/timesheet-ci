package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;


public interface IDepartementService {
	
	
	public List<Departement> getAllDepartements();
	public Departement ajoutDep(Departement d);
	public void deleteDepartementById(int depId);
	public Departement chercherDepartement(int id) ;

	public void suppriDepartementById(int depId);	
	

	
}
