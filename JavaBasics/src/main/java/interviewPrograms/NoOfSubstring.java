package interviewPrograms;

public class NoOfSubstring {
public static void main(String[] args) {
	String s="mondaytuedasdaywednesdaythursdaydayda";
	String sub="day";
	int n=0;
	int len = s.length();
	int subLength = sub.length();
	while (len>=subLength) {
		int index = s.indexOf(sub, 0);
		n++;
		s=s.substring(index+subLength,len);
		len=s.length();
	}
	System.out.println(n);
}
}
