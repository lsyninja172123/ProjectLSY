
package interviewPrograms;

import java.util.Iterator;

public class MultiThreadThing implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
