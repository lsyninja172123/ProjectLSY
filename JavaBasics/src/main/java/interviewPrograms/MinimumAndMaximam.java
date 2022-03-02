package interviewPrograms;

import java.util.Iterator;

public class MinimumAndMaximam {
	public static void minAndMax() {
		int[] a = { 34, 23, 56, 12, 78, 45, 99, 1 };
		int temp;
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (maxValue < a[i]) {
				maxValue = a[i];
			}
		}
		System.out.println("Max Value " + maxValue);

		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (minValue > a[i]) {
				minValue = a[i];
			}
		}
		System.out.println("Min Value " + minValue);

	}

	public static void directMethod() {
		int[] a = { 34, 23, 56, 12, 78, 45, 99, 1 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		System.out.println("Min Value " + a[0]);
		System.out.println("Max Value " + (a[a.length - 1]));
	}

	public static void main(String[] args) {
		minAndMax();
		directMethod();
	}

}
