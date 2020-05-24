package uvsq21921354;



import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Persistence.CarreDAO;
import Persistence.DAO;
import Persistence.DAOFactory;

public class CarreDaoTest {
	@Test
	  public void InsertTest(){
		
    Carre c1 = new Carre("att",3,3,5);
   DAO<Carre> D = new CarreDAO();
   D.create(c1);
	    D.find("att").printForme();
	    
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
	@Test
	  public void findAll() throws Exception {
	    List<Carre> ls = new ArrayList<>();
	    ls.addAll(DAOFactory.getCarreDAO().findAll());
	    
	    System.out.println(ls);
	  }

}
