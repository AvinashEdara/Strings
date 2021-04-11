package strings;

import java.util.Scanner;

public class Remove_White_Spaces {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] a = str.toCharArray();
		String b = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i] != ' ') {
				b = b + a[i];

			}
		}
		System.out.println(b);
		sc.close();
	}

}
