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
public Supervisor persistir(Supervisor paciente)
{
	return SupervisorDAO.getInstance().persistir(paciente);
}
	
	
//BUSCAR TODOS
@SuppressWarnings("unchecked")
public List<Supervisor> buscarTodos()
{
	return SupervisorDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
@SuppressWarnings("unchecked")
public List<Supervisor> BuscarPorNome(String nome)
{
	return SupervisorDAO.getInstance().buscarPorNome(nome);
}


//BUSCAR POR CPF		
@SuppressWarnings("unchecked")
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
public boolean excluir(Supervisor paciente)
{
	return SupervisorDAO.getInstance().excluir(paciente);
}


}
