
public class StringReverse {
	String name;
	private final char value[];
	
	public StringReverse(String name){
		this.name = name;
		this.value = this.name.toCharArray(); // toCharArray():以將字串以char[]陣列傳回
	}
	
	
	 public char charAt(int index) {
	  if ((index < 0) || (index >= value.length)) {
		  throw new StringIndexOutOfBoundsException(index);
		    }
		       return value[index];
		  }
	 public int length() {
		 return value.length;
	}
	 /* public String substring(int beginIndex, int endIndex) {
		  if (beginIndex < 0) {
			  throw new StringIndexOutOfBoundsException(beginIndex);
		  }
		  if (endIndex > value.length) {
			  throw new StringIndexOutOfBoundsException(endIndex);
		  }
	    int subLen = endIndex - beginIndex;
	       if (subLen < 0) {
	           throw new StringIndexOutOfBoundsException(subLen);
	       }
      if ((beginIndex == 0) && (endIndex == value.length))
    	  return ((beginIndex == 0) && (endIndex == value.length)) ? this
           : new String(value, beginIndex, subLen);
	   }*/
	  
	public CharSequence subSequence(int beginIndex, int endIndex) {
		 return this.name;
	}
	 public String toString() {
	    return this.name;
	 }
}	
	
	/*public static void Reverse(String name){
		StringBuffer sb = new StringBuffer();
	    sb.append(name);
	    sb.reverse();
	    System.out.println(sb.charAt(0));
	    System.out.println(sb.length());
	    System.out.println(sb.subSequence(0,2));
	    System.out.println(sb.toString());
		}*/

