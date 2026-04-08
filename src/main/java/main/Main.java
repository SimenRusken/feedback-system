package main;
import jakarta.persistence.EntityManagerFactory;
import service.StudentService;
import jakarta.persistence.Persistence;
import model.Student;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("feedback");
		System.out.println("Suksess");
		
		StudentService studentService = new StudentService();
		
		
		Student student = studentService.loginn("simen@gmail.com", "qwqwqw");
		System.out.println("Navn er: " + student.getFornavn());
		
		emf.close();
	}

}
