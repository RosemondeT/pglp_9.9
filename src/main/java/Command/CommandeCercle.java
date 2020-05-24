package Command;
import Exception.ParametresIncorrectsException;

import Forme_Graphique.Cercle;

/**
 * 
 * Classe CommandeCercle implémente l'interface Commande.
 * Cette classe implémente la méthode execute de l'interface Commande.
 * On fait appelle à cette classe lorque l'utilisateur passe une commande
 * pour créer un Cercle
 *
 */

public class CommandeCercle implements Commande{
  private Interpreter interprete;
  
  /**
   * Constructeur de la classe
   * @param interpreteur
   */
  public CommandeCercle(Interpreter interprete){
    this.interprete=interprete;
  }
  /**
   * Implémentation de la méthode execute. Cette méthode permet
   * de vérifier d'abord le nombre de paramètre entré par l'utlisateur
   * pour créer un cercle avant de passer à la création du cercle
   */
  @Override
  public void execute() throws ParametresIncorrectsException {
    if (interprete.parametresCommande.length != 4) {
    	 throw new ParametresIncorrectsException();
    }
    else{
      try {
     
        double x = Double.parseDouble( interprete.parametresCommande[1]);
        double y = Double.parseDouble( interprete.parametresCommande[2]);
        double z = Double.parseDouble( interprete.parametresCommande[3]);
        interprete.Liste_FormeGraphique.add(new Cercle( interprete.parametresCommande[0],x,y,z));
        System.out.println("Figure Cercle crée avec succès!!!!");
      }catch(NumberFormatException e){
        e.printStackTrace();
      }
    }
  }
}
	  