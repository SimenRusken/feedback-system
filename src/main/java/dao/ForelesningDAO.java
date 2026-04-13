package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Forelesning;

public class ForelesningDAO {


	public void lagre(Forelesning t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	
	public Forelesning finnVedId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Forelesning> finnAlle() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void slett(Forelesning t) {
		// TODO Auto-generated method stub
		
	}

	
	public void oppdater(Forelesning t) {
		// TODO Auto-generated method stub
		
	}



}
