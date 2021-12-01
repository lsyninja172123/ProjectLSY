package org.araay;
import java.util.Arrays;

public class Remove {

	public static void main(String[] args) {
		int i;
		float avg=0,sum=0;
		int b[]= {10,10,20,50,60,80,60,50};
		for ( i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
			
		}
		System.out.println("==============================");
		/*sum=10+10+20+57+60+89+60+50;
		avg=sum/8;
		System.out.println(sum);
		System.out.println(avg);
		*/
		
		
		int[] a= new int[10];
		a[0]=10;
		a[1]=10;
		a[2]=20;
		a[3]=50;
		a[4]=69;
		a[5]=80;
		a[6]=60;
		a[1]=50;	
		a[8]=60;
		System.out.println("a[1] = "+a[1]);
		for ( i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
			avg=sum/a.length;

		}
		System.out.println("Total is : "+sum);
		System.out.println();
		System.out.println("Average is : "+avg);
		System.out.println();

		System.out.println("Differnce of two arrrays is : "+(b.length-a.length));
		System.out.println("=============================");
		if (Arrays.equals(a, b)) {
			System.out.println("Both are equal");

		}else {
		
			System.out.println("Not equal");
		} 
		System.out.println("==============================");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	
}
}