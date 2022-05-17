package interviewPrograms;

public class MissingElementOfArray {
	public static void main(String[] args) {
		int[] a = { 10, 12, 17, 19, 21, 24 };// 11,13,14,15,16,18,20.22,23

		for (int i = 0; i < a.length-1; i++) {

			int n = a[i]; // n=10,12

			int d = a[i + 1] - a[i] - 1; // d=12-10-1->1 d=17-12-1->4 
			while (d > 0) {

				n = n + 1;
				System.out.print(n+" ");
				d--;
			}

		}
		
		//another way
		System.out.println();
		int val=a[0];
		for (int i = 0; i < a.length; i++) {
			while (val!=a[i]) {
				System.out.print(val+" ");
				val++;
			}
			val++;
		}

	}
}