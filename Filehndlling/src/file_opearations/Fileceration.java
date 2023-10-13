package file_opearations;

import java.io.File;
import java.io.IOException;

public class Fileceration {

	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
		try {
			file.createNewFile();
			System.out.println("File is created ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
