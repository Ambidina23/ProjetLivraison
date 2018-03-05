package org.system.livraison.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="Mission")
public class Mission {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long refMission;
	private String typeMission;
	private String descriptMission;
	@ManyToMany
	@JoinTable(name="Miss_Grp")
	private Collection<Equipe>equipes; 
	@ManyToMany
	@JoinTable(name="Miss_Veh")
	private Collection<Vehicule> vehicules;
	@ManyToMany
	@JoinTable(name="Miss_Cmd")
	private Collection<Commande> commandes;
	
	
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mission(long refMission, String typeMission, String descriptMission) {
		super();
		this.refMission=refMission;
		this.typeMission = typeMission;
		this.descriptMission = descriptMission;
	}
	
	
	public String getTypeMission() {
		return typeMission;
	}
	public void setTypeMission(String typeMission) {
		this.typeMission = typeMission;
	}
	public String getDescriptMission() {
		return descriptMission;
	}
	public void setDescriptMission(String descriptMission) {
		this.descriptMission = descriptMission;
	}
	
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Collection<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}
	
	public Collection<Equipe> getEquipes() {
		return equipes;
	}
	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}
	public long getRefMission() {
		return refMission;
	}
	public void setRefMission(long refMission) {
		this.refMission = refMission;
	}

}
