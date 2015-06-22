package dao;

import javax.persistence.EntityManager;

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
//BUSCAR POR NOME
//BUSCAR POR ID
//BUSCAR POR DATA
//EXCLUIR	
}
