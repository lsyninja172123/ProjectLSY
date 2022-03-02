package interviewPrograms;

public class PrintNumbersWithoutForLoop {
	public static void usingRecursion(int num) {
		if (num<=100) {
			System.out.print(num+" ");
			usingRecursion(num+1);
		}
	}
public static void main(String[] args) {
	int n=1;
	while (n<=100) {
		System.out.print(n+" ");
		n++;
	}
	System.out.println();
	int number=1;
	usingRecursion(number);
}
}
