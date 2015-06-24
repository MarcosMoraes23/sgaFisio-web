package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Secretaria;
import util.PersistenceUtil;

public class SecretariaDAO 
{
	public static SecretariaDAO  getInstance()
	{
		return new SecretariaDAO ();
	}
	
//PERSISTIR	
public Secretaria persistir(Secretaria secretaria)
{
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		em.getTransaction().begin();
		secretaria = em.merge(secretaria);
		em.getTransaction().commit();
		
		return secretaria;
		
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
public List<Secretaria> buscarTodos()
{
	List<Secretaria> secretarias;
	
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		Query query = em.createNamedQuery("Secretaria.FindAll");
		secretarias = query.getResultList();
		
		return secretarias;
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}

//BUSCAR POR NOME
@SuppressWarnings("unchecked")
public List<Secretaria> buscarPorNome(String nome)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Secretaria> secretarias;
	
	try 
	{
		Query query = em.createQuery("SELECT s FROM Secretaria s where nome=:nome");
		query.setParameter("nome", nome);
		
		secretarias = query.getResultList();
		
		return secretarias;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}


//BUSCAR POR CPF
@SuppressWarnings("unchecked")
public List<Secretaria> buscarCpf(String cpf)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Secretaria> secretarias;
	
	try 
	{
		Query query = em.createQuery("SELECT s FROM Secretaria s where cpf=:cpf");
		query.setParameter("cpf", cpf);
		
		secretarias = query.getResultList();
		
		return secretarias;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}



//BUSCAR POR ID	
public Secretaria buscarId(Long id)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	Secretaria secretaria;
	
	try
	{
		Query query = em.createQuery("SELECT s from Secretaria s where id=:id");
		query.setParameter("id", id);
		
		secretaria= (Secretaria)query.getSingleResult();
		
		return secretaria;
					
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//EXCLUIR
public boolean excluir(Secretaria secretaria)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		em.getTransaction().begin();
		em.remove(secretaria);
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
