package model;

import jakarta.persistence.*;


@Entity
@Table(name="Student")
public class Student extends Bruker {
	
	
	public Student(String fornavn, String etternavn, String epost) {
		super(fornavn,etternavn,epost);
		
		
	}

}
