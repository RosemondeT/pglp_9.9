package Forme_GraphiqueTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Forme_Graphique.Carre;
import Forme_Graphique.Point2D;

/**
 * Permet de tester les méthodes de la classe carre
 *
 */
public class CarreTest {
	
	@Test
	  public void ConstructeurCarreTest(){
		Point2D point = new Point2D("Point", 0,0);
		Carre carre = new Carre("Carre", 0, 0, 10);
		assertTrue(carre.getNom().equals("Carre") && carre.getPoint_depart().getX() == point.getX() 
		&& carre.getPoint_depart().getY() == point.getY()   && carre.getCote() == 10);
	  }
	
	@Test
	  public void MoveCarreTest() {
		Carre carre = new Carre("Carre",2,2, 5);
		carre.move(5, 6);
		assertTrue(carre.getPoint_depart().getX() == 5 && carre.getPoint_depart().getY() == 6);
	  }

}
