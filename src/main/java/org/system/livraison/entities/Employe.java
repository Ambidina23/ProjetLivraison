package org.system.livraison.entities;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Employe")
public class Employe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refEmp;
	private String nomEmploye;
	private String prenomEmploye;
	@ManyToMany
	@JoinTable(name="Emp_Equi",
	joinColumns=@JoinColumn(name="refEmp"),
	inverseJoinColumns=@JoinColumn(name="refEqui"))
	private Collection <Equipe> equipes;
	@ManyToOne
	@JoinColumn(name="refAdr")
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
	public int getRefEmp() {
		return refEmp;
	}
	public void setRefEmp(int refEmp) {
		this.refEmp = refEmp;
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
