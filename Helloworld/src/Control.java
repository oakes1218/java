
public class Control {
	private String color ;
	private int number ;

	public int getnumber(){
		return number;
		
	}
	public void setnumber(int number){
		this.number = number ;
	}
	
	public String getcolor(){
		return color ;
	}
	public void setcolor(String color){
		this.color = color ;
	}
	
}	

interface Change {
	default void cha(){		
	System.out.print("轉");
	}
}

class Channel1 extends Control implements Change{
	public void change (){
		System.out.println("CTV");
	}
}
class Channel2 extends Control implements Change{
	public void change (){
		System.out.println("TVBS");
	}
}
class Channel3 extends Control implements Change{
	public void change (){
		System.out.println("CNN");
	}
	
}


