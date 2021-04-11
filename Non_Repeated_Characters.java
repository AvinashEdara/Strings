package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Non_Repeated_Characters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] b = str.toCharArray();
		int size = b.length;
		int i = 0;
		LinkedHashMap<Character, Integer> lhmap = new LinkedHashMap<>();
		while (i < size) {
			if (lhmap.containsKey(b[i]) == false) {
				lhmap.put(b[i], 1);
			} else {
				int old_value = lhmap.get(b[i]);
				int new_value = old_value + 1;
				lhmap.put(b[i], new_value);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> lmap = lhmap.entrySet();
		for (Map.Entry<Character, Integer> data : lmap) {
			if (data.getValue() == 1)
				System.out.println(data.getKey());
		}
		sc.close();
	}

}
