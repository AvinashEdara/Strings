package strings;

import java.util.Scanner;

public class Replace_String_in_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace("Avi", "Ammalu");
		System.out.println(str);
		sc.close();
	}
}
