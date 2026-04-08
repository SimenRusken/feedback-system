package service;

import java.time.LocalDate;

import dao.ForelesningDAO;
import model.Forelesning;
import model.Lærer;

public class ForelesningService {
	
	private ForelesningDAO forelesningDao;
	
	public ForelesningService() {
		this.forelesningDao = new ForelesningDAO();
	}
	
	public void opprett(String fag, LocalDate dato, String sted, Lærer lærer) {
		Forelesning forelesning = new Forelesning(fag, dato, sted, lærer);
		forelesningDao.lagre(forelesning);
	}

}
