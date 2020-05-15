package uvsq21921354;

/**
 * 
 *Classe Point2D
 *
 */
public class Point2D implements FormeGraphique {
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
	   * Méthode qui permet de déplacer un point
	   */
	  public void move(double dx, double dy) {
		  x=dx;
		  y+=dy;
		 }
	
	  /**
	   * 
	   * Création des getter et setter 
	   */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Affichage de Point
	 */
	@Override
	public String toString() {
		return "Point [nom=" + nom + ", x=" + x + ", y=" + y + "]";
	}

}
