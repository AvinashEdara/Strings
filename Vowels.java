package strings;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		a = a.toLowerCase();
		int vowel_count = 0;
		int consonants_count = 0;

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u') {
				vowel_count++;
			}

			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				consonants_count++;
		}
		System.out.println("The number of vowels in the string is " + vowel_count);
		System.out.println("The number of vowels in the string is " + consonants_count);
		sc.close();

	}

}
