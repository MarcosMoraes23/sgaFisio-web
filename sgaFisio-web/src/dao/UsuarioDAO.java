package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Usuario;
import util.PersistenceUtil;


public class UsuarioDAO
{
	
	public static UsuarioDAO  getInstance()
	{
		return new UsuarioDAO ();
	}
	
//PERSISTIR	
public Usuario persistir(Usuario usuario)
{
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		em.getTransaction().begin();
		usuario = em.merge(usuario);
		em.getTransaction().commit();
		
		return usuario;
		
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
public List<Usuario> buscarTodos()
{
	List<Usuario> usuarios;
	
	EntityManager em =  PersistenceUtil.getEntityManager();
	
	try 
	{
		Query query = em.createNamedQuery("Usuario.findAll");
		usuarios = query.getResultList();
		
		return usuarios;
		
	}
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}

//BUSCAR POR User	
@SuppressWarnings("unchecked")
public List<Usuario> buscarPorNome(String user)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	List<Usuario> usuarios;
	
	try 
	{
<<<<<<< HEAD
		Query query = em.createQuery("SELECT u FROM Usuario u where upper(u.usuario) like :user");
		query.setParameter("user", "%"+ user.toUpperCase()+"%");
=======
		Query query = em.createQuery("SELECT u FROM Usuario u where usuario=:user");
		query.setParameter("user", user);
>>>>>>> origin/master
		
		usuarios = query.getResultList();
		
		return usuarios;
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
		return null;
	}
}


//BUSCAR POR ID	
public Usuario buscarId(Long id)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	Usuario usuario;
	
	try
	{
		Query query = em.createQuery("SELECT u from Usuario u where id=:id");
		query.setParameter("id", id);
		
		usuario = (Usuario)query.getSingleResult();
		
		return usuario;
					
	}
	catch (Exception e)
	{
		e.printStackTrace();
		return null;
	}
}


//EXCLUIR
public boolean excluir(Usuario usuario)
{
	EntityManager em = PersistenceUtil.getEntityManager();
	
	try
	{
		em.getTransaction().begin();
		em.remove(usuario);
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
