package fa.training.entities;

import java.io.Serializable;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      Mar 21, 2022
 * @version   1
 */
public class Candidate implements Serializable{

	protected String firsName;
	protected String lastName;
	protected String birthDate;
	protected String address;
	protected String phone;
	protected String email;
	
	public Candidate() {
		super();
	}

	public Candidate(String firsName, String lastName, String birthDate, String address, String phone, String email) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Candidate [firsName=" + firsName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
