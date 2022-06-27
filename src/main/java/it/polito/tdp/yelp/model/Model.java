package it.polito.tdp.yelp.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.yelp.db.YelpDao;

public class Model {
	private List<User> vertici;
	private YelpDao dao;
	

	public void creaGrafo(int n) {
	vertici = new ArrayList<>(dao.getAllUserByN(n));
		
		
	}
	
	
}
