package control;

import java.sql.Date;
import java.util.List;

import model.Atendimento;
import dao.AtendimentoDAO;


public class AtendimentoController
{
	
	public static AtendimentoController  getInstance()
	{
		return new AtendimentoController ();
	}
	
//PERSISTIR	
public Atendimento persistir(Atendimento atendimento)
{
	return AtendimentoDAO.getInstance().persistir(atendimento);
}
	
	
//BUSCAR TODOS
@SuppressWarnings("unchecked")
public List<Atendimento> buscarTodos()
{
	return AtendimentoDAO.getInstance().buscarTodos();
}

//BUSCAR POR DATA
@SuppressWarnings("unchecked")
public List<Atendimento> BuscarPorNome(Date data)
{
	return AtendimentoDAO.getInstance().buscarPorData(data);
}


//BUSCAR POR ID	
public Atendimento buscarId(Long id)
{
	return AtendimentoDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Atendimento atendimento)
{
	return AtendimentoDAO.getInstance().excluir(atendimento);
}


}
