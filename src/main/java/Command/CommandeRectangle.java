package Command;

import java.util.ArrayList;

import Forme_Graphique.Affichage;
import Forme_Graphique.Cercle;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Rectangle;
import Persistence.RectangleDAO;

public class CommandeRectangle implements Commande {
	private Interpreteur interprete;
	  
	  /**
	   * Constructeur
	   * @param interpreteur
	   */
	  public CommandeRectangle(Interpreteur interpreteur){
	    this.interprete=interpreteur;
	  }

	  @Override
	  public void execute() {
	    if (interprete.parametersT.length != 5) {
	      Affichage a = new Affichage();
	      a.posting("Erreur!!!! nombre de paramètres insuffisant pour dessiner un rectangle.");
	    }
	    else{
	      try {
	        interprete.undo.push(new ArrayList<>( interprete.dessin));
	        interprete.redo.clear();
	        double x = Integer.parseInt( interprete.parametersT[1]);
	        double y = Integer.parseInt( interprete.parametersT[2]);
	        double z = Double.parseDouble( interprete.parametersT[3]);
	        double t = Double.parseDouble( interprete.parametersT[4]);
	        
	        if(z<=t) {
	        	Affichage a = new Affichage();
	  	      a.posting("Erreur!!!! la largeur d'un rectangle doit être inférieure à la longueur .");
	  	    
	        	
	        }else interprete.dessin.add(new Rectangle( interprete.parametersT[0],x,y,z,t));   System.out.println("Figure Rectangle crée avec succès");
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }
}
