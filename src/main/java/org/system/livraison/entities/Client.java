package org.system.livraison.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//Gestion des persistances
@SuppressWarnings("serial")
@Entity
@Table(name="Client")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeClient",
discriminatorType=DiscriminatorType.STRING, length=3)
public  class Client implements Serializable {
//annotations JPA(@OneToOne, @ManyToOne, @OneToMany, @ManyToMany)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refCli;
	public String getCompte() {
		return Compte;
	}
	public void setCompte(String compte) {
		Compte = compte;
	}
	public long getRefCli() {
		return refCli;
	}
	public void setRefCli(long refCli) {
		this.refCli = refCli;
	}
	private String nomRespons;
	private String nomClient;
	private String penonomClient;
	private double telephoneClient;
	private String mailClient;
	private String typeClient;
	
	@ManyToOne
	@JoinColumn(name="refAdr")
	private String Adresse;
	@ManyToOne
	@JoinColumn(name="refGest")
	private String Gestionnaire;
	@OneToOne
	private String Compte;
	@OneToMany(mappedBy="Client", fetch=FetchType.LAZY)
	private Collection <Commande> commandes;
	@OneToMany(mappedBy="Facture", fetch=FetchType.LAZY)
	private Collection<Facture> factures;
	
	public Client(String nomClient, String adresseClient, double telephoneClient, String mailClient,
			String typeClient) {
		super();
		this.nomClient = nomClient;
		this.telephoneClient = telephoneClient;
		this.mailClient = mailClient;

	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdClient() {
		return refCli;
	}
	public void setIdClient(long refCli) {
		this.refCli = refCli;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public double getTelephoneClient() {
		return telephoneClient;
	}
	public void setTelephoneClient(double telephoneClient) {
		this.telephoneClient = telephoneClient;
	}
	public String getMailClient() {
		return mailClient;
	}
	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	
	public String getGestionnaire() {
		return Gestionnaire;
	}
	public void setGestionnaire(String gestionnaire) {
		Gestionnaire = gestionnaire;
	}
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public Collection<Facture> getFactures() {
		return factures;
	}
	public void setFactures(Collection<Facture> factures) {
		this.factures = factures;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getNomRespons() {
		return nomRespons;
	}
	public void setNomRespons(String nomRespons) {
		this.nomRespons = nomRespons;
	}
	public String getPenonomClient() {
		return penonomClient;
	}
	public void setPenonomClient(String penonomClient) {
		this.penonomClient = penonomClient;
	}
	

}
