package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*Assignment: WAP to read a text file and print how many words are in file repeated at least thrice.*/

public class IOAss2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader read = new BufferedReader(new FileReader("e:/demo/sample.txt"));		
		
        HashMap<String, Integer> words = new HashMap<>();
        int totalWords=0;
        String line;

        while ((line = read.readLine()) != null) {
    	   
    	   String[] arr = line.split("\\s+");
    	   totalWords += arr.length;
    	   for(String word : arr) {
    		   
    		   if(words.containsKey(word)) {
    			   words.put(word,words.get(word)+1);
    		   }
    		   else {
    			   words.put(word,1);
    		   }
    	   }
       }
        
        read.close();
        
        System.out.println("Total Words : " + totalWords);
        System.out.println("Words repeated at least 3 times:");

        for(Map.Entry<String,Integer> entry : words.entrySet()) {
        	if(entry.getValue()>= 3) {
        	      System.out.println(entry.getKey() + " -> " + entry.getValue());
        	}
        }
		
	}

}
