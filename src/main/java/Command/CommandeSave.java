package Command;
import Forme_Graphique.*;
import Persistence.DAOFactory;
import java.util.List;
/**
 * Cette classe implemente l'interface Commande et la méthode
 * execute.On fait appelle à cette méthode lorsque l'utilisateur
 * demande à sauvegarder les commandes effectuées.
 *
 */
public class CommandeSave implements Commande {
  private Interpreter interprete;
/**
 * Constructeur
 * @param interpreteur
 */
  public CommandeSave(Interpreter interpreteur) {
  this. interprete=interpreteur;
  }
/**
 * Cette méthode permet d'abord de vérifier l'instance d'une commande
 * pour savoir si c'est un cercle, un carré, un rectangle ou
 * un triangle avant de sauvegarder dans la base de données correspndante
 * @param list
 */
  public void saveList(List<FormeGraphique> list){
    for (FormeGraphique form : list){
   
      if (form instanceof Cercle) DAOFactory.getCercleDAO().create((Cercle) form);
      if (form instanceof Carre) DAOFactory.getCarreDAO().create((Carre) form);
      if (form instanceof Rectangle) DAOFactory.getRectangleDAO().create((Rectangle) form);
      if (form instanceof Triangle) DAOFactory.getTriangleDAO().create((Triangle) form);
      else if (form instanceof Groupe_FormeGraphique) saveList(((Groupe_FormeGraphique) form).liste);
    }
  }
/**
 * Implémentation de la méthode execute qui fait appelle à la méthode saveList 
 * lorsque l'utilisateur demande à sauvegarder une commande
 */
  @Override
  public void execute() {
    saveList( interprete.Liste_FormeGraphique);
    System.out.println("Sauvegarde effectuée avec succès");
  }
}