package file_opearations;

import java.io.File;

public class Delete {

	public static void main(String[] args)  {
		
		File file = new File("D:\\WEJA14\\Filehndlling\\Absolute/test.txt");
		
		if (file.exists()) {
			
			file.delete();
			
			System.out.println("file is sucessfully deleted");
		}
		else {
			
        System.out.println("file doesn't exists");
        
		}
	}
}
