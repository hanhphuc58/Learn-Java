package Bai_7_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai_7_3 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\Learn_Java\\Bai_7\\src\\Bai_7_3\\Untitled2.txt");

		int sum = 0;

		try {
			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {

				String s = sc.nextLine();

				sum += Integer.parseInt(s);

			}
			sc.close();

			FileWriter fr = new FileWriter("D:\\Learn_Java\\Bai_7\\src\\Bai_7_3\\result.txt", true);

			fr.write("sum = " + sum);
			
			fr.close();
			
			System.out.println("success");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

//		System.out.println("sum = " + sum);

	}

}
