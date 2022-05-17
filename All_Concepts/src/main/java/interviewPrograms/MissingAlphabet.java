package interviewPrograms;

public class MissingAlphabet {
public static void main(String[] args) {
	String s="acdefghilmnopqrstuwxyz";
	int ascii=97;
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		int n=c;
		while (n!=ascii) {
			char c1=(char)ascii;
			System.out.println(c1);
			ascii++;
		}
		ascii++;
	}
}
}
