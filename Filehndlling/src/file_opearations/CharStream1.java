package file_opearations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream1 {

	public static void main(String[] args) throws IOException {
		
	  File file = new File("demo.txt");
	  
	  if (file.exists()) {
		
		  System.out.println("file is already exists");
		  
		  FileWriter fileWriter = new FileWriter(file);
		  
		  fileWriter.write("Hello world");
		  
		  System.out.println("data is written to the file");
		  fileWriter.close();
	}
	  
	  else {
		  System.out.println("file doesnt exist");
		  
		  file.createNewFile();
		   System.out.println("file is created");
		   FileWriter fileWriter = new FileWriter(file);
		   fileWriter.write("hello world");
		   System.out.println("data is written to the file");
		   
		   fileWriter.close();
		  
	  }
	  
	  
	  
	}
}
