package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;


public class UsuarioDbTest {
	
	public static void main(String [] args){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("gestor"); 
		EntityManager em = factory.createEntityManager();
		
		Usuario user = new Usuario();
		user.setEmail("lucy@gmail.com");
		user.setPassworld("123");
		
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
				
	}

}


