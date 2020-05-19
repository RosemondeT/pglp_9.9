package Command;

import java.util.ArrayList;

public class CommandeRedo implements Commande {

	  private Interpreteur interprete;

	  public CommandeRedo(Interpreteur interpreteur) {
	    this.interprete=interpreteur;
	  }

	  @Override
	  public void execute() {
		  interprete.undo.push(new ArrayList<>(interprete.dessin));
		  interprete.dessin=interprete.redo.pop();
	  }
	}