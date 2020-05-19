package Forme_Graphique;

public class Rectangle implements FormeGraphique {
	 private String nom;
	  private Point2D point_depart;
	  private double longueur;
	  private double largeur;
	
	public Rectangle (String nom, double x, double y, double longueur, double largeur){
	    this.nom=nom;
	    this.point_depart= new Point2D("Point_depart",x,y);
	    this.longueur=longueur;
	    this.largeur=largeur;
	  }

	@Override
	public void move(double x, double y) {
		point_depart.move(x, y);
		
	}

	@Override
	public String toString() {
				
	return "Rectangle(Point_depart=("+this.point_depart.getX()  +"," +this.point_depart.getY() +"),longueur="+this.longueur +",largeur="+this.largeur +")";

	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Point2D getPoint_depart() {
		return point_depart;
	}

	public void setPoint_depart(Point2D point_depart) {
		this.point_depart = point_depart;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
	}
	


	

	
	
	

	

}
