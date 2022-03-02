package interviewPrograms;

import java.util.Scanner;

public class Swapping {
	public static void withoutThird() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Value");
		int a = s.nextInt();

		System.out.println("Enter the second Value");
		int b = s.nextInt();

		System.out.println("Before swapping");
		System.out.println(a + " , " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping");
		System.out.println(a + " , " + b);

	}

	public static void withThird() {
		int c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Value");
		int a = s.nextInt();

		System.out.println("Enter the second Value");
		int b = s.nextInt();

		System.out.println("Before swapping");
		System.out.println(a + " , " + b);

		c=a;
		a=b;
		b=c;

		System.out.println("After swapping");
		System.out.println(a + " , " + b);
	}

	public static void main(String[] args) {
		//withoutThird();
		withThird();
	}
}
