package Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Forme_Graphique.Carre;
import Forme_Graphique.Cercle;

public class CarreDAO extends DAO<Carre>{
	
	private static String db = Login.db;

	@Override
	public Carre create(Carre objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("INSERT INTO Carre (nom, CoordoneesX, CoordoneesY, cote)" +"VALUES (?, ?, ?, ?)");
			prepare.setString(1,objet.getNom());
			prepare.setDouble(2,objet.getPoint_depart().getX());
			prepare.setDouble(3,objet.getPoint_depart().getY());
			prepare.setDouble(4,objet.getCote());;
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
	public Carre find(String id) {
		Carre C1= null;
		try (Connection connect = DriverManager.getConnection(db)){
			System.out.println(" Recherche " + id);
			PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Carre WHERE nom = ?");
			prepare.setString(1, id);
			prepare.execute();
			ResultSet result = prepare.getResultSet();
			if(result.next()){
			
				try {
				C1 = new Carre(
			            result.getString("nom"),
			            result.getDouble("CoordoneesX"),
			            result.getDouble("CoordoneesY"),
			            result.getDouble("cote")
			        );
				result.close();
				}catch (Exception e) {
					// TODO: handle exception
					e.getMessage();
				}
				
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return C1;
		
	}

	@Override
	public Carre update(Carre objet) {
		try (Connection connect = DriverManager.getConnection(db)) {
			PreparedStatement prepare = connect.prepareStatement("UPDATE Carre SET CoordoneesX = ?, CoordoneesY = ?, cote = ? WHERE nom = ?");
			prepare.setDouble(1, objet.getPoint_depart().getX());
			prepare.setString(3, objet.getNom());
			int result = prepare.executeUpdate();
			assert result == 1;
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		System.out.println("Mise A Jour " + objet);
		return objet;
	}

	@Override
	public void delete(Carre objet) {
		try (Connection connect = DriverManager.getConnection(db)){
			PreparedStatement prepare = connect.prepareStatement("DELETE FROM Carre "+ "WHERE nom = ?");
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
	public List<Carre> findAll() {
		 List<Carre> carre = new ArrayList<>();
			try (Connection connect = DriverManager.getConnection(db)){
				PreparedStatement prepare = connect.prepareStatement("SELECT * FROM Carre "+ "WHERE nom = ?");
				prepare.execute();
				ResultSet result = prepare.getResultSet();
				 while(result.next()){
				        carre.add(new Carre(
				            result.getString("nom"),
				            result.getDouble("CoordoneesX"),
				            result.getDouble("CoordoneesY"),
				            result.getDouble("rayon")
				        ));
				      }
		    }catch(Exception e){
		      e.printStackTrace();
		    }
		  
		    return carre;
		  }
	}
		
	


