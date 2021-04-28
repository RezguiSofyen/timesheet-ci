package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Entreprise;


public interface IEntrepriseService {
	
	
	public List<Entreprise> getAllDepartements();
	public Entreprise ajoutEntreprise(Entreprise e);
	public void suppriEntrepriseById(int entID);
	public Entreprise chercherEntreprise(int id) ;

	
	
	

	
}
