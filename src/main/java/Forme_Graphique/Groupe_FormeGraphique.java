package Forme_Graphique;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


/**
 * 
 * Le Composite Groupe_FormeGraphique qui permet
 * de manipiler un ensemble de Forme Graphique
 *
 */
public class Groupe_FormeGraphique implements FormeGraphique {
	 public String nom;
	  public List<FormeGraphique> liste = new ArrayList<>();
/**
 * Constructeur
 * @param nom
 */
	  public Groupe_FormeGraphique(String nom){
	    this.nom=nom;
	  }
/**
 * Méthode qui permet d'ajouter un element dans la liste
 * @param f
 */
	  public void addFormeGraphique(FormeGraphique f){
		  liste.add(f);
	  }
/**
 * Méthode qui permet de supprimer un elemnt dans la liste
 * @param f
 */
	  public void remove(FormeGraphique f){ liste.remove(f); }

/**
 * Implémentation de la méthode getNom() qui permet de retourner
 * le nom d'une forme graphique donnée
 */
	  @Override
	  public String getNom() {
	    return nom;
	  }
/**
 * Implementation de la méthode move qui permet le déplacement d'un ensemble
 * de forme graphique
 */
	@Override
	public void move(double x, double y) {
		for (FormeGraphique f : liste){
		      f.move(x,y);
		    }	
	}
/**
 * Implémentation de la méthode printForme() qui permet
 * l'affichage de la liste des formes graphique
 */
	@Override
	public void printForme() {
		for (FormeGraphique f : liste){
		      f.printForme();
		    }
	}
	/**
	 * Cette méthode permet de parcourir l'ensemble de la liste
	 * @return
	 */
	public Iterator<FormeGraphique> iterator() {
		
		return liste.iterator();
	}
	}


