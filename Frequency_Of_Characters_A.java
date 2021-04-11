package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Characters_A {
	// see frequency =_of_characters_of_b
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] b = str.toCharArray();
		int size = b.length;
		int i = 0;
		HashMap<Character, Integer> map = new HashMap<>();

		while (i != size) {
			if (map.containsKey(b[i]) == false) {
				map.put(b[i], 1);
			} else {
				int old_value = map.get(b[i]);
				int new_value = old_value + 1;
				map.put(b[i], new_value);
			}
			++i;
		}
		for (Map.Entry<Character, Integer> h : map.entrySet()) {

			System.out.print(h.getKey() + ":");
			System.out.println(h.getValue());
		}
		sc.close();
	}
}
