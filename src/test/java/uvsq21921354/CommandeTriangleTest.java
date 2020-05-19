package uvsq21921354;


import org.junit.Test;



import Command.CommandeTriangle;
import Command.Interpreteur;
import Interface_Utilisateur.DrawingTUI;

public class CommandeTriangleTest {


	@Test
	  public void executeBonsParametresTest() {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"r1", "0", "0", "10", "3", "6", "1"});
	    CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
	    commandeTriangle.execute();
	    DrawingTUI afficheTriangle = new DrawingTUI();
	    afficheTriangle.printDessin(interprete);
	  }


	@Test
	  public void executeNombreDeParametresInsuffisantTest(){
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"R2", "0", "14"});
	    CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
	    commandeTriangle.execute();
	    DrawingTUI afficheTriangle = new DrawingTUI();
	    afficheTriangle.printDessin(interprete);}
	  

	@Test
	  public void executeMauvaisParametreTest() throws Exception{
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c3", "5", "4", "5", "3", "0", "zygeai"});
	    CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
	    commandeTriangle.execute();
	    DrawingTUI afficheTriangle = new DrawingTUI();
	    afficheTriangle.printDessin(interprete);
	  }


}
