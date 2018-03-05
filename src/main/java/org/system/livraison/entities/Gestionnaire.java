package org.system.livraison.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Gestionnaire {
	private String nomGest;
	private String prenomGest;
	private Double telephoneGest;
	private String mailGest;
	
	@OneToOne
	@JoinColumn(name="idCpte")
	private String Compte;
	@OneToMany(mappedBy="Gestionaire")
	private Collection<Client> clients;
	@OneToMany(mappedBy="Gestionaire")
	private Collection<Commande> commandes;
	@OneToMany(mappedBy="Gestionaire")
	private Collection<Facture> factures;
	@OneToMany(mappedBy="Gestionaire")
	private Collection<Reservation> reservations;
	
	//contructeur avec paramettres
	public Gestionnaire() {
		super();
	}
	
	//contructeur avec paramettres
	public Gestionnaire(String nomGest, String prenomGest, Double telephoneGest, String mailGest) {
		super();
		this.nomGest = nomGest;
		this.prenomGest = prenomGest;
		this.telephoneGest = telephoneGest;
		this.mailGest = mailGest;
	}
	public String getNomGest() {
		return nomGest;
	}
	public void setNomGest(String nomGest) {
		this.nomGest = nomGest;
	}
	public String getPrenomGest() {
		return prenomGest;
	}
	public void setPrenomGest(String prenomGest) {
		this.prenomGest = prenomGest;
	}
	public Double getTelephoneGest() {
		return telephoneGest;
	}
	public void setTelephoneGest(Double telephoneGest) {
		this.telephoneGest = telephoneGest;
	}
	public String getMailGest() {
		return mailGest;
	}
	public void setMailGest(String mailGest) {
		this.mailGest = mailGest;
	}
	
	public String getCompte() {
		return Compte;
	}
	public void setCompte(String compte) {
		Compte = compte;
	}

	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public Collection<Facture> getFactures() {
		return factures;
	}

	public void setFactures(Collection<Facture> factures) {
		this.factures = factures;
	}

	public Collection<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Collection<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
	

}
