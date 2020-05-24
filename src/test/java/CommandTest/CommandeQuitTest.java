package CommandTest;
import org.junit.Test;
import Command.CommandeQuit;
import Command.Interpreter;

/**
 * Permet de tester les méthodes de la classe CommandeQuit
 *
 */
public class CommandeQuitTest {

	@Test
	public void test() {
		 Interpreter interprete = new Interpreter();
	interprete.parametresCommande(new String[]{"quit"});
	//CommandeQuit commandeQuit = new CommandeQuit(interprete);
   //commandeQuit.execute();
	}

}
