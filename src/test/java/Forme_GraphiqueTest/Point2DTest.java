package Forme_GraphiqueTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Forme_Graphique.Point2D;
/**
 * 
 * Classe qui teste les méthodes de la classe Point2D
 *
 */
public class Point2DTest {
	 @Test
	 
	    public void ConstructionPoint2DTest() {
	        Point2D point = new Point2D("Point", 0,0);
	        assertTrue(point.getX() == 0 && point.getY() == 0);
	    }
	 @Test
	  public void printPoint2DTest(){
	  Point2D point = new Point2D("Point",3,3);
	  point.printPoint2D();
	 
	  }
	 
	 @Test
		public void movePoint2DTest() {
			Point2D point = new Point2D("Point1", 0,0);
			point.move(3, 4);
			assertTrue(point.getX() == 3 && point.getY() == 4);
		}
}
