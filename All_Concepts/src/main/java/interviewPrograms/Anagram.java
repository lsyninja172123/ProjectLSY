package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Anagram {
public static void main(String[] args) {
	String s1="keep";
	String s2="pees";
	int p=0;
	if (s1.length()!=s2.length()) {
		System.out.println("not a anagram");
	}
	else {
		for (int i = 0; i <s1.length(); i++) {
			char c = s1.charAt(i);
			if (!s2.contains(String.valueOf(c))) {
				p++;
				System.out.println("not a anagram");
				break;
			}
		}
		if (p==0) {
			System.out.println("anagram");
		}
	}
	
	Map<Integer, Integer> mp=new HashMap<>();
	mp.put(1, 0);
	mp.put(1, 1);
	System.out.println(mp.size());
	System.out.println(mp);
	
	Set<Integer> s=new HashSet<>();
	Iterator<Integer> it = s.iterator();
	
	List<Integer> li=new ArrayList<>();
	ListIterator<Integer> lt = li.listIterator();
	
	
	
}
}
