import java.util.Scanner ;
public class GuessGame {
	public static void main (String[] args){
		
		
		int number = (int) (Math.random() * 100)+1 ;
		System.out.println(number);
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		do{
			if(guess>100){
				continue;
			}	
			if(guess<=0){
				break;
			}	
			if(guess>number){
				System.out.println("Too Big");
				break;
				
			}
			if(guess<number){
				System.out.println("Too Small");
				break;
				
			}
		} while(guess != number);
			
			if(guess==number){
				System.out.println("Bingo");
			}/*else {
				System.out.println("Give up");
			}	*/
		
	}	

}
