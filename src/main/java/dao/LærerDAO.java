package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Lærer;

public class LærerDAO implements Dao<Lærer> {

	
	
	
	public void logginn(String epost, String passord) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Lærer lærer = em.createQuery("SELECT l FROM lærer l WHERE l.epost = :epost", Lærer.class)
				.setParameter("epost", epost).getSingleResult();
		
		if (lærer == null) {
			throw new IllegalStateException("Finner ikkje bruker med denne eposten");
		} else {
			if (lærer.getPassord().equals(passord)) {
				System.out.println("Logg inn korrekt");
			} else {
				throw new IllegalStateException("Passord stemmer ikkje");
			}
		}
	}
	
	@Override
	public void lagre(Lærer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lærer finnVedId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lærer> finnAlle() {
		EntityManager em = JPAUtil.getEntityManager();
		return em.createQuery("SELECT l FROM lærer l",Lærer.class).getResultList();

	}

	@Override
	public void slett(Lærer t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oppdater(Lærer t) {
		// TODO Auto-generated method stub
		
	}

}
