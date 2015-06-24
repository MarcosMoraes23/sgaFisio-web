package dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.FilaDeEspera;
import util.PersistenceUtil;


public class FilaDeEsperaDAO 
{
	public static FilaDeEsperaDAO getInstance()
	{
		return new FilaDeEsperaDAO();
	}

	
//PERSISTIR 
	public FilaDeEspera persistir(FilaDeEspera filaDeEspera)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		
		try
		{
			em.getTransaction().begin();
			filaDeEspera = em.merge(filaDeEspera);
			em.getTransaction().commit();
			
			return filaDeEspera;
		}
		catch (Exception e)
		{
			em.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}
	}
		
	
//BUSCAR POR DATA
@SuppressWarnings("unchecked")
public List<FilaDeEspera> buscarPorData(Date data)
{
	List<FilaDeEspera> filasDeEspera;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT f FROM FilaDeEspera f where dataInclusao =:data");
		query.setParameter("data", data);	
		filasDeEspera = query.getResultList();
		
		return filasDeEspera;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}
	
	
//BUSCAR TODOS
	@SuppressWarnings("unchecked")
	public List<FilaDeEspera> buscarTodos()
	{
		List<FilaDeEspera> filasDeEspera;
		
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			Query query = em.createNamedQuery("FilaDeEspera.findAll");
			filasDeEspera = query.getResultList();
			
			return filasDeEspera;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR POR ID	
	public FilaDeEspera buscarId(Long id)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		FilaDeEspera filaDeEspera;
		
		try
		{
			Query query = em.createQuery("SELECT f from FilaDeEspera f where id=:id");
			query.setParameter("id", id);
			
			filaDeEspera = (FilaDeEspera)query.getSingleResult();
			
			return filaDeEspera;
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
//EXCLUIR
	public boolean excluir(FilaDeEspera filaDeEspera)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		try
		{
			em.getTransaction().begin();
			em.remove(filaDeEspera);
			em.getTransaction().commit();
			return true;
		}
		catch(Exception e)
		{
			em.getTransaction().rollback();
			e.printStackTrace();
			return false;
		}
	}	
	


}
