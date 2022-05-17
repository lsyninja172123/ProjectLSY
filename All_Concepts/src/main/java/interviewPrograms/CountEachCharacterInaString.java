package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountEachCharacterInaString {
	public static void main(String[] args) {
		String s = "Firstly i need to find where i am in me";
		s = s.replace(" ", "");
		System.out.println(s);
		Map<Character, Integer> mp = new HashMap<>();
		char[] ch = s.toCharArray();
		for (char c : ch) {
			if (mp.containsKey(c)) {
				Integer it = mp.get(c);
				mp.put(c, it + 1);
			} else
				mp.put(c, 1);
		}
		System.out.println(mp);
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" = "+entry.getValue());
			}
		}
	}
}
