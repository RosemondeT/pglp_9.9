package Command;
import Exception.DrawingNotFoundException;
import Exception.ParametresIncorrectsException;
import Exception.RectangleLongueurLargeurException;
/**
 * 
 *Interface Commande qui contient une méthode execute qui sera implémenté
 *par toutes les classes implémentant l'interface Commande
 *
 */
public interface Commande {
	 public void execute() throws ParametresIncorrectsException, DrawingNotFoundException, RectangleLongueurLargeurException;
}
