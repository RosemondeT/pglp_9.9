package uvsq21921354;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * Classe qui permet la connexion à la base de données
 *
 */
public class Login {
	
	private static final String Nom = "traoremousso";
	private static final String password = "bene1234";
	public static String db = "jdbc:derby:bd;create=true";
	
	
	/**
	 * Méthode qui permet la connexion à la base de données
	 */
	public void seConnecter() {
		Properties connectionProps = new Properties();
		connectionProps.put("user", Nom);
		connectionProps.put("user", password);
		System.out.println("Connexion reussie ");
		
	}
	
	
	/**
	 * Méthode qui permet la création de la table Cercle dans la base de données 
	 */
	 public void createTables(){
			try (Connection connect = DriverManager.getConnection(db)){
				Statement state = connect.createStatement();
				state.addBatch("CREATE TABLE Cercle ("+ "nom VARCHAR(100) PRIMARY KEY,"+ "CoordoneesX double,"+ "CoordoneesY double,"+ "rayon Double "+ ")");
				state.executeBatch();
				System.out.println("Création de table reussie ");
			} 
			catch (SQLException e){
				e.printStackTrace();
			}		
		}
	
	/**
	 * Méthode qui permet de supprimer une table dans la base de données
	 */
	public void DropTables(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Cercle");
			state.executeBatch();
			System.out.println("supression de table reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	

}
