package Command;

import java.util.Scanner;

import Forme_Graphique.Affichage;
import Persistence.DAOFactory;

public class CommandeLoad implements Commande {

	  public Interpreteur interpreteur;
	  public CommandeLoad(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  @Override
	  public void execute() {
	    Affichage a = new Affichage();
	    a.posting("Charger ?");
	    String reponseUtilisateur;
	    Scanner sc;
	    do {
	      sc = new Scanner(System.in);
	      reponseUtilisateur= sc.nextLine();
	    }while (!(reponseUtilisateur.equals("Oui"))||!(reponseUtilisateur.equals("Non")));
	    if (reponseUtilisateur.equals("Oui")) {
	      interpreteur.dessin.addAll(DAOFactory.getCercleDAO().findAll());
	      interpreteur.dessin.addAll(DAOFactory.getCarreDAO().findAll());
	      interpreteur.dessin.addAll(DAOFactory.getRectangleDAO().findAll());
	      interpreteur.dessin.addAll(DAOFactory.getTriangleDAO().findAll());
	    }
	    System.exit(12);
	  }
	}