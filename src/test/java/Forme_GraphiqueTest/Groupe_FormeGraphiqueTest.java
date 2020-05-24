package Forme_GraphiqueTest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Iterator;
import org.junit.Test;
import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Groupe_FormeGraphique;


/**
 * 
 * Classe qui teste les méthodes de la classe Groupe_FormeGraphique
 *
 */
public class Groupe_FormeGraphiqueTest {
	@Test
	  public void addFormeGraphiqueCercleTest() {
		Groupe_FormeGraphique groupe = new Groupe_FormeGraphique("Carre");
		Carre carre = new Carre("carre", 0,0, 1);
		Carre carre1 = new Carre("carre1",1,1, 3);
		groupe.addFormeGraphique(carre);
		groupe.addFormeGraphique(carre1);
		assertTrue(groupe.liste.size() == 2 );
		assertTrue(groupe.liste.get(0) == carre);
		assertTrue(groupe.liste.get(1) == carre1);
	  
	  }
	
	@Test
	public void testSupprimerForme() {
		Groupe_FormeGraphique groupe = new Groupe_FormeGraphique("Carre");
		Carre carre = new Carre("carre",1,1, 3);
		Carre carre1 = new Carre("carre2",2,3, 3);
		groupe.addFormeGraphique(carre);
		groupe.addFormeGraphique(carre1);
		groupe.remove(carre);
		assertTrue(groupe.liste.size() == 1 );
		assertTrue(groupe.liste.get(0) == carre1);	
	}
	
	@Test
	  public void moveGroupeTest() {
	    Cercle c1 = new Cercle("c1",0,0,5);
	    Cercle c2 = new Cercle("c2",1,1,13);
	    Cercle c3= new Cercle("c3",12,12,15);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique("nom");
	    forme1.addFormeGraphique(c1);
	    forme1.addFormeGraphique(c2);
	    forme1.addFormeGraphique(c3);   
	    forme1.move(5,10);
		assertTrue(c1.getCentre().getX() == 5 && c1.getCentre().getY() == 10
				&& c2.getCentre().getX() == 5 && c2.getCentre().getY() == 10
				&& c3.getCentre().getX() == 5 && c3.getCentre().getY() == 10); 
		 
	 }
	
	@Test
	public void IteratorTest() {
		Groupe_FormeGraphique groupe = new Groupe_FormeGraphique("Carre");
		Carre c = new Carre("carré",5,6,7);
		groupe.addFormeGraphique(c);
		Iterator<FormeGraphique> iterator = groupe.iterator();
		assertTrue(iterator.hasNext() && iterator.next()== c);
		assertFalse(iterator.hasNext());
	}
	
}
