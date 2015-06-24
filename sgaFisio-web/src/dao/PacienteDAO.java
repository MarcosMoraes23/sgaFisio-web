package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Paciente;
import util.PersistenceUtil;

public class PacienteDAO 
{
	public static PacienteDAO  getInstance()
	{
		return new PacienteDAO ();
	}
	
//PERSISTIR	
public Paciente persistir(Paciente paciente)
{
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		em.getTransaction().begin();
		paciente = em.merge(paciente);
		em.getTransaction().commit();
		
		return paciente;
		
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
public List<Paciente> buscarTodos()
{
	List<Paciente> pacientes;
	
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		Query query = em.createNamedQuery("Paciente.findAll");
		pacientes = query.getResultList();
		
		return pacientes;
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}

//BUSCAR POR CPF	
@SuppressWarnings("unchecked")
public List<Paciente> buscarCpf(String cpf)
{
	List<Paciente> pacientes;
	
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		Query query = em.createQuery("SELECT p FROM Paciente p where cpf =:cpf");
		query.setParameter("cpf", cpf);	
		pacientes = query.getResultList();
		
		return pacientes;
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//BUSCAR POR NOME
@SuppressWarnings("unchecked")
public List<Paciente> buscarPorNome(String nome)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Paciente> pacientes;
	
	try 
	{
		Query query = em.createQuery("SELECT p FROM Paciente p where nome=:nome");
		query.setParameter("nome", nome);
		
		pacientes = query.getResultList();
		
		return pacientes;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}


//BUSCAR POR ID	
public Paciente buscarId(Long id)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	Paciente paciente;
	
	try
	{
		Query query = em.createQuery("SELECT p from Paciente p where id=:id");
		query.setParameter("id", id);
		
		paciente= (Paciente)query.getSingleResult();
		
		return paciente;
					
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//EXCLUIR
public boolean excluir(Paciente paciente)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		em.getTransaction().begin();
		em.remove(paciente);
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
