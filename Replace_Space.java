package strings;

import java.util.Scanner;

public class Replace_Space {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = '-';
		if (str.contains(" ")) {
			str = str.replace(' ', ch);
			System.out.println(str);
		} else
			System.out.println("No space in given string");

		sc.close();
	}
}
