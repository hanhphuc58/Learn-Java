package Bai_6_1;

import java.util.Scanner;

public class Bai_6_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		try {
			int b = sc.nextInt();
			
			System.out.println("thuong la: " + a/b);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhap b phai khac 0");
		}
	}
}
