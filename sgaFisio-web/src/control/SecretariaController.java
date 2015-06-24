package control;

import java.util.List;

import model.Secretaria;
import dao.SecretariaDAO;


public class SecretariaController
{
	
	public static SecretariaController  getInstance()
	{
		return new SecretariaController ();
	}
	
//PERSISTIR	
public Secretaria persistir(Secretaria paciente)
{
	return SecretariaDAO.getInstance().persistir(paciente);
}
	
	
//BUSCAR TODOS
public List<Secretaria> buscarTodos()
{
	return SecretariaDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
public List<Secretaria> BuscarPorNome(String nome)
{
	return SecretariaDAO.getInstance().buscarPorNome(nome);
}


//BUSCAR POR CPF		
public List<Secretaria> buscarPorCpf(String cpf)
{
	return SecretariaDAO.getInstance().buscarCpf(cpf);
}


//BUSCAR POR ID	
public Secretaria buscarId(Long id)
{
	return SecretariaDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Secretaria paciente)
{
	return SecretariaDAO.getInstance().excluir(paciente);
}


}
