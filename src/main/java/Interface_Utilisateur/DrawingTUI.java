package Interface_Utilisateur;


import java.util.Scanner;

import Command.Commande;
import Command.CommandeCarre;
import Command.CommandeCercle;

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
	  
	
	  public String reponseUtilisateur() {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Do you want to save this form y/n?");
		  String in = sc.nextLine();
		  return in;
	  }
 
	  public Commande nextCommande(String saisieUser){
	
		  Double a, b;
		  String reponseUser = null;
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
					    //demande de sauvegarde
					    reponseUser = reponseUtilisateur();
					    if(reponseUser.contentEquals("y") || reponseUser.contentEquals("Y") || reponseUser.contentEquals("yes")) {
							 CommandeSave save = new CommandeSave(interprete);
							 save.execute(); 
							 //System.out.println("Sauvegarde réussi");
					    }
					    
					   				    
				    break;
				 case "Cercle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4]});
					  CommandeCercle commandeCercle = new CommandeCercle(interprete);
					    commandeCercle.execute();
					    //demande de sauvegarde
					    reponseUser = reponseUtilisateur();
					    if(reponseUser.contentEquals("y") || reponseUser.contentEquals("Y") || reponseUser.contentEquals("yes")) {
							 CommandeSave save = new CommandeSave(interprete);
							 save.execute(); 
							 //System.out.println("Sauvegarde réussi");
					    }
				   
				    break;
				 case "Rectangle":
					  interprete.setParametersT(new String[]{chaine[0], chaine[2], chaine[3],chaine[4], chaine[5] });
					  CommandeRectangle commandeRectangle = new CommandeRectangle(interprete);
					    commandeRectangle.execute();
					    
					  
					    //demande de sauvegarde
					    reponseUser = reponseUtilisateur();
					    if(reponseUser.contentEquals("y") || reponseUser.contentEquals("Y") || reponseUser.contentEquals("yes")) {
							 CommandeSave save = new CommandeSave(interprete);
							 save.execute(); 
							 //System.out.println("Sauvegarde réussi");
					    }
				    break;
				  case "Triangle":
					  interprete.setParametersT(new String[]{chaine[0],chaine[2], chaine[3], chaine[4],chaine[5], chaine[6], chaine[7] });
					  CommandeTriangle commandeTriangle = new CommandeTriangle(interprete);
					    commandeTriangle.execute();
					    //demande de sauvegarde
					    reponseUser = reponseUtilisateur();
					    if(reponseUser.contentEquals("y") || reponseUser.contentEquals("Y") || reponseUser.contentEquals("yes")) {
							 CommandeSave save = new CommandeSave(interprete);
							 save.execute(); 
							 //System.out.println("Sauvegarde réussi");
					    }
					  
				    break;
				 
		}
			  
			 
			  
					
					 if (chaine[0].contentEquals("move")) {
			
						if (chaine[1].contentEquals("all")) {
							for (FormeGraphique form : interprete.dessin) {
								  a = Double.parseDouble(chaine[2]);
						          b = Double.parseDouble(chaine[3]);
								form.move(a, b);
								
							}
							System.out.println("deplacement de" + interprete.dessin +"reussie!!!");
						} else {
						 interprete.setParametersT(new String[]{chaine[1], chaine[2], chaine[3]});
						CommandeMove commandeMove = new CommandeMove(interprete);
						 commandeMove.execute();}
						  
						 
						 
					 }  else if (chaine[0].contentEquals("view")) {
						
						 if (chaine[1].contentEquals("all")) {
							
							 for (FormeGraphique form : interprete.dessin) {
								  form.printForme();
								
							}
						 }else {
						 DrawingTUI afficheView = new DrawingTUI();
						    afficheView.printDessin(interprete,chaine[1]);}
						 
					 }else if (chaine[0].contentEquals("quit")){
						 
						 CommandeQuit quitter = new CommandeQuit(interprete);
						    quitter.execute();
							 
					 
					 } 
					 
					 
				  
				 
	
		
		return null;
			  
		  
		
		  
		
		  
		 
		 
			
	   
	  }

	
	  
	  public void printDessin(Interpreteur interprete,String name){
		 
		  CommandeMove m = new CommandeMove(interprete);
		  FormeGraphique f =  m.findFormeGraphique(name);
		  f.printForme();
		 
//		  for(FormeGraphique forme : interprete.dessin){
//		      forme.printForme();
//		    }
	  }
	 
	  
	}