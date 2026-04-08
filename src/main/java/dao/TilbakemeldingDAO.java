package dao;

import jakarta.persistence.EntityManager;
import model.Forelesning;
import model.Student;
import model.Tilbakemelding;

public class TilbakemeldingDAO implements Dao {


	public boolean harAlleredeStemt(Student s, Forelesning f) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Tilbakemelding tilbakemelding = em.createQuery("SELECT t FROM tilbakemelding t "
				+ "WHERE t.student = :student AND t.forelesning = :forelesning", Tilbakemelding.class)
				.getSingleResult();
		
		if (tilbakemelding != null) {
			return true;
		} return false;
	}

}
