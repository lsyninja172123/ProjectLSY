package sathya;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FromToCity {
	public static void main(String[] args) {
		String s = "chennai-vellore";
		String s1 = "bangalore-salem";
		String[] split = s.split("-");
		String[] split1 = s1.split("-");

		Map<String, String> mp = new HashMap<>();
		mp.put(split[0], split[1]);
		mp.put(split1[0], split1[1]);
		// System.out.println(mp);
		System.out.println("Enter from City");
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			if (key.equalsIgnoreCase(nextLine)) {
				String value = entry.getValue();
				System.out.println("The Destination of " + nextLine + " is " + value);
			}
		}
	}
}
