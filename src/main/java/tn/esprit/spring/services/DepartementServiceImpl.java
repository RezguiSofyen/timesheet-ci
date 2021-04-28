package tn.esprit.spring.services;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;



@Service
public class DepartementServiceImpl implements IDepartementService {
	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);

	@Autowired
	DepartementRepository departementRepository;
	
	@Autowired 
	IDepartementService dep;

	public List<Departement> getAllDepartement() {
		l.info("In  retrieveAllContrats : ");
		List<Departement> listCont = (List<Departement>) departementRepository.findAll();
		for (Departement cont : listCont) {
			l.debug("Departement  : " + cont);
		}
		l.info(" tout le département trouver");
		return listCont;
	}
	@Override

	public Departement ajoutDep(Departement d) {
		l.info("Ajout Departement : " + d);
		Departement depr = departementRepository.save(d);
		//dep.ajoutDep(depr);
		l.info(d + "déprtement Ajouté");
		return depr;
	}

	@Override
	public void suppriDepartementById(int depId) {
		l.info("supprimé contrat id : " + depId);
		departementRepository.delete(departementRepository.findById(depId).get());

	}
	@Override
	public List<Departement> getAllDepartements() {
		l.info("trouver tous les département");
		return (List<Departement>) departementRepository.findAll();
	}

	@Override
	public Departement chercherDepartement(int id) {
		l.info("Chercher département par id = " + id);
		Departement d =  departementRepository.findById(id).get();
		l.info("Departement  : " + d.toString());
		return d; 
	}
	@Override
	public void deleteDepartementById(int depId) {
		// TODO Auto-generated method stub
		
	}

}