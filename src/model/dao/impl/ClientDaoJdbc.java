package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.ClientDao;
import model.entities.Client;

public class ClientDaoJdbc implements ClientDao{
	
	private Connection conn;
	
	public ClientDaoJdbc(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delteByid(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
