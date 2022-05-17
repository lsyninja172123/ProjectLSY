package interviewPrograms;

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		MultiThreadThing mul = new MultiThreadThing();
		Thread t1=new Thread(mul);

		StringComparisons mul1 = new StringComparisons();
		Thread t2=new Thread(mul1);
  
		MultiThreadThing mul2 = new MultiThreadThing();

		Thread t3=new Thread(mul2);

		t1.start();
		t1.join();

		t2.start();

		t2.join();
		
		t3.start();

	}

}
