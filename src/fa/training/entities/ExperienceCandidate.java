package fa.training.entities;
/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      Mar 21, 2022
 * @version   1
 */
public class ExperienceCandidate extends Candidate {

	private int experiencedYear;
	private String professionalSkill;
	
	
	public ExperienceCandidate() {
		super();
	}
	
	public ExperienceCandidate(String firsName, String lastName, String birthDate, String address, String phone,
			String email, int experiencedYear, String professionalSkill) {
		
		super(firsName, lastName, birthDate, address, phone, email);
		this.experiencedYear = experiencedYear;
		this.professionalSkill = professionalSkill;
	}

	public int getExperiencedYear() {
		return experiencedYear;
	}

	public void setExperiencedYear(int experiencedYear) {
		this.experiencedYear = experiencedYear;
	}

	public String getProfessionalSkill() {
		return professionalSkill;
	}

	public void setProfessionalSkill(String professionalSkill) {
		this.professionalSkill = professionalSkill;
	}

	@Override
	public String toString() {
		return "ExperienceCandidate [experiencedYear=" + experiencedYear + ", professionalSkill=" + professionalSkill
				+ ", firsName=" + firsName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
