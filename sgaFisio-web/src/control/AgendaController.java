package control;

import java.sql.Date;
import java.util.List;

import model.Agenda;
import dao.AgendaDAO;


public class AgendaController
{
	
	public static AgendaController  getInstance()
	{
		return new AgendaController ();
	}
	
//PERSISTIR	
public Agenda persistir(Agenda agenda)
{
	return AgendaDAO.getInstance().persistir(agenda);
}
	
	
//BUSCAR TODOS
public List<Agenda> buscarTodos()
{
	return AgendaDAO.getInstance().buscarTodos();
}

//BUSCAR POR DATA
public List<Agenda> BuscarPorNome(Date data)
{
	return AgendaDAO.getInstance().buscarPorData(data);
}


//BUSCAR POR ID	
public Agenda buscarId(Long id)
{
	return AgendaDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Agenda agenda)
{
	return AgendaDAO.getInstance().excluir(agenda);
}


}
