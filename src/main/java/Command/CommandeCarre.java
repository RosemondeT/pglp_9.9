package Command;
import Exception.ParametresIncorrectsException;
import Forme_Graphique.Carre;
/**
 * 
 * Classe CommandeCarre implémente l'interface Commande.
 * Cette classe implémente la méthode execute de l'interface Commande.
 * On fait appelle à cette classe lorque l'utilisateur passe une commande
 * pour créer un Carre
 *
 */
public class CommandeCarre implements Commande {
	private Interpreter interprete;
	  
	/**
	 * Constructeur de la classe
	 * @param interpreteur
	 */
	  public CommandeCarre(Interpreter interpreteur){
	    this.interprete=interpreteur;
	  }
      
	  /**
	   * Implémentation de la méthode execute. Cette méthode permet
	   * de vérifier d'abord le nombre de paramètre entré par l'utlisateur
	   * pour créer un carré avant de passer à la création du carré
	   */
	  @Override
	  public void execute()throws ParametresIncorrectsException{
	    if (interprete.parametresCommande.length != 4) {
	      throw new ParametresIncorrectsException();
	    }
	    else{
	      try {
	     
	        double x = Double.parseDouble( interprete.parametresCommande[1]);
	        double y = Double.parseDouble( interprete.parametresCommande[2]);
	        double z = Double.parseDouble( interprete.parametresCommande[3]);
	        interprete.Liste_FormeGraphique.add(new Carre( interprete.parametresCommande[0],x,y,z));
	        System.out.println("Figure Carre crée avec succès!!!!");
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }

}
