package uvsq21921354;

/**
 * 
 * Classe CommandeCercle qui implémente l'interface Commande
 *
 */
public class CommandeCercle implements Commande{
	  private String[] parameters;
	  private Groupe_FormeGraphique groupe;
	  
	  /**
	   * Constructeur de CommandeCercle
	   * @param parameters
	   * @param groupe
	   */
	  public CommandeCercle(String[] parameters, Groupe_FormeGraphique groupe){
	    this.parameters=parameters;
	    this.groupe=groupe;
	  }

	  /**
	   * Implémentation de la méthode execute()
	   */
	  @Override
	  public void execute() {
	    if (this.parameters.length != 4) {
	      Affichage a = new Affichage();
	      a.posting("Erreur sur le nombre de paramètres.");
	    }
	    else{
	      try {
	        double a = Double.parseDouble(this.parameters[1]);
	        double b = Double.parseDouble(this.parameters[2]);
	        double c = Double.parseDouble(this.parameters[3]);
	        groupe.addFormeGraphique(new Cercle(parameters[0],a,b,c));
	      }catch(NumberFormatException e){
	        e.printStackTrace();
	      }
	    }
	  }

	  
	  /**
	   * Implémentation de la méthode undo()
	   */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}
	}