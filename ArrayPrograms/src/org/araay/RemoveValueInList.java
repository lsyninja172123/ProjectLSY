package org.araay;

import java.util.ArrayList;
import java.util.List;

public class RemoveValueInList {

	public static void main(String[] args) {
		
		List l = new ArrayList<>();
		/*l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		System.out.println("List l is ");
		System.out.println(l);
		System.out.println();
		Integer rem = l.remove(2);
		System.out.println("Removed value is "+rem);
		System.out.println("After removing : ");
		System.out.println(l);
		Integer rem1 = l.remove(10);
		System.out.println();
		System.out.println(l);
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(40);
		l.add(10);
		System.out.println(l);
		System.out.println();
		int li = l.lastIndexOf(10);
		Integer remove = l.remove(li);
		System.out.println("After removing last value of 10 ");
		System.out.println(l);*/
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		System.out.println("List l is ");
		System.out.println(l);
		System.out.println();
		System.out.println(l.size());
		l.add(8, 70);
		System.out.println(l);
		l.add(8, 80);
		System.out.println(l);
		System.out.println();
		l.set(7, 10);
		System.out.println(l);
		System.out.println();
		
		System.out.println(l);
	}
}
