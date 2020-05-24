package PersistenceTest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;
import Forme_Graphique.Triangle;
import Persistence.DAO;
import Persistence.Login;
import Persistence.TriangleDAO;

/**
 * Permet de tester les méthodes de la classe TriangleDAO
 *
 */
/*public class TriangleDAOTest {
	
	@Before
	  public void seConnectTest(){
	    Login db = new Login();
	    db.seConnecter();
	    db.DropTableTriangle();
	    db.createTableTriangle();
	  }
	

	@Test
	  public void InsertTest(){
		
	    Triangle T2 = new Triangle("T4",3,3,5,6,7,8);
	    DAO<Triangle> D = new TriangleDAO();
	    D.create(T2);
	    assertNotNull(D.create(T2));
	  }
	
	@Test
    public void FindTest(){
		Triangle T1 = new Triangle("T1",3,3,5,6,7,8);
	    DAO<Triangle> D = new TriangleDAO();
	    D.create(T1);
	   // assertNull(D.find("T1"));
	    //D.find("T1").printForme();
	    //assertNotNull(D.find("T1"));
	    
	  }
	
	@Test
    public void UpdateTest(){
		 Triangle T3 = new Triangle("T3",2,2,5,6,7,8);
		    DAO<Triangle> D = new TriangleDAO();
		   D.update(T3);
		   assertNotNull(D.update(T3));
		   
	  }
	
	@Test
	public void deleteTest() {
		 Triangle T4 = new Triangle("T4",9,9,5,6,7,8);
		 DAO<Triangle> D = new TriangleDAO();
		 D.create(T4);
		 D.delete(T4);
	}
	
	

}*/
