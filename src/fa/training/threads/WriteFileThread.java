package fa.training.threads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class WriteFileThread extends Thread {

	private Repository repository = Repository.getInstance();
	
	public WriteFileThread() {
		
	}

	public void writeFile() {
		ObjectOutputStream objectOutputStream1 = null;
		ObjectOutputStream objectOutputStream2 = null;

		// Write experienced candidate to file

		synchronized (repository.experienceCandidateFile) {

			try {
				objectOutputStream1 = new ObjectOutputStream(new FileOutputStream(repository.experienceCandidateFile));
				for (ExperienceCandidate experienceCandidate : repository.experienceCandidateListInput) {
					objectOutputStream1.writeObject(experienceCandidate);
					System.out.println("Write file thread: "+experienceCandidate.toString());
				}

			} catch (Exception exception) {

				exception.printStackTrace();

			} finally {
				repository.experienceCandidateFile.notifyAll();
				if (objectOutputStream1 != null) {
					try {
						objectOutputStream1.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		// Write fresher candidate to file
		synchronized (Repository.fresherCandidateFile) {

			try {
				objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(repository.fresherCandidateFile));
				for (FresherCandidate fresherCandidate : repository.fresherCandidateListInput) {
					objectOutputStream2.writeObject(fresherCandidate);
					System.out.println("Write file thread: "+fresherCandidate.toString());

				}

			} catch (Exception exception) {
				
				exception.printStackTrace();
				
			} finally {
				repository.fresherCandidateFile.notifyAll();
				
				if (objectOutputStream2 != null) {
					try {
						objectOutputStream2.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	@Override
	public void run() {

		System.out.println("WriteFileThread is running");
		
			writeFile();
		
	}

}
