package fa.training.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.ExperienceCandidate;
import fa.training.entities.ExperienceCandidate.ExperienceCandidateBuilder;
import fa.training.entities.FresherCandidate;
import fa.training.entities.FresherCandidate.FresherCandidateBuilder;
import fa.training.utils.Constant;

public class Repository {

	public static File fresherCandidateFile = new File(Constant.FRESHER_EMPLOYEE_FILE_PATH);
	public static File experienceCandidateFile = new File(Constant.EX_EMPLOYEE_FILE_PATH);;
	public static List<FresherCandidate> fresherCandidateListInput = new ArrayList<>();
	public static List<ExperienceCandidate> experienceCandidateListInput = new ArrayList<>();
	public static List<FresherCandidate> fresherCandidateListOutput = new ArrayList<>();
	public static List<ExperienceCandidate> experienceCandidateListOutput = new ArrayList<>();
	
	private static Repository INSTANCE;
	
	private Repository() {
		setUpRepository();
	}
	
	public static Repository getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Repository();
		}
		return INSTANCE;
	}
	
	private void setUpRepository() {
		 ExperienceCandidate experienceCandidate1 = ((ExperienceCandidateBuilder) new ExperienceCandidate.ExperienceCandidateBuilder()		
		.setFirsName("Phuong")
		.setLastName("Le")
		.setAddress("Hai Duong")
		.setBirthDate("16/04/2000")
		.setEmail("1801040171@s.hanu.edu.vn")
		.setPhone("3483583043"))
		.setProfessionalSkill("Java")
		.setExperiencedYear(1)
		.build();
		
		ExperienceCandidate experienceCandidate2 = ((ExperienceCandidateBuilder) new ExperienceCandidate.ExperienceCandidateBuilder()
		.setFirsName("Anh")
		.setLastName("Ngoc")
		.setAddress("Hai Duong")
		.setBirthDate("31/10/2000")
		.setEmail("1801040015@s.hanu.edu.vn")
		.setPhone("8540964506"))
		.setProfessionalSkill("Mobile")
		.setExperiencedYear(1)
		.build();
		
		ExperienceCandidate experienceCandidate3 = ((ExperienceCandidateBuilder) new ExperienceCandidate.ExperienceCandidateBuilder()
		.setFirsName("Lead")
		.setLastName("Do")
		.setAddress("Nam Dinh")
		.setBirthDate("12/03/1996")
		.setEmail("1601040000@s.hanu.edu.vn")
		.setPhone("485647964"))
		.setProfessionalSkill("Chem gio")
		.setExperiencedYear(26)
		.build();
		
		experienceCandidateListInput.add(experienceCandidate1);
		experienceCandidateListInput.add(experienceCandidate2);
		experienceCandidateListInput.add(experienceCandidate3);
		
		
		FresherCandidate fresherCandidate1 = ((FresherCandidateBuilder) new FresherCandidate.FresherCandidateBuilder()
		.setFirsName("Phuong")
		.setLastName("Le")
		.setAddress("Hai Duong")
		.setBirthDate("16/04/2000")
		.setEmail("1801040171@s.hanu.edu.vn")
		.setPhone("493948232"))
		.setGraduationRank(1)
		.setGraduationDate(null)
		.setEducation("HANU")
		.build();
		
		FresherCandidate fresherCandidate2 = ((FresherCandidateBuilder) new FresherCandidate.FresherCandidateBuilder()
		.setFirsName("Anh")
		.setLastName("Ngoc")
		.setAddress("Hai Duong")
		.setBirthDate("31/10/2000")
		.setEmail("1801040015@s.hanu.edu.vn")
		.setPhone("38573943"))
	    .setEducation("HANU")
		.setGraduationRank(1)
		.setGraduationDate(null)
		.build();
		
		FresherCandidate fresherCandidate3 = ((FresherCandidateBuilder) new FresherCandidate.FresherCandidateBuilder()
		.setFirsName("Lead")
		.setLastName("Do")
		.setAddress("Nam Dinh")
		.setBirthDate("12/03/1996")
		.setEmail("1601040000@s.hanu.edu.vn")
		.setPhone("43948394"))
		.setEducation("HUST")
		.setGraduationRank(1)
		.setGraduationDate(null)
		.build();
		
		fresherCandidateListInput.add(fresherCandidate1);
		fresherCandidateListInput.add(fresherCandidate2);
		fresherCandidateListInput.add(fresherCandidate3);

	}
	
}
