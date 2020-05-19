package uvsq21921354;



import org.junit.Test;

import Command.CommandeCercle;
import Command.CommandeSave;
import Command.Interpreteur;

public class CommandeSaveTest {

	@Test
	  public void execute() throws Exception {
	    Interpreteur interprete = new Interpreteur();
	    interprete.setParametersT(new String[]{"c7", "0", "0", "6"});
	    CommandeCercle cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    interprete.setParametersT(new String[]{"c8", "2", "2", "2"});
	    cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    interprete.setParametersT(new String[]{"c9", "3", "3", "2"});
	    cercle = new CommandeCercle(interprete);
	    cercle.execute();
	    CommandeSave save = new CommandeSave(interprete);
	    save.execute();
	  }

}
