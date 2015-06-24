package control;

import java.sql.Date;
import java.util.List;

import model.Anamnese;
import dao.AnamneseDAO;


public class AnamneseController
{
	
	public static AnamneseController  getInstance()
	{
		return new AnamneseController ();
	}
	
//PERSISTIR	
public Anamnese persistir(Anamnese anamnese)
{
	return AnamneseDAO.getInstance().persistir(anamnese);
}
	
	
//BUSCAR TODOS
@SuppressWarnings("unchecked")
public List<Anamnese> buscarTodos()
{
	return AnamneseDAO.getInstance().buscarTodos();
}

//BUSCAR POR DATA
@SuppressWarnings("unchecked")
public List<Anamnese> BuscarPorNome(Date data)
{
	return AnamneseDAO.getInstance().buscarPorData(data);
}


//BUSCAR POR ID	
public Anamnese buscarId(Long id)
{
	return AnamneseDAO.getInstance().buscarId(id);
}


//EXCLUIR
public boolean excluir(Anamnese anamnese)
{
	return AnamneseDAO.getInstance().excluir(anamnese);
}


}
