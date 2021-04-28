package tn.esprit.spring;


import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseTest {
	Entreprise entreprise=new Entreprise();
	
	@Autowired
	IEntrepriseService us;
	
	@Test
	public void testegaliterID(){
		
		//Assert.assertEquals(1, departement.getId());
		
	}

	@Test
	public void testegaliterName(){
	//	Assert.assertEquals("Entreprise1" , entreprise.getName());
		
	}
	
	@Test
	public void TestajoutEntreprise() throws ParseException {
		
		
		Entreprise  entreprise=new Entreprise("Sofrecom","raisonSocial");
		
		
		Entreprise ajoutentreprise = us.ajoutEntreprise(entreprise);
		System.out.print(ajoutentreprise.toString());
	//	us.ajoutEntreprise(entreprise);
	//	us.ajoutDep(d2);
	//	Assert.assertEquals(d.getId(),addDep.getId());
		
	}
	
	
}
