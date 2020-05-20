package Command;

import java.util.List;

import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Groupe_FormeGraphique;
import Forme_Graphique.Rectangle;
import Forme_Graphique.Triangle;
import Persistence.DAOFactory;

public class CommandeDelete implements Commande{
	private Interpreteur interprete;

	  public CommandeDelete(Interpreteur interpreteur) {
	  this. interprete=interpreteur;
	  }
	  
	  

	  public void deleteList(List<FormeGraphique> list){
	    for (FormeGraphique form : list){
	   
	      if (form instanceof Cercle) DAOFactory.getCercleDAO().delete((Cercle) form);
	      if (form instanceof Carre) DAOFactory.getCarreDAO().delete((Carre) form);
	      if (form instanceof Rectangle) DAOFactory.getRectangleDAO().delete((Rectangle) form);
	      if (form instanceof Triangle) DAOFactory.getTriangleDAO().delete((Triangle) form);
	      else if (form instanceof Groupe_FormeGraphique) deleteList(((Groupe_FormeGraphique) form).liste);
	    }
	  }

	  @Override
	  public void execute() {
		  deleteList( interprete.dessin);
	  }

}
