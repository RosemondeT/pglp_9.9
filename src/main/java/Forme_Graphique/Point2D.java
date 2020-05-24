package Forme_Graphique;

/**
 * 
 *Classe Point2D. Cette classe est utilisée pour la construction et le déplacement des objets 
 *de type Ppoint2D. Par exemple l'origine d'un cercle est de type Point2D.
 *
 */
public class Point2D {
	private String nom;
	  private double x;
	  private double y;

	 /**
	  * Constructeur de Point2D
	  * @param nom
	  * @param x
	  * @param y
	  */
	  public Point2D(String nom, double x, double y){
	    this.nom=nom;
	    this.x = x;
	    this.y = y;
	  }
	  
	  /**
	   * Méthode qui permet de déplacer un objet de type Point2D
	   */
	  public void move(double dx, double dy) {
		  x=dx;
		  y=dy;
		 }
	
	  
	  /**
	   * Permet de recupérer le nom donné à un objet de type Point2D 
	   */
	public String getNom() {
		return nom;
	}

	
	/**
	 * Permet de modifier le nom donné à un objet de type Point2D
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Permet de recuperer le coordonné X d'un objet de type Point2D
	 * @return
	 */
	public double getX() {
		return x;
	}
    

	/**
	 * Permet de modifier le coordonné X d'un objet de type Point2D
	 * 
	 */
	public void setX(int x) {
		this.x = x;
	}

/**
 * Permet de recuperer le coordoné Y d'un objet de type Point2d
 * @return
 */
	public double getY() {
		return y;
	}

	
	/**
	 * Permet de modifier le coordonné Y d'un objet de type Point2D
	 * 
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	/**
	 * Méthode qui permet de définir le type d'affichage souhaité
	 */
	public String toString() {
		return "Point [nom=" + nom + ", x=" + x + ", y=" + y + "]";
	}
	
	/**
	 * Permet l'affichage d'un objet de type Point2D
	 */
	public void printPoint2D(){
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
		
	}

}
