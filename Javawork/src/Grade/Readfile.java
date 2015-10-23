package Grade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Readfile {
	
	ArrayList<IStudent> list_Data = new ArrayList<IStudent>();
	String line ;
	
	public ArrayList<IStudent> Read() throws IOException {
		
		FileReader fr = new FileReader("/Users/eddie/Downloads/grade1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while ((line = br.readLine()) != null){
			Student student = new Student();
			String[] d = line.split(",");
			student.setId(Integer.valueOf(d[0]));
			student.setName(d[1]);
			student.setScore(Integer.valueOf(d[2]));
			list_Data.add(student);
			
		}
		fr.close();
		return list_Data;
	}
	

}	
