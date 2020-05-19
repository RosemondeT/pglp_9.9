package Command;



import Forme_Graphique.*;


import Persistence.DAOFactory;

import java.util.List;

public class CommandeSave implements Commande {
  private Interpreteur interprete;

  public CommandeSave(Interpreteur interpreteur) {
  this. interprete=interpreteur;
  }

  public void saveList(List<FormeGraphique> list){
    for (FormeGraphique form : list){
      if (form instanceof Cercle) DAOFactory.getCercleDAO().create((Cercle) form);
      if (form instanceof Carre) DAOFactory.getCarreDAO().create((Carre) form);
      if (form instanceof Rectangle) DAOFactory.getRectangleDAO().create((Rectangle) form);
      if (form instanceof Triangle) DAOFactory.getTriangleDAO().create((Triangle) form);
      else if (form instanceof Groupe_FormeGraphique) saveList(((Groupe_FormeGraphique) form).liste);
    }
  }

  @Override
  public void execute() {
    saveList( interprete.dessin);
  }
}