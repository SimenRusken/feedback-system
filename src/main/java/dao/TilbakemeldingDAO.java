package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Forelesning;
import model.Student;
import model.Tilbakemelding;

public class TilbakemeldingDAO  {


	public boolean harAlleredeStemt(String s, Forelesning f) {
		EntityManager em = JPAUtil.getEntityManager();
		
		List<Tilbakemelding> tilbakemelding = em.createQuery("SELECT t FROM Tilbakemelding t "
				+ "WHERE t.student = :student AND t.forelesning = :forelesning", Tilbakemelding.class)
				.setParameter("student", s)
				.setParameter("forelesning", f)
				.getResultList();
		
		if (tilbakemelding.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public void giTilbakemelding(Tilbakemelding t) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}

}
