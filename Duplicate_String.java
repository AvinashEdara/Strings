package strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Duplicate_String {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		char y[]= str.toCharArray();
		int size=y.length;
		LinkedHashMap<Character,Integer>map= new LinkedHashMap<>();
		int i=0;
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i],1);
			}
			else {
				int old_value=map.get(y[i]);
			int new_value=old_value+1;
			map.put(y[i],new_value);
		}
			++i;
	}
	Set<Map.Entry<Character,Integer>>lmap=map.entrySet();
	for (Entry<Character, Integer> data : lmap) {
		if(data.getValue()>1) {
			System.out.print(data.getKey()+" ");
			System.out.println(data.getValue());
		}
	}
			sc.close();
	}

}
