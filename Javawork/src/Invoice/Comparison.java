package Invoice;

import java.util.ArrayList;
import java.util.Scanner;

public class Comparison {
	ArrayList<String> special_List = new ArrayList<String>();
	ArrayList<String> twomillion_List = new ArrayList<String>();
	ArrayList<String> twohundredthousand_List = new ArrayList<String>();
	ArrayList<String> second_List = new ArrayList<String>();
	ArrayList<String> third_List = new ArrayList<String>();
	ArrayList<String> fourth_List = new ArrayList<String>();
	ArrayList<String> fifth_List = new ArrayList<String>();
	ArrayList<String> sixth_List = new ArrayList<String>();
	
	Scanner scanner = new Scanner(System.in);
	String number ; 
	
	public void comparison_Invoice () {
		
		System.out.print("請輸入兌獎號碼：");
		special_List.add("54719495");
		twomillion_List.add("52704456");
		twohundredthousand_List.add("95358086");
		twohundredthousand_List.add("35867930");
		twohundredthousand_List.add("14013695");
		second_List.add("5358086");
		second_List.add("5867930");
		second_List.add("4013695");
		third_List.add("358086");
		third_List.add("867930");
		third_List.add("013695");
		fourth_List.add("58086");
		fourth_List.add("67930");
		fourth_List.add("13695");
		fifth_List.add("8086");
		fifth_List.add("7930");
		fifth_List.add("3695");
		sixth_List.add("086");
		sixth_List.add("930");
		sixth_List.add("695");
		sixth_List.add("270");
		sixth_List.add("432");
		sixth_List.add("326");
		
		number = scanner.next();
		
		//number.substring(1);
		/*int after_Convert = Integer.parseInt(number);
		after_Convert = after_Convert%10000000;
		String frist_Number = String.valueOf(after_Convert); //七碼 ４Ｗ
		after_Convert = after_Convert%1000000;
		String second_Number = String.valueOf(after_Convert); //六碼 １Ｗ
		after_Convert = after_Convert%100000;
		String third_Number = String.valueOf(after_Convert); //五碼 ４０００
		after_Convert = after_Convert%10000;
		String fourth_Number = String.valueOf(after_Convert); //四碼 １０００
		after_Convert = after_Convert%1000;
		String fifth_Number = String.valueOf(after_Convert); //三碼 ２００*/
		
		for (int i = 0 ; i < special_List.size() ; i++){
			if(number.equals(special_List.get(i))){
			System.out.println("中獎1千萬");
			return;
			}
		} 
		
		for (int i = 0 ; i < twomillion_List.size() ; i++){
			if(number.equals(twomillion_List.get(i))){
			System.out.println("中獎200萬");
			return;
			}
		}
		for (int i = 0 ; i < twohundredthousand_List.size() ; i++){
			if(number.equals(twohundredthousand_List.get(i))){
			System.out.println("中獎20萬");
			return;
			}
		}
		String frist_Number = number.substring(1);
		for (int i = 0 ; i < second_List.size() ; i++){
			if(frist_Number.equals(second_List.get(i))){
			System.out.println("中獎４萬");
			return;
			}
		}
		String second_Number = number.substring(2);
		for (int i = 0 ; i < third_List.size() ; i++){
			if(second_Number.equals(third_List.get(i))){
			System.out.println("中獎１萬");
			return;
			}
		}
		String third_Number = number.substring(3);
		for (int i = 0 ; i < fourth_List.size() ; i++){
			if(third_Number.equals(fourth_List.get(i))){
			System.out.println("中獎4000");
			return;
			}
		}
		String fourth_Number = number.substring(4);
		for (int i = 0 ; i < fourth_List.size() ; i++){
			if(fourth_Number.equals(fourth_List.get(i))){
			System.out.println("中獎1000");
			return;
			}
		}
		String fifth_Number = number.substring(5);
		for (int i = 0 ; i < sixth_List.size() ; i++){
			if(fifth_Number.equals(sixth_List.get(i))){
			System.out.println("中獎200");
			return;
			}
		}
		System.out.println("槓龜");
	System.out.print(frist_Number + " " + second_Number + " " + third_Number + " " + fourth_Number + " " + fifth_Number );
	}
}
