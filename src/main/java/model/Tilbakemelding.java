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
	private String studenthash;
	
	@ManyToOne
	@JoinColumn(name = "forelesning")
	private Forelesning forelesning;
	
	@Enumerated(EnumType.STRING)
	private Farge farge;
	
	
	public Tilbakemelding(String studenthash, Forelesning forelesning, Farge farge) {
		this.studenthash = studenthash;
		this.forelesning = forelesning;
		this.farge = farge;
	}
	
	


}
