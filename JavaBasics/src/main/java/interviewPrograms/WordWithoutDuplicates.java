package interviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordWithoutDuplicates {

	public static void method1() {
		// Print word which dosen't had duplicates character
		String s = "my name is Rahul but my last name is Kumaar";
		String[] split = s.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for (int i = 0; i < split.length; i++) {
			set.add(split[i]);
		}

		for (String st : set) {
			List<Character> li = new ArrayList<>();
			int p = 0;
			for (int i = 0; i < st.length(); i++) {
				char c = st.charAt(i);
				if (li.contains(c) == true) {
					p++;
				} else {
					li.add(c);
				}
			}
			if (p == 0) {
				System.out.print(st+" ");
			}
		}
	}
	
	public static void withoutDuplicateWords() {
		//Ignore the duplicate words
		String s = "my name is Rahul but my last name is Kumaar";
		String[] split = s.split(" ");
		Map<String, Integer> mp=new HashMap<>();
		for (String word : split) {
			if(mp.containsKey(word)) {
				Integer it = mp.get(word);
				mp.put(word, it+1);
			}
			else {
				mp.put(word, 1);
			}
		}
		Set<Entry<String, Integer>> entry = mp.entrySet();
		for (Entry<String, Integer> en : entry) {
			if (en.getValue()==1) {
				System.out.print(en.getKey()+" ");
			}
		}
		}
	
	public static void printDuplicateWords() {
		String s = "my name is Rahul but my last name is Kumaar";
		String[] split = s.split(" ");
		List<String> li=new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			if (li.contains(split[i])==false) {
				li.add(split[i]);
			}
			else {
				System.out.print(split[i]+" ");
			}
		}
		
	}
	
	public static void deleteDuplicates() {
		String s="sweetty";
		String s1="";
		int len=s.length();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (s1.indexOf(c)<0) {
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {
		method1();
		System.out.println();
		withoutDuplicateWords();
		System.out.println();
		printDuplicateWords();
		System.out.println();
		deleteDuplicates();
	}

}
