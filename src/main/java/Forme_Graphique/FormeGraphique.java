package Forme_Graphique;

/**
 * 
 * Interface FormeGraphique qui contient la méthode move(), printForme() et getNom().
 * Cette classe est implémenté par les classes Cercle, Carre, Rectangle, Triangle 
 *
 */

public interface FormeGraphique {
	void move(double x, double y); //pour le deplacemnet
	  void printForme(); // pour l'affichage
	  String getNom(); //pour retourner le nom de la forme graphique
}
