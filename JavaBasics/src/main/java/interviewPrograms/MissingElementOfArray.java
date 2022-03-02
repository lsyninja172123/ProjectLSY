package interviewPrograms;

public class MissingElementOfArray {
	public static void main(String[] args) {
		int[] a={10,12,13,14,19,21,24};
		for (int i = 0; i < a.length-1; i++) {
			int n=a[i];
			int d=a[i+1]-a[i]-1;
			while (d>0) {
				n=n+1;
				System.out.print(n+" ");
				d--;
			}
					}
	}

}
