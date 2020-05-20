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
	    a.posting("Voulez vous sauvegarder les figures crées dans la base de donnés ?");
	    String SaisieUser;
	    Scanner sc;
	    while (true) {
	      sc = new Scanner(System.in);
	      SaisieUser= sc.nextLine();
	      if (SaisieUser.contains("oui")) {
	        CommandeSave save = new CommandeSave(interprete);
	        save.execute();
	        System.exit(0);
	      }
	      if (SaisieUser.contains("non")){
	        System.exit(0);
	      }
	    }

	  }
	}