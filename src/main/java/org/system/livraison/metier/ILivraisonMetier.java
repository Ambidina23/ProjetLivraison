package org.system.livraison.metier;

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

public interface ILivraisonMetier {
	public Compte addCompte(Compte cpte, long refCli,long refGest);
	public Client addClient(Client cli );
	public Gestionnaire addGestionnaire(Gestionnaire gest);
	public Commande addCommande(Commande cmd);
	public Objet addObjet(Objet obj);
	public Employe addEmploye(Employe emp );
	public Equipe addEquipe(Equipe equi);
	public Mission addMission(Mission miss);
	public Vehicule addVehicule(Vehicule veh);
	public Reservation addReservation(Reservation res);
	public Adresse addAdresse(Adresse adr);
	public Facture addFacture(Facture fact);
	public void addMissionToEquipe(long refMiss, long refEqui);
	public void addAdresseToClient(long refAdr, long refCli);
	public void addAdresseToEmploye(long refAdr, long refEmp);
	public void addAdresseToCommande(long refAdr, long refCmd);
	public void addEmployeToEquipe(long refEmp, long refEqui);
	public void addVehiculeToMission(long refMiss,long refVeh);
	public void addVehiculeToReservation(long refveh, long refRes);
	public void validerCommande(long refCmd, long refGest, long refClient, long refEqui,long refMiss);
	public Client consulterInfoClient(long refCli);
	public Commande consulterInfoCmd(long refCmd);
	public Gestionnaire consulterInfoGest(long refGest);
	public Employe consulterInfoEmp(long refEmp);
	public Equipe consulterInfoEquipe(long refEqui);
	public List<Commande> consulterListeCommande(long mc);
	public List<Client> consulterListeClient(String mc);
	public List<Employe> consulterListeEmploye(String motCle);
	public List<Equipe> consulterListeEquipe(String mc);
	public List<Client> getListeClient();
	public List<Compte> getListeCompte();
	public List<Employe> getListeEmploye();
	public List<Commande> getListeCommande();
	public List<Equipe> getListeEquipe();
	public List<Compte> getCompteByClient(long refCli);
	public List<Client> getClientByCompte(long refCpte);
	public List<Compte> getCompteByGestionnaire(long refEmp);
	public List<Employe> getEmployeByEquipe(long refEqui);

}
