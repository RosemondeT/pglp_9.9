package CommandTest;
import org.junit.Test;
import Command.CommandeTriangle;
import Command.Interpreter;
import Exception.ParametresIncorrectsException;

/**
 * Permet de tester les méthodes de la classe CommandeTriangle
 *
 */
public class CommandeTriangleTest {


	@Test
	  public void executeBonsParametresTest() throws ParametresIncorrectsException {
	    Interpreter interprete = new Interpreter();
	    interprete.parametresCommande(new String[]{"r1", "0", "0", "10", "3", "6", "1"});
	    CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
	    commandeTriangle.execute();
	 
	  }


	

}
