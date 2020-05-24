package CommandTest;
import org.junit.Test;
import Command.CommandeCarre;
import Command.Interpreter;
import Exception.ParametresIncorrectsException;

/**
 * Permet de tester les méthodes de la classe Commandecarre
 */
public class CommandeCarreTest {

	@Test
	  public void executeTest() throws ParametresIncorrectsException {
	    Interpreter interprete = new Interpreter();
	    interprete.parametresCommande(new String[]{"c1", "0", "0", "4"});
	    CommandeCarre commandeCarre = new CommandeCarre(interprete);
	    commandeCarre.execute();
	  }
}
