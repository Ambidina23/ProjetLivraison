package org.system.livraison.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Comtpte")
public class Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1731378640766807291L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCmpte;
	private String login;
	private String mdp;
	private Date dateCreationCpte;
	private String  typeCpte;
	private String mail;
	@OneToOne
	@JoinColumn(name="refClient")
	private String Client;
	@OneToOne
	@JoinColumn(name="refGest")
	private String Gestionnaire;
	public Compte(String login, String mdp, Date dateCreationCpte, int userPrivilage, String mail) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.dateCreationCpte = dateCreationCpte;
		this.mail = mail;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Date getDateCreation() {
		return dateCreationCpte;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreationCpte = dateCreation;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTypeCpte() {
		return typeCpte;
	}
	public void setTypeCpte(String typeCpte) {
		this.typeCpte = typeCpte;
	}
	public int getIdCmpte() {
		return idCmpte;
	}
	public void setIdCmpte(int idCmpte) {
		this.idCmpte = idCmpte;
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
	
	
	

}
