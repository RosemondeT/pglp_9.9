package Forme_Graphique;

/**
 * 
 *Cette classe implémentant l'interface FormeGraphique permet de créer 
 * et de manipuler des formes graphiques de type Cercle.
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
	   * Méthode permettant d'avoir accès au nom donné à un objet de type Cercle
	   * @return
	   */
	 @Override
	  public String getNom() {
		return nom;
	}
	  
	  /**
	   * Méthode permettant de modifier le nom donné à un objet de type Cercle
	   * @param nom
	   */

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 *Méthode permettant d'avoir accès aux coordonnées du centre d'un objet de type Cercle
	 * @return
	 */
	public Point2D getCentre() {
		return centre;
	}

	/**
	 * Méthode permettant de modifier les coordonnées du centre d'un objet de type Cercle
	 * @param centre
	 */
	public void setCentre(Point2D centre) {
		this.centre = centre;
	}

	/**
	 * Méthode permettant d'avoir accès aux coordonnées du rayon d'un objet de type Cercle
	 * @return
	 */
	public double getRayon() {
		return rayon;
	}
	
	
/**
 * Methode permettant de modifier les valeurs du rayon d'un objet de type Cercle
 * @param rayon
 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	/**
	   * Méthode move qui permet le déplacement du centre d'un objet de type Cercle
	   */
	@Override
	public void move(double x, double y) {
		centre.move(x,y);
		
	}
	
	/**
	 * permet de définir l'affichage d'un objet de type cercle
	 */
	public String toString(){
	    return "Cercle(centre=("+this.centre.getX()  +"," +this.centre.getY() +"),rayon="+this.rayon +")";
	  }


	/**
	 * La méthode qui permet l'affichage d'un objet de type cercle
	 */

	@Override
	public void printForme() {
		 Affichage a=new Affichage();
		    a.posting(this.toString());
		
	}		
	}


