package org.system.livraison.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;
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
// implementation JPA
//Mapping Objet Relationnel
//utilisation de EntityManager
//pour le gestion des transaction:
//On demande à  Spring de gerer les transaction
//ajoutons l'annotation suivante
@Transactional
//ca veut dire toutes mes methodes sont transactionnelle:
public class LivraisonDaoImpl implements ILivraisonDAO{
	//Gestion des persistence en faisant appel à JPA
	//et en utilisant un objet de type entityManager
	
	//Vu q'après on va configurer JPA avec Spring on doit specifier l'annotation "persistanceContext"
	
	@PersistenceContext
	private EntityManager em;
	

	//Ajout(creation  des table dans la base de donnée en ulisant la persistance
	@Override
	public Compte addCompte(Compte cpte, long refCli, long refGest) {
		Client cli=em.find(Client.class , refCli);
		Gestionnaire gest=em.find(Gestionnaire.class, refGest);
		
		cpte.setClient(cli);
		cpte.setGestionnaire(gest);
		em.persist(cpte);
		
		return cpte;
	}
	@Override
	public Client addClient(Client cli) {
		em.persist(cli);
		return cli;
	}

	@Override
	public Gestionnaire addGestionnaire(Gestionnaire gest) {
		em.persist(gest);
		return gest;
	}

	@Override
	public Equipe addEquipe(Equipe equi) {
		em.persist(equi);
		return equi;
	}
	@Override
	public Commande addCommande(Commande cmd) {
		em.persist(cmd);
		return cmd;
	}
	
	@Override
	public Employe addEmploye(Employe emp) {
		em.persist(emp);
		return emp;
	}
	
	@Override
	public Vehicule addVehicule(Vehicule veh) {
		em.persist(veh);
		return veh;
	}
	@Override
	public Mission addMission(Mission miss) {
		em.persist(miss);
		return miss;
	}
	@Override
	public Adresse addAdresse(Adresse adr) {
	em.persist(adr);
		return adr;
	}
	@Override
	public Objet addObjet(Objet obj) {
		em.persist(obj);
		return obj;
	}

	@Override
	public Reservation addReservation(Reservation res) {
		em.persist(res);
		return res;
	}
	@Override
	public Facture addFacture(Facture fact) {
		em.persist(fact);
		return fact;
	}

	@Override
	public void addMissionToEquipe(long refMiss, long refEqui) {
		Mission miss=em.find(Mission.class,  refMiss);
		Equipe equi=em.find(Equipe.class, refEqui);
		miss.getEquipes().add(equi);
		equi.getMissions().add(miss);
	}

	@Override
	public void addAdresseToClient(long refAdr, long refCli) {
		Client cli=em.find(Client.class , refCli);
		cli.getAdresse();
		
	}

	@Override
	public void addAdresseToEmploye(long refAdr, long refEmp) {
		Employe cli=em.find(Employe.class , refEmp);
		cli.getAdresse();
			
	}

	@Override
	public void addAdresseToCommande(long refAdr, long refCmd) {
		Adresse adr=em.find(Adresse.class,  refAdr);
		Commande cmd=em.find(Commande.class, refCmd);
		adr.getCommandes().add(cmd);
		cmd.getAdresses().add(adr);
	}

	@Override
	public void addEmployeToEquipe(long refEmp, long refEqui) {
		Employe emp=em.find(Employe.class,  refEmp);
		Equipe equi=em.find(Equipe.class, refEqui);
		emp.getEquipes().add(equi);
		equi.getEmployes().add(emp);
		
	}
	@Override
	public void addVehiculeToMission(long refMiss, long refVeh) {
		Vehicule veh=em.find(Vehicule.class,  refVeh);
		Mission miss=em.find(Mission.class, refMiss);
		veh.getMissions().add(miss);
		miss.getVehicules().add(veh);
		
	}

	@Override
	public void addVehiculeToReservation(long refVeh, long refRes) {
		Vehicule veh=em.find(Vehicule.class,  refVeh);
		Reservation res=em.find(Reservation.class, refRes);
		veh.getReservations().add(res);
		res.getVehicules().add(veh);
	}


