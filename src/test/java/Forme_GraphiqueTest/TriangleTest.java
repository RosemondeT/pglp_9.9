package Forme_GraphiqueTest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Forme_Graphique.Point2D;
import Forme_Graphique.Triangle;

/**
 * Permet de tester les methodes de la classe Triangle
 *
 */
public class TriangleTest {

	@Test
	 public void ConstructeurTriangleTest(){
		Point2D point1 = new Point2D("Point1", 2,3);
		Point2D point2 = new Point2D("Point2", 10,5);
		Point2D point3 = new Point2D("Point3", 0,7);
		Triangle triangle = new Triangle("Triangle", 2, 3, 10, 5, 0, 7);
		assertTrue(triangle.getNom().equals("Triangle") 
				&& triangle.getPoint1().getX() == point1.getX() 
				&& triangle.getPoint1().getY() == point1.getY()   && triangle.getPoint2().getX() == point2.getX()
				&& triangle.getPoint2().getY()==point2.getY()  &&  triangle.getPoint3().getX()==point3.getX()   &&  
				triangle.getPoint3().getY()==point3.getY());
		
	  }
	
	
	@Test
	public void MoveTriangleTest() {
		Triangle triangle = new Triangle("Triangle1", 2, 3, 10, 5, 0, 7);
		Point2D p = new Point2D("Point1",5, 6);
		triangle.move(p.getX(), p.getY());
		assertTrue(triangle.getPoint1().getX() == p.getX() && triangle.getPoint1().getY() == p.getY()
				&& triangle.getPoint2().getX() == p.getX() && triangle.getPoint2().getY() ==p.getY()
		&& triangle.getPoint3().getX() == p.getX() && triangle.getPoint3().getY() == p.getY());
		
			
		
	  }

}
