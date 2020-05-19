package uvsq21921354;

import org.junit.Test;

import Forme_Graphique.Cercle;

/**
 * 
 * Classe qui teste l'affichage et le déplacement d'un objet de type Cercle
 *
 */
public class CercleTest {
	
	/**
	 * Méthode qui teste la méthode print()
	 */
	@Test
	  public void printFormeCercleTest() {
	    Cercle c1 = new Cercle("c1",0,0,10);
	    c1.printForme();
	  }


	/**
	 * Méthode qui teste la méthode move()
	 */
	@Test
	  public void moveCercleTest(){
	    Cercle C1 = new Cercle("C1",0,0,2);
	    C1.printForme();
	    C1.move(5,4);
	    C1.printForme();
	  }

	
}
