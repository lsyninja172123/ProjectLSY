package InterviwePrograms;

public class ArmstrongNumber {
	public static void toCheckArmstrong() {
		int n = 1634;
		int i, j = 0, digits = 0;
		int temp;
		int a = n;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
			// System.out.println(digits);
		}
		System.out.println(digits);
		while (a > 0) {
			i = a % 10;
			if (digits == 1) {
				j = j + (i);
			}
			if (digits == 2) {
				j = j + (i * i);
			}
			if (digits == 3) {
				j = j + (i * i * i);
			}
			if (digits == 4) {
				j = j + (i * i * i * i);
			}
			a = a / 10;
		}
		if (n == j) {
			System.out.println(n + " is Armstrong");
		} else {
			System.out.println(n + " is not Armstrong");
		}
	}

	public static void countofArmstrong() {
		int n = 9999;
		int i=0, j = 0, digits = 0, count = 0;
		int temp;
		int a = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		for (int k = 1; k <= n; k++) {
			a=k;
			while (a > 0) {
				i = a % 10;
				if (digits == 1) {
					j = j + (i);
				}
				else if (digits == 2) {
					j = j + (i * i);
				}
				else if (digits == 3) {
					j = j + (i * i * i);
				}
				else if (digits == 4) {
					j = j + (i * i * i * i);
				}
				a = a / 10;
			}
			if (a == j) {
				System.out.println(n);
				count++;
			}
		}
		System.out.println("count is " + count);
	}

	public static void main(String[] args) {
		//toCheckArmstrong();
		countofArmstrong();
	}

}
