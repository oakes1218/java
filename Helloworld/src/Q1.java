
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Q1 {

	public static void main(String[] args) throws IOException{
		File f = null;
        boolean bool = false;
        f = new File("/Users/eddie/downloads/q1");
        bool = f.mkdir();
        System.out.println(bool);
        
		InputStream inStream = null;
		OutputStream outStream = null;
			
	    	try{
	    		
	            File afile =new File("/Users/eddie/downloads/testt.txt");
	    	    File bfile =new File("/Users/eddie/downloads/q1/copytest.txt");
	    		
	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);
	        	
	    	    byte[] buffer = new byte[1024];
	    		
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	    	  
	    	    	outStream.write(buffer, 0, length);
	    	 
	    	    }
	    	 
	    	    inStream.close();
	    	    outStream.close();
	    	    
	    	    System.out.println("File is copied successful!");
	    	    
	    	}catch(IOException e){
	    	    e.printStackTrace();
	    	}
	    	
	    	 FileReader f1 =new FileReader("/Users/eddie/downloads/q1/copytest.txt");
	         BufferedReader b = new BufferedReader(f1);
	         String s;

	         while((s = b.readLine())!=null){
	             System.out.println(s);
	         }
	         b.close();
	 //判斷檔案非空值就列印，如此也可以做到印出整個文件
	     }
	     
}
		
