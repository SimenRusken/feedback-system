package model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="forelesning")
public class Forelesning {
	
	@Id
	@GeneratedValue
	private int id;
	private String fag;
	private LocalDate dato;
	private String sted;
	
	@ManyToOne
	private Lærer lærer;
	
	public Forelesning(String fag, LocalDate dato, String sted, Lærer lærer) {
		this.fag = fag;
		this.dato = dato;
		this.sted = sted;
		this.lærer = lærer;
	}

}
