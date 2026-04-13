package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import model.Student;
import service.PasswordUtil;

public class StudentDAO {
	
	public StudentDAO() {
		
	}


	public void lagre(Student t) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
	}


	public Student finnVedId(int id) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Student student = em.find(Student.class, id);
		return student;
	}
	
	public Student finnVedEpost(String epost) throws Exception {
		EntityManager em = JPAUtil.getEntityManager();
		
		Student student = em.createQuery(
				"SELECT s FROM Student s WHERE s.epost = :epost", Student.class)
				.setParameter("epost", epost).getSingleResult();
		if (student == null) {
			throw new Exception("Epost finnes ikkje");
		} return student;
				
	}


	public List<Student> finnAlle() {
		EntityManager em = JPAUtil.getEntityManager();
		
		List<Student> listeAvStudenter = em.createQuery(
				"SELECT s FROM Student s",Student.class).getResultList();
		return listeAvStudenter;
	}


	public void slettMedEpost(Student t) {
		String epost = t.getEpost();
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Query q = em.createQuery("DELETE FROM Student s WHERE s.epost = :epost");
		q.setParameter("epost", epost);
		q.executeUpdate();
		
		tx.commit();
	}


	public void oppdater(Student t) {
		// TODO Auto-generated method stub
		
	}
	


	
	

}
