package service;

import java.util.List;

import dao.LærerDAO;
import model.Lærer;

public class LærerService {
	
	private LærerDAO lærerDao;
	
	public LærerService() {
		this.lærerDao = new LærerDAO();
	}
	
	public void loginn(String epost, String passord) {
		lærerDao.logginn(epost,passord);
	}
	
	public List<Lærer> hentAlle() {
		return lærerDao.finnAlle();
	}

}
