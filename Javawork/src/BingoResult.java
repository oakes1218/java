
public class BingoResult {	
	private int aline;
	private int bline;
	
	
	
	public void setaline(int a_line){
		aline = a_line;
	}
	public int getaline(){
		return aline;
	}
	
	public void setbline(int b_line){
		bline = b_line;
	}
	public int getbline(){
		return bline;
	}
	public boolean Result(){
			
		return (aline >= 5 || bline >= 5);
	}
	  
}
	
