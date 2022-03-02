package interviewPrograms;

import java.util.Iterator;

public class ReverseString {
	public static void stringRev() {
		String s = "AdangathaPaanachi";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println("rev string of AdangathaPaanachi is   " + rev);
	}

	public static void revWord() {

		String s = "Senthil kumar periyathambi";
		String revWord = "";

		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			String rev = "";
			String sp = split[i];
			for (int j = sp.length() - 1; j >=0; j--) {
				rev = rev + sp.charAt(j);
			}
			revWord = revWord+rev+" ";
		}
		
		System.out.println(revWord);
	}

	public static void main(String[] args) {
		stringRev();
		
		revWord();
	}
}
