package control;

import java.util.List;

import model.Estagiario;
import dao.EstagiarioDAO;


public class EstagiarioController
{
	
	public static EstagiarioController  getInstance()
	{
		return new EstagiarioController ();
	}
	
//PERSISTIR	
public Estagiario persistir(Estagiario estagiario)
{
	return EstagiarioDAO.getInstance().persistir(estagiario);
}
	
	
//BUSCAR TODOS
public List<Estagiario> buscarTodos()
{
	return EstagiarioDAO.getInstance().buscarTodos();
}


//BUSCAR POR NOME	
public List<Estagiario> buscarPorNome(String nome)
{
	return EstagiarioDAO.getInstance().buscarPorNome(nome);
}


//BUSCAR POR CPF
public List<Estagiario> BuscarPorNome(String cpf)
{
	return EstagiarioDAO.getInstance().buscarCpf(cpf);
}


//BUSCAR POR ID	
public Estagiario buscarId(Long id)
{
	return EstagiarioDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Estagiario estagiario)
{
	return EstagiarioDAO.getInstance().excluir(estagiario);
}


}
