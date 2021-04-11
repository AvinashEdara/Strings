package strings;

import java.util.Scanner;

public class Subset_Of_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l = str.length();
		int temp = 0;
		String[] a = new String[l * (l + 1) / 2];

		for (int i = 0; i < l; i++) {
			for (int j = i; j < l; j++) {
				a[temp] = str.substring(i, j + 1);
				temp++;
			}
		}
		System.out.println("Possible subsets are ");
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);

		}
		sc.close();
	}
}
