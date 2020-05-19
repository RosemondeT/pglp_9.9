 package Interface_Utilisateur;

import java.util.Scanner;

import Command.Commande;

public enum DrawingApp
{
    DRAWINGAPP;

    private void run(){
    	
    	System.out.println("****BIENVENU SUR L'APPLICATION DE DESSIN****\n");
    	System.out.println("Exemples de commandes valides :\n"
                
                + "c1 =Cercle( (0, 0), 50)\n"
                + "c2 =Carre( (0, 0), 30)\n"
                + "r1 =Rectangle( (0, 0), 40, 10)\n"
                + "t1 =Triangle( (0, 0), (2, 2), (4, 0))\n"
                + "Déplacement : move (c1, (10, 20))\n"
                + "Suppression : delete(r1, t1)\n"
                + "Quitter : exit\n\n"
                + "Entrer une commande :");
    	
    	
        DrawingTUI dessin = new DrawingTUI();
        Scanner saisieUser;
        
        Scanner scanner = saisieUser = new Scanner(System.in);
    	String chaine= saisieUser.nextLine();
    
        Commande commande = dessin.nextCommande(chaine);
       

    }

    public static void main(String[] args){
        DRAWINGAPP.run();
    }
}