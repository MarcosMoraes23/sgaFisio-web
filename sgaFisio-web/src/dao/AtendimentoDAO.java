package dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Atendimento;
import util.PersistenceUtil;


public class AtendimentoDAO 
{
	public AtendimentoDAO getInstance()
	{
		return new AtendimentoDAO();
	}

	
//PERSISTIR 
	public Atendimento persistir(Atendimento atendimento)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		
		try
		{
			em.getTransaction().begin();
			atendimento = em.merge(atendimento);
			em.getTransaction().commit();
			
			return atendimento;
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
public List<Atendimento> buscarPorData(Date data)
{
	List<Atendimento> atendimentos;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT a FROM Atendimento a where dataAtendimento =:data");
		query.setParameter("data", data);	
		atendimentos = query.getResultList();
		
		return atendimentos;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}
	
	
//BUSCAR TODOS
	@SuppressWarnings("unchecked")
	public List<Atendimento> buscarTodos()
	{
		List<Atendimento> atendimentos;
		
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			Query query = em.createNamedQuery("Atendimento.FindAll");
			atendimentos = query.getResultList();
			
			return atendimentos;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR POR ID	
	public Atendimento buscarId(Long id)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		Atendimento atendimento;
		
		try
		{
			Query query = em.createQuery("SELECT a from Atendimento a where id=:id");
			query.setParameter("id", id);
			
			atendimento = (Atendimento)query.getSingleResult();
			
			return atendimento;
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
//EXCLUIR
	public boolean excluir(Atendimento atendimento)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		try
		{
			em.getTransaction().begin();
			em.remove(atendimento);
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
