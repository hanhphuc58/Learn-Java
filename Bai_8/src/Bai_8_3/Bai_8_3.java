package Bai_8_3;

import java.util.ArrayList;

public class Bai_8_3 {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			ar.add(i);
		}

		int s = 0;
		for (Integer x : ar) {

			s += x;
		}
		
		System.out.println(s);

	}
}
