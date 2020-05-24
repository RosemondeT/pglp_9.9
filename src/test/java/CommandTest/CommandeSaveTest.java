package CommandTest;
import org.junit.Test;
import Command.CommandeCercle;
import Command.CommandeSave;
import Command.Interpreter;

/**
 * Permet de tester les méthodes de la classe CommandeSave
 *
 */
public class CommandeSaveTest {

	@Test
	  public void execute() throws Exception {
	    Interpreter interprete = new Interpreter();
	    interprete.parametresCommande(new String[]{"c0", "0", "0", "6"});
	    CommandeCercle cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    interprete.parametresCommande(new String[]{"c1", "2", "2", "2"});
	    cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    interprete.parametresCommande(new String[]{"c2", "3", "3", "2"});
	    cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    CommandeSave save = new CommandeSave(interprete);
	    save.execute();
	  }

}
