package uvsq21921354;


import org.junit.Test;

import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.Groupe_FormeGraphique;
import Forme_Graphique.Rectangle;
import Forme_Graphique.Triangle;

/**
 * 
 * Classe qui teste la classe Groupe_FormeGraphique
 *
 */
public class Groupe_FormeGraphiqueTest {
	@Test
	  public void addFormeGraphiqueCercleTest() {
	    Cercle c1 = new Cercle("c1",0,0,1);
	    Cercle c2 = new Cercle("c2",11,11,14);
	    Groupe_FormeGraphique listeForme =  new Groupe_FormeGraphique("nom");
	    listeForme.addFormeGraphique(c1);
	    listeForme.addFormeGraphique(c2);
	    listeForme.printForme();
	  
	  }
	
	/**
	 * Méthode qui teste la méthode move()
	 */
	@Test
	  public void moveCercleTest() {
	    Cercle c1 = new Cercle("c1",0,0,5);
	    Cercle c2 = new Cercle("c2",1,1,13);
	    Cercle c3= new Cercle("c3",12,12,15);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique("nom");
	    forme1.addFormeGraphique(c1);
	    forme1.addFormeGraphique(c2);
	    forme1.addFormeGraphique(c3);   
	    forme1.move(5,10);
	    
	    forme1.printForme();
		 
	 }
	 
	 @Test
	  public void addFormeGraphiqueCarreTest() {
	    Carre c1 = new Carre("c1",5,5,10);
	    Carre c2 = new Carre("c2",11,11,14);
	    Groupe_FormeGraphique listeForme =  new Groupe_FormeGraphique("nom");
	    listeForme.addFormeGraphique(c1);
	    listeForme.addFormeGraphique(c2);
	    listeForme.printForme();
	  }
	 
	 @Test
	  public void moveCarreTest() {
	    Carre c1 = new Carre("c1",0,0,5);
	    Carre c2 = new Carre("c2",1,1,13);
	    Carre c3= new Carre("c3",12,12,15);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique("nom");
	    forme1.addFormeGraphique(c1);
	    forme1.addFormeGraphique(c2);
	    forme1.addFormeGraphique(c3);   
	    forme1.move(5,10);
	    
	    forme1.printForme();
		 
	 }
	
	 @Test
	  public void addFormeGraphiqueRectangleTest() {
	    Rectangle R1 = new Rectangle("R1",5,5,10,5);
	    Rectangle R2 = new Rectangle("R2",11,11,14,10);
	    Groupe_FormeGraphique listeForme =  new Groupe_FormeGraphique("nom");
	    listeForme.addFormeGraphique(R1);
	    listeForme.addFormeGraphique(R2);
	    //System.out.println(listeForme.formes.size());
	  }
	 
	 @Test
	  public void moveRectangleTest() {
	    Rectangle R1 = new Rectangle("R1",0,0,5,2);
	    Rectangle R2 = new Rectangle("R2",1,1,13,7);
	    Rectangle R3= new Rectangle("R3",12,12,15,8);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique("nom");
	    forme1.addFormeGraphique(R1);
	    forme1.addFormeGraphique(R2);
	    forme1.addFormeGraphique(R3);   
	    forme1.move(5,10);
	    
	    forme1.printForme();
		 
	 }
	 
	 @Test
	  public void addFormeGraphiqueTriangleTest() {
		 Triangle T1 = new Triangle("T1",2,2,5,6,7,8);
		 Triangle T2 = new Triangle("T2",2,2,5,6,7,8);
	    Groupe_FormeGraphique listeForme =  new Groupe_FormeGraphique("nom");
	    listeForme.addFormeGraphique(T1);
	    listeForme.addFormeGraphique(T2);
	    
	    listeForme.printForme();
	  }
	 
	 @Test
	  public void moveTriangleTest() {
		 Triangle T1 = new Triangle("T1",2,2,5,6,7,8);
	   Triangle T2 = new Triangle("T2",8,2,5,6,7,8);
	   Triangle T3 = new Triangle("T3",0,2,5,6,7,8);
	    Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique("nom");
	    forme1.addFormeGraphique(T1);
	    forme1.addFormeGraphique(T2);
	    forme1.addFormeGraphique(T3);   
	    forme1.move(5,10);
	    
	    forme1.printForme();
		 
	 }
	 
}
