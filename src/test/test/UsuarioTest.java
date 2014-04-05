package test;

import model.Usuario;

import org.junit.Assert;
import org.junit.Test;


public class UsuarioTest {

	@Test
	public void emailDoUsuarioDeveConteUmArroParaSerValido(){
		Usuario user = new Usuario();
		user.setEmail("lucy@gmail.com");
		Assert.assertTrue(user.emailValido());
	}
	
	@Test
	public void senhaDoUsuarioDeveConterMaisDeSeisCaracteres(){
		Usuario user = new Usuario();
		user.setPassworld("tf10m723");
		Assert.assertTrue(user.senhaValida());
	}
	
	
}
