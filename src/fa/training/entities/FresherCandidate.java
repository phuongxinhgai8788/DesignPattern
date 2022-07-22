package fa.training.entities;

import java.io.Serializable;
import java.util.Date;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      Mar 21, 2022
 * @version   1
 */
public class FresherCandidate extends Candidate implements Serializable{

	private Date graduationDate;
	private int graduationRank;
	private String education;
	
	
	public FresherCandidate() {
		super();
	}


	public FresherCandidate(String firsName, String lastName, String birthDate, String address, String phone,
			String email, Date graduationDate, int graduationRank, String education) {
		
		super(firsName, lastName, birthDate, address, phone, email);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}


	public Date getGraduationDate() {
		return graduationDate;
	}


	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}


	public int getGraduationRank() {
		return graduationRank;
	}


	public void setGraduationRank(int graduationRank) {
		this.graduationRank = graduationRank;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	@Override
	public String toString() {
		return "FresherCandidate [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
				+ ", education=" + education + ", firsName=" + firsName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
