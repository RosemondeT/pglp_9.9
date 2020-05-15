package uvsq21921354;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Classe qui teste la méthode DrawingTUI
 *
 */
public class DrawingTUITest {

	/**
	 * Méthode qui teste la méthode nextCommande()
	 */
	 @Test
	  public void nextCommande(){
	    DrawingTUI draw = new DrawingTUI();
	    Commande commande = draw.nextCommande("Cercle(C1,(0,0),4)");
	    assertNotEquals(commande,null);
	  }

	 
}
