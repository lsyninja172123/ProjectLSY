package interviewPrograms;

public class AlphabetPosition {
public static void main(String[] args) {
	String s="Alpha";
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		int n=c;
		//System.out.println(n+"---");
		if (n>=65 && n<=90) {
			System.out.println(c+"="+(n-64));
		}
		else if (n>=97 && n<=122) {
			System.out.println(c+"="+(n-96));
		}
	}
}
}
