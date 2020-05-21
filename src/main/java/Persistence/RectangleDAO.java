package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Forme_Graphique.Rectangle;

public class RectangleDAO extends DAO<Rectangle> {
	
	private static String db = Login.db;

	@Override
	public Rectangle create(Rectangle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Rectangle (nom, CoordoneesX, CoordoneesY, longueur, largeur)" +"VALUES (?, ?, ?, ?, ?)");
			prepare.setString(1,objet.getNom());
			prepare.setDouble(2,objet.getPoint_depart().getX());
			prepare.setDouble(3,objet.getPoint_depart().getY());
			prepare.setDouble(4,objet.getLongueur());
			prepare.setDouble(5,objet.getLargeur());
			System.out.println("Insertion reussie " + objet);
			int result = prepare.executeUpdate();
			assert result == 1; 
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return objet;
	}

	@Override
	public Rectangle find(String id) {
		Rectangle R1= null;
		try (Connection connect = DriverManager.getConnection(db)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Rectangle WHERE nom = ?");
			prepare.setString(1, id);
			prepare.execute();
			ResultSet result = prepare.getResultSet();
			if(result.next()){
			
				R1 = new Rectangle(
			            result.getString("nom"),
			            result.getDouble("CoordoneesX"),
			            result.getDouble("CoordoneesY"),
			            result.getDouble("longueur"),
			            result.getDouble("largeur")
			        );
			
				result.close();
				
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return R1;
		
	}

	@Override
	public Rectangle update(Rectangle objet) {
		try (Connection connect = DriverManager.getConnection(db)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Rectangle SET CoordoneesX = ?, CoordoneesY = ?, longueur = ?, largeur = ? WHERE nom = ?");
			prepare.setString(1, objet.getNom());
			prepare.setDouble(2, objet.getPoint_depart().getX());
			prepare.setDouble(3, objet.getPoint_depart().getY());
			prepare.setDouble(4, objet.getLongueur());
			prepare.setDouble(5, objet.getLargeur());
			
		
			int result = prepare.executeUpdate();
			assert result ==1;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mise A Jour " + objet);
		return objet;
	}

	@Override
	public void delete(Rectangle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Rectangle "+ "WHERE nom = ?");
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
	public List<Rectangle> findAll() {
		 List<Rectangle> rectangle = new ArrayList<>();
			try (Connection connect = DriverManager.getConnection(db)){
				PreparedStatement prepare = connect.prepareStatement("SELECT FROM Rectangle "+ "WHERE nom = ?");
				ResultSet result = prepare.executeQuery();
		      while(result.next()){
		        rectangle.add(new Rectangle(
		            result.getString("nom"),
		            result.getDouble("CoordoneesX"),
		            result.getDouble("CoordoneesY"),
		            result.getDouble("longeur"),
		            result.getDouble("largeur")
		        ));
		      }
		    
		    }catch(Exception e){
		      e.printStackTrace();
		    }
		  
		    return rectangle;
		  }
	}


