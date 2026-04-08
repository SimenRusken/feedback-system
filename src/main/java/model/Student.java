package model;

import jakarta.persistence.*;


@Entity
@Table(name="Student")
public class Student extends Bruker {
	
	
	public Student(String fornavn, String etternavn, String epost, String passord) {
		super(fornavn,etternavn,epost, passord);
		
	}
	
	public Student() {
		super();
	}
	
	

}
