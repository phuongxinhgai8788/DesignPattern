package fa.training.entities;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      July 22, 2022
 * @version   1
 */
public class ExperienceCandidate extends Candidate {

	private int experiencedYear;
	private String professionalSkill;

	public ExperienceCandidate() {
		super();
	}

	public ExperienceCandidate(ExperienceCandidateBuilder builder) {

		super(builder);
		this.experiencedYear = builder.getExperiencedYear();
		this.professionalSkill = builder.getProfessionalSkill();
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

	public static class ExperienceCandidateBuilder extends CandidateBuilder {
		private int experiencedYear;
		private String professionalSkill;

		public int getExperiencedYear() {
			return experiencedYear;
		}

		public ExperienceCandidateBuilder setExperiencedYear(int experiencedYear) {
			this.experiencedYear = experiencedYear;
			return this;
		}

		public String getProfessionalSkill() {
			return professionalSkill;
		}

		public ExperienceCandidateBuilder setProfessionalSkill(String professionalSkill) {
			this.professionalSkill = professionalSkill;
			return this;
		}

		@Override
		public ExperienceCandidate build() {
			return new ExperienceCandidate(this);
		}
	}
}
