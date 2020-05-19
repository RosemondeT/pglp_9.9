package Command;

import java.util.ArrayList;

import Forme_Graphique.Affichage;
import Forme_Graphique.Triangle;


public class CommandeTriangle implements Commande {
	private Interpreteur interprete;
	  
	  /**
	   * Constructeur
	   * @param interpreteur
	   */
	  public CommandeTriangle(Interpreteur interpreteur){
	    this.interprete=interpreteur;
	  }

	  @Override
	  public void execute() {
	    if (interprete.parametersT.length != 7) {
	      Affichage a = new Affichage();
	      a.posting("Erreur!!!! nombre de paramètres insuffisant pour dessiner un Triangle.");
	    }
	    else{
	      try {
	        interprete.undo.push(new ArrayList<>( interprete.dessin));
	        interprete.redo.clear();
	        double x = Integer.parseInt( interprete.parametersT[1]);
	        double y = Integer.parseInt( interprete.parametersT[2]);
	        double z = Double.parseDouble( interprete.parametersT[3]);
	        double t = Double.parseDouble( interprete.parametersT[4]);
	        double u = Double.parseDouble( interprete.parametersT[5]);
	        double v = Double.parseDouble( interprete.parametersT[6]);
	        
	         interprete.dessin.add(new Triangle( interprete.parametersT[0],x,y,z,t, u, v));
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }
	  
	  
	
}
