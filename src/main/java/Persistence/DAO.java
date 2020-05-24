package Persistence;

/**
 * 
 * DAO
 *
 * @param <T>
 */

public abstract class DAO<T> {
	  public abstract T create(T objet);
	  public abstract T update(T objet);
	  public abstract T find(String id);
	  public abstract void delete(T objet);
}
