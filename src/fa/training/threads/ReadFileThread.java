package fa.training.threads;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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
public class ReadFileThread extends Thread {

	private Repository repository = Repository.getInstance();
	
	public ReadFileThread() {
	
	}
	
	public void readFile() throws IOException, ClassNotFoundException {
		ObjectInputStream ois1 = null;
		ObjectInputStream ois2 = null;

		ExperienceCandidate experienceCandidate = null;
		FresherCandidate fresherCandidate = null;
		
			synchronized(repository.experienceCandidateFile) {
				synchronized(repository.experienceCandidateListOutput) {
				try {
				ois1 = new ObjectInputStream(new FileInputStream(repository.experienceCandidateFile));

			for (;;) {
			    try {
			    	experienceCandidate = (ExperienceCandidate) ois1.readObject();
					repository.experienceCandidateListOutput.add(experienceCandidate);
					System.out.println("Read file thread: "+experienceCandidate.toString());
			    }
			    catch (EOFException exc) {
			        break;
			    }
			}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				repository.experienceCandidateFile.notifyAll();
				repository.experienceCandidateListOutput.notifyAll();
				if(ois1 !=null) {
					ois1.close();
				}
			}
				}

			}
			
			synchronized(repository.fresherCandidateFile) {
		    	synchronized(repository.fresherCandidateListOutput) {

				try {
				ois2 = new ObjectInputStream(new FileInputStream(repository.fresherCandidateFile));

				for (;;) {
				    try {
				    	fresherCandidate = (FresherCandidate) ois2.readObject();
					    	repository.fresherCandidateListOutput.add(fresherCandidate);
				    
							System.out.println("Read file thread: "+fresherCandidate.toString());

				    }
				    catch (EOFException exc) {
				        break;
				    }
				}
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					repository.fresherCandidateFile.notifyAll();
					repository.fresherCandidateListOutput.notifyAll();
					if(ois2 !=null) {
						ois2.close();
					}
				}
			
			}
			}
			}
	
	
	@Override
	public void run() {
		
		System.out.println("ReadFileThread is running");
		try {
			readFile();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
