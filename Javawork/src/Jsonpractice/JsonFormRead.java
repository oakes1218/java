package Jsonpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;
import org.json.JSONArray;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;


public class JsonFormRead {
	
	private static Scanner scanner;

	public static void main (String[] args) throws IOException{
		scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		//Pattern pattern = Pattern.compile(sb); 
		URL url = new URL ("http://data.taipei.gov.tw/opendata/apply/json/QTdBNEQ5NkQtQkM3MS00QUI2LUJENTctODI0QTM5MkIwMUZE");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String jsonString = reader.readLine();
        reader.close();
       
        JSONArray jsonArray = new JSONArray(jsonString);
        JSONObject jsonObject = new JSONObject();
       
        while (true) {
        	
            System.out.println("請輸入飯店名稱：");
         	scanner.next();
         	
        	for (int i = 0 ; i < jsonArray.length() ; i++ ){
            	jsonObject = jsonArray.getJSONObject(i);   
            	System.out.println(jsonObject);
            	sb.append(jsonObject);
            	if(scanner.next().equals(jsonObject)){
            		System.out.println(jsonString);
            		break;
            	}
            }
			
		}

        
	}

}
