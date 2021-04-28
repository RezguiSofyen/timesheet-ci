package tn.esprit.spring.services;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;



@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);

	@Autowired
	EntrepriseRepository entrepriseRepository;
	
	@Autowired 
	IDepartementService dep;

	public List<Entreprise> getAllEntreprise() {
		l.info("In  retrieveAllContrats : ");
		List<Entreprise> listCont = (List<Entreprise>) entrepriseRepository.findAll();
		for (Entreprise cont : listCont) {
			l.debug("Entreprise  : " + cont);
		}
		l.info(" tout les entreprise trouver");
		return listCont;
	}
	@Override
	public Entreprise ajoutEntreprise(Entreprise e) {
		l.info("Ajout Departement : " + e);
		Entreprise depr = entrepriseRepository.save(e);
		l.info(e + "Entreprise Ajouté");
		return depr;
	}

	@Override
	public void suppriEntrepriseById(int entrepriseID) {
		l.info("supprimé contrat id : " + entrepriseID);
		entrepriseRepository.delete(entrepriseRepository.findById(entrepriseID).get());

	}
	@Override
	public List<Entreprise> getAllDepartements() {
		l.info("trouver tous les département");
		return (List<Entreprise>) entrepriseRepository.findAll();
	}

	@Override
	public Entreprise chercherEntreprise(int id) {
		l.info("Chercher département par id = " + id);
		Entreprise d =  entrepriseRepository.findById(id).get();
		l.info("Departement  : " + d.toString());
		return d; 
	}

}