package application;

import java.util.Date;

import model.entities.Address;
import model.entities.Client;


public class Program {

	public static void main(String[] args) {

		Address address = new Address("Estevam Barbosa", "15", "Quadra F", "Itapuã", "41610625", "Salvador", "Bahia");
		Client client =new Client(null, "Claudio Carigé", "ccarige@gmail.com", "894.965.315-04", new Date(), "71-991125697", address);
		System.out.println(client);
	}
}
