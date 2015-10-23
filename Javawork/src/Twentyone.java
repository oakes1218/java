
public class Twentyone {
	int ran = 0;
	
	public void  deal(){
		for (int i = 0 ; i < 6 ; i++){
			ran = (int)(Math.random()*13+1);
			System.out.println(ran);
				if (ran/10 > 0){
					ran = 0;
				}
			ran = ran;
		}
		System.out.print(ran);
		
	}
	
}
