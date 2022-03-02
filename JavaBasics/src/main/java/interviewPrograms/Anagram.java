package interviewPrograms;

public class Anagram {
public static void main(String[] args) {
	String s1="keep";
	String s2="peek";
	int p=0;
	if (s1.length()!=s2.length()) {
		System.out.println("not a anagram");
	}
	else {
		for (int i = 0; i <s1.length(); i++) {
			char c = s1.charAt(i);
			if (!s2.contains(String.valueOf(c))) {
				p++;
			}
		}
		if (p==0) {
			System.out.println("anagram");
		}
	}
	
	
}
}
