package org.system.livraison.entities;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name="Equipe")
public class Equipe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String refEqui;
	private String descritpEquipe;
	@ManyToMany(mappedBy="equipes")
	private Collection<Employe> employes;
	@ManyToMany(mappedBy="equipes")
	private Collection<Mission> missions;
	
	
	public Collection<Mission> getMissions() {
		return missions;
	}
	public void setMissions(Collection<Mission> missions) {
		this.missions = missions;
	}
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(String codeEquipe, String descritpEquipe) {
		super();
	
	}
	public String getCodeEquipe() {
		return refEqui;
	}
	public void setrefEquipe(String refEquipe) {
		this.refEqui = refEquipe;
	}
	public String getDescritpEquipe() {
		return descritpEquipe;
	}
	public void setDescritpEquipe(String descritpEquipe) {
		this.descritpEquipe = descritpEquipe;
	}
	public Collection<Employe> getEmployes() {
		return employes;
	}
	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}
	

}
