package org.system.livraison.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.system.livraison.entities.Adresse;
import org.system.livraison.entities.Client;
import org.system.livraison.entities.Commande;
import org.system.livraison.entities.Compte;
import org.system.livraison.entities.Employe;
import org.system.livraison.entities.Equipe;
import org.system.livraison.entities.Facture;
import org.system.livraison.entities.Gestionnaire;
import org.system.livraison.entities.Mission;
import org.system.livraison.entities.Objet;
import org.system.livraison.entities.Reservation;
import org.system.livraison.entities.Vehicule;

public class LivraisonDaoImpl implements ILivraisonDAO{
	@PersistenceContext
	private EntityManager em;
	@Override
	public Client addClient(Client cli) {
		em.persist(cli);
		return cli;
	}

	@Override
	public Commande addCommande(Commande cmd) {
		
		return null;
	}

	@Override
	public Compte addCompte(Compte cpte, long refClient, long refGest) {
		em.persist(refClient);
		em.persist(refGest);
		return cpte;
	}

	@Override
	public Gestionnaire addGestionnaire(Gestionnaire gest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe addEmploye(Employe emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Equipe addEquipe(Equipe equi) {
		em.persist(equi);
		return equi;
	}

	@Override
	public Mission addMissionByEquipe(Mission miss, long refVeh, long refEqui) {
		Vehicule veh= em.find(Vehicule.class, refVeh);
		Equipe equi= em.find(Equipe.class, refEqui);
		miss.getVehicules().add(veh);
		miss.getEquipes().add(equi);
		return miss;
	}

	@Override
	public List<Vehicule> addVehiculeByMission(Vehicule veh, long refMiss ) {
		
		return null;
	}

	@Override
	public Adresse addAdresse(Adresse adr) {
	
		return null;
	}

	@Override
	public Facture addFacture(Facture fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objet addObjet(Objet obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation addReservation(Reservation res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployeEquipe(long refEmploye, long refEquipe) {
		Employe emp=em.find(Employe.class, refEmploye);
		Equipe equi=em.find(Equipe.class, refEquipe);
		emp.getEquipes().add(equi);
		equi.getEmployes().add(emp);
		
		
	}

	@Override
	public Commande consulterCommande(long numCmd) {
		Commande cmd=em.find(Commande.class, numCmd);
		return cmd;
	}

	@Override
	public List<Commande> consulterListeCommande(long motCle) {
		
		return null;
	}

	@Override
	public List <Client>consulterClient(long refClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> consulterListeClient(String motCle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> ConsulterCommande(long codeClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> consulterListeClient() {
		return null;
		
	}

	@Override
	public List<Employe> consulterListeEmploye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Commande> ConsulterListeCommande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipe> getListeEquipe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> ConsulterEmployeByEquipe(long CodeEquipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equipe> getListeEmpoye() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employe> getEmployeByEquipe(long CodeEquipe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehicule>  addVehiculeByReservation(Vehicule veh, long refRes ) {
		Reservation res=em.find(Reservation.class, refRes);
		res.getVehicules().add(veh);
		return  (List<Vehicule>) veh ;
	}

	@Override
	public Vehicule addVehicule(Vehicule veh) {
		// TODO Auto-generated method stub
		return null;
	}

}
