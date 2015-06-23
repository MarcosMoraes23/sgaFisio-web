package dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.PersistenceUtil;
import model.Anamnese;

public class AnamneseDAO 
{
	public AnamneseDAO getInstance()
	{
		return new AnamneseDAO();
	}

	
//PERSISTIR 
	public Anamnese persistir(Anamnese anamnese)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		
		try
		{
			em.getTransaction().begin();
			anamnese = em.merge(anamnese);
			em.getTransaction().commit();
			
			return anamnese;
		}
		catch (Exception e)
		{
			em.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}
	}
		
	
//BUSCAR ANAMNESE POR DATA
@SuppressWarnings("unchecked")
public List<Anamnese> buscarPorData(Date data)
{
	List<Anamnese> anamneses;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT a FROM Anamnese a where dataAnamnese=:data");
		query.setParameter("data", data);	
		anamneses = query.getResultList();
		
		return anamneses;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}
	
	
//BUSCAR TODOS
	@SuppressWarnings("unchecked")
	public List<Anamnese> buscarTodos()
	{
		List<Anamnese> anamneses;
		
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			Query query = em.createNamedQuery("Anamnese.FindAll");
			anamneses = query.getResultList();
			
			return anamneses;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR POR ID	
	public Anamnese buscarId(Long id)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		Anamnese anamnese;
		
		try
		{
			Query query = em.createQuery("SELECT a from Anamnese a where id=:id");
			query.setParameter("id", id);
			
			anamnese= (Anamnese)query.getSingleResult();
			
			return anamnese;
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
//EXCLUIR
	public boolean excluir(Anamnese anamnese)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		try
		{
			em.getTransaction().begin();
			em.remove(anamnese);
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
