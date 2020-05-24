package Forme_GraphiqueTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Forme_Graphique.Cercle;
import Forme_Graphique.Point2D;

/**
 * 
 * Permet de tester les méthodes de la classe Cercle
 *
 */
public class CercleTest {
	
	/**
	 * Méthode qui teste la méthode print()
	 */
	@Test
	public void ConstructeurCercleTest(){
		Point2D point = new Point2D("Point", 0,0);
		Cercle cercle = new Cercle("Cercle", 0, 0, 10);
		assertTrue(cercle.getNom().equals("Cercle") && cercle.getCentre().getX() == point.getX() 
		&& cercle.getCentre().getY() == point.getY()   && cercle.getRayon() == 10);
	  }
	

	/**
	 * Méthode qui teste la méthode move()
	 */
	@Test
	public void MoveCercleTest() {
		Cercle cercle = new Cercle("Cercle",2,2, 5);
		cercle.move(5, 6);
		assertTrue(cercle.getCentre().getX() == 5 && cercle.getCentre().getY() == 6);
	  }


	
}
