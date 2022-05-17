package interviewPrograms;

public class PairOfElementsEqualToGivenNo {
public static void main(String[] args) {
	int[] a= {4,5,2,3,8,2,6,1,3,5};
	int givenNo=9;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]+a[j]==givenNo) {
				System.out.println(a[i]+","+a[j]);
				break;
			}
		}
	}
}
}
