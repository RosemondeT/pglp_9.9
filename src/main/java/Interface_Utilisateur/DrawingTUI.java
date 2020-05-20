package Interface_Utilisateur;


import Command.Commande;
import Command.CommandeCarre;
import Command.CommandeCercle;
import Command.CommandeDelete;
import Command.CommandeMove;
import Command.CommandeQuit;
import Command.CommandeRectangle;
import Command.CommandeSave;
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
			  String nom=null;
			  if(chaine.length > 1) {
				   nom=chaine[1];
			  }else {
				  nom = chaine[0];
			 }
			  
			 
			 	
			  
			 
			  
			  switch(nom) {
			  case "Carre":
				  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandeCarre commandeCarre = new CommandeCarre(interprete);
					    commandeCarre.execute();
					    
				    break;
				 case "Cercle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandeCercle commandeCercle = new CommandeCercle(interprete);
					    commandeCercle.execute();
					   
				   
				    break;
				 case "Rectangle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4], chaine[5] });
					  CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
					    commandeRectangle.execute();
					  
					   
				    break;
				  case "Triangle":
					  interprete.setParametersT(new String[]{chaine[0],chaine[2], chaine[3], chaine[4],chaine[5], chaine[6], chaine[7] });
					  CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
					    commandeTriangle.execute();
					   
					  
				    break;
				 
		}
			  
			 
			  
					
					 if (chaine[0].contentEquals("move")) {
			
						 
						 interprete.setParametersT(new String[]{chaine[1], chaine[2], chaine[3]});
						CommandeMove commandeMove = new CommandeMove(interprete);
						 commandeMove.execute();
						  
						 
						 
					 } else if(chaine[0].contentEquals("save")) {
						 
						
						 CommandeSave save = new CommandeSave(interprete);
						    save.execute();
							 
						 
						 
					 } else if (chaine[0].contentEquals("view")) {
						 
						 DrawingTUI afficheSave = new DrawingTUI();
						    afficheSave.printDessin(interprete);
						 
					 }else if (chaine[0].contentEquals("quit")){
						 CommandeQuit quitter = new CommandeQuit(interprete);
						    quitter.execute();
							 
					 }
					 
					 
					 
					 
				  
				 
	
		
		return null;
			  
		  
		
		  
		
		  
		 
		 
			
	   
	  }

	
	  
	  public void printDessin(Interpreteur interprete){
		 
		  for(FormeGraphique forme : interprete.dessin){
		      forme.printForme();
		    }
	  }
	 
	  
	}