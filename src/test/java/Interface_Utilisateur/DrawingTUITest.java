package Interface_Utilisateur;

import static org.junit.Assert.*;

import org.junit.Test;

import Command.Commande;
import Exception.CommandeIncorrectException;
import Exception.DrawingNotFoundException;
import Exception.ParametresIncorrectsException;
import Exception.RectangleLongueurLargeurException;
import Interface_Utilisateur.DrawingTUI;

/**
 * 
 * Classe qui teste la méthode de la classe DrawingTUI
 *
 */
public class DrawingTUITest {
	@Test
	  public void nextCommandeTest1() throws ParametresIncorrectsException, CommandeIncorrectException, DrawingNotFoundException, RectangleLongueurLargeurException{
	    DrawingTUI dessin = new DrawingTUI();
	    String saisie="c1 =Cercle( (0, 0), 50)";
	    //Commande commande = dessin.nextCommande(saisie);
	    //assertNotNull(commande);	
	  }

	@Test
	  public void nextCommandeTest2() throws Exception {
	    DrawingTUI dessin = new DrawingTUI();
	    String saisie="quit";
	    //Commande commande = dessin.nextCommande(saisie);
	    //assertNotEquals(commande,null);
	  }
	}
