package org.system.livraison.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Objet")
public class Objet implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refObj;
	private String nomObjet;
	private double poidsObjet;
	private String fragilite;
	private String description;
	private double valeur;
	private String photo;
	@ManyToOne
	@JoinColumn(name="refObjet")
	private String Commande;
	@ManyToOne
	@JoinColumn(name="refObjet")
	private String Vehicule;
	
	public String getNomObjet() {
		return nomObjet;
	}
	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}
	public double getPoidsObjet() {
		return poidsObjet;
	}
	public void setPoidsObjet(double poidsObjet) {
		this.poidsObjet = poidsObjet;
	}
	public String getFragilite() {
		return fragilite;
	}
	public void setFragilite(String fragilite) {
		this.fragilite = fragilite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getValeur() {
		return valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Objet(String nomObjet, double poidsObjet, String fragilite, String description, double valeur,
			String photo) {
		super();
		this.nomObjet = nomObjet;
		this.poidsObjet = poidsObjet;
		this.fragilite = fragilite;
		this.description = description;
		this.valeur = valeur;
		this.photo = photo;
	}
	public Objet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCommande() {
		return Commande;
	}
	public void setCommande(String commande) {
		Commande = commande;
	}
	public String getVehicule() {
		return Vehicule;
	}
	public void setVehicule(String vehicule) {
		Vehicule = vehicule;
	}
	public long getRefObj() {
		return refObj;
	}
	public void setRefObj(long refObj) {
		this.refObj = refObj;
	}

}
