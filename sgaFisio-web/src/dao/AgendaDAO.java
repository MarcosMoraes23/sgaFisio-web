package dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Agenda;
import util.PersistenceUtil;


public class AgendaDAO 
{
	public static AgendaDAO getInstance()
	{
		return new AgendaDAO();
	}
		
//PERSISTIR	
	public Agenda persistir(Agenda agenda)
	{
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			em.getTransaction().begin();
			agenda = em.merge(agenda);
			em.getTransaction().commit();
			
			return agenda;
			
		} 
		catch (Exception e) 
		{
			em.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR AGENDA POR DATA
@SuppressWarnings("unchecked")
public List<Agenda> buscarPorData(Date data)
{
	List<Agenda> agendas;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT a FROM Agenda a where dataAgenda=:data");
		query.setParameter("data", data);	
		agendas = query.getResultList();
		
		return agendas;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}
	
	
//BUSCAR TODOS
	@SuppressWarnings("unchecked")
	public List<Agenda> buscarTodos()
	{
		List<Agenda> autores;
		
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			Query query = em.createNamedQuery("Agenda.findAll");
			autores = query.getResultList();
			
			return autores;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR POR ID	
	public Agenda buscarId(Long id)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		Agenda agenda;
		
		try
		{
			Query query = em.createQuery("SELECT a from Agenda a where id=:id");
			query.setParameter("id", id);
			
			agenda= (Agenda)query.getSingleResult();
			
			return agenda;
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
//EXCLUIR
	public boolean excluir(Agenda agenda)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		try
		{
			em.getTransaction().begin();
			em.remove(agenda);
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
