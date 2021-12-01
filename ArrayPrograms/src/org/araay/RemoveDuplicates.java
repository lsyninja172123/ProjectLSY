package org.araay;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//List<Integer> l= new ArrayList<Integer>();
		int a[] = {10, 10, 20, 50, 60, 80, 60, 50};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+", ");
		}
		System.out.println();
		
		int b[] = new int[7];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		b[5] = 60;
		b[6] = 70;
		//b[7] = 80;
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+", ");
		}
		
		
	}
}
