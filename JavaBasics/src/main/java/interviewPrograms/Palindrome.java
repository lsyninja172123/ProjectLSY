package interviewPrograms;

import java.util.Iterator;

public class Palindrome {

	public static void revNumber() {

		int a, i = 0, j = 0;
		int num = 12345;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = j * 10 + i;
			a = a / 10;
		}
		System.out.println(j);

	}

	public static void PalindromeNumber() {
		int a, i = 0, j = 0;
		int num = 121;
		a = num;
		while (a > 0) {
			i = a % 10;
			j = j * 10 + i;
			a = a / 10;
		}
		if (num == j) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");
	}

	public static void countOfPanlidrome() {
		int count = 0;
		for (int k = 10; k <= 1000; k++) {
			int i = 0, j = 0;
			int a = k;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}
			if (k == j) {
				count++;
				System.out.println(k);
			}
		}
		System.out.println("Count "+count);
	}

	public static void main(String[] args) {
		//PalindromeNumber();
		//revNumber();
		countOfPanlidrome();

	}

}
