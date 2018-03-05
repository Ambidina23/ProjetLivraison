package org.system.livraison.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="E")
public class Entreprise extends Client {
	
	private static final long serialVersionUID = -2623286255487668161L;
	private String nomResponsable;

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	
}
