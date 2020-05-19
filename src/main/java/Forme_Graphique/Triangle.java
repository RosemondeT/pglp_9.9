package Forme_Graphique;

public class Triangle implements FormeGraphique {
	private String nom;
	private Point2D point1;
	private Point2D point2;
	private Point2D point3;
	
	 public Triangle(String nom, double x, double y, double z, double t, double u, double v){
		 
		  this.nom=nom;
		  this.point1 = new Point2D("Point1 ",x,y);
		  this.point2 = new Point2D("Point2 ",z,z);
		  this.point3 = new Point2D("Point3",u,v);
	 }

	@Override
	public void move(double x, double y) {
		point1.move(x, y);
		point2.move(x, y);
		point3.move(x, y);
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Point2D getPoint1() {
		return point1;
	}

	public void setPoint1(Point2D point1) {
		this.point1 = point1;
	}

	public Point2D getPoint2() {
		return point2;
	}

	public void setPoint2(Point2D point2) {
		this.point2 = point2;
	}

	public Point2D getPoint3() {
		return point3;
	}

	public void setPoint3(Point2D point3) {
		this.point3 = point3;
	}

	@Override
	public String toString() {
		//return "Triangle [nom=" + nom + ", point1=" + point1 + ", point2=" + point2 + ", point3=" + point3 + "]";
		  return "Triangle("
		  		+ "Point1=("+this.point1.getX()  +"," +this.point1.getY() +"),"
		  		+ "Point2=("+this.point2.getX()  +"," +this.point2.getY() +"),"
		  		+ "Point3=("+this.point3.getX()  +"," +this.point3.getY() +") "
		  		+")";
	  


	}
	
	

	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
		
	}

	
	

}
