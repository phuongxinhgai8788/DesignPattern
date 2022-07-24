package fa.training.entities;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      July 22, 2022
 * @version   1
 */
public class ExperienceCandidate extends Candidate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int experiencedYear;
	private String professionalSkill;

	 public static abstract class Builder<B extends Builder<B>> extends Candidate.Builder<B> {
		    private int experiencedYear;
			private String professionalSkill;
	        // ...

	        public B experiencedYear(int experiencedYear) {
	            this.experiencedYear = experiencedYear;
	            return self();
	        }

	        public B professionalSkill(String professionalSkill) {
	            this.professionalSkill = professionalSkill;
	            return self();
	        }

	        // ...

	        public ExperienceCandidate build() {
	            return new ExperienceCandidate(this);
	        }
	        
	        protected Builder() {}
	    }

	    public static Builder<?> builder() {
	        return new ExperienceCandidateBuilder();
	    }

	    public int getExperiencedYear() {
	        return experiencedYear;
	    }

	    public String getProfessionalSkill() {
	        return professionalSkill;
	    }
	    
	    private static class ExperienceCandidateBuilder extends Builder<ExperienceCandidateBuilder> {
	        @Override
	        protected ExperienceCandidateBuilder self() {
	            return this;
	        }
	    }

	    protected ExperienceCandidate(Builder<?> builder) {
	        super(builder);
	        experiencedYear = builder.experiencedYear;
	        professionalSkill = builder.professionalSkill;
	        // ...
	    }
	@Override
	public String toString() {
		return "ExperienceCandidate [experiencedYear=" + experiencedYear + ", professionalSkill=" + professionalSkill
				+ ", firsName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address="
				+ address + ", phone=" + phone + ", email=" + email + "]";
	}

	
}
