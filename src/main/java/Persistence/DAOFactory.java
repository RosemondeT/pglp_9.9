package Persistence;


import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.Rectangle;
import Forme_Graphique.Triangle;
import Forme_Graphique.Groupe_FormeGraphique;

/**
 * 
 * Fabrique le DAO
 *
 */
public class DAOFactory {
	 public static DAO<Cercle> getCercleDAO(){
		    return new CercleDAO();
		  }
	 
	 public static DAO<Carre> getCarreDAO(){
		    return new CarreDAO();
		  }
	 public static DAO<Rectangle> getRectangleDAO(){
		    return new RectangleDAO();
		  }
	 
	 public static DAO<Triangle> getTriangleDAO(){
		    return new TriangleDAO();
		  }
	 
	   
	    public static DAO<Groupe_FormeGraphique> getGroupe_FormeGraphiqueDao() {
	        return new Groupe_FormeGraphiqueDAO();
	    }
}
