package file_opearations;

import java.io.File;
import java.io.IOException;

public class Absolute {

	public static void main(String[] args) {
		
		File file = new File("D:\\WEJA14\\Filehndlling\\Absolute/test.txt");
		
	   if (file.exists()) {
		
		   System.out.println("file is already exist");
		   
    	} else {
    		
    		try {
				file.createNewFile();
				System.out.println("file is sucessfully created");
			} catch (IOException e) {
                 System.out.println("file is not created");
				e.printStackTrace();
			}
                   
	}
	}
}
