package fa.training.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.ExperienceCandidate;
import fa.training.entities.FresherCandidate;
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
		 ExperienceCandidate experienceCandidate1 = ExperienceCandidate.builder()		
		.firstName("Phuong")
		.lastName("Le")
		.address("Hai Duong")
		.birthDate("16/04/2000")
		.email("1801040171@s.hanu.edu.vn")
		.phone("3483583043")
		.professionalSkill("Java")
		.experiencedYear(1)
		.build();
		
		 
		ExperienceCandidate experienceCandidate2 = ExperienceCandidate.builder()
		.firstName("Anh")
		.lastName("Ngoc")
		.address("Hai Duong")
		.birthDate("31/10/2000")
		.email("1801040015@s.hanu.edu.vn")
		.phone("8540964506")
		.professionalSkill("Mobile")
		.experiencedYear(1)
		.build();
		
		ExperienceCandidate experienceCandidate3 = ExperienceCandidate.builder()
		.firstName("Lead")
		.lastName("Do")
		.address("Nam Dinh")
		.birthDate("12/03/1996")
		.email("1601040000@s.hanu.edu.vn")
		.phone("485647964")
		.professionalSkill("Chem gio")
		.experiencedYear(26)
		.build();
		
		experienceCandidateListInput.add(experienceCandidate1);
		experienceCandidateListInput.add(experienceCandidate2);
		experienceCandidateListInput.add(experienceCandidate3);
		
		
		FresherCandidate fresherCandidate1 = FresherCandidate.builder()
		.firstName("Phuong")
		.lastName("Le")
		.address("Hai Duong")
		.birthDate("16/04/2000")
		.email("1801040171@s.hanu.edu.vn")
		.phone("493948232")
		.graduationRank(1)
		.graduationDate(null)
		.education("HANU")
		.build();
		
		FresherCandidate fresherCandidate2 = FresherCandidate.builder()
		.firstName("Anh")
		.lastName("Ngoc")
		.address("Hai Duong")
		.birthDate("31/10/2000")
		.email("1801040015@s.hanu.edu.vn")
		.phone("38573943")
	    .education("HANU")
		.graduationRank(1)
		.graduationDate(null)
		.build();
		
		FresherCandidate fresherCandidate3 = FresherCandidate.builder()
		.firstName("Lead")
		.lastName("Do")
		.address("Nam Dinh")
		.birthDate("12/03/1996")
		.email("1601040000@s.hanu.edu.vn")
		.phone("43948394")
		.education("HUST")
		.graduationRank(1)
		.graduationDate(null)
		.build();
		
		fresherCandidateListInput.add(fresherCandidate1);
		fresherCandidateListInput.add(fresherCandidate2);
		fresherCandidateListInput.add(fresherCandidate3);

	}
	
}
