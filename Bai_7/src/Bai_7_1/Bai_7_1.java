package Bai_7_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bai_7_1 {

	public static void readFile(String file) {

		File f = new File(file);

		try {

			Scanner sc = new Scanner(f);

			while (sc.hasNextLine()) {

				String str = sc.nextLine();

				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String s = "./Bai_7/src/Bai_7_1/file.txt";

		readFile(s);

	}
}
