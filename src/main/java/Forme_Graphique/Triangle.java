package Forme_Graphique;
/**
 * 
 *Cette classe implémentant l'interface FormeGraphique permet de créer 
 * et de manipuler des formes graphiques de type Triangle.
 *
 */
public class Triangle implements FormeGraphique {
	private String nom;
	private Point2D point1;
	private Point2D point2;
	private Point2D point3;
	
	/**
	 * Constructeur
	 * @param nom
	 * @param x
	 * @param y
	 * @param z
	 * @param t
	 * @param u
	 * @param v
	 */
	 public Triangle(String nom, double x, double y, double z, double t, double u, double v){
		 
		  this.nom=nom;
		  this.point1 = new Point2D("Point1 ",x,y);
		  this.point2 = new Point2D("Point2 ",z,t);
		  this.point3 = new Point2D("Point3",u,v);
	 }

	 /**
	  * Implémentation de la méthode move qui permet
	  * le déplacement d'un triangle
	  */
	@Override
	public void move(double x, double y) {
		point1.move(x, y);
		point2.move(x, y);
		point3.move(x, y);	
	}
	
	/**
	 * Implémentation de la méthode getNom() qui permet
	 * de recuperer le nom d'un triangle
	 */
	@Override
	public String getNom() {
		return nom;
	}
/**
 * Permet de modifier le nom d'un triangle
 * @param nom
 */
	public void setNom(String nom) {
		this.nom = nom;
	}
/**
 * Permet de recuperer les coordonnées du premier point
 * @return
 */
	public Point2D getPoint1() {
		return point1;
	}
	
/**
 * Permet de modifier les coordonnées du premier point
 * @param point1
 */
	public void setPoint1(Point2D point1) {
		this.point1 = point1;
	}
	
/**Permet de recuperer les coordonnées du deuxième point
 * 
 * @return
 */
	public Point2D getPoint2() {
		return point2;
	}

	/**
	 * Permet de modifier les coordonnées du deuxième point
	 * @param point2
	 */
	public void setPoint2(Point2D point2) {
		this.point2 = point2;
	}

	/**
	 * Permet de recuperer les coordonnées du troisième point
	 * @return
	 */
	public Point2D getPoint3() {
		return point3;
	}
/**
 * Permet de modifier les coordonnées du troisième point
 * @param point3
 */
	public void setPoint3(Point2D point3) {
		this.point3 = point3;
	}
/**
 * Permet de définir le format d'affichage
 */
	@Override
	public String toString() {
		  return "Triangle("
		  		+ "Point1=("+this.point1.getX()  +"," +this.point1.getY() +"),"
		  		+ "Point2=("+this.point2.getX()  +"," +this.point2.getY() +"),"
		  		+ "Point3=("+this.point3.getX()  +"," +this.point3.getY() +") "
		  		+")";
	}
	
	
/**
 * Implémentation de la méthode printForme qui permet
 * d'afficher un triangle
 */
	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
		
	}

	
	

}
