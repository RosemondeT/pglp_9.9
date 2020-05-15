package uvsq21921354;


import org.junit.Test;

/**
 * 
 *Classe qui teste la classe CommandeCercle
 *
 */
public class CommandeCercleTest {

	/**
	 * Méthodes qui testent la méthode execute()
	 */
	 @Test
	  public void executeTest(){
		 Groupe_FormeGraphique forme = new Groupe_FormeGraphique();
	    CommandeCercle commandeCercle = new CommandeCercle(new String[]{"C1", "10", "10", "40"}, forme);
	    commandeCercle.execute();
	    forme.AffichageGroupe();
	  }
	 
	 @Test
	  public void executeErreurTest(){
		 Groupe_FormeGraphique forme1 = new Groupe_FormeGraphique();
	    CommandeCercle commandeCercle = new CommandeCercle(new String[]{"C2", "0", "4"},forme1);
	    commandeCercle.execute();
	    forme1.AffichageGroupe();
	  }
	 
	 
	 @Test
	  public void executeErreurTest1(){
		 Groupe_FormeGraphique forme2 = new Groupe_FormeGraphique();
	    CommandeCercle commandeCercle = new CommandeCercle(new String[]{"C3", "20", "20", "afgeiu"},forme2);
	    commandeCercle.execute();
	    forme2.AffichageGroupe();
	  }



}
