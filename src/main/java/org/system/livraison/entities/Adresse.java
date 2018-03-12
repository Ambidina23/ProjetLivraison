package org.system.livraison.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Adresse")
public class Adresse implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refAdr;
	private int numRue;
	private String nomRue;
	private int codeVille;
	private String nomVille;
	private String nomPays;
	@OneToMany(mappedBy="Adresse")
	private String Client;
	@OneToMany(mappedBy="Adresse")
	private String Employe;

	@ManyToMany(mappedBy="adresses")
	private Collection<Commande> commandes;
	
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresse(int numRue, String nomRue, int codeVille, String nomVille, String nomPays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codeVille = codeVille;
		this.nomVille = nomVille;
		this.nomPays = nomPays;
	}
	
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	
	public int getNumRue() {
		return numRue;
	}
	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}
	public String getNomRue() {
		return nomRue;
	}
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	public int getCodeVille() {
		return codeVille;
	}
	public void setCodeVille(int codeVille) {
		this.codeVille = codeVille;
	}
	public String getNomVille() {
		return nomVille;
	}
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public long getRefAdresse() {
		return refAdr;
	}
	public void setIdAdresse(long idAdresse) {
		this.refAdr = idAdresse;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public String getEmploye() {
		return Employe;
	}
	public void setEmploye(String employe) {
		Employe = employe;
	}
	
	public void setEmploye(Gestionnaire gest) {
		// TODO Auto-generated method stub
		
	}
	

}
