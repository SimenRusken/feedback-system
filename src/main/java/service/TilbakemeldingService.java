package service;

import dao.TilbakemeldingDAO;
import model.Forelesning;
import model.Student;

public class TilbakemeldingService {
	
	private TilbakemeldingDAO tilbakemeldingDao;
	
	public TilbakemeldingService() {
		this.tilbakemeldingDao = new TilbakemeldingDAO();
	}
	
	public void giTilbakemelding() {
		
	}
	
	public boolean harAlleredeStemt(Student s, Forelesning f) {
		return tilbakemeldingDao.harAlleredeStemt(s,f);
	}

}
