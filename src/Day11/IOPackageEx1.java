package Day11;

import java.io.File;
import java.io.IOException;

public class IOPackageEx1 {

	public static void main(String[] args) throws IOException{

		File f1 = new File("e:/demo");

		//1. exist() - return whether file exist at the location or not? True/False
		System.out.println("f3 exists = " + f1.exists());

		//2. isFile() - check whether the directory you mention is a file or not?
		System.out.println("f3 is file = " + f1.isFile());

		File f2 = new File("c:/demo");
		System.out.println("is file = " + f2.isFile());
		
		//3. isDirectory() - check whether the given path is a valid directory path or not?
		System.out.println("is directory = " + f2.isDirectory());	
		
		//4. length() - returns file size in bits
		System.out.println("file size = " + (f1.length()/8) + " bytes");

		//5. createNewFile()
		File f3 = new File("e:/demo/myfile.txt");
		
		if(!f3.exists())
			f3.createNewFile();
		
		System.out.println("f3 exists = " + f3.exists());
		System.out.println("f3 is file = " + f3.isFile());
		System.out.println("f1 is directory = " + f1.isDirectory());	

		//6. print directory path of file
		System.out.println("directory path = " + f3.getPath());
		System.out.println("directory parent path = " + f3.getParent());

		//7. print name of file 
		System.out.println("file name = " + f3.getName());
		
		//8. read only 
		System.out.println("file name = " + f3.canRead());
		
		//9. is file is hidden
		System.out.println("is file is hidden = " + f3.isHidden());
		
		//10. print last modified date of file
		System.out.println("last modified date of file = " + f3.lastModified());



	}
}
