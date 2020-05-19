package uvsq21921354;

/**
 * 
 *Classe DrawingTUI
 *
 */
public class DrawingTUI {
	
	/**
	 * Création d'un objet listeCommandes
	 */
	private ListeCommandes listeCommandes = new ListeCommandes();

 /**
  * Implémentation de la méthode nextCommande
  * @param chaine
  * @return
  */
	  public Commande nextCommande(String chaine){
	    String type = chaine.substring(0,chaine.indexOf("(")).replace(" ","");
	    String parameters=chaine.substring(chaine.indexOf("("),chaine.length()).replace(" ","");
	    this.listeCommandes.setParametersT(parameters.replace("(","").replace(")","").split(","));

	    type= type.substring(0,1).toUpperCase()+type.substring(1).toLowerCase();
	    Commande com = listeCommandes.set.get(type);
	    return com;
	  }

	  public void AffichageForme(){
	    
	  }

}
