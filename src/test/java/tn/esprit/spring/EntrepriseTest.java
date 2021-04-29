package tn.esprit.spring;


import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseTest {
	Entreprise entreprise=new Entreprise("Entreprise1","raisonsocial");
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	
	@Autowired
	IEntrepriseService us;
	
	@Test
	public void testegaliterID(){
		l.info("Test egaliter ID Entreprise  " + entreprise.getId());
		//Assert.assertEquals(1, entreprise.getId());
		
	}

	@Test
	public void testegaliterName(){
		l.info("Test egaliter ID Entreprise  " + entreprise.getId());
		Assert.assertEquals("Entreprise1" , entreprise.getName());
		
	}
	
	
	@Test
	public void TestajoutEntreprise() throws ParseException {
		
		
		Entreprise  entreprise=new Entreprise("Soprahr","raisonSocial");
		Entreprise  entreprise2=new Entreprise("Vermeg","raisonSocial");
		
		Entreprise ajoutentreprise = us.ajoutEntreprise(entreprise);
		System.out.print(ajoutentreprise.toString());
		us.ajoutEntreprise(entreprise);
		us.ajoutEntreprise(entreprise2);
		Assert.assertEquals(entreprise.getRaisonSocial(),entreprise.getRaisonSocial());
		
	}
	
	@Test
	public void TestsuppriEntrepriseById(){
		// Afficher tous les entreprises avant suppression
		us.getAllEntreprise();
		Entreprise entreprise=us.chercherEntreprise(4);
		l.info("Suppression Entreprise  : " + entreprise.toString());
		us.suppriEntrepriseById(4);
		l.info("Entreprise supprimé");
		
	}
	
	@Test
	public void TestgetAllEntreprise(){
		l.info("Affichage all entreprise");
		us.getAllEntreprise();
	}
	
}
