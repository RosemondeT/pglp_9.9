package Exception;
/**
 * Cette classe est utilisée lorque l'utlisateur veut afficher ou
 * effectuer un deplacement sur un objet qui ne se trouve ni dans 
 * l'instance ni dans la base de dpnnées
 *
 */
public class DrawingNotFoundException extends Exception{
	public DrawingNotFoundException ()
	{
		System.out.println("Figure introuvable");
	}
	

}
