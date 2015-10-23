import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;


public class WriteToFile {
	
	public static void main(String[] args)throws IOException{
		   
	    BufferedWriter bw = null;
	    BufferedReader br = null;
	    
	    try {
		    File file = new File("/Users/eddie/Downloads/test.txt");
		    bw = new BufferedWriter(new FileWriter(file)); 
		    bw.append("InfoQ interviewed Adzic, Evans and Roden about why they wrote this book");
		    bw.flush(); 
	    } catch (Exception e) {
	    	e.printStackTrace();
	      }

	   try {
		   File file = new File("/Users/eddie/Downloads/test.txt");
		   br = new BufferedReader(new FileReader(file));
		   String line;
		   while ((line = br.readLine()) != null) {
		       System.out.println(line);
		            
		   }
		       //(6)加入下面這一行，註解拿掉
		  // if(br == null)
		   throw new IllegalArgumentException("不能傳入 null");

	       } catch (FileNotFoundException e) {
	        	e.printStackTrace();
	
	       } catch (IOException e) {
	        	e.printStackTrace();
	        	
		   } finally {
		    	System.out.println("程式執行完畢");
		    	
		   }
	   
	   HashMap<String, Integer> map = new HashMap<String, Integer>();
	   map.put("InfoQ", 5);
       map.put("interviewed", 11);
       map.put("Adzic", 5);
       map.put("Evans", 5);
       map.put("and", 3);
       map.put("Roden", 5);
       map.put("about", 5);
       map.put("why", 3);
       map.put("they", 4);
       map.put("they", 4);
       map.put("wrote", 5);
       map.put("this", 4);
       map.put("book", 4);

       for (Object key : map.keySet()) {
           System.out.println(key + " : " + map.get(key));
       }   
	} 
}	
