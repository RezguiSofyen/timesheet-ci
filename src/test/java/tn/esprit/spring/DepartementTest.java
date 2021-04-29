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
import tn.esprit.spring.services.IDepartementService;
import tn.esprit.spring.services.IEntrepriseService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementTest {
	Entreprise entreprise=new Entreprise();
	Departement departement = new Departement("Departement1",entreprise);
	@Autowired
	IDepartementService us;
	IEntrepriseService us2;
	
	@Test
	public void testegaliterID(){
		
		//Assert.assertEquals(1, departement.getId());
		
	}

	@Test
	public void testegaliterName(){
		Assert.assertEquals("Departement1" , departement.getName());
		
	}
	
	@Test
	public void TestajoutDep() throws ParseException {
		
		String typeDepartement="Cloud";
		//Entreprise entreprise=us2.chercherEntreprise(1);
		Entreprise entreprise=new Entreprise(10,"Sopra","raisonSocial");
		Departement d = new Departement(typeDepartement,entreprise); 
		Departement d2 = new Departement("Prodops",entreprise);
		Departement addDep = us.ajoutDep(d);
		Departement addDep2=us.ajoutDep(d2);
	//	us.ajoutDep(d2);
		Assert.assertEquals(d.getId(),addDep.getId());
		
	}
	@Test
	public void TestsuppriDepartementById() throws ParseException {
		
		//us.suppriDepartementById(1);
	}
	
	
}
