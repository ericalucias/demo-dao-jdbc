package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //insere no banco de dados o objeto enviado como parametro de entrada
	void update(Seller obj);
	void deleteById(Seller obj);
	Seller findById(Integer id); //pega o ID consulta no BD o objeto com esse ID, se não achar retorna nullo
	List<Seller> findAll(); // retorna tudo em uma lista
}

