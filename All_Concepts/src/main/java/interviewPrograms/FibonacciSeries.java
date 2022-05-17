package interviewPrograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<n;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
		
		
	}
}
