package service;

import dao.PaisDAO;


public class VendedorService {
	PaisDAO dao;
	
	public VendedorService(){
		dao = new PaisDAO();
	}
	
}
