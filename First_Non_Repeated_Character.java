package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class First_Non_Repeated_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] y = str.toCharArray();
		int size = y.length;
		int i = 0;
		LinkedHashMap<Character, Integer> lhmap = new LinkedHashMap<>();
		while (i != size) {
			if (lhmap.containsKey(y[i]) == false) {
				lhmap.put(y[i], 1);
			} else {
				int old_value = lhmap.get(y[i]);
				int new_value = old_value + 1;
				lhmap.put(y[i], new_value);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> lmap = lhmap.entrySet();
		for (Map.Entry<Character, Integer> data : lmap) {
			if (data.getValue() == 1) {
				System.out.println(data.getKey());
				break;
			}
		}
		sc.close();
	}

}
