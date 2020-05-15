package uvsq21921354;

/**
 * 
 *Classe Cercle
 *
 */
public class Cercle implements FormeGraphique {
	  private String nom;
	  private Point2D centre;
	  private double rayon;
	  
	  /**
	   * Constructeur de cercle
	   * @param nom
	   * @param x
	   * @param y
	   * @param rayon
	   */
	  public Cercle(String nom, double x, double y, double rayon){
		    this.nom=nom;
		    this.centre = new Point2D("Centre",x,y);
		    this.rayon=rayon;
		  }

	  /**
	   * Méthode permettant d'avoir accès au nom
	   * @return
	   */
	  public String getNom() {
		return nom;
	}
	  
	  /**
	   * Méthode permettant de modifier le nom
	   * @param nom
	   */

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 *Méthode permettant d'avoir accès aux coordonnées du Centre
	 * @return
	 */
	public Point2D getCentre() {
		return centre;
	}

	/**
	 * Méthode permettant de modifier les coordonnées du centre
	 * @param centre
	 */
	public void setCentre(Point2D centre) {
		this.centre = centre;
	}

	/**
	 * Méthode permettant d'avoir accès aux coordonnées du rayon
	 * @return
	 */
	public double getRayon() {
		return rayon;
	}
	
	
/**
 * Methode permettant de modifier les valeurs du rayon
 * @param rayon
 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	   * Méthode move qui permet le déplacement du centre
	   */
	public void move(double x, double y) {
		centre.move(x,y);
		
	}
	
	/**
	 * On définie l'affichage du centre
	 */
	public String toString(){
	    return "Cercle(centre=("+this.centre.getX()  +"," +this.centre.getY() +"),rayon="+this.rayon +")";
	  }


	/**
	 * La méthode View qui permet l'affichage des coordonées du centre
	 */
	public void view() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
	  }

	
		
	}


