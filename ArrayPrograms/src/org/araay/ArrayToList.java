package org.araay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayToList {

	public static void main(String[] args) {
		
		/*Integer[] a= {1,2,10,4,5,6,4,8,1,10};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		
		}
		
		System.out.println("=======================");
		System.out.println();
		List<Integer> asList = Arrays.asList(a);
		System.out.println(asList);
		System.out.println(asList.size());
		
		Set<Integer> s=new HashSet<>();
		s.addAll(asList);
		System.out.println();
		System.out.println(s);
		System.out.println(s.size());
		System.out.println("Duplicates count is : "+(asList.size()-s.size()));
		Iterator<Integer> iterator = s.iterator();
		while (iterator.hasNext()) {
			Integer integer =  iterator.next();
			System.out.println(integer);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicates numbers are : "+a[i]);
					
				}
			}
			
			
		}*/
		
		String[] s = {"ABC", "BCD", "EFG", "BCD", "HIJ", "ABC"};
		List<String> asList = Arrays.asList(s);
		System.out.println(asList);
		System.out.println(asList.size());
		Set<String> set = new HashSet<>();
		set.addAll(asList);
		System.out.println(set);
		System.out.println("Duplicates count is : "+(asList.size()-set.size()));
	}
}
