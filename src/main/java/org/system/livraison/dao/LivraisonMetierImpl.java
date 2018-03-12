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

public class LivraisonMetierImpl  implements ILivraisonDAO {
//couplage faible avec la couche DAO
//cette couche Metier va faire appel à la couche DAO

	private ILivraisonDAO dao;
	public void setDao(ILivraisonDAO dao) {
		this.dao = dao;
	}

	@Override
	public Compte addCompte(Compte cpte, long refCli, long refGest) {
		// TODO Auto-generated method stub
		return dao.addCompte(cpte, refCli, refGest);
	}

	@Override
	public Client addClient(Client cli) {
		// TODO Auto-generated method stub
		return dao.addClient(cli);
	}

	@Override
	public Gestionnaire addGestionnaire(Gestionnaire gest) {
		// TODO Auto-generated method stub
		return dao.addGestionnaire(gest);
	}

	@Override
	public Commande addCommande(Commande cmd) {
		// TODO Auto-generated method stub
		return dao.addCommande(cmd);
	}

	@Override
	public Objet addObjet(Objet obj) {
		// TODO Auto-generated method stub
		return dao.addObjet(obj);
	}

	@Override
	public Employe addEmploye(Employe emp) {
		// TODO Auto-generated method stub
		return dao.addEmploye(emp);
	}

	@Override
	public Equipe addEquipe(Equipe equi) {
		// TODO Auto-generated method stub
		return dao.addEquipe(equi);
	}

	@Override
	public Mission addMission(Mission miss) {
		// TODO Auto-generated method stub
		return dao.addMission(miss);
	}

	@Override
	public Vehicule addVehicule(Vehicule veh) {
		// TODO Auto-generated method stub
		return dao.addVehicule(veh);
	}

	@Override
	public Reservation addReservation(Reservation res) {
		// TODO Auto-generated method stub
		return dao.addReservation(res);
	}

	@Override
	public Adresse addAdresse(Adresse adr) {
		// TODO Auto-generated method stub
		return dao.addAdresse(adr);
	}

	@Override
	public Facture addFacture(Facture fact) {
		// TODO Auto-generated method stub
		return dao.addFacture(fact);
	}

	@Override
	public void addMissionToEquipe(long refMiss, long refEqui) {
		// TODO Auto-generated method stub
		dao.addMissionToEquipe(refMiss, refEqui);
	}

	@Override
	public void addAdresseToClient(long refAdr, long refCli) {
		// TODO Auto-generated method stub
		dao.addAdresseToClient(refAdr, refCli);
	}

	@Override
	public void addAdresseToEmploye(long refAdr, long refEmp) {
		// TODO Auto-generated method stub
		dao.addAdresseToEmploye(refAdr, refEmp);
	}

	@Override
	public void addAdresseToCommande(long refAdr, long refCmd) {
		// TODO Auto-generated method stub
		dao.addAdresseToCommande(refAdr, refCmd);
	}

	@Override
	public void addEmployeToEquipe(long refEmp, long refEqui) {
		// TODO Auto-generated method stub
		dao.addEmployeToEquipe(refEmp, refEqui);
	}

	@Override
	public void addVehiculeToMission(long refMiss, long refVeh) {
		// TODO Auto-generated method stub
		dao.addVehiculeToMission(refMiss, refVeh);
	}

	@Override
	public void addVehiculeToReservation(long refveh, long refRes) {
		// TODO Auto-generated method stub
		dao.addVehiculeToReservation(refveh, refRes);
	}

	@Override
	public void validerCommande(long refCmd, long refGest, long refClient, long refEqui, long refMiss) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client consulterInfoClient(long refCli) {
		// TODO Auto-generated method stub
		return dao.consulterInfoClient(refCli);
	}

	@Override
	public Commande consulterInfoCmd(long refCmd) {
		// TODO Auto-generated method stub
		return dao.consulterInfoCmd(refCmd);
	}

	@Override
	public Gestionnaire consulterInfoGest(long refGest) {
		// TODO Auto-generated method stub
		return dao.consulterInfoGest(refGest);
	}

	@Override
	public Employe consulterInfoEmp(long refEmp) {
		// TODO Auto-generated method stub
		return dao.consulterInfoEmp(refEmp);
	}

	@Override
	public Equipe consulterInfoEquipe(long refEqui) {
		// TODO Auto-generated method stub
		return dao.consulterInfoEquipe(refEqui);
	}

	@Override
	public List<Commande> consulterListeCommande(long mc) {
		// TODO Auto-generated method stub
		return dao.consulterListeCommande(mc);
	}

	@Override
	public List<Client> consulterListeClient(String mc) {
		// TODO Auto-generated method stub
		return dao.consulterListeClient(mc);
	}

	@Override
	public List<Employe> consulterListeEmploye(String motCle) {
		// TODO Auto-generated method stub
		return dao.consulterListeEmploye(motCle);
	}

	@Override
	public List<Equipe> consulterListeEquipe(String mc) {
		// TODO Auto-generated method stub
		return dao.consulterListeEquipe(mc);
	}

	@Override
	public List<Client> getListeClient() {
		// TODO Auto-generated method stub
		return dao.getListeClient();
	}

	@Override
	public List<Compte> getListeCompte() {
		// TODO Auto-generated method stub
		return dao.getListeCompte();
	}

	@Override
	public List<Employe> getListeEmploye() {
		// TODO Auto-generated method stub
		return dao.getListeEmploye();
	}

	@Override
	public List<Commande> getListeCommande() {
		// TODO Auto-generated method stub
		return dao.getListeCommande();
	}

	@Override
	public List<Equipe> getListeEquipe() {
		// TODO Auto-generated method stub
		return dao.getListeEquipe();
	}

	@Override
	public List<Compte> getCompteByClient(long refCli) {
		// TODO Auto-generated method stub
		return dao.getCompteByClient(refCli);
	}

	@Override
	public List<Client> getClientByCompte(long refCpte) {
		// TODO Auto-generated method stub
		return dao.getClientByCompte(refCpte);
	}

	@Override
	public List<Compte> getCompteByGestionnaire(long refEmp) {
		// TODO Auto-generated method stub
		return dao.getCompteByGestionnaire(refEmp);
	}

	@Override
	public List<Employe> getEmployeByEquipe(long refEqui) {
		// TODO Auto-generated method stub
		return dao.getEmployeByEquipe(refEqui);
	}

}
