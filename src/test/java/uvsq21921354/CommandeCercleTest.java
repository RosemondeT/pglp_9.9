package uvsq21921354;


import org.junit.Test;


import Command.CommandeCercle;
import Command.Interpreteur;
import Interface_Utilisateur.DrawingTUI;


/**
 * 
 *Classe qui teste la classe CommandeCercle
 *
 */
public class CommandeCercleTest {
	@Test
	  public void executeBonsParametresTest() {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c1", "0", "0", "4"});
	    CommandeCercle commandeCercle = new CommandeCercle(interprete);
	    commandeCercle.execute();
	    DrawingTUI afficheCercle = new DrawingTUI();
	    afficheCercle.printDessin(interprete);
	  }

	@Test
	  public void executeNombreDeParametresInsuffisantTest(){
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c2", "0", "14"});
	    CommandeCercle commandeCercle = new CommandeCercle(interprete);
	    commandeCercle.execute();
	    DrawingTUI afficheCercle = new DrawingTUI();
	    afficheCercle.printDessin(interprete);
	  }

	 @Test
	  public void executeMauvaisParametreTest() throws Exception{
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c3", "5", "4", "abcd"});
	    CommandeCercle commandeCercle = new CommandeCercle(interprete);
	    commandeCercle.execute();
	    DrawingTUI afficheCercle = new DrawingTUI();
	    afficheCercle.printDessin(interprete);
	  }
	}