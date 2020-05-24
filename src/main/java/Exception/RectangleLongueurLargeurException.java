package Exception;
/**
 * Cette classe est utilisé lorsque la valeur de la largeur est supérieure à celui
 * de la longueur
 *
 */
public class RectangleLongueurLargeurException extends Exception{
	public RectangleLongueurLargeurException()
	{
		System.out.println("Erreur!!! la longueur d'un rectangle doit être plus grande que sa largeur ");
	}

}
