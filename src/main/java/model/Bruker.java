package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Bruker")
public class Bruker {
	@GeneratedValue
	@Id
	private int id;
	
	private String fornavn;
	private String etternavn;
	private String epost;
	
	
	public Bruker(String fornavn, String etternavn, String epost) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.epost = epost;
	}
	
	

}
