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
		ExperienceCandidate experienceCandidate1 = new ExperienceCandidate();
		experienceCandidate1.setFirsName("Phuong");
		experienceCandidate1.setLastName("Le");
		experienceCandidate1.setAddress("Hai Duong");
		experienceCandidate1.setBirthDate("16/04/2000");
		experienceCandidate1.setEmail("1801040171@s.hanu.edu.vn");
		experienceCandidate1.setPhone("3483583043");
		experienceCandidate1.setProfessionalSkill("Java");
		experienceCandidate1.setExperiencedYear(1);
		
		ExperienceCandidate experienceCandidate2 = new ExperienceCandidate();
		experienceCandidate2.setFirsName("Anh");
		experienceCandidate2.setLastName("Ngoc");
		experienceCandidate2.setAddress("Hai Duong");
		experienceCandidate2.setBirthDate("31/10/2000");
		experienceCandidate2.setEmail("1801040015@s.hanu.edu.vn");
		experienceCandidate2.setPhone("8540964506");
		experienceCandidate2.setProfessionalSkill("Mobile");
		experienceCandidate2.setExperiencedYear(1);
		
		ExperienceCandidate experienceCandidate3 = new ExperienceCandidate();
		experienceCandidate3.setFirsName("Lead");
		experienceCandidate3.setLastName("Do");
		experienceCandidate3.setAddress("Nam Dinh");
		experienceCandidate3.setBirthDate("12/03/1996");
		experienceCandidate3.setEmail("1601040000@s.hanu.edu.vn");
		experienceCandidate3.setPhone("485647964");
		experienceCandidate3.setProfessionalSkill("Chem gio");
		experienceCandidate3.setExperiencedYear(26);
		
		experienceCandidateListInput.add(experienceCandidate1);
		experienceCandidateListInput.add(experienceCandidate2);
		experienceCandidateListInput.add(experienceCandidate3);
		
		
		FresherCandidate fresherCandidate1 = new FresherCandidate();
		fresherCandidate1.setFirsName("Phuong");
		fresherCandidate1.setLastName("Le");
		fresherCandidate1.setAddress("Hai Duong");
		fresherCandidate1.setBirthDate("16/04/2000");
		fresherCandidate1.setEmail("1801040171@s.hanu.edu.vn");
		fresherCandidate1.setPhone("493948232");
		fresherCandidate1.setGraduationRank(1);
		fresherCandidate1.setGraduationDate(null);
		
		FresherCandidate fresherCandidate2 = new FresherCandidate();
		fresherCandidate2.setFirsName("Anh");
		fresherCandidate2.setLastName("Ngoc");
		fresherCandidate2.setAddress("Hai Duong");
		fresherCandidate2.setBirthDate("31/10/2000");
		fresherCandidate2.setEmail("1801040015@s.hanu.edu.vn");
		fresherCandidate2.setPhone("38573943");
		fresherCandidate2.setGraduationRank(1);
		fresherCandidate2.setGraduationDate(null);
		
		FresherCandidate fresherCandidate3 = new FresherCandidate();
		fresherCandidate3.setFirsName("Lead");
		fresherCandidate3.setLastName("Do");
		fresherCandidate3.setAddress("Nam Dinh");
		fresherCandidate3.setBirthDate("12/03/1996");
		fresherCandidate3.setEmail("1601040000@s.hanu.edu.vn");
		fresherCandidate3.setPhone("43948394");
		fresherCandidate3.setGraduationRank(1);
		fresherCandidate3.setGraduationDate(null);
		
		fresherCandidateListInput.add(fresherCandidate1);
		fresherCandidateListInput.add(fresherCandidate2);
		fresherCandidateListInput.add(fresherCandidate3);

	}
	
}
