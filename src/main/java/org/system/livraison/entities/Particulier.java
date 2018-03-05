package org.system.livraison.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="P")
public class Particulier extends Client {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6187456096089785369L;

	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Particulier(String nomClient, String adresseClient, double telephoneClient, String mailClient,
			String typeClient) {
		super(nomClient, adresseClient, telephoneClient, mailClient, typeClient);
		// TODO Auto-generated constructor stub
	}

}
