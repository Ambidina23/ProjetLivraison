package org.system.livraison.dao;

import java.util.List;

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
// interface DAO
public interface ILivraisonDAO {
	public Client addClient(Client cli );
	public Commande addCommande(Commande cmd);
	public Compte addCompte(Compte cpte, long refClient, long refGest);
	public Gestionnaire addGestionnaire(Gestionnaire gest);
	public Employe addEmploye(Employe emp);
	public Equipe addEquipe(Equipe equi);
	public Mission addMissionByEquipe(Mission miss, long refVeh, long refEqui);
	public Vehicule addVehicule(Vehicule veh);
	public List<Vehicule> addVehiculeByMission(Vehicule veh, long refMiss);
	public List<Vehicule> addVehiculeByReservation(Vehicule veh, long refRes);
	public Adresse addAdresse(Adresse adr);
	public Facture addFacture(Facture fact);
	public Objet addObjet(Objet obj);
	public Reservation addReservation(Reservation res);
	public void addEmployeEquipe(long CodeEmploye,long codeGroupe);
	public Commande consulterCommande(long numCmd);
	public List<Commande> consulterListeCommande(long motCle);
	public List<Client> consulterClient(long refClient);
	public List<Client> consulterListeClient(String motCle);
	public List<Commande> ConsulterCommande(long codeClient);
	public List<Client> consulterListeClient();
	public List<Employe> consulterListeEmploye();
	public List<Commande> ConsulterListeCommande();
	public List<Equipe> getListeEquipe();
	public List<Equipe> getListeEmpoye();
	public List<Employe> getEmployeByEquipe(long CodeEquipe);
	public List<Employe> ConsulterEmployeByEquipe(long CodeEquipe);
	
	
	
	
	 
}
