package Persistence;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.util.List;

import Forme_Graphique.Cercle;

/**
 * 
 * Classe CercleDAO qui hérite de DAO
 *
 */
public class CercleDAO extends DAO<Cercle>{
	
	private static String db = Login.db;

	/**
	 * Création de la table Cercle dans la base de données
	 */
	@Override
	public Cercle create(Cercle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Cercle (nom, CoordoneesX, CoordoneesY, rayon)" +"VALUES (?, ?, ?, ?)");
			prepare.setString(1,objet.getNom());
			prepare.setDouble(2,objet.getCentre().getX());
			prepare.setDouble(3,objet.getCentre().getY());
			prepare.setDouble(4,objet.getRayon());
			System.out.println("Insertion reussie " + objet);
			int result = prepare.executeUpdate();
			assert result == 1; 
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return objet;
	}

	/**
	 * Rechercher un cercle 
	 */
	@Override
	public Cercle find(String id) {
		Cercle C1= null;
		try (Connection connect = DriverManager.getConnection(db)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Cercle WHERE nom = ?");
			
			prepare.setString(1, id);
			prepare.execute();
			ResultSet result = prepare.getResultSet();
		
			if(result.next()){
			
				C1 = new Cercle(
			            result.getString("nom"),
			            result.getDouble("CoordoneesX"),
			            result.getDouble("CoordoneesY"),
			            result.getDouble("rayon")
			        );
			
			
				result.close();
				
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return C1;
		
	}

	/**
	 * Mettre à jour la table Cercle
	 */
	@Override
	public Cercle update(Cercle objet) {
		try (Connection connect = DriverManager.getConnection(db)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Cercle SET CoordoneesX = ?, CoordoneesY = ?, rayon = ? WHERE nom = ?");
			prepare.setString(1, objet.getNom());
			prepare.setDouble(2, objet.getCentre().getX());
			prepare.setDouble(3, objet.getCentre().getY());
			prepare.setDouble(4, objet.getRayon());
			
		
			int result = prepare.executeUpdate();
			assert result ==1;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mise A Jour " + objet);
		return objet;
	}
	
	/**
	 * Supprimer un Cercle de la base de données
	 */

	@Override
	public void delete(Cercle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Cercle "+ "WHERE nom = ?");
			prepare.setString(1, objet.getNom());
			int result = prepare.executeUpdate();
			assert result == 1;
			System.out.println("Suppression reussie " + objet);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Cercle> findAll() {
		 List<Cercle> cercle = new ArrayList<>();
			try (Connection connect = DriverManager.getConnection(db)){
				PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Cercle "+ "WHERE nom = ?");
				ResultSet result = prepare.executeQuery();
		      while(result.next()){
		        cercle.add(new Cercle(
		            result.getString("nom"),
		            result.getDouble("CoordoneesX"),
		            result.getDouble("CoordoneesY"),
		            result.getDouble("rayon")
		        ));
		      }
		    
		    }catch(Exception e){
		      e.printStackTrace();
		    }
		  
		    return cercle;
		  }
	}


