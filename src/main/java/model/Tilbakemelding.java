package model;

import jakarta.persistence.*;

@Entity
@Table(name="tilbakemelding")
public class Tilbakemelding {
	
	@Id
	@GeneratedValue
	private int tilbakemelding_id;
	
	@ManyToOne
	@JoinColumn(name = "student")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "forelesning")
	private Forelesning forelesning;
	
	@Enumerated(EnumType.STRING)
	private Farge farge;
	
	
	public Tilbakemelding(Student student, Forelesning forelesning, Farge farge) {
		this.student = student;
		this.forelesning = forelesning;
		this.farge = farge;
	}
	
	


}
