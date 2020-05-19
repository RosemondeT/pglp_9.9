package uvsq21921354;



import org.junit.Test;


import Command.CommandeRectangle;
import Command.Interpreteur;
import Interface_Utilisateur.DrawingTUI;

public class CommandeRectangleTest {

	@Test
	  public void executeBonsParametresTest() {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"r1", "0", "0", "10", "3"});
	    CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
	    commandeRectangle.execute();
	    DrawingTUI afficheRectangle = new DrawingTUI();
	    afficheRectangle.printDessin(interprete);
	  }

	@Test
	 public void executeMauvaisParametresTest() {
		    Interpreteur interprete = new Interpreteur();
		    interprete.setParametersT(new String[]{"r1", "0", "0", "4", "9"});
		    CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
		    commandeRectangle.execute();
		    DrawingTUI afficheRectangle = new DrawingTUI();
		    afficheRectangle.printDessin(interprete);
		  }

	 @Test
	  public void executeNombreDeParametresInsuffisantTest(){
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"R2", "0", "14"});
	    CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
	    commandeRectangle.execute();
	    DrawingTUI afficheRectangle = new DrawingTUI();
	    afficheRectangle.printDessin(interprete);
	  }

	@Test
	  public void executeMauvaisParametreTest() throws Exception{
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c3", "5", "4", "5", "abcd"});
	    CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
	    commandeRectangle.execute();
	    DrawingTUI afficheRectangle = new DrawingTUI();
	    afficheRectangle.printDessin(interprete);
	  }



}
