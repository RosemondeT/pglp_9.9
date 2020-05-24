package Command;
import java.util.Scanner;
import Forme_Graphique.Affichage;
/**
 * Cette classe implémente la l'interface Commande ainsi que la
 * méthode execute. On fait appelle à cette classe lorsque l'utilisateur
 * désire quitter le programme
 *
 */
public class CommandeQuit implements Commande {

	  private Interpreter interprete;
/**
 * Constructeur
 * @param interpreteur
 */
	  public CommandeQuit(Interpreter interpreteur) {
	    this.interprete=interpreteur;
	  }
/**
 * Implémentation de la méthode execute qui avant de permettre
 * à l'utlisateur de quitter le programme lui donne la possibilité
 * de sauvegarder les commandes effectuées dans la base de données
 */
	  @Override
	  public void execute() {
	    Affichage a = new Affichage();
	    a.posting("Do you want to save all form y/n?");
	    String SaisieUser;
	    Scanner sc;
	    while (true) {
	      sc = new Scanner(System.in);
	      SaisieUser= sc.nextLine();
	      if (SaisieUser.contentEquals("y") || SaisieUser.contentEquals("Y") || SaisieUser.contentEquals("yes")) {
	        CommandeSave save = new CommandeSave(interprete);
	        save.execute();
	        System.out.println("Vous avez quitter le programme");
	        System.exit(0);
	     
	      }
	      if (SaisieUser.contentEquals("n") || SaisieUser.contentEquals("N") || SaisieUser.contentEquals("no")){
	    	   System.out.println("Vous avez quitter le programme");
	        System.exit(0);
	      }
	    }

	  }
	}