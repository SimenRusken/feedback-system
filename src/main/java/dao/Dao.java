package dao;

import java.util.List;

import model.Student;

public interface Dao<T> {
	
	void lagre (T t);
	T finnVedId(int id);
	List<T> finnAlle();
	void slett(T t);
	void oppdater(T t);
	void slettMedEpost(Student t);

}
