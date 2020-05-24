package CommandTest;
import org.junit.Test;
import Command.CommandeCercle;
import Command.Interpreter;
import Exception.ParametresIncorrectsException;

/**
 * 
 *Classe qui teste les méthodes de la classe CommandeCercle
 *
 */
public class CommandeCercleTest {
	@Test
	  public void executeTest() throws ParametresIncorrectsException {
	    Interpreter interprete = new Interpreter();
	    interprete.parametresCommande(new String[]{"c1", "0", "0", "4"});
	    CommandeCercle commandeCercle = new CommandeCercle(interprete);
	    commandeCercle.execute();
	  }
	}