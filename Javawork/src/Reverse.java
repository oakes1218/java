
public class Reverse {
	
	public static void main (String[] arge){ 
		
		StringReverse sr = new StringReverse("java");
		
		System.out.println(sr.name);
		
		//StringBuffer sb = new StringBuffer();
	    //sb.append(sr.name);
	    //sb.reverse();
	    System.out.println(sr.charAt(2));
	    System.out.println(sr.length());
	    System.out.println(sr.subSequence(0,2));
	    System.out.println(sr.toString());
		
	}
}

	




