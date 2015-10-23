import java.util.ArrayList;
import java.util.Collections;


public class Picture {
	ArrayList<Integer> list = new ArrayList<Integer>();
	int [] c = new int [25];
	//public static void main (String []arge){
	public Picture(){
		
		for (int k = 1 ; k<=25 ; k++){		
			list.add(k);
		}
		Collections.shuffle (list) ;  // 打亂arraylist element
		for (int i = 0 ; i < 25 ; i++){
			c[i] = list.get(i);    //複製到A陣列
			//System.out.print(c[i] +" ");
		}
		//System.out.print(" ");
		//return c;
	}
}
