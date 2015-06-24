package control;

import java.util.List;

import model.Paciente;
import dao.PacienteDAO;


public class PacienteController
{
	
	public static PacienteController  getInstance()
	{
		return new PacienteController ();
	}
	
//PERSISTIR	
public Paciente persistir(Paciente paciente)
{
	return PacienteDAO.getInstance().persistir(paciente);
}
	
	
//BUSCAR TODOS
public List<Paciente> buscarTodos()
{
	return PacienteDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
public List<Paciente> BuscarPorNome(String nome)
{
	return PacienteDAO.getInstance().buscarPorNome(nome);
}


//BUSCAR POR CPF		
public List<Paciente> buscarPorCpf(String cpf)
{
	return PacienteDAO.getInstance().buscarCpf(cpf);
}


//BUSCAR POR ID	
public Paciente buscarId(Long id)
{
	return PacienteDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Paciente paciente)
{
	return PacienteDAO.getInstance().excluir(paciente);
}


}
