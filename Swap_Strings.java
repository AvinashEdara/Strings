package strings;

import java.util.Scanner;

public class Swap_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());
		System.out.println("After Swapping ");
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
