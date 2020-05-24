package Forme_GraphiqueTest;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import Forme_Graphique.Affichage;

/**
 * 
 * Classe qui permet de tester les méthodes de la classe Affichage
 *
 */
public class AffichageTest {

	/**
	 * Test de la méthode affiche()
	 */
	@Test
	  public void affiche() {
	  Affichage a = new Affichage();
	  a.posting("teste de la classe Affichage");
	  assertNotNull(a);
	  }

}
