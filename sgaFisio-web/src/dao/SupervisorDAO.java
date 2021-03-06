package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Supervisor;
import util.PersistenceUtil;


public class SupervisorDAO 
{
	public static SupervisorDAO  getInstance()
	{
		return new SupervisorDAO ();
	}
	
//PERSISTIR	
public Supervisor persistir(Supervisor supervisor)
{
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		em.getTransaction().begin();
		supervisor = em.merge(supervisor);
		em.getTransaction().commit();
		
		return supervisor;
		
	} 
	catch (Exception e) 
	{
		em.getTransaction().rollback();
		e.printStackTrace();
		return null;
	}
}
	
	
//BUSCAR TODOS
@SuppressWarnings("unchecked")
public List<Supervisor> buscarTodos()
{
	List<Supervisor> supervisores;
	
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		Query query = em.createNamedQuery("Supervisor.findAll");
		supervisores = query.getResultList();
		
		return supervisores;
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}

//BUSCAR POR NOME
@SuppressWarnings("unchecked")
public List<Supervisor> buscarPorNome(String nome)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Supervisor> supervisores;
	
	try 
	{
		Query query = em.createQuery("SELECT s FROM Supervisor s where upper(s.nome) like :nome");
		query.setParameter("nome","%"+ nome.toUpperCase()+"%");
		
		supervisores = query.getResultList();
		
		return supervisores;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}



//BUSCAR POR CPF
@SuppressWarnings("unchecked")
public List<Supervisor> buscarCpf(String cpf)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Supervisor> supervisores;
	
	try 
	{
		Query query = em.createQuery("SELECT s FROM Supervisor s where s.cpf=:cpf");
		query.setParameter("cpf", cpf);
		
		supervisores = query.getResultList();
		
		return supervisores;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}



//BUSCAR POR ID	
public Supervisor buscarId(Long id)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	Supervisor supervisor;
	
	try
	{
		Query query = em.createQuery("SELECT s from Supervisor s where s.id=:id");
		query.setParameter("id", id);
		
		supervisor= (Supervisor)query.getSingleResult();
		
		return supervisor;
					
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//EXCLUIR
public boolean excluir(Supervisor supervisor)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		em.getTransaction().begin();
		em.remove(supervisor);
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
