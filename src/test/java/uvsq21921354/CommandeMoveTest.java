package uvsq21921354;



import org.junit.Test;


import Command.CommandeCercle;
import Command.CommandeMove;
import Command.Interpreteur;

import Interface_Utilisateur.DrawingTUI;

public class CommandeMoveTest {

	
	  @Test
  public void executeTest(){
    Interpreteur interprete = new Interpreteur();
    interprete.setParametersT(new String[]{"c5", "0", "0", "1"});
    CommandeCercle commandeCercle = new CommandeCercle(interprete);
    commandeCercle.execute();
    interprete.setParametersT(new String[]{"c5", "50", "50"});
   CommandeMove commandeMove = new CommandeMove(interprete);
   commandeMove.execute();

//	    /*DrawingTUI afficheMove = new DrawingTUI();
//	    afficheMove.printDessin(interprete);*/
//	  }

}}
