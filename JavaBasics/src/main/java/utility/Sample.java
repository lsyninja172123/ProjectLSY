package utility;

public class Sample extends Parent {
	final int a = 10;
	static int b = 20;

	public static void add() {
		int a;
	}

	public Sample() {

		System.out.println("Child ");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
	}
}
