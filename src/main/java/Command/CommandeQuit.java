package Command;

import java.util.Scanner;

import Forme_Graphique.Affichage;

public class CommandeQuit implements Commande {

	  private Interpreteur interprete;

	  public CommandeQuit(Interpreteur interpreteur) {
	    this.interprete=interpreteur;
	  }

	  @Override
	  public void execute() {
	    Affichage a = new Affichage();
	    a.posting("Voulez vous sauvegarder ?");
	    String SaisieUser;
	    Scanner sc;
	    while (true) {
	      sc = new Scanner(System.in);
	      SaisieUser= sc.nextLine();
	      if (SaisieUser.compareTo("Oui")==0) {
	        CommandeSave save = new CommandeSave(interprete);
	        save.execute();
	        System.exit(0);
	      }
	      if (SaisieUser.compareTo("Non")==0){
	        System.exit(1);
	      }
	    }

	  }
	}