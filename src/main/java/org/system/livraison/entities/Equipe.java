package org.system.livraison.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Equipe")
public class Equipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String codeEquipe;
	private String descritpEquipe;
	@OneToMany(mappedBy="Equipe")
	private Collection<Employe> employes;
	@ManyToMany
	@JoinTable(name="Equ_Miss")
	private Collection<Mission> missions;
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(String codeEquipe, String descritpEquipe) {
		super();
		this.codeEquipe = codeEquipe;
		this.descritpEquipe = descritpEquipe;
	}
	public String getCodeEquipe() {
		return codeEquipe;
	}
	public void setCodeEquipe(String codeEquipe) {
		this.codeEquipe = codeEquipe;
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
