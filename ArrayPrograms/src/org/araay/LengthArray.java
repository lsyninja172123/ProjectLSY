package org.araay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LengthArray {

	public static void main(String[] args) {
		
		
		List<Integer> l=new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(50);
		
		System.out.println(l);
		List<Integer> syn = Collections.synchronizedList(l);
		System.out.println(syn);
		int s = l.size();
		int count=0;
		
		for (int i = 0; i < l.size(); i++) {
			for (int j = i+1; j < l.size(); j++) {
				if (l.get(i)==l.get(j)) {
					count=count+1;
					System.out.println();
				}
			}}
			System.out.println("Duplicates count is : "+count);
		//}
		
		/*System.out.println("Length of the Array List is "+s);
		
		 Integer i = l.get(2);
		System.out.println(i);
		
		Integer remove = l.remove(3);
		System.out.println(remove);
		System.out.println(l);
		
		boolean b = l.contains(60);
		System.out.println(b);
		
		Integer set = l.set(1, 100);
		System.out.println(l);*/
		
		/*Iterator<Integer> iterator = l.iterator();
		while (iterator.hasNext()) {
			Integer x = iterator.next();
			System.out.println(x);
		}*/
		
	}

	
}
