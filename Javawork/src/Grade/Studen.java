package Grade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class Studen {
	
	public void data() throws IOException{
		Readfile rf = new Readfile();	
		ArrayList<IStudent> list_Data = rf.Read();
		Collections.sort(list_Data ,new Comparator<IStudent>() {
			@Override
			public int compare(IStudent o1, IStudent o2) {
				return (o2.getScore()-o1.getScore());		
			}		
		}); 
	
			for(int i = 0; i < list_Data.size()*0.25 ; i++){
				System.out.println(list_Data.get(i).getName()+" - " + "優");
			}
		
			for(int i = (int) (list_Data.size()*0.25)+1 ; i < list_Data.size()*0.25*2 ; i++){
				System.out.println(list_Data.get(i).getName()+" - " + "良");
			}
			
			for(int i = (int) (list_Data.size()*0.25)*2+1 ; i < list_Data.size()*0.25*3-1 ; i++){
				System.out.println(list_Data.get(i).getName()+" - " + "中");
			}
			
			for(int i = (int) (list_Data.size()*0.25)*3+1 ; i < list_Data.size()*0.25*4 ; i++){
				System.out.println(list_Data.get(i).getName()+" - " + "差");
			}
		
		}
	
}
