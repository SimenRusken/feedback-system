package model;

public class Forelesning {
	
	private int id;
	private String fag;
	private String dato;
	private String sted;
	private Lærer lærer;
	
	public Forelesning(int id, String fag, String dato, String sted, Lærer lærer) {
		this.id = id;
		this.fag = fag;
		this.dato = dato;
		this.sted = sted;
		this.lærer = lærer;
	}

}
