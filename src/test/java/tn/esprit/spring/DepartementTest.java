package tn.esprit.spring;


import java.text.ParseException;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Departement;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IDepartementService;

public class DepartementTest {
	Entreprise entreprise=new Entreprise();
	Departement departement = new Departement("Departement1",entreprise);
	@Autowired
	IDepartementService us;
	
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
		
		String typeDepartement="INFO";
		Entreprise  entreprise=new Entreprise(1,"Sopra","raisonSocial");
		Departement d = new Departement(typeDepartement,entreprise); 
		//Departement d2 = new Departement(typeDepartement,entreprise);
		Departement addDep = us.ajoutDep(d);
		//us.ajoutDep(d);
	//	us.ajoutDep(d2);
	//	Assert.assertEquals(d.getId(),addDep.getId());
		
	}
	
	
}
