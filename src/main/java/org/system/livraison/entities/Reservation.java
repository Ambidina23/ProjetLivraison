package org.system.livraison.entities;

import java.util.Collection;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Reservation")
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private double refRes;
	private Date dateReservation;
	private Date dateDepart;
	private double dureeTransport;
	@OneToOne
	@JoinColumn(name="refGest")
	private String Gestionnaire;
	@ManyToMany
	@JoinTable(name="Res_Veh")
	private Collection<Vehicule> vehicules;
	
	
	
	public double getrefRes() {
		return refRes;
	}
	public void setNumReservation(double numReservation) {
		this.refRes = numReservation;
	}
	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}
	public double getDureeTransport() {
		return dureeTransport;
	}
	public void setDureeTransport(double dureeTransport) {
		this.dureeTransport = dureeTransport;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public String getGestionnaire() {
		return Gestionnaire;
	}
	public void setGestionnaire(String gestionnaire) {
		Gestionnaire = gestionnaire;
	}
	public Reservation(Date dateReservation, Date dateDepart, double dureeTransport) {
		super();
		this.dateReservation = dateReservation;
		this.dateDepart = dateDepart;
		this.dureeTransport = dureeTransport;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
