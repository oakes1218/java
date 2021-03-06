package Park;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Parking {
	
	int hour = 0;
	int minute = 0;
	int money = 0;
	String begin ;
	String end ;
	int total_minute = 0;
	StringBuffer sb = new StringBuffer();
	
	public  void diffTime() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入停車入場時間(24小時制) 格式 yyyy-MM-dd-HH:mm:ss");
		begin = scanner.next();
		System.out.println("請輸入停車出場時間(24小時制) 格式 yyyy-MM-dd-HH:mm:ss");
		end = scanner.next(); 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
		
		try {  
        java.util.Date starDate = sdf.parse(begin);
        java.util.Date endDate = sdf.parse(end);
        
        total_minute = (int) ((endDate.getTime() - starDate.getTime())/(1000*60));  
        
        hour = (int) total_minute/60;  
        minute = (int) total_minute%60; 
        
        sb.append("總共停：").append(hour).append("小時又").append(minute).append("分鐘");  
       
		 } catch (ParseException e) {  
		        System.out.println("輸入格式錯誤");  
		 }
        hour += (minute > 0) ? 1 : 0; 
        money = hour / 24 * 150; 
        money += hour % 24 / 4 * 50;
        money += hour % 4 * 20;
        
        System.out.print(sb.toString() + "  需繳費:" + money + "元");
        
	}
}
