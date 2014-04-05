package controller;

import model.Usuario;
import persistence.IRepositoryUsuario;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;



@Resource
public class UsuarioController {

	private IRepositoryUsuario iRepositoryUsuario;

	public UsuarioController(IRepositoryUsuario iRepositoryUsuario){
		this.iRepositoryUsuario = iRepositoryUsuario;
		
	}
	
	@Post
	@Path("/cadastro/usuario/adicionar/")
	public void adicionarUsuario(String email, String passworld){
		Usuario user = new Usuario();
		user.setEmail(email);
		user.setPassworld(passworld);
		iRepositoryUsuario.salvar(user);
		
	}
}
