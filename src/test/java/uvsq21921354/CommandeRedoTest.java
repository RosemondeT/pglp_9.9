package uvsq21921354;



import org.junit.Test;

import Command.CommandeCercle;

import Command.Interpreteur;
import Interface_Utilisateur.DrawingTUI;



public class CommandeRedoTest {
  @Test
  public void execute() throws Exception {
    Interpreteur interprete = new Interpreteur();
    interprete.setParametersT(new String[]{"c7", "2", "2", "6"});
    CommandeCercle Cercle = new CommandeCercle(interprete);
    Cercle.execute();
    interprete.setParametersT(new String[]{"c8", "5", "5", "2"});
    Cercle = new CommandeCercle(interprete);
    Cercle.execute();
    DrawingTUI commande = new DrawingTUI();
    commande.printDessin(interprete);
    
    DrawingTUI commandeUndo = new DrawingTUI();
    commandeUndo.printDessin(interprete);
    
    commande = new DrawingTUI();
    commande.printDessin(interprete);
    
    DrawingTUI commandeRedo = new DrawingTUI();
    commandeRedo.printDessin(interprete);
    
    commande = new DrawingTUI();
    commande.printDessin(interprete);
    
    
  }

}