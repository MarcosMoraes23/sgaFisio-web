package control;

import java.util.List;

import model.Usuario;
import dao.UsuarioDAO;


public class UsuarioController
{
	
	public static UsuarioController  getInstance()
	{
		return new UsuarioController ();
	}
	
//PERSISTIR	
public Usuario persistir(Usuario paciente)
{
	return UsuarioDAO.getInstance().persistir(paciente);
}
	
	
//BUSCAR TODOS
<<<<<<< HEAD
=======
@SuppressWarnings("unchecked")
>>>>>>> origin/master
public List<Usuario> buscarTodos()
{
	return UsuarioDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
<<<<<<< HEAD
public List<Usuario> BuscarPorNome(String user)
{
	return UsuarioDAO.getInstance().buscarPorNome(user);
=======
@SuppressWarnings("unchecked")
public List<Usuario> BuscarPorNome(String nome)
{
	return UsuarioDAO.getInstance().buscarPorNome(nome);
>>>>>>> origin/master
}


//BUSCAR POR ID	
public Usuario buscarId(Long id)
{
	return UsuarioDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Usuario paciente)
{
	return UsuarioDAO.getInstance().excluir(paciente);
}


}
