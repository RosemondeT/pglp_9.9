package PersistenceTest;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import Forme_Graphique.Rectangle;
import Persistence.DAO;
import Persistence.Login;
import Persistence.RectangleDAO;

/**
 * permet de tester les méthodes de la classe RectangleDAO
 *
 */
/*public class RectangleDAOTest {
	
	@Before
	  public void seConnectTest(){
	    Login db = new Login();
	    db.seConnecter();
	    db.DropTableRectangle();;
	    db.createTableRectangle();
	  }
	
	@Test
	  public void InsertTest(){
	    Rectangle R1 = new Rectangle("R2",3,3,5,2);
	    DAO<Rectangle> D = new RectangleDAO();
	    D.create(R1);
	    assertNotNull(D.create(R1));
	    
	  }
	
	@Test
    public void FindTest(){
		Rectangle r1 = new Rectangle("r1",3,3,5,2);
		   DAO<Rectangle> D = new RectangleDAO();
		   D.create(r1);
		  // D.find("r1").printForme();
		  // assertNotNull( D.find("r1"));    
	  }
	
	@Test
    public void UpdateTest(){
		 Rectangle R2 = new Rectangle("R2",4,4,5,2);
		    DAO<Rectangle> D = new RectangleDAO();
		   D.update(R2);
		   assertNotNull(D.update(R2));	   
	  }
	
	@Test
	public void deleteTest() {
		 Rectangle R3 = new Rectangle("R3",3,3,5,1);
		 DAO<Rectangle> D = new RectangleDAO();
		 D.create(R3);
		 D.delete(R3);
	}
}*/
