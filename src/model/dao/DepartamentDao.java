package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void insert(Departament obj); //insere no banco de dados o objeto enviado como parametro de entrada
	void update(Departament obj);
	void deleteById(Departament obj);
	Departament findById(Integer id); //pega o ID consulta no BD o objeto com esse ID, se não achar retorna nullo
	List<Departament> findAll(); // retorna tudo em uma lista
}
