package Day11;

import java.io.File;
import java.io.IOException;

/* Assignment: WAP to list all the files in a directory with file name and its extention */

public class IOAss1 {

	public static void main(String[] args) throws IOException{

		File file = new File("e:/demo");
		
		File[] all_files = file.listFiles();
		
		for(File f : all_files) {
			if(f.exists() && f.isFile()) {
				
                int index = f.getName().lastIndexOf('.');
                
                if(index !=-1) {
                    String name = f.getName().substring(0, index);
                    String extension = f.getName().substring(index+1);
                    
                	System.out.println("File Name : " + name + " Extension : ." + extension);
                }
			}
		}
	}

}
