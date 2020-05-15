package uvsq21921354;


import org.junit.Test;

/**
 * 
 * Classe qui teste la classe Groupe_FormeGraphique
 *
 */
public class Groupe_FormeGraphiqueTest {
	@Test
	  public void addFormeGraphiqueTest() {
	    Cercle c1 = new Cercle("c1",0,0,1);
	    Cercle c2 = new Cercle("c2",0,11,14);
	    Groupe_FormeGraphique listeForme =  new Groupe_FormeGraphique();
	    listeForme.addFormeGraphique(c1);
	    listeForme.addFormeGraphique(c2);
	    System.out.println(listeForme.formes.size());
	  }
	
	/**
	 * Méthode qui teste la méthode move()
	 */
	 @Test
	  public void moveTest() {
	    Cercle c1 = new Cercle("c1",0,0,5);
	    Cercle c2 = new Cercle("c2",0,1,13);
	    Cercle c3= new Cercle("c3",12,0,15);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique();
	    forme1.addFormeGraphique(c1);
	    forme1.addFormeGraphique(c2);
	    forme1.addFormeGraphique(c3);   
	    forme1.move(5,10);
	    
	    forme1.AffichageGroupe();
		 
	 }
	 
}
