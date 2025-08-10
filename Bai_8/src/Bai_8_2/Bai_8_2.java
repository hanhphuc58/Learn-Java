package Bai_8_2;

import java.util.HashMap;
import java.util.Scanner;

public class Bai_8_2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hsm = new HashMap<>();
		
		hsm.put(1, "A");
		hsm.put(2, "B");
		hsm.put(3, "C");
		
//		System.out.println(hsm);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(hsm.get(n));
	}
}
