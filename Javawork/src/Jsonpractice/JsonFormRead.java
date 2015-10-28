package Jsonpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JsonFormRead {
	
	public static void main (String [] ager) throws IOException{
		
		URL url = new URL ("http://data.taipei.gov.tw/opendata/apply/json/QTdBNEQ5NkQtQkM3MS00QUI2LUJENTctODI0QTM5MkIwMUZE");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String jsonString = reader.readLine();
        System.out.print(jsonString);
        reader.close();
		String NAME = JSONObject(jsonString).getString("name");
	}

	
}
