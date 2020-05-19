package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Forme_Graphique.Triangle;

public class TriangleDAO extends DAO<Triangle> {
	
	private static String db = Login.db;

	@Override
	public Triangle create(Triangle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Triangle (nom, CoordoneesX, CoordoneesY,CoordoneesZ, CoordoneesT, CoordoneesU, CoordoneesV )" +"VALUES (?, ?, ?, ?, ?, ?, ?)");
			prepare.setString(1,objet.getNom());
			prepare.setDouble(2,objet.getPoint1().getX());
			prepare.setDouble(3,objet.getPoint1().getY());
			prepare.setDouble(4,objet.getPoint2().getX());
			prepare.setDouble(5,objet.getPoint2().getY());
			prepare.setDouble(6,objet.getPoint3().getX());
			prepare.setDouble(7,objet.getPoint3().getY());
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
	public Triangle find(String id) {
		Triangle T1= null;
		try (Connection connect = DriverManager.getConnection(db)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Triangle WHERE nom = ?");
			prepare.setString(1, id);
			ResultSet result = prepare.executeQuery();
		
			if(result.next()){
			
				T1 = new Triangle(
			            result.getString("nom"),
			            result.getDouble("CoordoneesX"),
			            result.getDouble("CoordoneesY"),
			            result.getDouble("CoordoneesZ"),
			            result.getDouble("CoordoneesT"),
			            result.getDouble("CoordoneesU"),
			            result.getDouble("CoordoneesV")
			        );
				
			
				result.close();
				
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return T1;
	}

	@Override
	public Triangle update(Triangle objet) {
		try (Connection connect = DriverManager.getConnection(db)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Triangle SET CoordoneesX = ?, CoordoneesY = ?, CoordoneesZ = ?, CoordoneesT = ?, CoordoneesU = ?, CoordoneesV = ?  WHERE nom = ?");
			prepare.setString(1, objet.getNom());
			prepare.setDouble(2, objet.getPoint1().getX());
			prepare.setDouble(3, objet.getPoint1().getY());
			prepare.setDouble(4, objet.getPoint2().getX());
			prepare.setDouble(5, objet.getPoint2().getY());
			prepare.setDouble(6, objet.getPoint3().getX());
			prepare.setDouble(7, objet.getPoint3().getY());
		
		
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
	public void delete(Triangle objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Triangle "+ "WHERE nom = ?");
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
	public List<Triangle> findAll() {
		List<Triangle> triangle = new ArrayList<>();
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("SELECT FROM Triangle "+ "WHERE nom = ?");
			ResultSet result = prepare.executeQuery();
	      while(result.next()){
	        triangle.add(new Triangle(
	            result.getString("nom"),
	            result.getDouble("CoordoneesX"),
	            result.getDouble("CoordoneesY"),
	            result.getDouble("CoordoneesZ"),
	            result.getDouble("CoordoneesT"),
	            result.getDouble("CoordoneesU"),
	            result.getDouble("CoordoneesV")
	        ));
	      }
	    
	    }catch(Exception e){
	      e.printStackTrace();
	    }
	  
	    return triangle;
	  }
	}


