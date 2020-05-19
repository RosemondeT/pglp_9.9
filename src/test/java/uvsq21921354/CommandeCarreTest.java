package uvsq21921354;



import org.junit.Test;


import Command.CommandeCarre;
import Command.Interpreteur;
import Interface_Utilisateur.DrawingTUI;

public class CommandeCarreTest {

	@Test
	  public void executeBonsParametresTest() {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c1", "0", "0", "4"});
	    CommandeCarre commandeCarre = new CommandeCarre(interprete);
	    commandeCarre.execute();
	    DrawingTUI afficheCarre = new DrawingTUI();
	    afficheCarre.printDessin(interprete);
	  }

	 @Test
	  public void executeNombreDeParametresInsuffisantTest(){
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c2", "0", "14"});
	    CommandeCarre commandeCarre = new CommandeCarre(interprete);
	    commandeCarre.execute();
	    DrawingTUI afficheCarre = new DrawingTUI();
	    afficheCarre.printDessin(interprete);
	  }

	 @Test
	  public void executeMauvaisParametreTest() throws Exception{
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c3", "5", "4", "abcd"});
	    CommandeCarre commandeCarre = new CommandeCarre(interprete);
	    commandeCarre.execute();
	    DrawingTUI afficheCarre = new DrawingTUI();
	    afficheCarre.printDessin(interprete);
	  }

}
