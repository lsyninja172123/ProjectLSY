package interviewPrograms;

public class Swapping_String {
	public static void withoutThird() {
     String a="abc";
     String b="def";
     System.out.println("Before swapping");
     
     System.out.println("a = "+a);
     System.out.println("b = "+b);
     
     System.out.println("After swapping");
     
     a=a+b;
    // System.out.println(a);
     b=a.substring(0, (a.length()-b.length()));
     a=a.substring(b.length());
     System.out.println("a = "+a);
     System.out.println("b = "+b);
	}
	public static void with_Third() {
		String a="abc";
	     String b="def";
	     System.out.println("Before swapping");
	     
	     System.out.println("a = "+a);
	     System.out.println("b = "+b);
	     System.out.println("After swapping");
	     String temp="";
	     temp=a;
	     a=b;
	     b=temp;
	     
	     System.out.println("a = "+a);
	     System.out.println("b = "+b);
	}
public static void main(String[] args) {
	//withoutThird();
	with_Third();
}
}
