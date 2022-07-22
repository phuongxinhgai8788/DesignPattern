package fa.training.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fa.training.entities.ExperienceCandidate;
import fa.training.entities.FresherCandidate;
import fa.training.threads.DisplayThread;
import fa.training.threads.ReadFileThread;
import fa.training.threads.WriteFileThread;
import fa.training.utils.Constant;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date      Mar 21, 2022
 * @version   1
 */
public class CandidateManagement {

	public static void main(String[] args) {
		
		WriteFileThread writeFileThread = new WriteFileThread();
		
		ReadFileThread readFileThread = new ReadFileThread();
		DisplayThread displayThread = new DisplayThread();
		
		writeFileThread.setPriority(Thread.MAX_PRIORITY);
		readFileThread.setPriority(Thread.NORM_PRIORITY);
		displayThread.setPriority(Thread.MIN_PRIORITY);
		writeFileThread.start();
		try {
			writeFileThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		readFileThread.start();
		try {
			readFileThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		displayThread.start();
		
	}
}
