import java.util.Scanner; 

public class Guess {
	public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        int number = (int) (Math.random() * 25);
        	System.out.println(number);
      
        int guess;
        
        do {
            System.out.print("猜數字（0 ~ 9）:");
            guess = userinput.nextInt();
        } while(guess != number);
        
        System.out.println("猜中了...XD");
    }
}
