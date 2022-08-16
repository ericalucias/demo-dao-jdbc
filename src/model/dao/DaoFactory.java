package model.dao;  //contem operações estaticas para instanciar os Daos

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { //o createSellerDao retorna o SellerDao, ou seja, quando eu instanciar chamando o createSellerDao ele vai retorna o que esta na inteface SellerDao
		return new SellerDaoJDBC();
	}

}
