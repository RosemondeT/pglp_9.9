package uvsq21921354;



import org.junit.Test;


import Forme_Graphique.Cercle;
import Persistence.CercleDAO;
import Persistence.DAO;
import Persistence.DAOFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Classe qui teste la classe DAOTest
 *
 */
public class CercleDAOTest {
	
	
/**
 * Test de la méthode qui teste la méthode create()
 */
	@Test
	  public void InsertTest(){
		
	    Cercle c2 = new Cercle("c4",3,3,5);
	    DAO<Cercle> D = new CercleDAO();
	    D.create(c2);
	    
	  }
	
 
	@Test
    public void FindTest(){
	    CercleDAO cercle = new CercleDAO();
		cercle.find("c3"); 
	    
	  }
	
	@Test
    public void UpdateTest(){
		 Cercle c3 = new Cercle("c3",3,3,5);
		    DAO<Cercle> D = new CercleDAO();
		   D.update(c3);
		   
	  }
	
	@Test
	  public void findAll() throws Exception {
	    List<Cercle> ls = new ArrayList<>();
	    ls.addAll(DAOFactory.getCercleDAO().findAll());
	    
	    System.out.println(ls);
	  }
	
	@Test
	public void deleteTest() {
		 Cercle c5 = new Cercle("c5",3,3,5);
		 DAO<Cercle> D = new CercleDAO();
		 D.create(c5);
		 D.delete(c5);
	}
	    
	    
	 
	 
	 


}
