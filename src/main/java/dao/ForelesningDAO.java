package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Forelesning;

public class ForelesningDAO implements Dao<Forelesning> {

	@Override
	public void lagre(Forelesning t) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public Forelesning finnVedId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Forelesning> finnAlle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void slett(Forelesning t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oppdater(Forelesning t) {
		// TODO Auto-generated method stub
		
	}



}
