package model.dao;

import db.DB;
import model.dao.impl.AddressDaoJdbc;


public class DaoFactory {
	
	public static AddressDao createAddressDao() {
		return new AddressDaoJdbc(DB.getConnection());
	}

}
