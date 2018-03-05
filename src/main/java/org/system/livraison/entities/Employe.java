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
@Table(name="Employe")
public class Employe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int codeEmployé;
	private String nomEmployé;
	private String prenomEmployé;
	@ManyToOne
	@JoinColumn(name="idGroupe")
	private String Groupe;
	@OneToOne
	@JoinColumn(name="idAdresse")
	private String Adresse;
	public Employe(String nomEmployé, String prenomEmployé) {
		super();
		this.nomEmployé = nomEmployé;
		this.prenomEmployé = prenomEmployé;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCodeEmployé() {
		return codeEmployé;
	}
	public void setCodeEmployé(int codeEmployé) {
		this.codeEmployé = codeEmployé;
	}
	public String getNomEmployé() {
		return nomEmployé;
	}
	public void setNomEmployé(String nomEmployé) {
		this.nomEmployé = nomEmployé;
	}
	public String getPrenomEmployé() {
		return prenomEmployé;
	}
	public void setPrenomEmployé(String prenomEmployé) {
		this.prenomEmployé = prenomEmployé;
	}
	public String getGroupe() {
		return Groupe;
	}
	public void setGroupe(String groupe) {
		Groupe = groupe;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

}
