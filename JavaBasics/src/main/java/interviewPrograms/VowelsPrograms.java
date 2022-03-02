package interviewPrograms;

public class VowelsPrograms {
public static void main(String[] args) {
	String s="senthilkumar";
	int vowels=0;
	int nonVowels=0;
	for (int i = 0; i <s.length(); i++) {
		char c = s.charAt(i);
		if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
			vowels++;
		}else
			nonVowels++;
	}
	System.out.println("Vowels "+vowels);
	System.out.println("Non Vowels "+nonVowels);
}
}