	@Override
	public void validerCommande(long refCmd, long refGest, long refClient, long refEqui, long refMiss) {
		
		
	}
	@Override
	public Commande consulterInfoCmd(long refCmd) {
		Commande cmd=em.find(Commande.class , refCmd);
		if(cmd==null) throw new RuntimeException("Client introuvable");
		return cmd;
	}
	@Override
	public Client consulterInfoClient(long refCli) {
		Client cli=em.find(Client.class , refCli);
		if(cli==null) throw new RuntimeException("Client introuvable");
		
		return cli;
	}
	
	@Override
	public Employe consulterInfoEmp(long refEmp) {
		
		Employe emp=em.find(Employe.class , refEmp);
		if(emp==null) throw new RuntimeException("Employe introuvable");
		
		return emp;
	}
	@Override
	public Equipe consulterInfoEquipe(long refEqui) {
		Equipe equi=em.find(Equipe.class , refEqui);
		if(equi==null) throw new RuntimeException("Employe introuvable");
		
		return equi;
	}
	@Override
	public Gestionnaire consulterInfoGest(long refGest) {
		Gestionnaire gest=em.find(Gestionnaire.class , refGest);
		if(gest==null) throw new RuntimeException("Employe introuvable");
		return gest;
	}
	@Override
	public List<Client> getListeClient() {
		Query req=em.createQuery("select cl from Client cl");
		return req.getResultList();
	}
	@Override
	public List<Compte> getListeCompte() {
		Query req=em.createQuery("select cpt from Compte cpt ");
		return req.getResultList();
	}
	@Override
	public List<Commande> getListeCommande() {
		Query req=em.createQuery("select com from Commande com");
		return req.getResultList();
	}
	
	@Override
	public List<Employe> getListeEmploye() {
		
		Query req=em.createQuery("select epl from Employe epl");
		return req.getResultList();
	}

	@Override
	public List<Equipe> getListeEquipe() {
	
		Query req=em.createQuery("select eq from Equipe eq");
		return req.getResultList();
	}
	@Override
	public List<Commande> consulterListeCommande(long mc) {
	
		Query req=em.createQuery("select com from Commande com where com.dateCreationCm like=:x");
		req.setParameter("x", "%"+mc+ "%");
		return req.getResultList();
	}

	@Override
	public List<Client> consulterListeClient(String mc) {
		Query req=em.createQuery("select cl from Client cl where cl.nomClient like=:x");
		req.setParameter("x", "%"+mc+ "%");
		return req.getResultList();
	}


	@Override
	public List<Compte> getCompteByClient(long refCli) {
		
		Query req=em.createQuery("select cp from Compte cp where cp.clients.codeCli=:x");
		req.setParameter("x", refCli);
		return req.getResultList();
	}
	@Override
	public List<Client> getClientByCompte(long refCpte) {
		Query req=em.createQuery("select cl from Employe cl where cl.comptes.refCpte=:x");
		req.setParameter("x", refCpte);
		return req.getResultList();
	}
	@Override
	public List<Employe> consulterListeEmploye(String mc) {
		Query req=em.createQuery("select empl from Employe empl where empl.nomEmploye like=:x");
		req.setParameter("x", "%"+mc+ "%");
		return req.getResultList();
	}
	@Override
	public List<Equipe> consulterListeEquipe(String mc) {
		Query req=em.createQuery("select eq from Client eq where eq.nomEqui like=:x");
		req.setParameter("x", "%"+mc+ "%");
		return req.getResultList();
		
	}
	
	@Override
	public List<Compte> getCompteByGestionnaire(long refGest) {
		Query req=em.createQuery("select cp from Compte cp where cp.gestionnaires.refGest=:x");
		req.setParameter("x", refGest);
		return req.getResultList();
	
	}

	@Override
	public List<Employe> getEmployeByEquipe(long refEqui) {
		Query req=em.createQuery("select epl from Employe epl where epl.equipes.refEqui.refEqui=:x");
		req.setParameter("x", refEqui);
		return req.getResultList();
	}

	
	
	

}
