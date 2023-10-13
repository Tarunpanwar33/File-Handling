package file_opearations;

import java.io.File;
import java.io.IOException;

public class Exists {

	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
		if (file.exists()) {
			
			System.out.println("file is already exist");
		} else {
         
			try {
				file.createNewFile();
				
				System.out.println("file is sucesfully created");
				
			} catch (IOException e) {
				
				System.out.println("file is not created ");
				
				e.printStackTrace();
			}
		}
	}
}
