package interviewPrograms;

public class NoOfSubstring {
public static void main(String[] args) {
	String s="mondaytuedasdaywednesdaythursdaydaydas";
	String sub="day";
	int n=0;
	int len = s.length();
	int subLength = sub.length();
	while (len>=subLength) {
		int index = s.indexOf(sub, 0);
		try {
			String temp=s.substring(index, index+subLength);
			if (temp.equals(sub)) {
				n++;
				System.out.println(n);
			}
			
		}
		catch (Exception e) {
			
		}
		s=s.substring(index+subLength,len);
		System.out.println(s);
		len=s.length();
	}
	System.out.println("outer while");
	System.out.println("final n"+n);
}
}
