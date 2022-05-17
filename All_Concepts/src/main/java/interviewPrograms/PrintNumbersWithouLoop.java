package interviewPrograms;

public class PrintNumbersWithouLoop {
	public static void usingRecursion(int num) {

		if (num > 0) {
			usingRecursion(num - 1);
			System.out.print(num+" ");
		}
		
	}

	public static void main(String[] args) {

		usingRecursion(25);
	}
}
