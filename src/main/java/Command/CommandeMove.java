package Command;


import Forme_Graphique.Affichage;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Groupe_FormeGraphique;

public class CommandeMove implements Commande {

  private Interpreteur interprete;
  public CommandeMove(Interpreteur interpreteur) {
    this.interprete=interpreteur;
  }

  public FormeGraphique findGroupe(String name){
    Groupe_FormeGraphique forme=null;
    for (FormeGraphique form : interprete.dessin){
      if (form.getNom().equals(name)) return form;
      else if(form instanceof Groupe_FormeGraphique){
        forme = (Groupe_FormeGraphique) form;
        for (FormeGraphique f1 : forme.liste){
          if (f1.getNom().equals(name)) return f1;
        }
      }
    }
    return null;
  }

  @Override
  public void execute() {
    if (interprete.parametersT.length!=3){
      Affichage a = new Affichage();
      a.posting("Erreur!!! nombre de paramètre");
    }
    else{
     FormeGraphique f = findGroupe(interprete.parametersT[0]);
      if (f!=null){
        try{
          double a = Double.parseDouble(interprete.parametersT[1]);
          double b = Double.parseDouble(interprete.parametersT[2]);
          interprete.undo.push(interprete.dessin);
          interprete.redo.clear();
          f.move(a,b);
        }catch(Exception e){
          e.printStackTrace();
        }
      }


    }
  }
}