package uvsq21921354;


import org.junit.Test;

import Forme_Graphique.Carre;

public class CarreTest {
	
	@Test
	  public void moveCarreTest(){
	    Carre carre = new Carre("D1",0,0,2);
	    System.out.println( carre.toString());
	    carre.move(5,4);
	    System.out.println(carre.toString());
	  }
	
	@Test
	  public void ViewTest() {
	    Carre c1 = new Carre("c1",0,0,10);
	    c1.printForme();
	  }

}
