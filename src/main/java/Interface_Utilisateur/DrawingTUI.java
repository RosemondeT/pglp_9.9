package Interface_Utilisateur;


import Command.Commande;
import Command.CommandeCarre;
import Command.CommandeCercle;
import Command.CommandeRectangle;
import Command.CommandeTriangle;
import Command.Interpreteur;
import Forme_Graphique.FormeGraphique;



/**
 * 
 *Classe DrawingTUI
 *
 */
public class DrawingTUI {

	  private Interpreteur interprete = new Interpreteur();
	  
	
 
	  public Commande nextCommande(String saisieUser){
		  
		  
		 String[] chaine = saisieUser.replaceAll("[()=,;]","").split(" ");
		  
		 //System.out.println(chaine.length);
		 
		
		 
		  String nom=chaine[1];		
		 
		  
	switch(nom) {
			  case "Carre":
				  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandeCarre commandeCarre = new CommandeCarre(interprete);
					    commandeCarre.execute();
					    
					    DrawingTUI afficheCarre = new DrawingTUI();
					    afficheCarre.printDessin(interprete);
					    return commandeCarre;
				    //break;
				 case "Cercle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandeCercle commandeCercle = new CommandeCercle(interprete);
					    commandeCercle.execute();
					    
					    DrawingTUI afficheCercle = new DrawingTUI();
					    afficheCercle.printDessin(interprete);
				    
				    return commandeCercle;
				    //break;
				 case "Rectangle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4], chaine[5] });
					  CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
					    commandeRectangle.execute();
					   
					    DrawingTUI afficheRectangle = new DrawingTUI();
					    afficheRectangle.printDessin(interprete);
					    
					    
					    return commandeRectangle;
				    //break;
				  case "Triangle":
					  interprete.setParametersT(new String[]{chaine[0],chaine[2], chaine[3], chaine[4],chaine[5], chaine[6], chaine[7] });
					  CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
					    commandeTriangle.execute();
					   
					    DrawingTUI afficheTriangle = new DrawingTUI();
					    afficheTriangle.printDessin(interprete);
					    
					    return commandeTriangle;
				    //break;
				  default:
					  System.out.println("erreur syntaxique");
		}
				return null;

		 
			
	   
	  }

	
	  
	  public void printDessin(Interpreteur interprete){
		  //interprete.print();
		  for(FormeGraphique forme : interprete.dessin){
		      forme.printForme();
		    }
	  }
	 
	  
	}