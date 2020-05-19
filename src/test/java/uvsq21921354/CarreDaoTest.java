package uvsq21921354;



import org.junit.Test;

import Forme_Graphique.Carre;
import Persistence.CarreDAO;
import Persistence.DAO;

public class CarreDaoTest {
	@Test
	  public void InsertTest(){
		
	    Carre c1 = new Carre("c2",3,3,5);
	    DAO<Carre> D = new CarreDAO();
	    D.create(c1);
	    
	  }
	
	@Test
    public void FindTest(){
	    CarreDAO carre = new CarreDAO();
		carre.find("c2"); 
	    
	  }
	
	@Test
    public void UpdateTest(){
		 Carre c3 = new Carre("c3",3,3,5);
		    DAO<Carre> D = new CarreDAO();
		   D.update(c3);
		   
	  }
	
	@Test
	public void deleteTest() {
		 Carre c5 = new Carre("c5",3,3,5);
		 DAO<Carre> D = new CarreDAO();
		 D.create(c5);
		 D.delete(c5);
	}
	

}
