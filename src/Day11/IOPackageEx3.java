package Day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOPackageEx3 {

	public static void main(String[] args) {

		try
		{
			File f1 = new File("e:/demo/sample.txt");
			
			FileInputStream fin = new FileInputStream(f1);
			
			InputStreamReader in = new InputStreamReader(fin);
			
			while(true) {
				int code = in.read();
				if(code==-1)
					break;
				System.out.print((char)code);
			}
		}
		
		catch(FileNotFoundException ex) {
			System.out.println(ex);
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		
	}

}
