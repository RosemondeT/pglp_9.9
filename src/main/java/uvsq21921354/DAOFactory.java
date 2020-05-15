package uvsq21921354;

/**
 * 
 * Fabrique le DAO
 *
 */
public class DAOFactory {
	
	public DAO<Cercle> cercle(){
		return new CercleDAO();
		
	}

}
