package Command;
import Exception.DrawingNotFoundException;
import Exception.ParametresIncorrectsException;
import Forme_Graphique.Affichage;
import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;
import Forme_Graphique.FormeGraphique;
import Forme_Graphique.Groupe_FormeGraphique;
import Forme_Graphique.Rectangle;
import Forme_Graphique.Triangle;
import Persistence.CarreDAO;
import Persistence.CercleDAO;
import Persistence.DAO;
import Persistence.Login;
import Persistence.RectangleDAO;
import Persistence.TriangleDAO;
/**
 * Cette classe implémente l'interface Commande et
 * implémente la méthode execute de Commabde. On fait
 * appelle à cette classe lorsque l'utlisateur passe 
 * une commande pour déplacer une figure géométrique 
 * 
 */
public class CommandeMove implements Commande {

  private Interpreter interprete;
  /**
   * Constructeur
   * @param interprete
   */
  public CommandeMove(Interpreter interprete) {
    this.interprete=interprete;
  }

 /**
  * Méthode qui permet de rechercher un objet soit dans l'instance 
  * soit dans la base de données
  * @param name
  * @return
  * @throws DrawingNotFoundException
  */
  public FormeGraphique findFormeGraphique(String name)throws DrawingNotFoundException {
    Groupe_FormeGraphique forme=null;
    for (FormeGraphique form : interprete.Liste_FormeGraphique){//recherche de l'objet dans l'instance
      if (form.getNom().equals(name)) return form;
      else if(form instanceof Groupe_FormeGraphique){
        forme = (Groupe_FormeGraphique) form;
        for (FormeGraphique f1 : forme.liste){
          if (f1.getNom().equals(name)) return f1;
        }
      } else { //lorsque l'objet ne se trouve pas en instance on se connecte dans la base de données pour la chercher
    	  Login conn = new Login();
          conn.seConnecter();
          
          FormeGraphique f = null;
       
              DAO<Cercle> cercle = new CercleDAO();
              
      	     if (cercle.find(name) !=null) 
      	     {
      	    	 
      	    	 f=cercle.find(name); 
      	     }else {
     	    	 DAO<Carre> carre = new CarreDAO();
        	    	
      	    
      	    	  if (carre.find(name) !=null) 
      	    	  { 
      	    		  f= carre.find(name);
      	    		  
      	    	  } else {
      	    		DAO<Rectangle> rectangle = new RectangleDAO();
      	    		
      	    		if (rectangle.find(name) !=null) {
      	    		  f= rectangle.find(name);
      	    		}else {
      	    			DAO<Triangle> triangle = new TriangleDAO();
      	    			
      	    			if (triangle.find(name) !=null) {
      	    				 f= triangle.find(name);
      	    			} else return f=null;
      	    		}
      	    	  }
          
                      }   
    }}
    return null;
  }
/**
 * Implémentation de la méthode execute qui permet d'abord de verifier le nombre de
 * paramètre entré par l'utilisateur pour passer la commande pour déplacer une figure
 * ensuite recherche l'objet dans l'instance ou dans la base de données avant d'effectuer
 * le déplacement de l'objet
 */
  @Override
  public void execute() throws ParametresIncorrectsException, DrawingNotFoundException{
    if (interprete.parametresCommande.length!=3){
      Affichage a = new Affichage();
      a.posting("Erreur!!! nombre de paramètre insuffisant pour deplacer une figure géométrique");
    }
    else{
     FormeGraphique f = findFormeGraphique(interprete.parametresCommande[0]);
     
     if (f==null) {throw new DrawingNotFoundException();}
     
     
      if (f!=null){
        try{
          double a = Double.parseDouble(interprete.parametresCommande[1]);
          double b = Double.parseDouble(interprete.parametresCommande[2]);   
          f.move(a,b);
          System.out.println("Déplacement effectué avec succès\n\n" +f );
        }catch(Exception e){
          e.printStackTrace();
        }
      } 


    }
  }
}