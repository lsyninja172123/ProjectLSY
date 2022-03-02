package interviewPrograms;

public class TrimAndReplace {
	public static void main(String[] args) {
		String s="   Senthilkumar       ";
		System.out.println("Actual string "+ s);
		s=s.trim().replace(" ", "");
		
		System.out.println("After trimmed "+ s);
		
		s=s.replaceAll("[AaEeIiOoUu]","*");
		
		System.out.println("After replaced "+ s);
		
		
	}
}
