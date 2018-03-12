package org.system.livraison.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Commande")
public class Commande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refCmd;
	private Date dateCreationCmd;
	private Date dateExpeditionCmd;
	private Date dateLivraisonCmd;
	private boolean etatValidationCmd;
	private boolean etatPaiementCmd;
	@OneToOne
	@JoinColumn(name="refClient")
	private String Client;
	@OneToOne
	@JoinColumn(name="refGest")
	private String Gestionnaire;
	@OneToOne
	@JoinColumn(name="refFact")
	private String Facture;
	@ManyToMany
	@JoinTable(name="Cmd_Miss",
	joinColumns=@JoinColumn(name="refEmp"),
	inverseJoinColumns=@JoinColumn(name="refMiss"))
	private Collection <Mission> missions;
	@ManyToMany
	@JoinTable(name="Cmd_Adr",
	joinColumns=@JoinColumn(name="refCmd"),
	inverseJoinColumns=@JoinColumn(name="refAdr"))
	private Collection <Adresse> adresses;
	@OneToMany(mappedBy="Commande")
	private Collection<Objet> objets;
	@ManyToMany
	@JoinTable(name="Cmd_Veh",
	joinColumns=@JoinColumn(name="refCmd"),
	inverseJoinColumns=@JoinColumn(name="refVeh"))
	private Collection<Vehicule> vehicules;
	public Commande(long refCmd, Date dateCreationCmd, Date dateExpeditionCmd, Date dateLivraisonCmd,
			boolean etatValidationCmd, boolean etatPaiementCmd) {
		super();
		this.refCmd = refCmd;
		this.dateCreationCmd = dateCreationCmd;
		this.dateExpeditionCmd = dateExpeditionCmd;
		this.dateLivraisonCmd = dateLivraisonCmd;
		this.etatValidationCmd = etatValidationCmd;
		this.etatPaiementCmd = etatPaiementCmd;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getNumCommande() {
		return refCmd;
	}
	public void setNumCommande(long refCmd) {
		this.refCmd = refCmd;
	}
	public Date getDateCreationCmd() {
		return dateCreationCmd;
	}
	public void setDateCreationCmd(Date dateCreationCmd) {
		this.dateCreationCmd = dateCreationCmd;
	}
	public Date getDateExpeditionCmd() {
		return dateExpeditionCmd;
	}
	public void setDateExpeditionCmd(Date dateExpeditionCmd) {
		this.dateExpeditionCmd = dateExpeditionCmd;
	}
	public Date getDateLivraisonCmd() {
		return dateLivraisonCmd;
	}
	public void setDateLivraisonCmd(Date dateLivraisonCmd) {
		this.dateLivraisonCmd = dateLivraisonCmd;
	}
	public boolean isEtatValidationCmd() {
		return etatValidationCmd;
	}
	public void setEtatValidationCmd(boolean etatValidationCmd) {
		this.etatValidationCmd = etatValidationCmd;
	}
	public boolean isEtatPaiementCmd() {
		return etatPaiementCmd;
	}
	public void setEtatPaiementCmd(boolean etatPaiementCmd) {
		this.etatPaiementCmd = etatPaiementCmd;
	}


	
	public Collection<Objet> getObjets() {
		return objets;
	}
	public void setObjets(Collection<Objet> objets) {
		this.objets = objets;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Collection<Adresse> getAdresseDepart() {
		return adresseDepart;
	}
	public void setAdresseDepart(Collection<Adresse> adresseDepart) {
		this.adresseDepart = adresseDepart;
	}
	public Collection<Adresse> getAdresseDestination() {
		return adresseDestination;
	}
	public void setAdresseDestination(Collection<Adresse> adresseDestination) {
		this.adresseDestination = adresseDestination;
	}
	public Collection <Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(Collection <Adresse> adresses) {
		this.adresses = adresses;
	}
	public Collection <Mission> getMissions() {
		return missions;
	}
	public void setMissions(Collection <Mission> missions) {
		this.missions = missions;
	}
	public String getClient() {
		return Client;
	}
	public void setClient(String client) {
		Client = client;
	}
	public String getGestionnaire() {
		return Gestionnaire;
	}
	public void setGestionnaire(String gestionnaire) {
		Gestionnaire = gestionnaire;
	}
	public String getFacture() {
		return Facture;
	}
	public void setFacture(String facture) {
		Facture = facture;
	}
	private Collection <Adresse>  adresseDepart, adresseDestination;

	
	
	
	

}
