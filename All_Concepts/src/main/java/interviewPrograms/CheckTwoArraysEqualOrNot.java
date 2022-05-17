package interviewPrograms;

public class CheckTwoArraysEqualOrNot {
public static void main(String[] args) {
	int[] a= {2,3,4,5};
	int[] b= {2,3,4,5};
	int sum1=0;
	int sum2=0;
	for (int i = 0; i < a.length; i++) {
		sum1=sum1+a[i];
	}
	for (int i = 0; i < b.length; i++) {
		sum2=sum2+a[i];
	}
	if (sum1==sum2) {
		System.out.println("Arrays are equal");
	}
	else {
		System.out.println("arrays are not equal");
	}
}
}
