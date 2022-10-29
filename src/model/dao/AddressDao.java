package model.dao;

import java.util.List;

import model.entities.Address;

public interface AddressDao {
	
	void insert(Address address);
	void update(Address address);
	void deleteById(Integer id);
	Address findById(Integer id);
	List<Address> findAll();
}
