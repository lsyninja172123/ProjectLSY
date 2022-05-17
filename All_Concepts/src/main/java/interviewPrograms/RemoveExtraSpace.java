package interviewPrograms;

public class RemoveExtraSpace {
public static void main(String[] args) {
	String s="    Wednesday   ";
	
	//remove leading spaces
	System.out.println(s.replaceAll("[ \t]", ""));
	
	//remove trailing spaces
	System.out.println(s.replaceAll("[ \t]+$",""));
	
	//remove both leading and trailing spaces
	System.out.println(s.replaceAll("[ \t]+|[\t]+$", ""));
	
	
}
}
