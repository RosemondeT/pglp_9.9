package uvsq21921354;



import org.junit.Test;

import Forme_Graphique.Triangle;
import Persistence.DAO;
import Persistence.TriangleDAO;

public class TriangleDAOTest {

	@Test
	  public void InsertTest(){
		
	    Triangle T2 = new Triangle("T2",3,3,5,6,7,8);
	    DAO<Triangle> D = new TriangleDAO();
	    D.create(T2);
	    
	  }
	
	@Test
    public void FindTest(){
		TriangleDAO T = new TriangleDAO();
		T.find("T2"); 
	    
	  }
	
	@Test
    public void UpdateTest(){
		 Triangle T3 = new Triangle("T3",2,2,5,6,7,8);
		    DAO<Triangle> D = new TriangleDAO();
		   D.update(T3);
		   
	  }
	
	@Test
	public void deleteTest() {
		 Triangle T4 = new Triangle("T4",9,9,5,6,7,8);
		 DAO<Triangle> D = new TriangleDAO();
		 D.create(T4);
		 D.delete(T4);
	}
	
	

}
