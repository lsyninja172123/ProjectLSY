package interviewPrograms;

public class Factorial {

	public static void pattern() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			int pattern=1;
			for (int j = num; j > i; j--) {
				System.out.print(" ");
				pattern++;
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(pattern);
				pattern++;
			}
			
			System.out.println();
		}

	}

	public static void main(String[] args) {
		pattern();
		// TODO Auto-generated method stub
		int fact = 1;
		int num = 5;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
	}

}
