/**
 * 
 */
package javasparkes;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import javasparkes.service.CaseNoteService;
import javasparkes.service.CaseService;

/**
 * @author swmohara
 *
 */
public class SparkEsApi {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("SparkEsApi is Up!!!");
		
		new Thread(new CaseService()).start();
		//new Thread(new CaseNoteService()).start();
	}

}
