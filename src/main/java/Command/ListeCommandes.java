package uvsq21921354;

import java.util.HashMap;

/**
 * 
 * Classe qui permet de dresser une liste des commandes
 *
 */
public class ListeCommandes {
	 protected HashMap<String,Commande> set = new HashMap<>();
	  private String[] parametres;
	  private Groupe_FormeGraphique forme;
	  
	  /**
	   * Constructeur de la classe
	   */
	  public ListeCommandes(){
	    set.put("Cercle",new CommandeCercle(parametres,forme));
	  }

	  /**
	   * Méthodes qui permet de modifier les paramètres
	   * @param parametres
	   */
	  public void setParametersT(String[] parametres) {
	    this.parametres = parametres;
	  }

}
