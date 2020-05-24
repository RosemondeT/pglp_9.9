package Forme_Graphique;
/**
 * 
 *Cette classe implémentant l'interface FormeGraphique permet de créer 
 * et de manipuler des formes graphiques de type Carre.
 *
 */
public class Carre implements FormeGraphique {
	
	 private String nom;
	  private Point2D point_depart;
	  private double cote;
	  
	  /**
	   * Constructeur
	   * @param nom
	   * @param x
	   * @param y
	   * @param cote
	   */
	  public Carre(String nom, double x, double y, double cote){
		    this.nom=nom;
		    this.point_depart = new Point2D("Point",x,y);
		    this.cote=cote;
		  }
/**
 * Retourne le nom d'un objet Carre
 * @return
 */	
	@Override
	public String getNom() {
		return nom;
	}

/**
 * Permet de modifier le nom d'un objet Carré
 * @param nom
 */

	public void setNom(String nom) {
		this.nom = nom;
	}

/**
 * Retourne les coordonnées du point de depart d'un carré
 * @return 
 */
public Point2D getPoint_depart() {
		return point_depart;
	}

/**
 * Permet de modifier les coordonnées du point de depart d'un carré
 * @param point_depart
 */
	public void setPoint_depart(Point2D point_depart) {
		this.point_depart = point_depart;
	}


/**
 * Retourne la valeur du coté d'un carré
 * @return
 */
	public double getCote() {
		return cote;
	}
/**
 * Permet de modifier la valeur ducoté d'un carré
 * @param cote
 */
	public void setCote(double cote) {
		this.cote = cote;
	}
/**
 * Méthode qui permet de définir l'affichage d'un carré	
 */
	public String toString() {
		 return "Carre(Point_depart=("+this.point_depart.getX()  +"," +this.point_depart.getY() +"),cote="+this.cote +")";
	}
	
	/**
	 * Implémentation de la méthode move qui permet
	 * de déplacer un Carre
	 */
	@Override
	public void move(double x, double y) {
		point_depart.move(x, y);
		
	}
	/**
	 * Implémentation de la méthode printForme
	 * qui permet d'affichage d'un carre
	 */
	@Override
	public void printForme() {
		Affichage affiche=new Affichage();
		affiche.posting(this.toString());
		
	}
}
