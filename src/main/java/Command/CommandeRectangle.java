package Command;
import Exception.ParametresIncorrectsException;
import Exception.RectangleLongueurLargeurException;
import Forme_Graphique.Rectangle;
/**
 * 
 * Classe CommandeRectangle implémente l'interface Commande.
 * Cette classe implémente la méthode execute de l'interface Commande.
 * On fait appelle à cette classe lorque l'utilisateur passe une commande
 * pour créer un Rectangle
 *
 */

public class CommandeRectangle implements Commande {
	private Interpreter interprete;
	  
	  /**
	   * Constructeur
	   * @param interpreteur
	   */
	  public CommandeRectangle(Interpreter interpreteur){
	    this.interprete=interpreteur;
	  }
	  /**
	   * Implémentation de la méthode execute. Cette méthode permet
	   * de vérifier d'abord le nombre de paramètre entré par l'utlisateur
	   * pour créer un rectangle avant de passer à la création du rectangle
	 * @throws RectangleLongueurLargeurException 
	   */
	  @Override
	  public void execute() throws ParametresIncorrectsException, RectangleLongueurLargeurException {
	    if (interprete.parametresCommande.length != 5) {
	    	throw new ParametresIncorrectsException();
	    }
	    else{
	      try {
	       
	        double x = Integer.parseInt( interprete.parametresCommande[1]);
	        double y = Integer.parseInt( interprete.parametresCommande[2]);
	        double z = Double.parseDouble( interprete.parametresCommande[3]);
	        double t = Double.parseDouble( interprete.parametresCommande[4]);
	        
	        if(z<=t) {
	        	throw new RectangleLongueurLargeurException();
	        	
	        }else interprete.Liste_FormeGraphique.add(new Rectangle( interprete.parametresCommande[0],x,y,z,t));   System.out.println("Figure Rectangle crée avec succès");
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }
}
