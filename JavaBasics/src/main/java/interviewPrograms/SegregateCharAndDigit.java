package interviewPrograms;

public class SegregateCharAndDigit {
	public static void anotherWay(){
		String s="123AM256CD";
		String alpha="";
		String nos="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int n=c;
			if ((n>=65 && n<=90) || (n>=97 && n<=122)) {
				alpha=alpha+c;
			}
			else {
				nos=nos+c;
			}
		}
		System.out.println(alpha+nos);
	}
	
	public static void main(String[] args) {
		//Write a program Ind12ia45my to print in the below format? op- Indiamy1245
		
		String s="Ind12ia45my";
		String digit="";
		String no="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				no=no+c;
			}
			else {
				digit=digit+c;
			}
		}
		System.out.println(digit+no);
		
		anotherWay();
	}
	
	

}
