package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String a = sc.next();
		a=a.toLowerCase();
		System.out.println("Enter the Second String: ");
		String b = sc.next();
		b=b.toLowerCase();
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if (Arrays.equals(c, d))
			System.out.println("They are Anagrams");
		else
			System.out.println("not Anagrams");
		sc.close();
	}

}
