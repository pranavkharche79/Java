package exep;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		try {
			FileReader file= new FileReader("text.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
		}

	}

}
