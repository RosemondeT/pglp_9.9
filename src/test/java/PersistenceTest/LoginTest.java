package PersistenceTest;
import org.junit.Before;
import org.junit.Test;
import Persistence.Login;

/**
 * 
 * Classe qui teste les méthodes de la classe Login
 *
 */
public class LoginTest {
	@Before
	  public void seConnectTest(){
	    Login db = new Login();
	    db.seConnecter();
	    db.deleteTables();
	  }
   @Test
	  public void createTableCercleTest(){
	    Login db = new Login();
	    db.createTableCercle();
	  }
	
	@Test
	  public void createTableCarreTest(){
	    Login db = new Login();
	    db.createTableCarre();
	  }
	  
	  @Test
	  public void createTableRectangleTest(){
	    Login db = new Login();
	    db.createTableRectangle();
	  }
	@Test
	  public void createTableTriangleTest(){
	    Login db = new Login();
	    db.createTableTriangle();
	    
	  }
}
