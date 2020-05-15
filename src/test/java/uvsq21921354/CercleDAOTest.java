package uvsq21921354;

import static org.junit.Assert.*;
import org.junit.Test;

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
	  public void createTest(){
	    Cercle c2 = new Cercle("c2",3,3,5);
	    DAO<Cercle> D = new CercleDAO();
	    assertSame(c2,D.create(c2));
	  }

}
