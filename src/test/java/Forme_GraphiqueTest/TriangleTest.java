package uvsq21921354;



import org.junit.Test;

import Forme_Graphique.Triangle;

public class TriangleTest {

	@Test
	  public void moveTest(){
	    Triangle T1 = new Triangle("T1",0,0,2,3,4,5);
	    System.out.println(T1.toString());
	    T1.move(5,4);
	    System.out.println(T1.toString());
	  }
	
	@Test
	  public void ViewTest() {
	    Triangle T1 = new Triangle("T1",0,0,10,3,5,6);
	    T1.printForme();
	  }

}
