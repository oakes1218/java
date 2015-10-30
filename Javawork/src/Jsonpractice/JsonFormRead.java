package Jsonpractice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONArray;


public class JsonFormRead {
	
	// hello world
	public static void main (String[] args) throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		String name ;
		boolean Flag = true;
		
		URL url = new URL ("http://data.taipei.gov.tw/opendata/apply/json/QTdBNEQ5NkQtQkM3MS00QUI2LUJENTctODI0QTM5MkIwMUZE");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String jsonString = reader.readLine();
        reader.close();
       
        JSONArray jsonArray = new JSONArray(jsonString);
       
        while (Flag) {
        	
            System.out.println("請輸入飯店名稱：");
         	name = scanner.next();
         	
        	for (int i = 0 ; i < jsonArray.length() ; i++ ){
        		JSONObject jsonObject = jsonArray.getJSONObject(i);   
            	//System.out.println(jsonObject.get("name"));            	
            	//System.out.println(name.equals(jsonObject.get("name")));
            	String vaule = jsonObject.get("name").toString();
            	
            	if (vaule.contains(name)) {
            		System.out.println("名字：" + jsonObject.get("name"));
             		System.out.println("地址：" + jsonObject.get("display_addr"));
             		System.out.println("電話：" + jsonObject.get("tel"));
            	}
        	}
        	
		}
       
	}

}
