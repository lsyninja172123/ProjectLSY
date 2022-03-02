package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapUsingIndex {
	
	public static void UsingIndex() {
		Map<Integer, Character> mp=new HashMap<>();
		mp.put(1, 'a');
		mp.put(2, 'b');
		mp.put(3, 'c');
		
		Set<Integer> keySet = mp.keySet();
		Integer[] arr=new Integer[keySet.size()];
		keySet.toArray(arr);
		for (int i = 0; i < arr.length; i++) {
			Character c = mp.get(arr[i]);
			System.out.println("Value in "+i+" index is "+c);
		}
	}
	
	public static void normal() {
		Map<Integer, Character> mp=new HashMap<>();
		mp.put(1, 'a');
		mp.put(2, 'b');
		mp.put(3, 'c');
		Set<Entry<Integer, Character>> entry = mp.entrySet();
		for (Entry<Integer, Character> en : entry) {
			System.out.println(en);
		}
	}
	public static void main(String[] args) {
		UsingIndex();
		normal();
	}

}
