package fa.training.threads;

import java.util.List;

import fa.training.entities.ExperienceCandidate;
import fa.training.entities.FresherCandidate;
import fa.training.main.Repository;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      Mar 21, 2022
 * @version   1
 */
public class DisplayThread extends Thread {

	private Repository repository = Repository.getInstance();
	
	public DisplayThread() {
		
	}
	public void display() {
		
		synchronized(repository.experienceCandidateListOutput) {
			for(ExperienceCandidate experienceCandidate : repository.experienceCandidateListOutput) {
				System.out.println("Display Thread: "+experienceCandidate.toString());
			}
			repository.experienceCandidateListOutput.notifyAll();
			}

				synchronized(repository.fresherCandidateListOutput) {
			for(FresherCandidate fresherCandidate : repository.fresherCandidateListOutput) {
				System.out.println("Display Thread: "+fresherCandidate.toString());
			}
			repository.fresherCandidateListOutput.notifyAll();
		}
				
}

	
	@Override
	public void run() {
		System.out.println("Display thread is running");
		display();
	}
	
}
