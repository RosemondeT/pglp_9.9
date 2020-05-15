package uvsq21921354;
import org.junit.Test;

/**
 * 
 * Classe qui teste la classe Point2D
 *
 */
public class Point2DTest {
	
	/**
	 * Méthode qui teste la méthode PostingPoint()
	 */
	 @Test
	  public void PostingPointTest(){
	  Affichage affichage = new Affichage();
	  Point2D point = new Point2D("Point",5.2,10);
	  affichage.posting(point.toString());
	  }


}
