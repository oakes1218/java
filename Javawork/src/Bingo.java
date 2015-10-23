import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.sound.sampled.Line;
import javax.swing.text.StyledEditorKit.ForegroundAction;


public class Bingo {
	//private static final String Picture = null;
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> inputList = new ArrayList<Integer>();
	
	int number = 0;
	int guess = 0;
	//Player player = new Player(0, 0);
	Player[] pl = new Player[2];
	//Picture[] pi = new Picture[2];
	
	public Bingo (){
		
		for (int i = 0 ; i < pl.length ; i++){
			pl[i] = new Player(0, 0) ;		
		}
		pl[0].Picture();
		pl[1].Picture();
		//System.out.print(pl[0]);
		
	}
	
	public void Comparison(int z){
		
		if(pl[z].line >= 5) {
			//break;
		}
			
		for (int i = 0 ; i < list.size() ; i++){
			pl[z].count = 0;
			for (int j = 0 ; j < 5 ; j++){
				if(inputList.contains(pl[z].list.get(i * 5 + j))){ //判斷數字有沒有包含列位置
					pl[z].count ++;
				}	
				if(pl[z].count == 5 ){
					pl[z].line ++;
				}
			}
			//System.out.print(pl[z].line + " ");
		}
		for (int i = 0 ; i < 5 ; i++){
			pl[z].count = 0;
			for (int j = 0 ; j < 5 ; j++){
				if(inputList.contains(pl[z].list.get(j * 5 + i))){ //判斷數字有沒有包含行位置
					pl[z].count ++;
				}
				if(pl[z].count == 5 ){
					pl[z].line ++;
				}
			}	
		}
		for (int i = 0 ; i < 5 ; i++){ //判斷數字有沒有包含交叉位置
			pl[z].count = 0;
			if(inputList.contains(pl[z].list.get(i * 6 ))){
				pl[z].count ++;
			}
			if(pl[z].count == 5 ){
				pl[z].line ++;
			}
		}
		for (int i = 0 ; i < 5 ; i++){  //判斷數字有沒有包含交叉位置
			pl[z].count = 0;
			if(inputList.contains(pl[z].list.get(i * 4 ))){
				pl[z].count ++;
			} 	
			if(pl[z].count == 5 ){
				pl[z].line ++;
			}		
		}
		/*if(pl[z].line >= 5){
			//pl[z].line ++;
			
		}*/		
		//System.out.print(pl[z].line + " ");
		System.out.println(pl[z].line);
			for (int i = 0 ; i < 25 ; i++){
				System.out.print(pl[z].list.get(i) + " ");
			}
		System.out.println("");
		
		}
		
	
	
	
	public void Game() {
		boolean num = true;
		
		do{	 // 輸入迴圈
			this.input("A");
			this.Comparison(0);
			this.input("B");
			this.Comparison(1);
			for(int z = 0 ; z <list.size() ; z++ ){
				if(pl[z].line >= 5){  //判斷Ａ輸入ＡＢ有沒有５條線
					num = false;  //跳出do迴圈
					break;
				}
			}
		}while (num);
		int count = 0;
		for(int z = 0 ; z <list.size() ; z++ ){
			if(pl[z].line >= 5){ //有五條線以上判斷輸贏
				count ++;
		}		
			//System.out.println(count);
				if(count == list.size()){
				System.out.println("平手");
				System.out.println("A賓果圖");
				for(int i = 0 ; i < 25 ; i++){ //映出Ａ圖
					if(i % 5 == 0){
						System.out.println();
					}
					System.out.print(pl[z].list.get(i)+ " ");
				}
				System.out.println();
			}
			else if (pl[0].line >= 5) {
				System.out.println("A贏了");	
				System.out.println("A賓果圖");
				for(int i = 0 ; i < 25 ; i++){
					if(i % 5 == 0){
						System.out.println();
					}
				System.out.print(pl[0].list.get(i)+ " ");
					break;
				}
				System.out.println();
				} else if (pl[1].line >= 5) {
					System.out.println("B贏了");	
					System.out.println("B賓果圖");
					for(int i = 0 ; i < 25 ; i++){
						if(i % 5 == 0){
							System.out.println();
						}
					System.out.print(pl[0].list.get(i)+ " ");
						break;
					}	
				System.out.println();
			}
		}
	}

	public void input(String user) {
		while (true) {
			try{  //判斷輸入是否為整數
				Scanner guess = new Scanner(System.in);
				System.out.print(user+"玩家輸入");
				number = guess.nextInt();					
				if(number < 26 && number > 0){   //判斷輸入是否為0~25				
				    if(inputList.contains(number)){  //循环遍历集体中的元素
						System.out.println("重複輸入請在輸入一次");
				     }else{
				      	inputList.add(number);
				      	break;
					}    	
				}else {
					System.out.println("請輸入1～25正數數字");
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("输入有誤");
			}
		}
	
	}
	
}	