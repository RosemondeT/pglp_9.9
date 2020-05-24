package CommandTest;
import org.junit.Test;
import Command.CommandeCercle;
import Command.CommandeMove;
import Command.Interpreter;
import Exception.DrawingNotFoundException;
import Exception.ParametresIncorrectsException;

/**
 * Permet de tester les méthodes de la classe CommandeMove
 *
 */

public class CommandeMoveTest {	
	  @Test
  public void executeMoveTest() throws ParametresIncorrectsException, DrawingNotFoundException{
    Interpreter interprete = new Interpreter();
    interprete.parametresCommande(new String[]{"c5", "0", "0", "1"});
    CommandeCercle commandeCercle = new CommandeCercle(interprete);
    commandeCercle.execute();
    interprete.parametresCommande(new String[]{"c5", "50", "50"});
   CommandeMove commandeMove = new CommandeMove(interprete);
   commandeMove.execute();

}}
