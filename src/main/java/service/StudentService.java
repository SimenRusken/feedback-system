package service;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	
	StudentDAO studentDAO;
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
	}
	

	
	public Student registrer(String fornavn, String etternavn, String epost, String passord) {
		
		String hashedPassword = PasswordUtil.hashPassword(passord);
		Student student = new Student(fornavn, etternavn, epost, hashedPassword);
		studentDAO.lagre(student);
		return student;
		
	}
	
	public Student finnStudent(int id) {
		return studentDAO.finnVedId(id);
		
	}
	
	public Student loginn(String epost, String passord) throws Exception {
		Student student = studentDAO.finnVedEpost(epost);
		if (PasswordUtil.checkPassword(passord, student.getPassord())) {
			return student;
		} else {
			throw new IllegalArgumentException("Passord stemmer ikkje");
		}
	}
	


}
