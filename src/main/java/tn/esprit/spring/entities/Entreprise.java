package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Entreprise implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3152690779535828408L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	
	private String raisonSocial;
	
	@OneToMany(mappedBy="entreprise", 
			cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER)
	private List<Departement> departements = new ArrayList<>();

	public Entreprise() {
		super();
	}

	public Entreprise(String name, String raisonSocial) {
		this.name = name;
		this.raisonSocial = raisonSocial;
	}

	public Entreprise(int identreprise,String name, String raisonSocial) {
		this.id=identreprise;
		this.name = name;
		this.raisonSocial = raisonSocial;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}



	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}




	
	
	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", name=" + name + ", raisonSocial=" + raisonSocial + "=]";
	}




}
