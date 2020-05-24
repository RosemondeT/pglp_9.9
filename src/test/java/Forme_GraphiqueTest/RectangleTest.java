package Forme_GraphiqueTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Forme_Graphique.Point2D;
import Forme_Graphique.Rectangle;

/**
 * Permet de tester les méthodes de la classe Rectangle
 *
 */
public class RectangleTest {

	@Test
	 public void ConstructeurRectagleTest(){
		Point2D point = new Point2D("Point", 0,0);
		Rectangle rec = new Rectangle("Rectangle", 0, 0, 10, 5);
		assertTrue(rec.getNom().equals("Rectangle") && rec.getPoint_depart().getX() == point.getX() 
				&& rec.getPoint_depart().getY() == point.getY()   && rec.getLongueur() == 10 && rec.getLargeur()==5);
		
	  }
	
	 @Test
	 public void MoveRectangleTest() {
			Rectangle rec = new Rectangle("Rectangle1", 0, 0, 15, 5);
			rec.move(5, 6);
			assertTrue(rec.getPoint_depart().getX() == 5 && rec.getPoint_depart().getY() == 6);
		  }
}
