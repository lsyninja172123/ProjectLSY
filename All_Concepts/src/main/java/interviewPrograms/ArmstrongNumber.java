package interviewPrograms;

public class ArmstrongNumber {

	public static void toFindArmstrongNumber() {

		int num = 1;
		int n1 = num, n2 = num;
		int a = 0;
		int sum = 0;
		int digits = 0;
		while (n1 > 0) {
			n1 = n1 / 10;
			digits++;
		}

		while (n2 > 0) {
			a = n2 % 10;
			
			int x = 1;

			for (int i = 1; i <= digits; i++) {
				x = x * a;
			}

			sum = sum + x;
			n2 = n2 / 10;

		}
		if (num == sum) {
			System.out.println("Armstrong");
		} else
			System.out.println("Not Armstrong");

	}

	public static void countofArmsNo() {
		for (int j = 1; j <= 100000; j++) {
			int num = j;
			int n1 = num, n2 = num;
			int a = 0;
			int b = 0;
			int digits = 0;
			while (n1 > 0) {
				n1 = n1 / 10;
				digits++;
			}

			while (n2 > 0) {
				a = n2 % 10;
				int x = 1;

				for (int i = 0; i < digits; i++) {
					x = x * a;
				}
				b = b + x;
				n2 = n2 / 10;

			}
			if (num == b) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		toFindArmstrongNumber();
		countofArmsNo();
	}

}
