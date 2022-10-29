package model.dao.impl;

import java.sql.Connection;
import java.util.List;
import model.dao.AddressDao;
import model.entities.Address;

public class AddressDaoJdbc implements AddressDao{

	private Connection conn;
	
	public AddressDaoJdbc(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Address address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Address findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
