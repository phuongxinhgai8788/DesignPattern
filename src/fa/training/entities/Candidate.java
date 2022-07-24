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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String firstName;
	protected String lastName;
	protected String birthDate;
	protected String address;
	protected String phone;
	protected String email;
	
	public static abstract class Builder<B extends Builder<B>> {
		private String firstName;
		private String lastName;
		private String birthDate;
		private String address;
		private String phone;
		private String email;
		
		public B firstName(String firstName) {
			this.firstName = firstName;
			return self();
		}
		
		public B lastName(String lastName) {
			this.lastName = firstName;
			return self();
		}
		
		public B birthDate(String birthDate) {
			this.birthDate = firstName;
			return self();
		}
		
		public B address(String address) {
			this.address = firstName;
			return self();
		}
		
		public B phone(String phone) {
			this.phone = firstName;
			return self();
		}
		
		public B email(String email) {
			this.email = firstName;
			return self();
		}
		protected abstract B self();
		
		protected Builder() {
			
		}
	}

	public static Builder<?> builder(){
		return new BaseBuilder();
	}

	public String getFirstName() {
		return firstName;
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
	
	 private static class BaseBuilder extends Builder<BaseBuilder> {
	        @Override
	        protected BaseBuilder self() {
	            return this;
	        }
	    }

	    @SuppressWarnings("WeakerAccess")
	    protected Candidate(Builder<?> builder) {
	        firstName = builder.firstName;
	        lastName = builder.lastName;
	        birthDate = builder.birthDate;
	        address = builder.address;
	        phone = builder.phone;
	        email = builder.email;
	    }

	@Override
	public String toString() {
		return "Candidate [firsName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
