package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Estagiario;
import util.PersistenceUtil;


public class EstagiarioDAO
{
	public EstagiarioDAO getInstance()
	{
		return new EstagiarioDAO();
	}

	
//PERSISTIR 
	public Estagiario persistir(Estagiario estagiario)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		
		try
		{
			em.getTransaction().begin();
			estagiario = em.merge(estagiario);
			em.getTransaction().commit();
			
			return estagiario;
		}
		catch (Exception e)
		{
			em.getTransaction().rollback();
			e.printStackTrace();
			return null;
		}
	}
		
	
//BUSCAR POR NOME
@SuppressWarnings("unchecked")
public List<Estagiario> buscarPorData(String nome)
{
	List<Estagiario> estagiarios;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT e FROM Estagiario e where nome =:nome");
		query.setParameter("nome", nome);	
		estagiarios = query.getResultList();
		
		return estagiarios;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//BUSCAR POR CPF	
@SuppressWarnings("unchecked")
public List<Estagiario> buscarCpf(String cpf)
{
	List<Estagiario> estagiarios;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT e FROM Estagiario e where cpf =:cpf");
		query.setParameter("cpf", cpf);	
		estagiarios = query.getResultList();
		
		return estagiarios;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}



//BUSCAR TODOS
	@SuppressWarnings("unchecked")
	public List<Estagiario> buscarTodos()
	{
		List<Estagiario> estagiarios;
		
		EntityManager em =  PersistenceUtil.getEntityManager();
		
		try 
		{
			Query query = em.createNamedQuery("Estagiario.FindAll");
			estagiarios = query.getResultList();
			
			return estagiarios;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	
//BUSCAR POR ID	
public Estagiario buscarId(Long id)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		Estagiario estagiario;
		
		try
		{
			Query query = em.createQuery("SELECT e from Estagiario e where id=:id");
			query.setParameter("id", id);
			
			estagiario = (Estagiario)query.getSingleResult();
			
			return estagiario;
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	
//EXCLUIR
	public boolean excluir(Estagiario estagiario)
	{
		EntityManager em = PersistenceUtil.getEntityManager();
		
		try
		{
			em.getTransaction().begin();
			em.remove(estagiario);
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
