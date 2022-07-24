package fa.training.entities;

import java.util.Date;


/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      July 22, 2022
 * @version   1
 */
public class FresherCandidate extends Candidate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date graduationDate;
	private int graduationRank;
	private String education;
	
			 public static abstract class Builder<B extends Builder<B>> extends Candidate.Builder<B> {
				 private Date graduationDate;
					private int graduationRank;
					private String education;
					

		        public B graduationDate(Date graduationDate) {
		            this.graduationDate = graduationDate;
		            return self();
		        }

		        public B graduationRank(int graduationRank) {
		            this.graduationRank = graduationRank;
		            return self();
		        }
		        
		        public B education(String education) {
		            this.education = education;
		            return self();
		        }

		        public FresherCandidate build() {
		            return new FresherCandidate(this);
		        }
		        
		        protected Builder() {}
		    }

		    public static Builder<?> builder() {
		        return new FresherCandidateBuilder();
		    }

		  
		    
		    public Date getGraduationDate() {
				return graduationDate;
			}


			public int getGraduationRank() {
				return graduationRank;
			}


			public String getEducation() {
				return education;
			}



			private static class FresherCandidateBuilder extends Builder<FresherCandidateBuilder> {
		        @Override
		        protected FresherCandidateBuilder self() {
		            return this;
		        }
		    }

		    protected FresherCandidate(Builder<?> builder) {
		        super(builder);
		        graduationDate = builder.graduationDate;
		        graduationRank = builder.graduationRank;
		        education = builder.education;
		    }


	@Override
	public String toString() {
		return "FresherCandidate [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank
				+ ", education=" + education + ", firsName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
	}
