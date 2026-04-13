package service;

import dao.TilbakemeldingDAO;
import model.Farge;
import model.Forelesning;
import model.Student;
import model.Tilbakemelding;

public class TilbakemeldingService {
	
	private TilbakemeldingDAO tilbakemeldingDao;
	
	public TilbakemeldingService() {
		this.tilbakemeldingDao = new TilbakemeldingDAO();
	}
	
	public void giTilbakemelding(Student student, Forelesning forelesning, Farge farge) {
		
		String hashedStudent = SHA256Hashing.generateSHA256Hash(""+student.getId());
		
		if (!harAlleredeStemt(hashedStudent, forelesning)) {
			Tilbakemelding tilbakemelding = new Tilbakemelding(hashedStudent, forelesning, farge);
			tilbakemeldingDao.giTilbakemelding(tilbakemelding);
		} else {
			throw new IllegalArgumentException("Studenten har allerede gitt tilbakemelding på denne forelesningen");
		}
	
	}
	
	public boolean harAlleredeStemt(String s, Forelesning f) {
		return tilbakemeldingDao.harAlleredeStemt(s,f);
	}

}
