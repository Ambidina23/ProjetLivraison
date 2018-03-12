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
@SuppressWarnings("serial")
@Entity
@Table(name="Compte")
public class Compte implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refCpte;
	private String login;
	private String mdp;
	private Date dateCreationCpte;
	private String  typeCpte;
	private String mail;
	@OneToOne(mappedBy="Compte")
	private Client cli;
	@OneToOne
	@JoinColumn(name="refGest")
	private Gestionnaire gest;
	

	
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
	
	public long getRefCpte() {
		return refCpte;
	}
	public void setRefCpte(long refCpte) {
		this.refCpte = refCpte;
	}
	
	public Date getDateCreationCpte() {
		return dateCreationCpte;
	}
	public void setDateCreationCpte(Date dateCreationCpte) {
		this.dateCreationCpte = dateCreationCpte;
	}
	
	public Client getClient() {
		return cli;
	}
	public void setClient(Client cli) {
		this.cli = cli;
	}
	
	public Gestionnaire getGestionnaire() {
		return gest;
	}
	public void setGestionnaire(Gestionnaire gest) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
