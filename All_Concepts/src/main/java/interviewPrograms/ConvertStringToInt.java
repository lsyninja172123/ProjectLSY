package interviewPrograms;

public class ConvertStringToInt {
	public static void main(String[] args) {
		String s="12335";
		char c='a';
		int n=1;
		Integer valueOf = Integer.valueOf(c);
		System.out.println(valueOf);
		Integer valueOf2 = Integer.valueOf(n);
		System.out.println(valueOf2);
		Integer valueOf3 = Integer.valueOf(s);
		System.out.println(valueOf3);
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
		
	}
}
