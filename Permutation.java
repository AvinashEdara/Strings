package strings;

public class Permutation {
// https://www.youtube.com/watch?v=aMnqiYL52VY
	public void StringPermutation(String prefix, String str) {
		int length = str.length();
		if (length == 0) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < length; i++) {
			StringPermutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, length));
			//prefix + str.charAt(i) - this one is prefix
			//str.substring(0, i) + str.substring(i + 1, length)- this one is string for next recursion
		}
	}

	public void Permutations(String str) {
		StringPermutation("", str);
	}

	public static void main(String[] args) {
		Permutation p = new Permutation();
		p.Permutations("cat");
	}

}
