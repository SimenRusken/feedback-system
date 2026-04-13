package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.*;

import dao.StudentDAO;
import model.*;
import service.*;

public class TestService {
	
	private Student testStudent;
	private StudentService studentService;
	private BrukerService brukerService;
	private StudentDAO studentDAO;
	
	@BeforeEach
	public void opprett() {
		studentService = new StudentService();
		brukerService = new BrukerService();
		studentDAO = new StudentDAO();
	}
	
	@AfterEach
	public void fjernStudentFraDatabase() {
		if (testStudent != null) {
			studentDAO.slettMedEpost(testStudent);
		}
	}
	
	
	@Test
	void registrerStudent() throws Exception {
		testStudent = studentService.registrer("Simen", "Rusken", "simen@gmail.com", "simen123");
		Student studentFraDatabase = studentDAO.finnVedEpost("simen@gmail.com");
		assertTrue(testStudent.getEpost().equals(studentFraDatabase.getEpost()));
				
			}
	
	
		
	}


