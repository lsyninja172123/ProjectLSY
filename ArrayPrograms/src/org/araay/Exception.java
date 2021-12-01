package org.araay;

public class Exception {

	private void m1() {
		m2();
		System.out.println("1");
	}

	private void m2() {
		m3();
		System.out.println("2");
	}

	private void m3() {
		System.out.println("3");
		try {
			int sum = 4 / 0;
			System.out.println("4");
		} catch (NullPointerException e) {
			System.out.println("1st catch");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2nd catch");
		} catch (Throwable e) {
			// System.out.println("3rd catch");
		}

		System.out.println("7");
	}

	public static void main(String[] args) {
		Exception obj = new Exception();
		obj.m1();
	}
}
