package uvsq21921354;



import org.junit.Test;

import Forme_Graphique.Rectangle;

public class RectangleTest {

	@Test
	  public void moveTest(){
	    Rectangle R1 = new Rectangle("R1",0,0,5,3);
	    System.out.println(R1.toString());
	    R1.move(5,4);
	    System.out.println(R1.toString());
	  }
	
	
	 @Test
	  public void ViewTest() {
		 Rectangle R1 = new Rectangle("R1",0,0,5,3);
	    R1.printForme();
	  }

}
