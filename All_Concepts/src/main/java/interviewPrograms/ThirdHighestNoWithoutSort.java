package interviewPrograms;

public class ThirdHighestNoWithoutSort {
	
public static void main(String[] args) {
  int[] a= {4,9,2,1,6,3};
  int first=0;
  int second=0;
  int third=0;
  
  for (int i = 0; i < a.length; i++) {
	if (first<a[i]) {        
		third=second;          
		second=first;
		first=a[i];
	}
	else if (second<a[i]) {
		third=second;     
		second=a[i];			
	}
	
	else if (third<a[i]) {
		third=a[i];                  
	}
}
  
  System.out.println(first);
  System.out.println(second);
  System.out.println(third);
}
}
