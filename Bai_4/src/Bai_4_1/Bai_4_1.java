package Bai_4_1;

public class Bai_4_1 {

	public static int sum(short a[]) {

		int s = 0;

		for (short i = 0; i < a.length; i++) {
			s += a[i];
		}

		return s;

	}

	public static void print(short a[]) {

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {

		short a[] = { 1, 2, 3, 4, 6 };

		System.out.println("sum = " + sum(a));

		print(a);
	}
}
