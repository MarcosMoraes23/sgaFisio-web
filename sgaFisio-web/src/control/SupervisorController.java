package control;

import java.util.List;

import model.Supervisor;
import dao.SupervisorDAO;


public class SupervisorController
{
	
	public static SupervisorController  getInstance()
	{
		return new SupervisorController ();
	}
	
//PERSISTIR	
public Supervisor persistir(Supervisor supervisor)
{
	return SupervisorDAO.getInstance().persistir(supervisor);
}
	
	
//BUSCAR TODOS
public List<Supervisor> buscarTodos()
{
	return SupervisorDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
public List<Supervisor> buscarPorNome(String nome)
{
	return SupervisorDAO.getInstance().buscarPorNome(nome);
}


//BUSCAR POR CPF		
public List<Supervisor> buscarPorCpf(String cpf)
{
	return SupervisorDAO.getInstance().buscarCpf(cpf);
}


//BUSCAR POR ID	
public Supervisor buscarId(Long id)
{
	return SupervisorDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Supervisor supervisor)
{
	return SupervisorDAO.getInstance().excluir(supervisor);
}


}
