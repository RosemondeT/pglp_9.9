package uvsq21921354;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * 
 * Le Composite
 *
 */
public class Groupe_FormeGraphique implements FormeGraphique {
	  public List<FormeGraphique> formes = new ArrayList<FormeGraphique>();
	  
	  /**
	   * Ajout dans la liste
	   * @param forme
	   */
	  public void addFormeGraphique(FormeGraphique forme){
		    formes.add(forme);
		  }
	  
	  /**
	   * Déplacement d'une élement de la liste
	   */
	  public void move(double x, double y){
		    for (FormeGraphique forme : formes){
		      forme.move(x,y);
		    }
		  } 
	  /**
	   * Supression d'un element de la liste
	   * @param forme
	   */
	  public void deleteFormeGraphique(FormeGraphique forme){
		    formes.remove(forme);
		  }
	  
	  /**
	   * Affichage des elements de la liste avec Iterator
	   * @return
	   */
	  public Iterator <FormeGraphique> Iterator() {
		  return formes.listIterator();
		
	  }
	  
	  /**
	   * Une autre méthode qui permet l'affichage de la liste sans utiliser Iterator
	   */
	  public void AffichageGroupe(){
		  for (int i=0; i<formes.size(); i++)
		    {
		    	System.out.println(formes.get(i));
		    	
		    	

		    }
		  } 

	

}
