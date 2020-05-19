package Command;


import java.util.ArrayList;

import Forme_Graphique.Affichage;
import Forme_Graphique.Cercle;


/**
 * 
 * Classe CommandeCercle qui implémente l'interface Commande
 *
 */

public class CommandeCercle implements Commande{
  private Interpreteur interprete;
  
  /**
   * Constructeur
   * @param interpreteur
   */
  public CommandeCercle(Interpreteur interpreteur){
    this.interprete=interpreteur;
  }

  @Override
  public void execute() {
    if (interprete.parametersT.length != 4) {
      Affichage a = new Affichage();
      a.posting("Erreur!!!! nombre de paramètres insuffisant pour dessiner un Cercle.");
    }
    else{
      try {
        interprete.undo.push(new ArrayList<>( interprete.dessin));
        interprete.redo.clear();
        double x = Double.parseDouble( interprete.parametersT[1]);
        double y = Double.parseDouble( interprete.parametersT[2]);
        double z = Double.parseDouble( interprete.parametersT[3]);
        interprete.dessin.add(new Cercle( interprete.parametersT[0],x,y,z));
      }catch(NumberFormatException e){
        e.printStackTrace();
      }
    }
  }
}
	  