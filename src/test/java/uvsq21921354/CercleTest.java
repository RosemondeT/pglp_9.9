package uvsq21921354;

import org.junit.Test;

/**
 * 
 * Classe qui teste la classe Cercle
 *
 */
public class CercleTest {

	/**
	 * Méthode qui teste la méthode move()
	 */
	@Test
	  public void moveTest(){
	    Cercle C1 = new Cercle("C1",0,0,2);
	    System.out.println(C1.toString());
	    C1.move(5,4);
	    System.out.println(C1.toString());
	  }

	/**
	 * Méthode qui teste la méthode View()
	 */
	 @Test
	  public void ViewTest() {
	    Cercle c1 = new Cercle("c1",0,0,10);
	    c1.view();
	  }

}
