package org.araay;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCount {

public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1= new ArrayList<Integer>();
		l.add(0);
		l.add(1);
		l.add(3);
		l.add(2);
		l.add(4);
		l.add(4);
		l.add(2);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(3);
		l.add(4);
		
		int count=0;
		System.out.println(l);
		System.out.println();
		System.out.println("Size of list l is "+l.size());
		System.out.println("==============================================");
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				
				if (l.get(i)==l.get(j)) {
					if (l1.contains(l.get(j))) {
						continue;
					}
					l1.add(l.get(i));
					count++;
				}
			}}
			System.out.println("Duplicate elements in list l is "+l1);
			System.out.println("Duplicates count is : "+count);
		
}
}
