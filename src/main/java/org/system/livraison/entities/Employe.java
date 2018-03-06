package org.system.livraison.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employe")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refEmploye;
	private String nomEmploye;
	private String prenomEmploye;
	@ManyToMany
	@JoinTable(name="Emp_Equi")
	private Collection <Equipe> equipes;
	@OneToOne
	@JoinColumn(name="idAdresse")
	private String Adresse;
	public Employe(String nomEmploye, String prenomEmploye) {
		super();
		this.setNomEmploye(nomEmploye);
		this.setPrenomEmploye(prenomEmploye);
		
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}


	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	
	public Collection<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	
}
