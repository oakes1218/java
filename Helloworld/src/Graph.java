
/*public class Graph {
	protected int length ;
	protected int width ; 	
	
	public Graph(int length, int width) {
		this.length = length ;
		this.width = width ;
		
	}
	
	public int getlength(){
		return length;
	}
	
	public int getwidth(){
		return width;
	}	
}*/

interface Formula {
	void fma();
}

class Triangle implements Formula {
	protected int length ;
	protected int width ;
	
	public Triangle (int length , int width){
		this.length =length ;
		this.width = width ;
	}
	@Override
	public void fma() {
		System.out.print((length*width)/2);
		
	}	
}

class Circle implements Formula {
	private float r ;
	
	public Circle (int r){
		this.r=r ;
	}

	@Override
	public void fma() {
		System.out.print( r*r *3.14);
	}	
}

class Square implements Formula {
	
	protected int length ;
	protected int width ;
	
	public Square (int length, int width){
		this.length = length ;
		this.width = width ;
	}
	@Override
	public void fma() {
		System.out.print(length*width);		
	}	
}