package control;

import java.sql.Date;
import java.util.List;

import model.FilaDeEspera;
import dao.FilaDeEsperaDAO;


public class FilaDeEsperaController
{
	
	public static FilaDeEsperaController  getInstance()
	{
		return new FilaDeEsperaController ();
	}
	
//PERSISTIR	
public FilaDeEspera persistir(FilaDeEspera filaDeEspera)
{
	return FilaDeEsperaDAO.getInstance().persistir(filaDeEspera);
}
	
	
//BUSCAR TODOS
public List<FilaDeEspera> buscarTodos()
{
	return FilaDeEsperaDAO.getInstance().buscarTodos();
}

//BUSCAR POR NOME
public List<FilaDeEspera> BuscarPorNome(Date data)
{
	return FilaDeEsperaDAO.getInstance().buscarPorData(data);
}


//BUSCAR POR ID	
public FilaDeEspera buscarId(Long id)
{
	return FilaDeEsperaDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(FilaDeEspera filaDeEspera)
{
	return FilaDeEsperaDAO.getInstance().excluir(filaDeEspera);
}


}
