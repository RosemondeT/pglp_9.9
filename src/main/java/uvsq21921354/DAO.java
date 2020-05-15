package uvsq21921354;

/**
 * 
 * DAO
 *
 * @param <T>
 */

public abstract class DAO<T> {
	 public abstract T create(T objet);
	  public abstract T find(String id);
	  public abstract T update(T objet);
	  public abstract void delete(T objet);

}
