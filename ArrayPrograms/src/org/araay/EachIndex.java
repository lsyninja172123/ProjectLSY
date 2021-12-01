package org.araay;

import java.util.ArrayList;
import java.util.List;

public class EachIndex {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		
		System.out.println(l);
		System.out.println();
		System.out.println("Size of list l is "+l.size());
		System.out.println("==============================================");
		
		for (int i = 0; i < l.size(); i++) {
			Integer x = l.get(i);
			//System.out.println(x);

				if (x==10) {
					 System.out.println(i);
					
					
				}
			
		}			

		
	}		

		
	}

