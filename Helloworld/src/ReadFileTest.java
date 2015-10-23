import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileTest {

	
    public static void main(String[] args) {
        String filePath = "/Users/eddie/Downloads/test.txt";
        cat(new File(filePath));
    }

    private static void cat(File file) {
        BufferedReader reader = null;
        try {
	        reader = new BufferedReader(new FileReader(file));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	            
	        }
	        //(6)加入下面這一行，註解拿掉
	        if(reader == null)
				throw new IllegalArgumentException("不能傳入 null");
	        
	        //System.out.println("程式執行完畢");
        } catch (FileNotFoundException e) {
        	e.printStackTrace();

        } catch (IOException e) {
        	e.printStackTrace();
        	
	    } finally {
	    	System.out.println("程式執行完畢");
	    }
    }    
}
