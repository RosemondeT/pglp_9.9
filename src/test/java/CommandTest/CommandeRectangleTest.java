package CommandTest;
import org.junit.Test;
import Command.CommandeRectangle;
import Command.Interpreter;
import Exception.ParametresIncorrectsException;
import Exception.RectangleLongueurLargeurException;

/**
 * Permet de tester les méthode de la classe CommandeRectangle
 *
 */
public class CommandeRectangleTest {

	@Test
	  public void executeTest() throws ParametresIncorrectsException, RectangleLongueurLargeurException {
	    Interpreter interprete = new Interpreter();
	    interprete.parametresCommande(new String[]{"r1", "0", "0", "10", "3"});
	    CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
	    commandeRectangle.execute();
	  
	  }

	



}
