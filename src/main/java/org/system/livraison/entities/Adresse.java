package org.system.livraison.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Adresse")
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAdresse;
	private int numRue;
	private String nomRue;
	private int codeVille;
	private String nomVille;
	private String nomPays;
	@ManyToOne
	@JoinColumn(name="codeClient")
	private String Client;
	@ManyToOne
	@JoinColumn(name="codeCmd")
	private String Commande;
	@OneToMany(mappedBy="Adresse")
	private String Employe;
	
	public Adresse(int numRue, String nomRue, int codeVille, String nomVille, String nomPays) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codeVille = codeVille;
		this.nomVille = nomVille;
		this.nomPays = nomPays;
	}
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getIdAdresse() {
		return idAdresse;
	}
	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
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
	public String getCommande() {
		return Commande;
	}
	public void setCommande(String commande) {
		Commande = commande;
	}
	

}
