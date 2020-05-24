package Exception;
/**
 * 
 *Cette exception est utilisée lorsque la syntaxe utilisée
 *pour passer une commande est incorrecte
 *
 */
public class CommandeIncorrectException extends Exception{
	public CommandeIncorrectException ()
	{
		System.out.println("Votre commande est incorrecte");
	}
	
}
