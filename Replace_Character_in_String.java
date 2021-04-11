package strings;

import java.util.Scanner;

public class Replace_Character_in_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		str = str.replace("R", "A");
		System.out.println(str);
		sc.close();
	}

}
