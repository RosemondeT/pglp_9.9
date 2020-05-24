package Forme_Graphique;
/**
 * 
 *Cette classe implémentant l'interface FormeGraphique permet de créer 
 * et de manipuler des formes graphiques de type Rectangle.
 *
 */
public class Rectangle implements FormeGraphique {
	 private String nom;
	  private Point2D point_depart;
	  private double longueur;
	  private double largeur;
	/**
	 * Constructeur
	 * @param nom
	 * @param x
	 * @param y
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle (String nom, double x, double y, double longueur, double largeur){
	    this.nom=nom;
	    this.point_depart= new Point2D("Point_depart",x,y);
	    this.longueur=longueur;
	    this.largeur=largeur;
	  }

	/**
	 * Implémentation de la méthode move qui permet
	 * le déplacement d'un rectangle
	 */
	@Override
	public void move(double x, double y) {
		point_depart.move(x, y);
		
	}
/**
 * Permet de définir le format d'affichage souhaité
 */
	public String toString() {
				
	return "Rectangle(Point_depart=("+this.point_depart.getX()  +"," +this.point_depart.getY() +"),longueur="+this.longueur +",largeur="+this.largeur +")";

	}
	/**
	 * Permet de recuperer le nom d'un rectangle
	 */
	@Override
	public String getNom() {
		return nom;
	}
/**
 * Permet de modifier le nom d'un rectangle
 * @param nom
 */
	public void setNom(String nom) {
		this.nom = nom;
	}
/**
 * Permet de recuperer le point de depart d'un rectangle
 * @return
 */
	public Point2D getPoint_depart() {
		return point_depart;
	}
/**
 * Permet de modifier le point de depart d'un rectangle
 * @param point_depart
 */
	public void setPoint_depart(Point2D point_depart) {
		this.point_depart = point_depart;
	}
/**
 * Permet de recuperer le longueur d'un rectangle
 * @return
 */
	public double getLongueur() {
		return longueur;
	}
/**
 * Permet de modifier la longueur d'un rectangle
 * @param longueur
 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
/**
 * Permet de recuperer la largeur d'un rectangle
 * @return
 */
	public double getLargeur() {
		return largeur;
	}
/**
 * Permet de modifier la largeur d'un rectangle
 * @param largeur
 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
/**
 * Implémentation de la méthode printForme qui
 * permet d'afficher un rectangle
 */
	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
	}
	


	

	
	
	

	

}
