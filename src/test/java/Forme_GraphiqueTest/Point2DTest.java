package uvsq21921354;
import org.junit.Test;

import Forme_Graphique.Point2D;

/**
 * 
 * Classe qui teste les objets de type Point2D
 *
 */
public class Point2DTest {
	
	/**
	 * Méthode qui teste l'affichage d'un objet crée de type Point2D
	 */
	 @Test
	  public void printPoint2DTest(){
	  Point2D point = new Point2D("Point",5.2,10);
	  point.printPoint2D();
	 
	  }
	 
	 /**
	  * Méthode qui teste le déplacement d'un objet de type Point2D
	  */
	 @Test
	  public void movePoint2DTest(){
	  Point2D point = new Point2D("Point",5.2,10);
	  point.printPoint2D();
	  point.move(2, 0);
	  point.printPoint2D();
	 
	  }
	 

}
