package Command;

import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Rectangle;
import Forme_Graphique.Triangle;
import Persistence.CarreDAO;
import Persistence.CercleDAO;
import Persistence.DAO;
import Persistence.Login;
import Persistence.RectangleDAO;
import Persistence.TriangleDAO;

public class CreateCommande implements Commande{
	
	private FormeGraphique forme;
	
	public CreateCommande(final FormeGraphique forme) {
        this.forme = forme;
    }

	@Override
	public void execute() {
        Login conn = new Login();
        conn.seConnecter();
    
        FormeGraphique f = null;
        if (forme.getClass() == Cercle.class) {
            DAO<Cercle> D = new CercleDAO();
    	    D.create((Cercle) forme);
                 
            
        }  else if (forme.getClass() == Carre.class) {
        	  DAO<Carre> D = new CarreDAO();
            D.create((Carre) forme);
            
    }else if (forme.getClass() == Rectangle.class) {
    	DAO<Rectangle> D = new RectangleDAO();
            
        D.create((Rectangle) forme);
        
    }else if(forme.getClass() == Triangle.class)
        	
        	 {
            	DAO<Triangle> D = new TriangleDAO();
                    
                D.create((Triangle) forme);
        	
        }else {
        	System.out.println("Forme inexistante");
        }

	

}
}
