package Forme_Graphique;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Le Composite
 *
 */
public class Groupe_FormeGraphique implements FormeGraphique {
	 public String nom;
	  public List<FormeGraphique> liste = new ArrayList<>();

	  public Groupe_FormeGraphique(String nom){
	    this.nom=nom;
	  }

	  public void addFormeGraphique(FormeGraphique f){
		  liste.add(f);
	  }

	  public void remove(FormeGraphique f){ liste.remove(f); }


	  @Override
	  public String getNom() {
	    return nom;
	  }

	@Override
	public void move(double x, double y) {
		for (FormeGraphique f : liste){
		      f.move(x,y);
		    }
		
	}

	@Override
	public void printForme() {
		for (FormeGraphique f : liste){
		      f.printForme();
		    }
	}
	}


