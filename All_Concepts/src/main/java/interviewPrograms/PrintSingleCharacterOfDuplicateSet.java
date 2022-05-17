package interviewPrograms;

public class PrintSingleCharacterOfDuplicateSet {
public static void main(String[] args) {
	String s="aaabbbcccdda";
	String temp=String.valueOf(s.charAt(0));
	
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (temp.charAt(temp.length()-1)!=c) {
			temp=temp+c;
		}
	}
	 
	System.out.println(temp);
}
}
