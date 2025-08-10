package Bai_10;

public class main {

	public static void main(String[] args) {

		String s[] = new String[] { "abde", "ab", "abc", "a", "b" };

		Lambda lbd = (s) -> {

			for (int i = 0; i < s.length - 1; i++) {

				for (int j = i + 1; j < s.length; j++) {

					if (s[i].compareToIgnoreCase(s[j]) > 0) {

						String t = s[i];

						s[i] = s[j];

						s[j] = t;

					}
				}
			}

			System.out.println(s);
		};

	}
}
