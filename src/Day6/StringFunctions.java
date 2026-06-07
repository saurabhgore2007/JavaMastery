package Day6;

//String Finctions

public class StringFunctions {

	public static void main(String[] args) {


		String quote = "     The     best way to cheer yourself up is to try to cheer somebody else up.   ";
		
		System.out.println(quote);
		
		char data[] = {'1','2','3'};
		String s = new String(data);
		System.out.println(data);
		
		//1.length()
		System.out.println("Total number of characters = " + quote.length());
		
		//2.Concat()
		
		String fname= "Saurabh"; 
		String lname= "Gore"; 
		fname = fname.concat(" "); 
		String fullName = fname.concat(lname); 
		System.out.println("fname = " + fname); 
		System.out.println("lname = " + lname); 
		System.out.println("Fullname = " + fullName);
		
		//2. toUpperCase()
		System.out.println("String in Uppercase = " + quote.toUpperCase());

		//3. toLowerCase()
		System.out.println("String in Lowercase = " + quote.toLowerCase());
		
		//4. charAt()
		System.out.println("String charAt() = " + quote.charAt(20));
		
		//5. indexOf()
		System.out.println("IndexOf w = " + quote.indexOf("w"));
		System.out.println("IndexOf to = " + quote.indexOf("to"));

		//6. lastIndexOf()
		System.out.println("lastIndexOf Z = " + quote.lastIndexOf("Z"));
		System.out.println("lastIndexOf to = " + quote.lastIndexOf("to"));

		//7. equals()
		String name1 = "James";
		String name2 = "JAMES";
		String name3 = "James";

		System.out.println("equals name1 with name2 = " + name1.equals(name2));
		System.out.println("equals name1 with name3 = " + name1.equals(name3));
		
		//8. equalsIgnoreCase()

		System.out.println("equalsIgnoreCase name1 with name2 = " + name1.equalsIgnoreCase(name2));
		System.out.println("equalsIgnoreCase name1 with name3 = " + name1.equalsIgnoreCase(name3));

		//9. compareTo()
		System.out.println("compareTo name1 with name2 = " + name1.compareTo(name2));
		System.out.println("compareTo name1 with name3 = " + name1.compareTo(name3));

		//10. compareToIgnoreCase()
		System.out.println("compareToIgnoreCase name1 with name2 = " + name1.compareToIgnoreCase(name2));
		System.out.println("compareToIgnoreCase name1 with name3 = " + name1.compareToIgnoreCase(name3));
		
		//11. trim()
		System.out.println("trim = " +  quote.trim());

		//12. substring()
		System.out.println("substring = " + quote.substring(4,29));

		//11.getChars()
		String str = "HelloWorld";
	    char[] arr = new char[5];
	    
	    str.getChars(0, 5, arr, 0);
        System.out.println(arr);
        
		//12.startsWith()	 return boolean
        System.out.println("Starts with J " + name1.startsWith("J"));
        System.out.println("Starts with j " + name1.startsWith("j"));
        
        //13.startsWith()	 return boolean
        System.out.println("Starts with S " + name1.endsWith("S"));
        System.out.println("Starts with s " + name1.endsWith("s"));

        //14.replace() 
        String oldStr = "Old";

        oldStr = oldStr.replace("Old","NewString");
        
        System.out.println("Old String :- " + oldStr);
        
	}

}
