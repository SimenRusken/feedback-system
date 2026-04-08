package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	
	StudentDAO studentDAO;
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
	}
	

	
	public void registrer(String fornavn, String etternavn, String epost, String passord) {
		Student student = new Student(fornavn, etternavn, epost, passord);
		studentDAO.lagre(student);
		
	}
	
	public Student finnStudent(int id) {
		return studentDAO.finnVedId(id);
		
	}
	
	public Student loginn(String epost, String passord) {
		return studentDAO.loginn(epost, passord);
	}
	


}
