package org.system.livraison.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Facture")
public class Facture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private double refFact;
	private double dateFact;
	private boolean etatFact;
	private double montant;
	@ManyToOne
	@JoinColumn(name="refClient")
	private String Client;
	@OneToOne
	@JoinColumn(name="refCmd")
	private String Commande;
	@ManyToOne
	@JoinColumn(name="refGest")
	private String Gestionnaire;
	public Facture(double refFact, double dateFact, boolean etatFact, double montant) {
		super();
		this.refFact = refFact;
		this.dateFact = dateFact;
		this.etatFact = etatFact;
		this.montant = montant;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getRefFact() {
		return refFact;
	}
	public void setRefFact(double refFact) {
		this.refFact = refFact;
	}
	public double getDateFact() {
		return dateFact;
	}
	public void setDateFact(double dateFact) {
		this.dateFact = dateFact;
	}
	public boolean isEtatFact() {
		return etatFact;
	}
	public void setEtatFact(boolean etatFact) {
		this.etatFact = etatFact;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public String getCommande() {
		return Commande;
	}
	public void setCommande(String commande) {
		Commande = commande;
	}
	public String getGestionnaire() {
		return Gestionnaire;
	}
	public void setGestionnaire(String gestionnaire) {
		Gestionnaire = gestionnaire;
	}
	
	
	

}
