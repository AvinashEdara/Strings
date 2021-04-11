package strings;

public class String_contains_Digit {

	public static boolean isNumeric(CharSequence c) {
		if (c.length() == 0) {
			return false;
		}

		for (int i = 0; i < c.length(); i++) {
			if (!Character.isDigit(c.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isNumeric("123"));
		System.out.println(isNumeric("a"));
		System.out.println(isNumeric(" "));

	}

}
