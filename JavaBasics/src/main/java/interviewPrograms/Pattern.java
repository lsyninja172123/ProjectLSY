package interviewPrograms;

import java.util.Iterator;

public class Pattern {

	public static void forwardTriangle() {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	public static void reverseTriange() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	public static void doubleStar() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	public static void pyramid() {
		
		
	}

	public static void numberTriangle() {
		// TODO Auto-generated method stub
		int n = 6;
		// int num=1;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	public static void revNumber() {
		// TODO Auto-generated method stub
		int n = 6;
		// int num=1;
		for (int i = 1; i <= n; i++) {
			int num = 1;
			for (int j = n; j >= i; j--) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
	}

	public static void main(String[] args) {
		forwardTriangle();
		reverseTriange();
		doubleStar();
		numberTriangle();
		revNumber();
	}
}
