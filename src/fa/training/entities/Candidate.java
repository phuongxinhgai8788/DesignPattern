package fa.training.entities;

import java.io.Serializable;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      July 22, 2022
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

	public Candidate(CandidateBuilder builder) {
		super();
		this.firsName = builder.getFirsName();
		this.lastName = builder.getLastName();
		this.birthDate = builder.getBirthDate();
		this.address = builder.getAddress();
		this.phone = builder.getPhone();
		this.email = builder.getEmail();
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
	
	public static class CandidateBuilder{

		   private String firsName;
	        private String lastName;
	        private String birthDate;
	        private String address;
	        private String phone;
	        private String email;

	        public CandidateBuilder setFirsName(String firsName) {
	            this.firsName = firsName;
	            return this;
	        }

	        public CandidateBuilder setLastName(String lastName) {
	            this.lastName = lastName;
	            return this;
	        }

	        public CandidateBuilder setBirthDate(String birthDate) {
	            this.birthDate = birthDate;
	            return this;
	        }

	        public CandidateBuilder setAddress(String address) {
	            this.address = address;
	            return this;
	        }

	        public CandidateBuilder setPhone(String phone) {
	            this.phone = phone;
	            return this;
	        }

	        public CandidateBuilder setEmail(String email) {
	            this.email = email;
	            return this;
	        }

	        public String getFirsName() {
	            return firsName;
	        }

	        public String getLastName() {
	            return lastName;
	        }

	        public String getBirthDate() {
	            return birthDate;
	        }

	        public String getAddress() {
	            return address;
	        }

	        public String getPhone() {
	            return phone;
	        }

	        public String getEmail() {
	            return email;
	        }

	        public Candidate build() {
	            return new Candidate(this);
	        }

		
	}
}
