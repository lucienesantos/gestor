package persistence;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import model.Usuario;

public class RepositoryUsuario implements IRepositoryUsuario{
	
	private Session em;
	
	public RepositoryUsuario(Session em){
		this.em = em;
		
	}
	
	public void salvar(Usuario user){
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
	}
 
}
