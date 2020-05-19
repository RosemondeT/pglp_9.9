package uvsq21921354;



import org.junit.Test;

import Forme_Graphique.Rectangle;
import Persistence.DAO;
import Persistence.RectangleDAO;

public class RectangleDAOTest {

	@Test
	  public void InsertTest(){
		
	    Rectangle R1 = new Rectangle("R1",3,3,5,2);
	    DAO<Rectangle> D = new RectangleDAO();
	    D.create(R1);
	    
	  }
	
	@Test
    public void FindTest(){
	    RectangleDAO rectangle = new RectangleDAO();
		rectangle.find("R1"); 
	    
	  }

	
	@Test
    public void UpdateTest(){
		 Rectangle R2 = new Rectangle("R2",4,4,5,2);
		    DAO<Rectangle> D = new RectangleDAO();
		   D.update(R2);
		   
	  }
	
	@Test
	public void deleteTest() {
		 Rectangle R3 = new Rectangle("R3",3,3,5,1);
		 DAO<Rectangle> D = new RectangleDAO();
		 D.create(R3);
		 D.delete(R3);
	}
}
