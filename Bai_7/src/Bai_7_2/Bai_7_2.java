package Bai_7_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bai_7_2 {

	public static void main(String[] args) {

		try {

			FileWriter fw = new FileWriter("D:\\Learn_Java\\Bai_7\\src\\Bai_7_2\\Untitled 1.txt", true);

			BufferedWriter bfw = new BufferedWriter(fw);

			bfw.write("Nguyen Van A ");
			bfw.write("Nguyen Van B ");
			bfw.write("Nguyen Van C ");
			bfw.write("Nguyen Van D ");
			bfw.write("Nguyen Van E");

			System.out.println("success");

			bfw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
