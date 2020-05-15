package uvsq21921354;

import org.junit.Test;

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
	  public void createTablesTest(){
	    Login db = new Login();
	    db.createTables();
	  }
	
	/**
	 * Méthode qui teste la méthode DropTables()
	 */
	@Test
	  public void DropTablesTest(){
	    Login db = new Login();
	    db.DropTables();
	  }

}
