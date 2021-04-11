package strings;

import java.util.Scanner;

public class Number_of_Characters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Number of characters in a string is " + count);

		sc.close();
	}

}
