package Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * 
 * Classe qui permet la connexion à la base de données
 *  et la création des tables Cercles, Rectangles, Triangle
 *  et Carré dans la base de données
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
	 public void createTableCercle(){
			try (Connection connect = DriverManager.getConnection(db)){
				Statement state = connect.createStatement();
				state.addBatch("CREATE TABLE Cercle ("+ "nom VARCHAR(100) not null PRIMARY KEY,"+ "CoordoneesX double,"+ "CoordoneesY double,"+ "rayon double "+ ")");
				state.executeBatch();
				System.out.println("Création de la table Cercle reussie ");
			} 
			catch (SQLException e){
				e.printStackTrace();
			}		
		}
	
	/**
	 * Méthode qui permet de supprimer la table Cercle dans la base de données
	 */
	public void DropTableCercle(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Cercle");
			state.executeBatch();
			System.out.println("supression de la table Cercle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	/**
	 * Méthode qui permet la création de la table Carre dans la base de données
	 */
	public void createTableCarre(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("CREATE TABLE Carre ("+ "nom VARCHAR(100) PRIMARY KEY,"+ "CoordoneesX double,"+ "CoordoneesY double,"+ "cote double "+ ")");
			state.executeBatch();
			System.out.println("Création de la table Carre reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}		
	}
	
	/**
	 * Méthode qui permet la suppression de la table Carre dans la base de données
	 */
	public void DropTableCarre(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Carre");
			state.executeBatch();
			System.out.println("supression de la table Carre reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	
	/**
	 * Méthode qui permet la création de la table Rectangle dans la base de données
	 */
	public void createTableRectangle(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("CREATE TABLE Rectangle ("+ "nom VARCHAR(100) PRIMARY KEY,"+ "CoordoneesX double,"+ "CoordoneesY double,"+ "longueur double, "+ "largeur double "+ ")");
			state.executeBatch();
			System.out.println("Création de la table Rectangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}		
	}
	
	/**
	 * Méthode qui permet de supprimer la table Rectangle
	 */
	public void DropTableRectangle(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Rectangle");
			state.executeBatch();
			System.out.println("supression de la table Rectangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	/**
	 * Méthode qui permet de créer la table Rectangle
	 */
	public void createTableTriangle(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("CREATE TABLE Triangle ("+ "nom VARCHAR(100) PRIMARY KEY,"+ "CoordoneesX double,"+ "CoordoneesY double,"+ "CoordoneesZ double, "+ "CoordoneesT double, "+ " CoordoneesU double, "+ " CoordoneesV double   "+ ")");
			state.executeBatch();
			System.out.println("Création de la table Triangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}		
	}
	
	/**
	 * Méthode qui permet de supprimer la table Triangle
	 */
	public void DropTableTriangle(){
		try (Connection connect = DriverManager.getConnection(db)){
			Statement state = connect.createStatement();
			state.addBatch("DROP TABLE Triangle");
			state.executeBatch();
			System.out.println("supression de la table Triangle reussie ");
		} 
		catch (SQLException e){
			e.printStackTrace();
		}	
	}
	
	/**
	 * Méthode qui permet de supprimer les tables Cercle, Carre, Triangle, Rectangle
	 */
	public static void deleteTables() {

		Statement stat = null;
        try {
			Connection conn =DriverManager.getConnection(db);
            stat = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stat.execute("drop table Rectangle");
        } catch (SQLException e) {
        }
        try {
            stat.execute("drop table Carre");
        } catch (SQLException e) {
        }
        try {
            stat.execute("drop table Triangle");
        } catch (SQLException e) {
        }
        try {
            stat.execute("drop table Cercle");
        } catch (SQLException e) {
        }
	}
}
