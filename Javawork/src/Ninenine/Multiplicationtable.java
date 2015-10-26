package Ninenine;

public class Multiplicationtable {
	public  static void main (String [] agre) {
		
	for (int k = 0 ; k <=6 ; k += 3){
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				System.out.print( j + k + " x " + i + " = " + i * (j+k) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		}
	}
}
