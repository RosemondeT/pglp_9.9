package Forme_Graphique;

public class Carre implements FormeGraphique {
	
	 private String nom;
	  private Point2D point_depart;
	  private double cote;
	  
	  
	  public Carre(String nom, double x, double y, double cote){
		    this.nom=nom;
		    this.point_depart = new Point2D("Point",x,y);
		    this.cote=cote;
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



	public double getCote() {
		return cote;
	}



	public void setCote(double cote) {
		this.cote = cote;
	}



	
	public String toString() {
		//return "Carre [nom=" + nom + ", point_depart=" + point_depart + ", cote=" + cote + "]";

		 return "Carre(Point_depart=("+this.point_depart.getX()  +"," +this.point_depart.getY() +"),cote="+this.cote +")";

	}
	
	@Override
	public void move(double x, double y) {
		point_depart.move(x, y);
		
	}
	

	


	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
		
	}

	
	

}
