package Command;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Forme_Graphique.FormeGraphique;
/**
 * 
 * cette classe permet d'identifier le type de commande
 * passer par un utilisateur
 *
 */
public class Interpreter {

	public HashMap<String,Commande> setCommande = new HashMap<>();//qui vas contenir la liste des commandes
	  public String[] parametresCommande; //qui vas contenir les paramètres des différentes commandes
	  public List<FormeGraphique> Liste_FormeGraphique = new ArrayList<>(); // qui vas contenir la liste des formes graphiques
	  
	  /**
	   * Constructeur dans le lequel on a dressé la liste des commandes
	   */
	  public Interpreter(){
		  setCommande.put("Cercle",new CommandeCercle(this));
		  setCommande.put("Carre",new CommandeCercle(this));
		  setCommande.put("Rectangle",new CommandeCercle(this));
		  setCommande.put("Triangle",new CommandeCercle(this));
		  setCommande.put("Move", new CommandeMove(this));   
		  setCommande.put("Quit", new CommandeQuit(this));
		  setCommande.put("Save", new CommandeSave(this));
		  }
	  /**
	   * Méthode permettant d'ajouter les paramètres d'une commande
	   * @param parametresCommande
	   */
	  public void parametresCommande(String[] parametresCommande) {
		    this.parametresCommande = parametresCommande;
		  }
        /**
         * Méthode permettant d'afficher la liste des commandes
         */
		  public void print() {
		    for(FormeGraphique forme : this.Liste_FormeGraphique){
		      forme.printForme();
		    }
		  }
}
