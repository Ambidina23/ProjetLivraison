package org.system.livraison.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="OP")
public class OrgPublic extends Client{
	
	private static final long serialVersionUID = 2927003227236725708L;
	private String nomResponsable;

	public OrgPublic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrgPublic(String nomClient, String adresseClient, double telephoneClient, String mailClient,
			String typeClient) {
		super(nomClient, adresseClient, telephoneClient, mailClient, typeClient);
		// TODO Auto-generated constructor stub
	}

	public String getNomResponsable() {
		return nomResponsable;
	}

	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}

}
