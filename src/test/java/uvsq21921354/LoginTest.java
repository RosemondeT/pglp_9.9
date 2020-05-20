package uvsq21921354;

import org.junit.Test;

import Persistence.Login;

/**
 * 
 * Classe qui teste la classe Login
 *
 */
public class LoginTest {
	
	/**
	 * Méthode qui teste la méthode seConnectT()
	 */
	@Test
	  public void seConnectTest(){
	    Login db = new Login();
	    db.seConnecter();
	  }

	 /**
		 * Méthode qui teste la méthode createTables()
		 */
	 
   @Test
	  public void createTableCercleTest(){
	    Login db = new Login();
	    db.createTableCercle();
	  }
	
	/**
	 * Méthode qui teste la méthode DropTables()
	 */
	/*@Test
	  public void DropTableCercleTest(){
	    Login db = new Login();
	    db.DropTableCercle();
	  }*/

	@Test
	  public void createTableCarreTest(){
	    Login db = new Login();
	    db.createTableCarre();
	  }
	  
	/* @Test
	  public void DropTableCarreTest(){
	    Login db = new Login();
	    db.DropTableCarre();
	  }*/
	  
	  @Test
	  public void createTableRectangleTest(){
	    Login db = new Login();
	    db.createTableRectangle();
	  }
	  
	 /*@Test
	  public void DropTableRectangleTest(){
	    Login db = new Login();
	    db.DropTableRectangle();}*/

	
	@Test
	  public void createTableTriangleTest(){
	    Login db = new Login();
	    db.createTableTriangle();
	  }
	
	 /*@Test
	  public void DropTableTriangleTest(){
	    Login db = new Login();
	    db.DropTableTriangle();}*/
}
