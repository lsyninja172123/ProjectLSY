package interviewPrograms;

public class CountAndSumofDigits {
	public static void main(String[] args) {
		int i=0,j=0,count=0;
		int num=12345;
		int a=num;
		while(a>0) {
			i=a%10;
			j=j+i;
			a=a/10;
			count++;
		}
		System.out.println("Sum "+j);
		System.out.println("Count "+count);
	}
}
