package Command;

public class CommandeUndo implements Commande {

	  public Interpreteur interpreteur;

	  public CommandeUndo(Interpreteur interpreteur) {
	    this.interpreteur=interpreteur;
	  }

	  @Override
	  public void execute() {
	    interpreteur.redo.push(interpreteur.dessin);
	    interpreteur.dessin=interpreteur.undo.pop();
	  }
	}