package model.entities;

import java.util.Date;
import java.util.Objects;

public class Client {
	
	private Integer id;
	private String name;
	private String email;
	private String cpf;
	private Date bhirthDate;
	private String phoneNumber;
	
	private Address address;

	public Client(Integer id, String name, String email, String cpf, Date bhirthDate, String phoneNumber,
			Address address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cpf = cpf;
		this.bhirthDate = bhirthDate;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getBhirthDate() {
		return bhirthDate;
	}

	public void setBhirthDate(Date bhirthDate) {
		this.bhirthDate = bhirthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Client: \n"
				+ "id=" + id 
				+ "\nname : " + name 
				+ "\nemail : " + email 
				+ "\ncpf : " + cpf 
				+ "\nbhirthDate : " + bhirthDate 
				+ "\nphoneNumber : " + phoneNumber
				+ address;
	}
	
}
