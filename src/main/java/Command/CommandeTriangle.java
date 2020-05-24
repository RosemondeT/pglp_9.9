package Command;
import Exception.ParametresIncorrectsException;
import Forme_Graphique.Triangle;
/**
 * 
 * Classe CommandeTriangle implémente l'interface Commande.
 * Cette classe implémente la méthode execute de l'interface Commande.
 * On fait appelle à cette classe lorque l'utilisateur passe une commande
 * pour créer un Triangle
 *
 */

public class CommandeTriangle implements Commande {
	private Interpreter interprete;
	  
	  /**
	   * Constructeur
	   * @param interpreteur
	   */
	  public CommandeTriangle(Interpreter interpreteur){
	    this.interprete=interpreteur;
	  }
	  /**
	   * Implémentation de la méthode execute. Cette méthode permet
	   * de vérifier d'abord le nombre de paramètre entré par l'utlisateur
	   * pour créer un triangle avant de passer à la création du triangle
	   */
	  @Override
	  public void execute() throws ParametresIncorrectsException {
	    if (interprete.parametresCommande.length != 7) {
	    	throw new ParametresIncorrectsException();
	    }
	    else{
	      try {
	       
	        double x = Integer.parseInt( interprete.parametresCommande[1]);
	        double y = Integer.parseInt( interprete.parametresCommande[2]);
	        double z = Double.parseDouble( interprete.parametresCommande[3]);
	        double t = Double.parseDouble( interprete.parametresCommande[4]);
	        double u = Double.parseDouble( interprete.parametresCommande[5]);
	        double v = Double.parseDouble( interprete.parametresCommande[6]);
	        
	         interprete.Liste_FormeGraphique.add(new Triangle( interprete.parametresCommande[0],x,y,z,t, u, v));
	         System.out.println("Figure Triangle crée avec succès");
			    
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }
	  
	  
	
}
