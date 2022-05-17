package interviewPrograms;

public class PerfectNumber {
	public static void checkPerfectNo() {
		int n=6;
		int sum=0;
		for (int i = 1; i <n; i++) {
			if (n%i==0) {
				sum=sum+i;
			}
		}
		if (sum==n) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}
	
	public static void countOfPerfectnumber() {
		int count=0;
		for (int i = 1; i <=500; i++) {
			int sum=0;
			for (int j = 1; j < i; j++) {
				if (i%j==0) {
					sum=sum+j;
				}
			}
			if (sum==i) {
				count++;
				System.out.println(i);
			}
			
		}
	}
public static void main(String[] args) {
	checkPerfectNo();
	countOfPerfectnumber();
}
}
