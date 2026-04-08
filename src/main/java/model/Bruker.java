package model;

import jakarta.persistence.*;

@Entity
@Table(name = "Bruker")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Bruker {
	@GeneratedValue
	@Id
	private int id;
	
	private String fornavn;
	private String etternavn;
	private String epost;
	private String passord;
	
	
	
	public Bruker(String fornavn, String etternavn, String epost, String passord) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.epost = epost;
		this.passord = passord;
	}
	
	public Bruker() {}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFornavn() {
		return fornavn;
	}



	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}



	public String getEtternavn() {
		return etternavn;
	}



	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}



	public String getEpost() {
		return epost;
	}



	public void setEpost(String epost) {
		this.epost = epost;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}
	
	
	
	
	
	

}
