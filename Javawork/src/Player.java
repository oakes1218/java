import java.util.ArrayList;
import java.util.Collections;

public class Player {	
	int line = 0;
	int count = 0;
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	public ArrayList<Integer> Picture(){
		
		for (int k = 1 ; k<=25 ; k++){		
			list.add(k);
		}
		Collections.shuffle (list) ; // 打亂arraylist element
		return list;
	}
	public Player(int line , int count){	
		this.line = line;
		this.count = count;
	}
	public void reset(){
		line = 0;
		count = 0;
	}
	@Override
	public String toString() {
	    return line + " " + count + " " + Picture();
	}
	
}
