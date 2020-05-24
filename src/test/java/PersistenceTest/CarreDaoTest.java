package PersistenceTest;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import Forme_Graphique.Carre;
import Persistence.CarreDAO;
import Persistence.DAO;
import Persistence.Login;

/**
 * permet de tester les méthodes de la classe CarreDAO
 *
 */
/*public class CarreDaoTest {
	
	@Before
	  public void seConnectTest(){
	    Login db = new Login();
	    db.seConnecter();
	    db.DropTableCarre();
	    db.createTableCarre();
	  }
 
	@Test
	  public void InsertTest(){
		
    Carre c1 = new Carre("att",3,3,5);
   DAO<Carre> D = new CarreDAO();
   D.create(c1);
   assertNotNull( D.create(c1));
	    
	  }
	
	@Test
    public void FindTest(){
		
		Carre c2 = new Carre("carr",3,3,5);
		   DAO<Carre> D = new CarreDAO();
		   D.create(c2);
		   D.find("carr").printForme();
		   assertNotNull( D.find("carr"));	
	  }
	
	@Test
    public void UpdateTest(){
		 Carre c2 = new Carre("c2",4,3,5);
		    DAO<Carre> D = new CarreDAO();
		   D.update(c2);
		   assertNotNull(D.update(c2));	   
	  }
	
	@Test
	public void deleteTest() {
		 Carre c5 = new Carre("c5",3,3,5);
		 DAO<Carre> D = new CarreDAO();
		 D.create(c5);
		 D.delete(c5);		
	}
}*/
