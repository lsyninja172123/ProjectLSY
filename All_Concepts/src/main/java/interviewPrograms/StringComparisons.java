package interviewPrograms;

public class StringComparisons extends Thread {
@Override
	public void run() {
	String s1=new String("abc");
	String s2=new String("abc");
	System.out.println(s1==s2);// Different memory allocation
	
	String ss1="abc";
	String ss2="abc";
	System.out.println(ss1==ss2);
	
	StringBuffer sb1=new StringBuffer(s1);
	StringBuffer sb2=new StringBuffer("abc");

	
	System.out.println(s1.equals(sb1)); // stingbuffer does not overwrite a equals methood.
	
	System.out.println(s1.contentEquals(sb1)); //To compare String with StringBuffer
	
	System.out.println(sb1==sb2); // Return memory location
	
	System.out.println(sb1.toString().equals(sb2.toString())); // To compare sb with sb
	
	String s3="abc";
	s3.intern(); // intern create copy only if string created with new(object)
				 // Must call at the time of object creation itself 
	
	System.out.println(s1==s3); //return different location
	
	String s4=new String("abc").intern();
	String s5=new String("abc");
	s5.intern();
	System.out.println(s4==s5);
	
	String s6=new String("abc").intern();
	System.out.println(s4==s6); // If the copy is there already, just sharing the memory
	
	
}
}
