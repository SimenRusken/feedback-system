package model;

import jakarta.persistence.*;

@Entity
@Table(name="lærer")
public class Lærer extends Bruker {

	
	public Lærer(String fornavn, String etternavn, String epost, String passord) {
		super(fornavn,etternavn,epost, passord);
	}

}
