package Command;

import java.util.*;

import Forme_Graphique.FormeGraphique;


public class Interpreteur {
  public HashMap<String,Commande> set = new HashMap<>();
  public String[] parametersT;
  public List<FormeGraphique> dessin = new ArrayList<>();
  public Stack<List<FormeGraphique>> undo = new Stack<>();
  public Stack<List<FormeGraphique>> redo = new Stack<>();


  public Interpreteur(){
    set.put("Cercle",new CommandeCercle(this));
    set.put("Move", new CommandeMove(this));
    set.put("Delete", new CommandeDelete(this));
    set.put("Undo", new CommandeUndo(this));
    set.put("Redo", new CommandeRedo(this));
    set.put("Quit", new CommandeQuit(this));
    set.put("Save", new CommandeSave(this));
    set.put("Load",new CommandeLoad(this));
  }

  public void setParametersT(String[] parametersT) {
    this.parametersT = parametersT;
  }

  public void print() {
    for(FormeGraphique forme : this.dessin){
      forme.printForme();
    }
  }

  public void undo(){
  }
}