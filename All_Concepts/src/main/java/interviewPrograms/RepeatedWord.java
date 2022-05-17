package interviewPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWord {
public static void main(String[] args) {
	String s ="Firstly i need to find where i am in me";
	String[] split = s.split(" ");
	Map<String,Integer> mp=new HashMap<>();
	for (String sp : split) {
		if(mp.containsKey(sp)) {
			Integer it = mp.get(sp);
			mp.put(sp, it+1);
		}else
			mp.put(sp, 1);
	}
	System.out.println(mp);
	Set<Entry<String, Integer>> entrySet = mp.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
}
}
