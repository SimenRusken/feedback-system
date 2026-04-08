package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import model.Student;

public class StudentDAO implements Dao<Student> {
	
	public StudentDAO() {
		
	}

	@Override
	public void lagre(Student t) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Student finnVedId(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public List<Student> finnAlle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void slett(Student t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void oppdater(Student t) {
		// TODO Auto-generated method stub
		
	}
	
	public Student loginn(String epost, String passord) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Student student = em.createQuery(
				"SELECT s from Student s WHERE s.epost = :epost", Student.class)
				.setParameter("epost", epost).getSingleResult();
		
		if (student == null) {
			throw new NullPointerException("Epost stemmer ikkje");
		} else {
			if (student.getPassord().equals(student.getPassord())) {
				return student;
			
			} else {
				System.out.println(student.getPassord());
				throw new NullPointerException("Epost er korrekt, men passord stemmer ikkje");
			}
		}
	
	}

	
	

}
