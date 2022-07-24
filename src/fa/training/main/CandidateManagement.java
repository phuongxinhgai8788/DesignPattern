package fa.training.main;

import fa.training.threads.DisplayThread;
import fa.training.threads.ReadFileThread;
import fa.training.threads.WriteFileThread;

/*
 * 
 * @author    PhuongLe
 * @modifier
 * @date     July 22, 2022
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
			e1.printStackTrace();
		}
		readFileThread.start();
		try {
			readFileThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		displayThread.start();
		
	}
}
