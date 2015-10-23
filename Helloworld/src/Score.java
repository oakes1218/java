import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
	    int[] scores = new int[] {50,60,70,80,90,55,68,79,88,100};
	    for(int score : scores) {
	        System.out.printf("%2d ", score);
	    }
	    System.out.println();
	    Arrays.fill(scores, 60);
	    for(int score : scores) {
	        System.out.printf("%3d", score);
	    }
	}
}

