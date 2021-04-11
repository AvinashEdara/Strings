package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Max_Occurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char x[] = str.toCharArray();
		int size = x.length;
		LinkedHashMap<Character, Integer> lmap = new LinkedHashMap<>();
		int i = 0;
		while (i != size) {
			if (lmap.containsKey(x[i]) == false) {
				lmap.put(x[i], 1);
			} else {
				int old_value = lmap.get(x[i]);
				int new_value = old_value + 1;
				lmap.put(x[i], new_value);

			}
			++i;

		}
		Set<Map.Entry<Character, Integer>> lhmap = lmap.entrySet();
		char max_key = ' ';
		int max_value = 0;
		for (Entry<Character, Integer> data : lhmap) {
			if (data.getValue() > max_value) {
				max_value = data.getValue();
				max_key = data.getKey();
			}
		}
		System.out.print(max_key + " ");
		System.out.println(max_value);
		
		sc.close();
	}

}
