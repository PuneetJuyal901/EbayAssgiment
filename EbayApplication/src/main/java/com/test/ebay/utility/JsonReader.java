package com.test.ebay.utility;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonReader {
	
	public static Object[][] getdata(String JSON_path, String typeData, int totalDataRow, int totalColumnEntry) throws JsonIOException, JsonSyntaxException, FileNotFoundException
	{ 
		JsonParser jsonParser =  new JsonParser();
		JsonObject jsonObj = jsonParser.parse(new FileReader(JSON_path)).getAsJsonObject();
        JsonArray array = (JsonArray) jsonObj.get(typeData);
        return searchJsonElement(array, totalDataRow, totalColumnEntry);
	}
	
	public static Object[][] searchJsonElement(JsonArray jsonArray, int totalDataRow, int totalColumnEntry) throws NullPointerException 
	{			
		Object[][] matrix = new Object[totalDataRow][totalColumnEntry];
        int i =0;
        int j = 0;
        for (JsonElement jsonElement : jsonArray) 
        {
             for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) 
             {
            	 matrix[i][j] = entry.getValue().toString().replace("\"","");
                 j++;   
            }
            i++;
            j = 0;
        }
        return matrix;
	}
}


