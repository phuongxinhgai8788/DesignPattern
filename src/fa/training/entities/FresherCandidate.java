package fa.training.entities;

import java.io.Serializable;
import java.util.Date;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      July 22, 2022
 * @version   1
 */
public class FresherCandidate extends Candidate implements Serializable{

	private Date graduationDate;
	private int graduationRank;
	private String education;
	
	
	public FresherCandidate() {
		super();
	}


	public FresherCandidate(FresherCandidateBuilder builder) {
		
		super(builder);
		this.graduationDate = builder.getGraduationDate();
		this.graduationRank = builder.getGraduationRank();
		this.education = builder.getEducation();
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
	public static class FresherCandidateBuilder extends CandidateBuilder {
        private Date graduationDate;
        private int graduationRank;
        private String education;

        public Date getGraduationDate() {
            return graduationDate;
        }

        public FresherCandidateBuilder setGraduationDate(Date graduationDate) {
            this.graduationDate = graduationDate;
            return this;
        }

        public int getGraduationRank() {
            return graduationRank;
        }

        public FresherCandidateBuilder setGraduationRank(int graduationRank) {
            this.graduationRank = graduationRank;
            return this;
        }

        public String getEducation() {
            return education;
        }

        public FresherCandidateBuilder setEducation(String education) {
            this.education = education;
            return this;
        }

        @Override
        public FresherCandidate build() {
            return new FresherCandidate(this);
        }
    }
}
