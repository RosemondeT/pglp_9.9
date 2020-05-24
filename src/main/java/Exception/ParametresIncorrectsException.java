package Exception;
/**
 *Cette classe est utilisée lorsque le nombre de paramètre
 *d'une commande est incorrecte
 */
public class ParametresIncorrectsException extends Exception{
	public ParametresIncorrectsException ()
	{
		System.out.println("Le nombre de paramètre est incorrecte ");
	}
	

}
