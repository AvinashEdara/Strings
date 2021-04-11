package strings;

import java.util.Scanner;

public class String_Rotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String str = a.concat(a);
		if (str.contains(b))
			System.out.println("It's a rotational string");
		else
			System.out.println("It's not a rotational string");
		sc.close();
	}
}
