package interviewPrograms;

public class CamelAndPascal {
public static void camelNotation(){
	
	String s="camel and pascal";
	String[] split = s.split(" ");
	String sen="";
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		char c = word.charAt(0);
		sen=sen+Character.toLowerCase(c)+word.substring(1);
	}
	System.out.println(sen);
}

public static void pascalNotation() {
	String s="camel and pascal";
	String[] split = s.split(" ");
	String sen="";
	
	for (int j = 0; j < split.length; j++) {
		String word = split[j];
		char c=word.charAt(0);
		if (j==0) {
			c = Character.toLowerCase(c);
		}
		else {
			c=Character.toUpperCase(c);
		}
		sen=sen+c+word.substring(1);
	}
	System.out.println(sen);
	}
	

public static void main(String[] args) {
	camelNotation();
	pascalNotation();
}
}
